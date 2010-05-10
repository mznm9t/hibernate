package test;


import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import domain.ContactableH;
import domain.PersonH;
import interfaces.Address;
import interfaces.Company;
import interfaces.ContactGroup;
import interfaces.ContactStatus;
import interfaces.Employee;
import interfaces.PhoneNumber;

import static builders.BuilderDirector.*;
import static core.ReflectiveUtil.hasSameValues;
import static org.junit.Assert.*;

public class BuilderTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void simpleBuilder(){
		 String entityName="PhoneNumber";
	     String areaCode="02";
	     String theNumber="7689872634";
	     String countryCode="+44";
	     
	     PhoneNumber number=aPhoneNumber().build();
	     assertEquals(entityName, number.getEntityName());
	     assertEquals(areaCode, number.getAreaCode());
	     assertEquals(theNumber, number.getTheNumber());
	     assertEquals(countryCode, number.getCountryCode());
	}
	
	@Test
	public void simpleBuilderWithSuperClass(){
		 Date NOW=new Date();
		 String entityName = "Contactable";
		 String notes = "No notes";
		 Address address = anAddress().build();
		 PhoneNumber phone1 = aPhoneNumber().build();
		 PhoneNumber phone2 = aPhoneNumber().build();
		 PhoneNumber mobile = aPhoneNumber().build();
		 PhoneNumber fax = aPhoneNumber().build();
		 String email="test@com.com";
	     String www="www.test.com";
		 Employee accountManager = aEmployee().build();
		 String knownAs="The Contactable";
		 ContactGroup mainGroup = aContactGroup()
		.build();
		 ContactStatus status = aContactStatus()
		.build();
		 
		 Company company=aCompany().withCreated(NOW).withLastUpdate(NOW).build();
	     String jobTitle="Engineer";
	     String lastName="Nahhas";
	     String title="Mr";
	     String firstName="Omar";
		 String personEntityName="Person";
		
		 ContactableH c=(ContactableH) aContactable().build();
		
	     assertEquals(entityName, c.getEntityName());
	     assertEquals(notes, c.getNotes());
	     
	     assertTrue(hasSameValues(phone1,c.getPhone1()));
	     assertTrue(hasSameValues(status,c.getStatus()));
	     assertTrue(hasSameValues(phone2,c.getPhone2()));
	     assertTrue(hasSameValues(mobile,c.getMobile()));
	     assertTrue(hasSameValues(fax,c.getFax()));
	     assertEquals(email, c.getEmail());
	     assertEquals(www, c.getWww());
	     assertTrue(hasSameValues(address,c.getAddress()));
	     assertEquals(knownAs, c.getKnownAs());
	     assertEquals(email, c.getEmail());
	     assertTrue(hasSameValues(accountManager.getFirstName(),c.getAccountManager().getFirstName()));
	     assertTrue(hasSameValues(mainGroup,c.getMainGroup()));
	     
	     
	     PersonH p=(PersonH) aPerson().withCompany(aCompany().withCreated(NOW).withLastUpdate(NOW).build()).build();
	     assertEquals(personEntityName, p.getEntityName());
	     assertEquals(notes, p.getNotes());
	     assertTrue(hasSameValues(address,p.getAddress()));
	     assertTrue(hasSameValues(phone1,p.getPhone1()));
	     assertTrue(hasSameValues(phone2,p.getPhone2()));
	     assertTrue(hasSameValues(mobile,p.getMobile()));
	     assertTrue(hasSameValues(fax,p.getFax()));
	     assertEquals(email, p.getEmail());
	     assertEquals(www, p.getWww());
	     assertEquals(knownAs, p.getKnownAs());
	     assertEquals(email, p.getEmail());
	     assertTrue(hasSameValues(accountManager.getFirstName(),p.getAccountManager().getFirstName()));
	     assertTrue(hasSameValues(mainGroup,p.getMainGroup()));
	     assertTrue(hasSameValues(status,p.getStatus()));
	     assertTrue(hasSameValues(company,p.getCompany()));
	     assertEquals(jobTitle, p.getJobTitle());
	     assertEquals(lastName, p.getLastName());
	     assertEquals(title, p.getTitle());
	     assertEquals(firstName, p.getFirstName());
	}
	
	@Test
	public void simpleBuilderWithSuperClassWithDifferntValues(){
		 Date NOW=new Date();
		 String entityName = "Contactable";
		 String notes = "No notes";
		 Address address = anAddress().build();
		 
		 address.setLine1("OTHER LINE");
		 PhoneNumber phone1 = aPhoneNumber().build();
		 phone1.setAreaCode("99");
		 PhoneNumber phone2 = aPhoneNumber().build();
		 PhoneNumber mobile = aPhoneNumber().build();
		 PhoneNumber fax = aPhoneNumber().build();
		 String email="test@com.com";
	     String www="www.test.com";
		 Employee accountManager = aEmployee().build();
		 String knownAs="The Contactable";
		 ContactGroup mainGroup = aContactGroup()
		.build();
		 ContactStatus status = aContactStatus()
		.build();
		 
		 Company company=aCompany().withCreated(NOW).withLastUpdate(NOW).build();
	     String jobTitle="Engineer";
	     String lastName="Nahhas";
	     String title="Mr";
	     String firstName="Omar";
		 String personEntityName="Person";
		
		 ContactableH c=(ContactableH) aContactable().build();
		
	     assertEquals(entityName, c.getEntityName());
	     assertEquals(notes, c.getNotes());
	     
	     assertFalse(hasSameValues(phone1,c.getPhone1()));
	     assertTrue(hasSameValues(status,c.getStatus()));
	     assertTrue(hasSameValues(phone2,c.getPhone2()));
	     assertTrue(hasSameValues(mobile,c.getMobile()));
	     assertTrue(hasSameValues(fax,c.getFax()));
	     assertEquals(email, c.getEmail());
	     assertEquals(www, c.getWww());
	     assertFalse(hasSameValues(address,c.getAddress()));
	     assertEquals(knownAs, c.getKnownAs());
	     assertEquals(email, c.getEmail());
	     assertTrue(hasSameValues(accountManager.getFirstName(),c.getAccountManager().getFirstName()));
	     assertTrue(hasSameValues(mainGroup,c.getMainGroup()));
	     
	     
	     PersonH p=(PersonH) aPerson().withCompany(aCompany().withCreated(NOW).withLastUpdate(NOW).build()).build();
	     assertEquals(personEntityName, p.getEntityName());
	     assertEquals(notes, p.getNotes());
	     assertFalse(hasSameValues(address,p.getAddress()));
	     assertFalse(hasSameValues(phone1,p.getPhone1()));
	     assertTrue(hasSameValues(phone2,p.getPhone2()));
	     assertTrue(hasSameValues(mobile,p.getMobile()));
	     assertTrue(hasSameValues(fax,p.getFax()));
	     assertEquals(email, p.getEmail());
	     assertEquals(www, p.getWww());
	     assertEquals(knownAs, p.getKnownAs());
	     assertEquals(email, p.getEmail());
	     assertTrue(hasSameValues(accountManager.getFirstName(),p.getAccountManager().getFirstName()));
	     assertTrue(hasSameValues(mainGroup,p.getMainGroup()));
	     assertTrue(hasSameValues(status,p.getStatus()));
	     assertTrue(hasSameValues(company,p.getCompany()));
	     assertEquals(jobTitle, p.getJobTitle());
	     assertEquals(lastName, p.getLastName());
	     assertEquals(title, p.getTitle());
	     assertEquals(firstName, p.getFirstName());
	}
	
	@Test
	public void customizedBuilder(){
		 String entityName="PhoneNumber";
	     String areaCode="05";
	     String theNumber="976617632";
	     String countryCode="+32";
	     
	     PhoneNumber number=aPhoneNumber()
	     .withAreaCode(areaCode)
	     .withTheNumber(theNumber)
	     .withCountryCode(countryCode).build();
	     
	     assertEquals(entityName, number.getEntityName());
	     assertEquals(areaCode, number.getAreaCode());
	     assertEquals(theNumber, number.getTheNumber());
	     assertEquals(countryCode, number.getCountryCode());
	}
	
	@Test
	public void customizedBuilderWithSuperClass(){
	
		 String notes = "My customzied notes";
	     String lastName="My customzied lastName";
	  
	     PersonH p=(PersonH) aPerson()
	     .withLastName(lastName)
	     .withNotes(notes)
	     .build();
	   
	     assertEquals(notes, p.getNotes());
	     assertEquals(lastName, p.getLastName());

	}

}
