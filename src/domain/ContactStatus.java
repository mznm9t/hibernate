package domain;
// default package



/**
 * ContactStatus entity. @author MyEclipse Persistence Tools
 */

public class ContactStatus  implements java.io.Serializable {


    // Fields    

	 private ID ID;
	 private Long identifier;
     private String entityName;
     private String name;
     private String code;


    // Constructors

    /** default constructor */
    public ContactStatus() {
    }

    
    /** full constructor */
    public ContactStatus(String entityName, String name, String code) {
        this.entityName = entityName;
        this.name = name;
        this.code = code;
    }

   
    // Property accessors

  
    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

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

    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
   








}