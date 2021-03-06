package domain;
// default package



/**
 * ContactStatus entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class ContactStatusH  implements interfaces.ContactStatus,java.io.Serializable {


    // Fields    

	 private ID id;
     private String entityName;
     private String name;
     private String code;


    // Constructors

    /** default constructor */
    public ContactStatusH() {
    }

    
    /** full constructor */
    public ContactStatusH(String entityName, String name, String code) {
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
		return id;
	}


	public void setID(ID iD) {
		id = iD;
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