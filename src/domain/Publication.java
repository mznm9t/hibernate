package domain;
// default package



/**
 * Publication entity. @author MyEclipse Persistence Tools
 */

public class Publication  implements java.io.Serializable {


    // Fields    

     private Long id;
     private String entityName;
     private String description;
     private String publicationName;
     private Long type;
     private Float value;


    // Constructors

    /** default constructor */
    public Publication() {
    }

    
    /** full constructor */
    public Publication(String entityName, String description, String publicationName, Long type, Float value) {
        this.entityName = entityName;
        this.description = description;
        this.publicationName = publicationName;
        this.type = type;
        this.value = value;
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

    public String getPublicationName() {
        return this.publicationName;
    }
    
    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public Long getType() {
        return this.type;
    }
    
    public void setType(Long type) {
        this.type = type;
    }

    public Float getValue() {
        return this.value;
    }
    
    public void setValue(Float value) {
        this.value = value;
    }
   








}