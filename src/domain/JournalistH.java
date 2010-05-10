package domain;

import interfaces.Publication;

// default package



/**
 * Journalist entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class JournalistH extends PersonH implements interfaces.Journalist,java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private Publication publication;
     private Integer frequency;


    // Constructors

    /** default constructor */
    public JournalistH() {
    }

    
    /** full constructor */
    public JournalistH(String entityName, Publication publication, Integer frequency) {
        this.entityName = entityName;
        this.publication = publication;
        this.frequency = frequency;
    }

   
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

    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public Integer getFrequency() {
        return this.frequency;
    }
    
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
   








}