package domain;
// default package



/**
 * Office entity. @author MyEclipse Persistence Tools
 */

public class Office extends Contactable implements java.io.Serializable {


    // Fields    

     private Long id;
     private String entityName;
     private String description;
     private String name;
     private Long region;
     private Long managedBy;


    // Constructors

    /** default constructor */
    public Office() {
    }

    
    /** full constructor */
    public Office(String entityName, String description, String name, Long region, Long managedBy) {
        this.entityName = entityName;
        this.description = description;
        this.name = name;
        this.region = region;
        this.managedBy = managedBy;
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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Long getRegion() {
        return this.region;
    }
    
    public void setRegion(Long region) {
        this.region = region;
    }

    public Long getManagedBy() {
        return this.managedBy;
    }
    
    public void setManagedBy(Long managedBy) {
        this.managedBy = managedBy;
    }
   








}