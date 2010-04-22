package domain;
// default package



/**
 * Company entity. @author MyEclipse Persistence Tools
 */

public class Company extends Contactable implements java.io.Serializable {


    // Fields    

     private Long id;
     private String entityName;
     private String name;
     private Long mainContact;


    // Constructors

    /** default constructor */
    public Company() {
    }

    
    /** full constructor */
    public Company(String entityName, String name, Long mainContact) {
        this.entityName = entityName;
        this.name = name;
        this.mainContact = mainContact;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Long getMainContact() {
        return this.mainContact;
    }
    
    public void setMainContact(Long mainContact) {
        this.mainContact = mainContact;
    }
   








}