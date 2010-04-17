package test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import core.HibernateSessionFactory;

import domain.Address;
import domain.Contactable;
import domain.ID;

import access.AddressDAO;
import access.ContactableDAO;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DAOTest extends TestCase {
	
	
	private static final String USERNAME="root";
	private static final String PASSWORD="cars14";
	private static final String DBCLASS = "com.mysql.jdbc.Driver";
	private static final String DBNAME="savillstest";
	private static final String DBURL = "jdbc:mysql://localhost/"+DBNAME;
	private static final String DBTABLEPREFIX="com_fpdsavills_pr_";
	
	private static final Logger log = LoggerFactory.getLogger(TestCase.class);

	public DAOTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
	
	//this method runs a sql query and returns a list of ID , make sure the first field on the select clause 
	//is the id.
	private List<ID> runSQLQuery(String equery){
		String dbid;
		String query = equery;
		List<ID> IDs=new ArrayList<ID>();
		try {
		Class.forName(DBCLASS);
		java.sql.Connection con = DriverManager.getConnection (DBURL,USERNAME,PASSWORD);
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			dbid = rs.getString(1);
			IDs.add(new ID(Long.parseLong(dbid)));
		}
		con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return IDs;
	}

	private List<ID> getOneToOneLinkedEntitiesByNativeSql(String parentEntity,String childEntity){
		String sql="SELECT c.ID FROM "+DBTABLEPREFIX+parentEntity+" as c WHERE EXISTS (SELECT a.ID FROM "+DBTABLEPREFIX+childEntity+" as a WHERE c."+childEntity.toLowerCase()+"_=a.ID AND c."+childEntity.toLowerCase()+"_ is not null)";
		return runSQLQuery(sql);
	}
	
	public void canFindAllAddresses(){
		AddressDAO addressDataProvider=new AddressDAO();
		Collection<Address> addresses=addressDataProvider.findAll();
		assertTrue("Founded "+addresses.size()+" addresses", !addresses.isEmpty());
		log.info("Founded "+addresses.size()+" addresses");
	}
	
	public void canFindAllAContactable(){
		ContactableDAO contactableDataProvider=new ContactableDAO();
		Collection<Contactable> contactables=contactableDataProvider.findAll();
		assertTrue("Founded "+contactables.size()+" contactables", !contactables.isEmpty());
		log.info("Founded "+contactables.size()+" contactables");
	}
	
	public void canFindContactableByIdentifier(){
		Long IDLONG=new Long("-9206799015780976182");
		ContactableDAO contactableDataProvider=new ContactableDAO();
		List<Contactable> contacatables=contactableDataProvider.findByIdentifier(IDLONG);
		Contactable contactable=contacatables.get(0);
		assertTrue(contacatables.size()==1);
		assertTrue(contactable.getIdentifier().equals(IDLONG));	
	}
	
	public void canFindAddressFromContactable(){
		Long IDLONG=new Long("-9079796649221450108");
		Long IDADDLONG=new Long("5822768449375409798");
		ContactableDAO contactableDataProvider=new ContactableDAO();
		ID id=new ID(IDLONG);
		Contactable contactable2=contactableDataProvider.findById(id);
		assertNotNull(contactable2);
		assertNotNull(contactable2.getID());
		assertNotNull(contactable2.getAddress());
		assertNotNull(contactable2.getAddress().getID());
		assertTrue(new ID(IDADDLONG).equals(contactable2.getAddress().getID()));
		assertTrue("com.fpdsavills.pr.Address".equals(contactable2.getAddress().getEntityName()));		
	}
	
	 public void canGetAllContactablesThatHasAnAddressByNativeSQL(){
		 List<ID> IDs=getOneToOneLinkedEntitiesByNativeSql("Contactable", "Address");
		 log.info("Founded "+IDs.size()+" contactables who has an address");
		 assertTrue(IDs.size()==111);
	 }
	 
	
	public void canFindContactableByID(){
		Long IDLONG=new Long("-9206799015780976182");
	    String WWW = "www";
		ContactableDAO contactableDataProvider=new ContactableDAO();
		ID id=new ID(IDLONG);
		List<Contactable> contacatables=contactableDataProvider.findByIdentifier(IDLONG);
		Contactable contactable=contacatables.get(0);
		assertTrue(contacatables.size()==1);
		assertNotNull(contactable);
		assertNotNull(contactable.getID());
		assertTrue(contactable.getIdentifier().equals(IDLONG));	
		assertTrue(contactable.getID().toString().equals(IDLONG.toString()));
		
		Contactable contactable2=(Contactable)contactableDataProvider.findById(id);
		assertNotNull(contactable2);
		assertNotNull(contactable2.getID());
		assertEquals(contactable, contactable2);
		
		contactable.setWww(WWW);
		assertEquals(contactable2.getWww(),WWW);
		
	}
	
	
	
	public static Test suite() {
		TestSuite suite = new TestSuite("Running all test test");
		//$JUnit-BEGIN$
		suite.addTest(new DAOTest("canFindAllAContactable"));
		suite.addTest(new DAOTest("canFindAllAddresses"));
		suite.addTest(new DAOTest("canFindContactableByID"));
		suite.addTest(new DAOTest("canFindContactableByIdentifier"));
		suite.addTest(new DAOTest("canFindAddressFromContactable"));
		suite.addTest(new DAOTest("canGetAllContactablesThatHasAnAddressByNativeSQL"));	
		//$JUnit-END$
		return suite;
	}
	

	
	
	
}
