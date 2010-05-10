package domain;
// default package



/**
 * ContactGroup entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class ContactGroupH  implements interfaces.ContactGroup,java.io.Serializable {


    // Fields    

	 private ID id;
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
		return id;
	}


	public void setID(ID iD) {
		id = iD;
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