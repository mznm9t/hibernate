package domain;
// default package



/**
 * ContactGroup entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class ContactGroupH  implements interfaces.ContactGroup,java.io.Serializable {


    // Fields    

	 private ID ID;
     private Long identifier;
     private String entityName;
     private String name;
     private String description;


    // Constructors

    /** default constructor */
    public ContactGroupH() {
    }

    
    /** full constructor */
    public ContactGroupH(String entityName, String name, String description) {
        this.entityName = entityName;
        this.name = name;
        this.description = description;
    }

   
    // Property accessors

    public ID getID() {
		return ID;
	}


	public void setID(ID iD) {
		ID = iD;
	}


	public Long getIdentifier() {
		return identifier;
	}


	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
	}

    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
   








}