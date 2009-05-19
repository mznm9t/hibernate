package test;



import java.util.Date;

import junit.framework.TestCase;

import org.hibernate.CacheMode;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import domain.ContactableH;

public class GetLoadTestMethod  extends TestCase{
	
	
	public void testLoadMethod(){
		
		Configuration configuration = new AnnotationConfiguration();
		configuration.configure("/SandBoxHibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		ContactableH contactable1=new ContactableH();
		contactable1.setEmail("test@test.com");
		contactable1.setLastUpdate(new Date());
		contactable1.setCreated(new Date());
		
		
		org.hibernate.Transaction t=session.beginTransaction();
		session.saveOrUpdate(contactable1);
		t.commit();//it generates the id.
		session.close();
		
		session=sessionFactory.openSession();
		ContactableH contactable2=(ContactableH) session.load(ContactableH.class, contactable1.getID());
		assertNotNull(contactable2);
		assertTrue("test@test.com".equals(contactable2.getEmail()));
		
		session=sessionFactory.openSession();
		t=session.beginTransaction();
		session.delete(contactable1);
		t.commit();
		session.close();
		
		session=sessionFactory.openSession();
		ContactableH contactable3=(ContactableH) session.load(ContactableH.class, contactable1.getID());
		assertNotNull(contactable3);//it does not break here
		boolean hasThrownAnException=false;
		try{
		assertTrue("test@test.com".equals(contactable3.getEmail()));//but it breaks here when retrieving the proxy	
		}catch(ObjectNotFoundException e){
			hasThrownAnException=true;
		}
		assertTrue(hasThrownAnException);
	}
		
public void testGetMethod(){
		
		Configuration configuration = new AnnotationConfiguration();
		configuration.configure("/SandBoxHibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		ContactableH contactable1=new ContactableH();
		contactable1.setEmail("test@test.com");
		contactable1.setLastUpdate(new Date());
		contactable1.setCreated(new Date());
		
		
		org.hibernate.Transaction t=session.beginTransaction();
		session.saveOrUpdate(contactable1);
		t.commit();//it generates the id.
		session.close();
		
		session=sessionFactory.openSession();
		ContactableH contactable2=(ContactableH) session.load(ContactableH.class, contactable1.getID());
		assertNotNull(contactable2);
		assertTrue("test@test.com".equals(contactable2.getEmail()));
		
		session=sessionFactory.openSession();
		t=session.beginTransaction();
		session.delete(contactable1);
		t.commit();
		session.close();
		
		session=sessionFactory.openSession();
		ContactableH contactable3=(ContactableH) session.get(ContactableH.class, contactable1.getID());
		assertNull(contactable3);//it does break here
	}

public void testLoadMethodWithCacheMode(){
	
	Configuration configuration = new AnnotationConfiguration();
	configuration.configure("/SandBoxHibernate.cfg.xml");
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.setCacheMode(CacheMode.NORMAL);
	
	//ANY CACHE CHANGE DOES NOT MAKE ANY DIFFERENCE IN THE BEHAIVOR OF LOAD METHOD
	/*session.setCacheMode(CacheMode.GET);
	session.setCacheMode(CacheMode.PUT);
	session.setCacheMode(CacheMode.IGNORE);
	session.setCacheMode(CacheMode.REFRESH);*/
	
	ContactableH contactable1=new ContactableH();
	contactable1.setEmail("test@test.com");
	contactable1.setLastUpdate(new Date());
	contactable1.setCreated(new Date());
	
	
	org.hibernate.Transaction t=session.beginTransaction();
	session.saveOrUpdate(contactable1);
	t.commit();//it generates the id.
	session.close();
	
	session=sessionFactory.openSession();
	ContactableH contactable2=(ContactableH) session.load(ContactableH.class, contactable1.getID());
	assertNotNull(contactable2);
	assertTrue("test@test.com".equals(contactable2.getEmail()));
	
	session=sessionFactory.openSession();
	t=session.beginTransaction();
	session.delete(contactable1);
	t.commit();
	session.close();
	
	session=sessionFactory.openSession();
	ContactableH contactable3=(ContactableH) session.load(ContactableH.class, contactable1.getID());
	assertNotNull(contactable3);//it does not break here
	boolean hasThrownAnException=false;
	try{
	assertTrue("test@test.com".equals(contactable3.getEmail()));//but it breaks here when retrieving the proxy	
	}catch(ObjectNotFoundException e){
		hasThrownAnException=true;
	}
	assertTrue(hasThrownAnException);
}

}
