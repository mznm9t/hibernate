package domain;
// default package



/**
 * PRManager entity. @author MyEclipse Persistence Tools
 */

public class PRManager  implements java.io.Serializable {


    // Fields    

     private Long id;
     private String entityName;
     private String fullName;


    // Constructors

    /** default constructor */
    public PRManager() {
    }

    
    /** full constructor */
    public PRManager(String entityName, String fullName) {
        this.entityName = entityName;
        this.fullName = fullName;
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

    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
   








}