package test;

import static builders.BuilderDirector.*;
import static core.ReflectiveUtil.hasSameValues;
import static core.ReflectiveUtil.hasAnyNullValues;

import java.util.ArrayList;

import org.dbunit.dataset.IDataSet;
import junit.framework.Test;
import junit.framework.TestSuite;

import interfaces.Address;
import interfaces.Asset;
import interfaces.Audience;
import interfaces.BusinessObject;
import interfaces.Company;
import interfaces.ContactEvent;
import interfaces.ContactEventType;
import interfaces.ContactGivenType;
import interfaces.ContactGroup;
import interfaces.ContactStatus;
import interfaces.Contactable;
import interfaces.Country;
import interfaces.Coverage;
import interfaces.Division;
import interfaces.Employee;
import interfaces.FeatureType;
import interfaces.Journalist;
import interfaces.MappingTool;
import interfaces.MentionType;
import interfaces.Message;
import interfaces.Office;
import interfaces.PRManager;
import interfaces.Person;
import interfaces.PhoneNumber;
import interfaces.PressRelease;
import interfaces.Publication;
import interfaces.PublicationType;
import interfaces.Region;
import interfaces.SequenceNumber;
import interfaces.Story;
import builders.BuilderI;
import builders.BuilderDirector.DefaultPoliciy;
import core.HibernateSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.OfficeH;
import domain.PublicationH;

@SuppressWarnings("unchecked")
public class RoundTripTest extends SandBoxTestCase {

	@SuppressWarnings("unused")
	private static final String SANDBOX_DB = "dataSets/savillddsBlank.xml";
	private static ArrayList<Object[]> buildingsSet;
	Logger log = LoggerFactory.getLogger(RoundTripTest.class);

	private void initBuilders(DefaultPoliciy defaultPolicy){
		 setDefaultPoliciy(defaultPolicy);
		 buildingsSet=new ArrayList<Object[]>();
		 buildingsSet.add(new Object[]{aCompany(),Company.class });
		 buildingsSet.add(new Object[]{aContactable(),Contactable.class });	
		 buildingsSet.add(new Object[]{aContactEvent() ,ContactEvent.class});
		 buildingsSet.add(new Object[]{aContactEventType() ,ContactEventType.class});
		 buildingsSet.add(new Object[]{aContactGivenType() ,ContactGivenType.class});
		 buildingsSet.add(new Object[]{aContactGroup() ,ContactGroup.class});
		 buildingsSet.add(new Object[]{aContactStatus() , ContactStatus.class});
		 buildingsSet.add(new Object[]{aCountry() ,Country.class});
		 buildingsSet.add(new Object[]{aCoverage() ,Coverage.class});
		 buildingsSet.add(new Object[]{aDivision(),Division.class});
		 buildingsSet.add(new Object[]{aEmployee() ,Employee.class});
		 buildingsSet.add(new Object[]{aFeatureType() , FeatureType.class});
		 buildingsSet.add(new Object[]{aMappingTool() ,MappingTool.class});
		 buildingsSet.add(new Object[]{aMentionType() ,MentionType.class});
		 buildingsSet.add(new Object[]{aMessage() , Message.class});
		 buildingsSet.add(new Object[]{anAddress() ,Address.class});
		 buildingsSet.add(new Object[]{anAsset() ,Asset.class});
		 buildingsSet.add(new Object[]{anAudience() ,Audience.class});
		 buildingsSet.add(new Object[]{anOffice() ,Office.class});
		 buildingsSet.add(new Object[]{aPerson() ,Person.class});
		 buildingsSet.add(new Object[]{aPhoneNumber() ,PhoneNumber.class});
		 buildingsSet.add(new Object[]{aPressRelease() ,PressRelease.class});
		 buildingsSet.add(new Object[]{aPRManager() ,PRManager.class});
		 buildingsSet.add(new Object[]{aPublication() ,Publication.class});
		 buildingsSet.add(new Object[]{aPublicationType(),PublicationType.class});
		 buildingsSet.add(new Object[]{aRegion() ,Region.class});
		 buildingsSet.add(new Object[]{aSequenceNumber(),SequenceNumber.class});
		 buildingsSet.add(new Object[]{aStory() , Story.class});
		 buildingsSet.add(new Object[]{aJournalist() , Journalist.class});
		 
	}

	static {
		HibernateSessionFactory.setConfigFile("/SandBoxHibernate.cfg.xml");
	}

	public RoundTripTest(String testName) {
		super(testName);
	}

	private void buildAll() throws Exception {
		initBuilders(DefaultPoliciy.BASIC);
		new Transaction(getSession()) {
			void toDo() {
				for (Object[] a : buildingsSet) {
					BuilderI b = (BuilderI) a[0];
					BusinessObject bo = b.build();
					getSession().save(bo);
					getEntityMap4Testing().put((Class) a[1], bo);
				}
			}
		}.execute();
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		buildAll();
	}

	public void testRoundTrip() throws Exception {
		initBuilders(DefaultPoliciy.TEST);
		for (Object[] a : buildingsSet) {
			System.out.println("Building Entity :" + a[1]);
			BuilderI b = (BuilderI) a[0];
			// round forward ..
			final BusinessObject bo = b.build();
			new Transaction(getNewSession()) {
				void toDo() {
					session.saveOrUpdate(bo);
				}
			}.execute();

			// round backwards ..
			BusinessObject pbo = (BusinessObject) getSession().get(
					bo.getClass(), bo.getID());
			if(bo instanceof PublicationH){
				System.out.println("Checking PublicationH now");
			}
			assertTrue(hasSameValues(bo, pbo));
			assertFalse(hasAnyNullValues(pbo));
		}
		assertTrue(hasAllTablesAtLeastOneRow());
	}

	private boolean hasAllTablesAtLeastOneRow() {
		try {
			IDataSet dataset = getConnection().createDataSet();
			for (String tname : dataset.getTableNames()) {
				if (dataset.getTable(tname).getRowCount() < 1) {
					log.debug("Table "
									+ tname
									+ " does not have any row on it,this is probably caused because an error in hibernate mapping");
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static Test suite() {
		TestSuite suite = new TestSuite("Running all test test");
		suite.addTest(new RoundTripTest("testRoundTrip"));
		return suite;
	}

}
