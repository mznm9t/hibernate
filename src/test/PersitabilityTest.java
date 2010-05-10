package test;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.hibernate.Session;

import interfaces.Contactable;
import interfaces.PublicationType;
import static builders.BuilderDirector.*;
import static core.ReflectiveUtil.hasSameValues;
import core.HibernateSessionFactory;
import domain.ID;
import access.ContactableDAO;
import access.PublicationTypeDAO;




public class PersitabilityTest extends SandBoxTestCase{
	
	@SuppressWarnings("unused")
	
	private static final String SANDBOX_DB = "dataSets/savillddsBlank.xml";

	 static{
		 HibernateSessionFactory.setConfigFile("/SandBoxHibernate.cfg.xml");
	 }
	
	public PersitabilityTest(String testName) {
		super(testName);
	}
	
	protected Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
	@Override
	public void setUp() throws Exception {
	  super.setUp();
	}

	@Override
	public void tearDown() throws Exception {
	}
	
	public void testCanPersistSimpleEntityFromBuilder() throws Exception{
		//1- assert that there is not rows in the table
		ITable table=getDatabaseTester().getDataSet().getTable("com_fpdsavills_pr_publicationtype");
		assertEquals(0, table.getRowCount());	
		
		//2- now we create a instance and make it persistent.
		PublicationTypeDAO pManager=new PublicationTypeDAO();
		pManager.setSession(getSession());
		org.hibernate.Transaction t= getSession().beginTransaction();
		PublicationType type= aPublicationType().build(); 
		pManager.makePersistent(type);
		t.commit();
		ID id=type.getID();
		assertNotNull(id);
		
		//3- we retrieve the instance from the database through the ID.Using a new session to avoid cache. 
		HibernateSessionFactory.closeSession();
		t= getSession().beginTransaction();
		pManager.setSession(getSession());//add the new session
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
		Contactable contactable= aContactable().build(); 
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
	}
	
	public static Test suite() {
		TestSuite suite = new TestSuite("Running all test test");
		suite.addTest(new PersitabilityTest("testCanPersistEntityWithEntityAttributesFromBuilder")); 
		return suite;
	}

	
}
