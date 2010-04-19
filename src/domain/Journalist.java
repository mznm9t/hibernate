package domain;
// default package



/**
 * Journalist entity. @author MyEclipse Persistence Tools
 */

public class Journalist  implements java.io.Serializable {


    // Fields    

     private Long id;
     private String entityName;
     private Long publication;
     private Integer frequency;


    // Constructors

    /** default constructor */
    public Journalist() {
    }

    
    /** full constructor */
    public Journalist(String entityName, Long publication, Integer frequency) {
        this.entityName = entityName;
        this.publication = publication;
        this.frequency = frequency;
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

    public Long getPublication() {
        return this.publication;
    }
    
    public void setPublication(Long publication) {
        this.publication = publication;
    }

    public Integer getFrequency() {
        return this.frequency;
    }
    
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
   








}