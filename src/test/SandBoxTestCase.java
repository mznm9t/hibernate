package test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.DriverManager;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.dbunit.DatabaseTestCase;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.excel.XlsDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.hibernate.Session;

import core.HibernateSessionFactory;

public class SandBoxTestCase extends DatabaseTestCase {
	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "cars14";
	private static final String DBCLASS = "com.mysql.jdbc.Driver";
	private static final String DBNAME = "savillsblank";
	private static final String DBURL = "jdbc:mysql://localhost/" + DBNAME;
	private static final String SANDBOX_DB = "dataSets/savillsBlank.xls";
	
	
	public SandBoxTestCase(String testName) {
	 super(testName);
	}

	public void setUp() throws Exception {
	  super.setUp();
	}
	

	public void tearDown() throws Exception {
	}
	
	public void checkSandBox() throws Exception {
		assertEquals(getDatabaseTester().getDataSet().getTableNames().length,33);
	}
	
	/*
	 * This method show an example of how you can export data to XLS in order to use it a test sample afterwards.
	 */
    	public void checkSandBoxCreation() throws Exception {
		XlsDataSet.write( getConnection().createDataSet(),new FileOutputStream("exportedDB.xls"));
	}
	
	/*
	 * This method show an example of how you can export data to XML in order to use it a test sample afterwards.
	 */
    /*  public void testSandBoxCreation() throws Exception {
    	XmlDataSet.write( getConnection().createDataSet(),new FileOutputStream("exportedDB.xml"));
	}
	*/
	
    protected Session getSession() {
    		Session session=HibernateSessionFactory.getSession();
    		//session.setCacheMode(CacheMode.IGNORE);
    		return session;
    }
    
    protected Session getNewSession() {
		return HibernateSessionFactory.getNewSession();
    }
    	
	protected IDatabaseConnection getConnection() throws Exception {
	    Class.forName(DBCLASS);
        return new DatabaseConnection(DriverManager.getConnection(DBURL, USERNAME,PASSWORD));
	}
	
	protected IDataSet getDataSet() throws Exception {
		if(SANDBOX_DB.endsWith("xml")) return getDataSetXML();
		else if(SANDBOX_DB.endsWith("xls")) return getDataSetXLS();
		else throw new Exception("There is not an appropiated method to import the sandbox DB - "+SANDBOX_DB);
	}

	protected IDataSet getDataSetXLS() throws Exception {
		FileInputStream file;
		try{
			file = new FileInputStream(SANDBOX_DB);
			return new XlsDataSet(file);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			throw e;
		}catch(DataSetException e){
			e.printStackTrace();
			throw e;
		}

	}
	
	protected IDataSet getDataSetXML() throws Exception {
		FileInputStream file;
		try{
			file = new FileInputStream(SANDBOX_DB);
			FlatXmlDataSetBuilder builder=new FlatXmlDataSetBuilder();
			return builder.build(file);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			throw e;
		}catch(DataSetException e){
			e.printStackTrace();
			throw e;
		}
	}
	
	@SuppressWarnings("unused")
	private static Test suite() {
	TestSuite suite = new TestSuite("Running all test test");
	suite.addTest(new PersitabilityTest("checkSandBox"));  
	suite.addTest(new PersitabilityTest("checkSandBoxCreation"));  
	return suite;
}

}
