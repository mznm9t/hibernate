package domain;
// default package



/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person extends Contactable implements java.io.Serializable {


    // Fields    

     private Long id;
     private String entityName;
     private Long company;
     private String jobTitle;
     private String lastName;
     private String title;
     private String firstName;


    // Constructors

    /** default constructor */
    public Person() {
    }

    
    /** full constructor */
    public Person(String entityName, Long company, String jobTitle, String lastName, String title, String firstName) {
        this.entityName = entityName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.lastName = lastName;
        this.title = title;
        this.firstName = firstName;
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

    public Long getCompany() {
        return this.company;
    }
    
    public void setCompany(Long company) {
        this.company = company;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
   








}