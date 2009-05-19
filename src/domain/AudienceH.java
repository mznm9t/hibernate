package domain;

import interfaces.Audience;

// default package



/**
 * Audience entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class AudienceH  implements Audience,java.io.Serializable {


    // Fields    

	 private ID id;
     private String entityName;
     private String description;
     private String name;
     private Integer size;


    // Constructors

    /** default constructor */
    public AudienceH() {
    }
    
    /** full constructor */
    public AudienceH(String entityName, String description, String name, Integer size) {
        this.entityName = entityName;
        this.description = description;
        this.name = name;
        this.size = size;
    }

    public String getEntityName() {
        return this.entityName;
    }
    
    @SuppressWarnings("unused")
	private void setEntityName(String entityName) {
        this.entityName = entityName;
    }

	@Override
	public ID getID() {
		return this.id;
	}
	
	@SuppressWarnings("unused")
	private void setID(ID id) {
		this.id = id;
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

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

}