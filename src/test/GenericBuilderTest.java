package test;

import static builders.BuilderDirector.aContactable;
import static builders.BuilderDirector.aPerson;
import static builders.BuilderDirector.aEmployee;
import static org.junit.Assert.assertEquals;
import interfaces.Employee;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import domain.ContactableH;
import domain.PersonH;

public class GenericBuilderTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void simpleBuilderWithSuperClass(){
		 String entityName = "Contactable";
		 String notes = "No notes";
		 String email="test@com.com";
	     String www="www.test.com";
		 String knownAs="The Contactable";
		 
		 String personEntityName="Person";
	     String jobTitle="Engineer";
	     String lastName="Nahhas";
	     String title="Mr";
	     String firstName="Omar";
	     
		 String employeeEntityName="Employee";
		 Boolean current=true;
		 
		 ContactableH c=(ContactableH) aContactable().build();		
	     assertEquals(entityName, c.getEntityName());
	     assertEquals(notes, c.getNotes()); 
	     assertEquals(email, c.getEmail());
	     assertEquals(www, c.getWww());
	     assertEquals(knownAs, c.getKnownAs());
	     assertEquals(email, c.getEmail());    
	     
	     PersonH p=(PersonH) aPerson().build();
	     assertEquals(personEntityName, p.getEntityName());
	     assertEquals(notes, p.getNotes());
	     assertEquals(email, p.getEmail());
	     assertEquals(www, p.getWww());
	     assertEquals(knownAs, p.getKnownAs());
	     assertEquals(email, p.getEmail());
	     assertEquals(jobTitle, p.getJobTitle());
	     assertEquals(lastName, p.getLastName());
	     assertEquals(title, p.getTitle());
	     assertEquals(firstName, p.getFirstName());
	     
	     Employee e= aEmployee().build();
	     assertEquals(employeeEntityName, e.getEntityName());
	     assertEquals(notes, e.getNotes());
	     assertEquals(email, e.getEmail());
	     assertEquals(www, e.getWww());
	     assertEquals(knownAs, e.getKnownAs());
	     assertEquals(email, e.getEmail());
	     assertEquals(jobTitle, e.getJobTitle());
	     assertEquals(lastName, e.getLastName());
	     assertEquals(title, e.getTitle());
	     assertEquals(firstName, e.getFirstName());
	     assertEquals(current, e.getCurrent());
	     
	     
	     
	}
		
	@Test
	public void customizedBuilderWithSuperClass(){
	
		 String notes = "My customzied notes";
	     String lastName="My customzied lastName";
	     String jobTitle="Accountant";
	     Boolean current=false;
	     
	     Employee e= aEmployee()
	     .withLastName(lastName)
	     .withNotes(notes)
	     .withJobTitle(jobTitle)
	     .withCurrent(current)
	     .build();
	   
	     assertEquals(notes, e.getNotes());
	     assertEquals(lastName, e.getLastName());
	     assertEquals(jobTitle, e.getJobTitle());
	     assertEquals(current, e.getCurrent());

	}

}
