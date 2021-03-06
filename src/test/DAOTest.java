package test;

import interfaces.Address;
import interfaces.Company;
import interfaces.Contactable;
import interfaces.Country;
import interfaces.Employee;
import interfaces.Journalist;
import interfaces.Office;
import interfaces.PRManager;
import interfaces.Person;
import interfaces.PhoneNumber;
import interfaces.Publication;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import access.AddressDAO;
import access.CompanyDAO;
import access.ContactableDAO;
import access.CountryDAO;
import access.EmployeeDAO;
import access.JournalistDAO;
import access.OfficeDAO;
import access.PRManagerDAO;
import access.PersonDAO;
import access.PhoneNumberDAO;
import access.PublicationDAO;
import core.HibernateSessionFactory;
import domain.EmployeeH;
import domain.ID;
import domain.JournalistH;
import domain.PersonH;

public class DAOTest extends TestCase {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "cars14";
	private static final String DBCLASS = "com.mysql.jdbc.Driver";
	private static final String DBNAME = "savillstest";
	private static final String DBURL = "jdbc:mysql://localhost/" + DBNAME;
	private static final String DBTABLEPREFIX = "com_fpdsavills_pr_";

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

	// this method runs a sql query and returns a list of ID , make sure the
	// first field on the select clause
	// is the id.
	private List<ID> runSQLQuery(String equery) {
		String dbid;
		String query = equery;
		List<ID> IDs = new ArrayList<ID>();
		try {
			Class.forName(DBCLASS);
			java.sql.Connection con = DriverManager.getConnection(DBURL,
					USERNAME, PASSWORD);
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				dbid = rs.getString(1);
				IDs.add(new ID(Long.parseLong(dbid)));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return IDs;
	}

	private List<ID> getOneToOneLinkedEntitiesByNativeSql(String parentEntity,
			String childEntity) {
		String sql = "SELECT c.ID FROM " + DBTABLEPREFIX + parentEntity
				+ " as c WHERE EXISTS (SELECT a.ID FROM " + DBTABLEPREFIX
				+ childEntity + " as a WHERE c." + childEntity.toLowerCase()
				+ "_=a.ID AND c." + childEntity.toLowerCase()
				+ "_ is not null)";
		return runSQLQuery(sql);
	}

	public void canFindAllAddresses() {
		AddressDAO addressDataProvider = new AddressDAO();
		Collection<Address> addresses = addressDataProvider.findAll();
		assertTrue("Founded " + addresses.size() + " addresses", !addresses
				.isEmpty());
		log.info("Founded " + addresses.size() + " addresses");
	}
	
	public void canFindAllContactables() {
		ContactableDAO addressDataProvider = new ContactableDAO();
		Collection<Contactable> addresses = addressDataProvider.findAll();
		assertTrue("Founded " + addresses.size() + " Contactable", !addresses
				.isEmpty());
		log.info("Founded " + addresses.size() + " Contactable");
	}

	public void canFindAllCompanies() {
		CompanyDAO contactableDataProvider = new CompanyDAO();
		List<Company> contactables = contactableDataProvider.findAll();
		assertTrue("Founded " + contactables.size() + " companies",
				!contactables.isEmpty());
		log.info("Founded " + contactables.size() + " companies");
	}

	public void canFindAllEmployee() {
		EmployeeDAO contactableDataProvider = new EmployeeDAO();
		Collection<Employee> contactables = contactableDataProvider.findAll();
		assertTrue("Founded " + contactables.size() + " Employee",
				!contactables.isEmpty());
		log.info("Founded " + contactables.size() + " Employee");
	}

	public void canFindAllJournalist() {
		JournalistDAO contactableDataProvider = new JournalistDAO();
		Collection<Journalist> contactables = contactableDataProvider.findAll();
		assertTrue("Founded " + contactables.size() + " Journalist",
				!contactables.isEmpty());
		log.info("Founded " + contactables.size() + " Journalist");
	}

	public void canFindAllOffice() {
		OfficeDAO contactableDataProvider = new OfficeDAO();
		Collection<Office> contactables = contactableDataProvider.findAll();
		assertTrue("Founded " + contactables.size() + " Office", !contactables
				.isEmpty());
		log.info("Founded " + contactables.size() + " Office");
	}

	public void canFindAllAPerson() {
		PersonDAO contactableDataProvider = new PersonDAO();
		Collection<Person> contactables = contactableDataProvider.findAll();
		assertTrue("Founded " + contactables.size() + " Person", !contactables
				.isEmpty());
		log.info("Founded " + contactables.size() + " Person");
	}

	public void canFindAllPRManager() {
		PRManagerDAO contactableDataProvider = new PRManagerDAO();
		Collection<PRManager> contactables = contactableDataProvider.findAll();
		assertTrue("Founded " + contactables.size() + " PRManager",
				!contactables.isEmpty());
		log.info("Founded " + contactables.size() + " PRManager");
	}

	public void canFindAllPublication() {
		PublicationDAO contactableDataProvider = new PublicationDAO();
		Collection<Publication> contactables = contactableDataProvider
				.findAll();
		assertTrue("Founded " + contactables.size() + " Publication",
				!contactables.isEmpty());
		log.info("Founded " + contactables.size() + " Publication");
	}

	public void canFindAllAContactable() {
		ContactableDAO contactableDataProvider = new ContactableDAO();
		Collection<Contactable> contactables = contactableDataProvider
				.findAll();
		assertTrue("Founded " + contactables.size() + " Contactable",
				!contactables.isEmpty());
		log.info("Founded " + contactables.size() + " Contactable");
	}

	/*public void canFindContactableByIdentifier() {
		Long IDLONG = new Long("-9206799015780976182");
		ContactableDAO contactableDataProvider = new ContactableDAO();
		List<Contactable> contacatables = contactableDataProvider
				.findByIdentifier(IDLONG);
		Contactable contactable = contacatables.get(0);
		assertTrue(contacatables.size() == 1);
		assertTrue(contactable.getID().equals(new ID(IDLONG)));
	}*/

	public void canFindAddressFromContactable() {
		Long IDLONG = new Long("-6073657009662267811");
		Long IDADDLONG = new Long("9208485891119933922");
		ContactableDAO contactableDataProvider = new ContactableDAO();
		ID id = new ID(IDLONG);
		Contactable contactable2 = contactableDataProvider.findById(id);
		assertNotNull(contactable2);
		assertNotNull(contactable2.getID());
		assertNotNull(contactable2.getAddress());
		assertNotNull(contactable2.getAddress().getID());
		assertTrue(new ID(IDADDLONG).equals(contactable2.getAddress().getID()));
		assertTrue("com.fpdsavills.pr.Address".equals(contactable2.getAddress()
				.getEntityName()));
	}

	public void canGetAllContactablesThatHasAnAddressByNativeSQL() {
		List<ID> IDs = getOneToOneLinkedEntitiesByNativeSql("Contactable",
				"Address");
		log.info("Founded " + IDs.size() + " contactables who has an address");
		assertTrue(IDs.size() == 111);
	}

	@SuppressWarnings("deprecation")
	public void catGetDatefromContactable(){
		Long id=new Long("-8899529580270853052");
		ContactableDAO contactableDataProvider = new ContactableDAO();
		Contactable contactable=contactableDataProvider.findById(new ID(id));
		log.info("Contactable Date "+contactable.getCreated());
		assertNotNull(contactable.getCreated());
		assertEquals("14 Oct 2004 23:00:00 GMT", contactable.getCreated().toGMTString());
		
	}
	
	public void catSetDatefromContactable(){
		Long id=new Long("-8899529580270853052");
		Date nowDate=new Date();
		
		ContactableDAO contactableDataProvider = new ContactableDAO();
		Contactable contactable=contactableDataProvider.findById(new ID(id));
		contactable.setLastUpdate(nowDate);
		getSession().flush();
		HibernateSessionFactory.closeSession();
		contactableDataProvider = new ContactableDAO();

		contactable=contactableDataProvider.findById(new ID(id));
		assertEquals(contactable.getLastUpdate(), nowDate);
		
	}
	
	@SuppressWarnings("unchecked")
	public void canGetAllContactablesThatHasAnAddressByDetachedCriteria() {
		DetachedCriteria criteria = DetachedCriteria.forEntityName(
				"domain.ContactableH").add(Restrictions.isNotNull("address"));
		List<Contactable> contactableWithAddress = criteria
				.getExecutableCriteria(getSession()).list();
		assertEquals(111, contactableWithAddress.size());
	}
	

	public void canGetPublicationByName() {
		String NAME="Hampshire Golf";
		PublicationDAO publicationDAO=new PublicationDAO();
		List<Publication> publications=publicationDAO.findByCriteria(Restrictions.eq("name", NAME));
		assertEquals(1, publications.size());
		assertEquals(publications.iterator().next().getName(),NAME);		
	}
	
	

	public void canGetCompanyByName() {
		String NAME="FPD Savills";
		CompanyDAO companyDAO=new CompanyDAO();
		List<Company> publications=companyDAO.findByCriteria(Restrictions.eq("name", NAME));
		assertEquals(1, publications.size());
		assertEquals(publications.iterator().next().getName(),NAME);		
	}
	
	public void canGetCountryFromAddress() {
		ID id=new ID(new Long("-8159254789568338835"));
		AddressDAO addressDAO=new AddressDAO();
		Address address=addressDAO.findById(id);
		assertNotNull(id);
		assertEquals("Holland", address.getCountry().getName());				
	}
	
	public void canFindAllCountries() {
		CountryDAO countryDataProvider = new CountryDAO();
		Collection<Country> contactables = countryDataProvider
				.findAll();
		assertTrue("Founded " + contactables.size() + " countries",
				!contactables.isEmpty());
		log.info("Founded " + contactables.size() + " countries");
	}

	public void canGetAllContactablesThatHasAnAddressByFindByCriteron() {
		ContactableDAO contactableDataProvider = new ContactableDAO();
		List<Contactable> contactableWithAddress = contactableDataProvider
				.findByCriteria(Restrictions.isNotNull("address"));
		assertEquals(111, contactableWithAddress.size());
	}

	@SuppressWarnings("unchecked")
	public void catGetContactByOneOfThePhoneNumbersPhoneNumber() {

		Long IDLONG = new Long("-9148036790037986107");
		String PHONENUMBER = "0115 9102106";

		DetachedCriteria phoneCriteria = DetachedCriteria.forClass(
				PhoneNumber.class, "pho").add(
				Restrictions.eq(PhoneNumberDAO.THE_NUMBER, PHONENUMBER));

		PhoneNumber phoneNumber = (PhoneNumber) phoneCriteria
				.getExecutableCriteria(getSession()).uniqueResult();

		assertNotNull(phoneNumber);

		assertTrue(phoneNumber.getTheNumber().equals(PHONENUMBER));

		assertTrue(phoneNumber.getID().equals(new ID(IDLONG)));

		Criteria mainCriteria = getSession().createCriteria(Contactable.class)
				.add(
						Restrictions.disjunction().add(
								Property.forName(ContactableDAO.PHONE1).eq(
										phoneNumber)).add(
								Property.forName(ContactableDAO.PHONE2).eq(
										phoneNumber)).add(
								Property.forName(ContactableDAO.MOBILE).eq(
										phoneNumber)).add(
								Property.forName(ContactableDAO.FAX).eq(
										phoneNumber)));
		List<Contactable> contactableWithAddress = mainCriteria.list();

		Contactable contactable = (Contactable) mainCriteria.uniqueResult();

		assertEquals(1, contactableWithAddress.size());
		log.info("Founded " + contactable.getEntityName()
				+ "with the following number " + PHONENUMBER);
		assertTrue(!contactableWithAddress.isEmpty());

		assertEquals(contactable.getPhone1().getTheNumber(), PHONENUMBER);
	}


	public void catGetContactByOneOfThePhoneNumbersPhoneNumberByDotNotation() {

		String PHONENUMBER = "0115 9102106";

		Query q = getSession().createQuery(
				"select c from ContactableH c where c.phone1.theNumber=:number");
		q.setString("number", PHONENUMBER);
		ContactableDAO contactableDataProvider = new ContactableDAO();
		List<Contactable> contactableWithAddress = contactableDataProvider.findByHQL(q);

		Contactable contactable = (Contactable) q.uniqueResult();

		assertEquals(1, contactableWithAddress.size());
		log.info("Founded " + contactable.getEntityName()
				+ "with the following number " + PHONENUMBER);
		assertTrue(!contactableWithAddress.isEmpty());

		assertEquals(contactable.getPhone1().getTheNumber(), PHONENUMBER);
	}

	public void canFindContactableWithSpecificAddress() {
		String ADDRESS = "Finsbury Circus";
		Criteria mainCriteria = getSession().createCriteria(
				"domain.ContactableH").createCriteria("address").add(
				Property.forName(AddressDAO.LINE1).eq(ADDRESS));

		assertEquals(mainCriteria.list().size(), 1);

		Contactable contactable = (Contactable) mainCriteria.uniqueResult();

		assertEquals(contactable.getAddress().getLine1(), ADDRESS);

	}

	public void canNavegateFromPersonToContactable() {

		String MAIL = "geoff.hedge@nqo.com";
		String FIRSTNAME = "Geoff";
		PersonDAO contactableDataProvider = new PersonDAO();
		Person testPerson = new PersonH();
		testPerson.setEmail(MAIL);
		
		Collection<Person> contactables = contactableDataProvider
				.findByExample(testPerson);
		assertTrue("Founded " + contactables.size() + " Person", !contactables
				.isEmpty());
		log.info("Founded " + contactables.size() + " Person with mail "+ MAIL);
		Person person = contactables.iterator().next();
		log.info("Person : " + person.getFirstName());
		assertEquals(MAIL, person.getEmail());
		assertEquals(FIRSTNAME, person.getFirstName());
	}

	public void canNavegateFromJournalistToContactable() {
		String MAIL = "geoff.hedge@nqo.com";
		String FIRSTNAME = "Geoff";
		PublicationDAO publicationDataProvider=new PublicationDAO();
		Publication PUBLICATION=publicationDataProvider.findById(new ID(new Long(769)));
		
		JournalistDAO contactableDataProvider = new JournalistDAO();
		Journalist testPerson = new JournalistH();
		testPerson.setFirstName(FIRSTNAME);
		Collection<Journalist> contactables = contactableDataProvider
				.findByExample(testPerson);
		assertTrue("Founded " + contactables.size() + " Person", !contactables
				.isEmpty());
		log
				.info("Founded " + contactables.size() + " Person with mail "
						+ MAIL);
		Journalist person = contactables.iterator().next();
		log.info("Person : " + person.getFirstName());
		assertEquals(MAIL, person.getEmail());
		assertEquals(FIRSTNAME, person.getFirstName());
		assertEquals(PUBLICATION, person.getPublication());
	}
	
	public void canNavegateFromEmployeeToContactable() {
		String PHONE = "345345345";
		String FIRSTNAME = "John";
		Boolean CURRENT = true;
		
		EmployeeDAO contactableDataProvider = new EmployeeDAO();
		Employee testPerson = new EmployeeH();
		testPerson.setFirstName(FIRSTNAME);
		testPerson.setCurrent(CURRENT);
		Collection<Employee> contactables = contactableDataProvider
				.findByExample(testPerson);
		assertTrue("Founded " + contactables.size() + " Person", !contactables
				.isEmpty());
		log
				.info("Founded " + contactables.size() + " Person with FIRSTNAME "
						+ FIRSTNAME);
		Employee person = contactables.iterator().next();
		log.info("Person : " + person.getFirstName());
		assertEquals(CURRENT, person.getCurrent());
		assertEquals(FIRSTNAME, person.getFirstName());
		assertEquals(PHONE, person.getFax().getTheNumber());
	}
	
	public void canFindContactableByID() {
		Long IDLONG = new Long("-9206799015780976182");
		ContactableDAO contactableDataProvider = new ContactableDAO();
		ID id = new ID(IDLONG);
		
		Contactable contactable2 = (Contactable) contactableDataProvider
				.findById(id);
		assertNotNull(contactable2);
		assertNotNull(contactable2.getID());

	}
	

	/**
	 * @return
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite("Running all test test");
		// $JUnit-BEGIN$
		
		suite.addTest(new DAOTest("canFindAllContactables")); 
		suite.addTest(new DAOTest("catGetDatefromContactable")); 
		suite.addTest(new DAOTest("catSetDatefromContactable")); 
		
		suite.addTest(new DAOTest("canFindAllCompanies")); 
		suite.addTest(new DAOTest("canFindAllAddresses")); 
		suite.addTest(new DAOTest("canFindAllEmployee")); 
		suite.addTest(new DAOTest("canFindAllJournalist"));
		
		suite.addTest(new DAOTest("canFindAllAPerson"));  
		
		suite.addTest(new DAOTest("canFindAllPRManager"));		
		
		suite.addTest(new DAOTest("canFindContactableByID")); 
		suite.addTest(new DAOTest("canFindAddressFromContactable")); 
		suite.addTest(new DAOTest("canGetAllContactablesThatHasAnAddressByNativeSQL"));
		suite.addTest(new DAOTest("canGetAllContactablesThatHasAnAddressByDetachedCriteria"));
		suite.addTest(new DAOTest("canGetAllContactablesThatHasAnAddressByFindByCriteron"));
		suite.addTest(new DAOTest("catGetContactByOneOfThePhoneNumbersPhoneNumber"));
		suite.addTest(new DAOTest("canFindContactableWithSpecificAddress"));
		suite.addTest(new DAOTest("catGetContactByOneOfThePhoneNumbersPhoneNumberByDotNotation"));
		 
		suite.addTest(new DAOTest("canNavegateFromPersonToContactable"));
		suite.addTest(new DAOTest("canNavegateFromJournalistToContactable"));
		suite.addTest(new DAOTest("canNavegateFromEmployeeToContactable"));
		
		suite.addTest(new DAOTest("canFindAllOffice"));
		suite.addTest(new DAOTest("canFindAllPublication"));
		suite.addTest(new DAOTest("canFindAllCompanies"));
		suite.addTest(new DAOTest("canGetPublicationByName"));
		suite.addTest(new DAOTest("canGetCompanyByName"));
		
		suite.addTest(new DAOTest("canGetCountryFromAddress"));
		suite.addTest(new DAOTest("canFindAllCountries"));
		
		
		
		
		
		
		
		// $JUnit-END$
		return suite;
	}

}
