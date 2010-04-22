package domain;
// default package



/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee extends Person implements java.io.Serializable {


    // Fields    

     private Long id;
     private String entityName;
     private Boolean current;


    // Constructors

    /** default constructor */
    public Employee() {
    }

    
    /** full constructor */
    public Employee(String entityName, Boolean current) {
        this.entityName = entityName;
        this.current = current;
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

    public Boolean getCurrent() {
        return this.current;
    }
    
    public void setCurrent(Boolean current) {
        this.current = current;
    }
   








}