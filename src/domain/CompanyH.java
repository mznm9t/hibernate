package domain;

import interfaces.Person;
// default package



/**
 * Company entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class CompanyH extends ContactableH  implements interfaces.Company,java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private String name;
     private Person mainContact;


    // Constructors

    /** default constructor */
    public CompanyH() {
    }

    
    /** full constructor */
    public CompanyH(String entityName, String name, Person mainContact) {
        this.entityName = entityName;
        this.name = name;
        this.mainContact = mainContact;
    }

   
    // Property accessors

    public ID getID() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setID(ID id) {
		this.id = id;
	}
	
	
    public String getEntityName() {
        return this.entityName;
    }
    
    @SuppressWarnings("unused")
	private void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Person getMainContact() {
        return this.mainContact;
    }
    
    public void setMainContact(Person mainContact) {
        this.mainContact = mainContact;
    }
   








}