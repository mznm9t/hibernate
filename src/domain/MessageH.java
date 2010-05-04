package domain;

import interfaces.Message;
// default package



/**
 * Message entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class MessageH  implements Message,java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private String name;
     private String description;


    // Constructors

    /** default constructor */
    public MessageH() {
    }

    
    /** full constructor */
    public MessageH(String entityName, String name, String description) {
        this.entityName = entityName;
        this.name = name;
        this.description = description;
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