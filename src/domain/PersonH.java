package domain;

import interfaces.Company;

// default package



/**
 * Person entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class PersonH extends ContactableH implements interfaces.Person,java.io.Serializable {


    // Fields    

   
     private String entityName;
     private Company company;
     private String jobTitle;
     private String lastName;
     private String title;
     private String firstName;


    // Constructors

    /** default constructor */
    public PersonH() {
    }

    
    /** full constructor */
    public PersonH(String entityName, Company company, String jobTitle, String lastName, String title, String firstName) {
        this.entityName = entityName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.lastName = lastName;
        this.title = title;
        this.firstName = firstName;
    }

   
    // Property accessors

  

    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
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