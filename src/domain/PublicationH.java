package domain;

import java.util.Collection;

import interfaces.Audience;
import interfaces.PublicationType;
// default package



/**
 * Publication entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class PublicationH extends CompanyH implements interfaces.Publication,java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private String description;
     private String publicationName;
     private PublicationType type;
     private Float value;


    // Constructors

    /** default constructor */
    public PublicationH() {
    }

    
    /** full constructor */
    public PublicationH(String entityName, String description, String publicationName, PublicationType type, Float value) {
        this.entityName = entityName;
        this.description = description;
        this.publicationName = publicationName;
        this.type = type;
        this.value = value;
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

    public PublicationType getType() {
        return this.type;
    }
    
    public void setType(PublicationType type) {
        this.type = type;
    }

    public Float getValue() {
        return this.value;
    }
    
    public void setValue(Float value) {
        this.value = value;
    }


	@Override
	public void addAudience(Audience aAudience) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addAudiences(Collection aAudiences) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clearAudiences() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean containsAudience(Audience aAudience) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Collection getAudiences() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Audience[] getAudiencesAsArray() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void removeAudience(Audience aAudience) {
		// TODO Auto-generated method stub
		
	}
   








}