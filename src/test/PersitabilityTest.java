package test;

import static builders.BuilderDirector.aContactEvent;
import static builders.BuilderDirector.aContactable;
import static builders.BuilderDirector.aPhoneNumber;
import static builders.BuilderDirector.aPublicationType;
import static core.ReflectiveUtil.hasSameValues;
import junit.framework.Test;
import junit.framework.TestSuite;
import interfaces.ContactEvent;
import interfaces.Contactable;
import interfaces.PhoneNumber;
import interfaces.PublicationType;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;

import access.ContactEventDAO;
import access.ContactableDAO;
import access.PhoneNumberDAO;
import access.PublicationTypeDAO;
import builders.BuilderDirector;
import builders.BuilderDirector.DefaultPoliciy;
import core.HibernateSessionFactory;
import domain.ID;




public class PersitabilityTest extends SandBoxTestCase{
	
	@SuppressWarnings("unused")
	
	private static final String SANDBOX_DB = "dataSets/savillddsBlank.xml";

	 static{
		 HibernateSessionFactory.setConfigFile("/SandBoxHibernate.cfg.xml");
	 }
	
	public PersitabilityTest(String testName) {
		super(testName);
	}
	
	public void testCanPersistSimpleEntityFromBuilder() throws Exception{
		//1- assert that there is not rows in the table
		ITable table=getDatabaseTester().getDataSet().getTable("com_fpdsavills_pr_publicationtype");
		assertEquals(0, table.getRowCount());	
		
		//2- now we create a instance and make it persistent.
		PublicationTypeDAO pManager=new PublicationTypeDAO();
		org.hibernate.Transaction t= getSession().beginTransaction();
		PublicationType type= aPublicationType().build(); 
		pManager.makePersistent(type);
		t.commit();
		ID id=type.getID();
		assertNotNull(id);
		
		//3- we retrieve the instance from the database through the ID.Using a new session to avoid cache. 
		HibernateSessionFactory.closeSession();
		t= getSession().beginTransaction();
		pManager.renewSession();//this is needed because we closed the old session
		PublicationType type2=pManager.findById(id);
		
		//4- we assert that the instance we created in point 2 and the instance we retrieved has got the same values.
		assertTrue(hasSameValues(type, type2));
		
		//5-lastly we assert that only on row has been added to the database table 
		IDataSet dataSet=getConnection().createDataSet();
		table=dataSet.getTable("com_fpdsavills_pr_publicationtype");
		assertEquals(1, table.getRowCount());	
		t.commit();
	}
	
	public void testCanPersistEntityWithEntityAttributesFromBuilder() throws Exception{
		
		ContactableDAO cManager=new ContactableDAO();
		cManager.setSession(getSession());
		org.hibernate.Transaction t= getSession().beginTransaction();
		Contactable contactable= aContactable()
		.withPhone1(aPhoneNumber().build())
		.withAContactEvent(aContactEvent().build())
		.withAContactEvent(aContactEvent().build())
		.build();
		
		cManager.makePersistent(contactable);
		t.commit();
		ID id=contactable.getID();
		assertNotNull(id);
		
		//we retrieve the instance from the database through the ID.Using a new session to avoid cache. 
		HibernateSessionFactory.closeSession();
		t= getSession().beginTransaction();
		cManager.setSession(getSession());//add the new session
		Contactable contactable2=cManager.findById(id);
		
		//we assert that the instance we created in point 2 and the instance we retrieved has got the same values.
		assertTrue(hasSameValues(contactable, contactable2));
		
		contactable.addContactEvent(aContactEvent().build());
		assertFalse(hasSameValues(contactable, contactable2));
		
	}
	
	
public void testCanPersistEntityWithEntityAttributesFromBuilderINTESTMODE() throws Exception{
		BuilderDirector.setDefaultPoliciy(DefaultPoliciy.TEST);
		final ContactableDAO cManager=new ContactableDAO();
		final PhoneNumberDAO cPhoneNumber=new PhoneNumberDAO();
		final ContactEventDAO ceManager=new ContactEventDAO();
		final Contactable contactable;
		final ContactEvent ce;
		final PhoneNumber phone;
		final Contactable contactable2;
		
		ce=aContactEvent().build();
		phone=aPhoneNumber().build();
		new Transaction(getSession()) {
			void toDo() {
				
				ceManager.setSession(session);				
				ceManager.makePersistent(ce);
				BuilderDirector.getEntityMap4Testing().put(ContactEvent.class, ce);
				
				cPhoneNumber.setSession(session);
				cPhoneNumber.makePersistent(phone);
				BuilderDirector.getEntityMap4Testing().put(PhoneNumber.class, phone);
				
			}
		}.execute();
		
		contactable= aContactable().build();
		new Transaction(getSession()) {
			void toDo() {
				cManager.setSession(session);
				cManager.makePersistent(contactable);
			}
		}.execute();
			
		assertTrue(contactable.getPhone1().equals(phone));
		assertEquals(1,contactable.getContactEvents().size());
	
		cManager.setSession(getSession());
		contactable2=cManager.findById(contactable.getID());
		
		//we assert that the instance we created in point 2 and the instance we retrieved has got the same values.
		assertTrue(hasSameValues(contactable, contactable2));
		
		contactable.addContactEvent(aContactEvent().build());
		
		assertFalse(hasSameValues(contactable, contactable2));
		
		new Transaction(getSession()) {
			void toDo() {
				cManager.setSession(session);
				System.out.println("Removing Contactable :"+contactable2.getID());
				cManager.delete(contactable2);
			}
		}.execute();
		
		
		cManager.setSession(getSession());
		
		assertNull(cManager.findById(contactable2.getID()));
		
		ceManager.setSession(getSession());
	    ceManager.findById(ce.getID());
	    
	} 


	public void tearDown() throws Exception {
		BuilderDirector.setDefaultPoliciy(null);
	}
	
	
	public static Test suite() {
		TestSuite suite = new TestSuite("Running all test test");
		suite.addTest(new PersitabilityTest("testCanPersistSimpleEntityFromBuilder")); 
		suite.addTest(new PersitabilityTest("testCanPersistEntityWithEntityAttributesFromBuilderINTESTMODE")); 
		return suite;
	}

	
}
