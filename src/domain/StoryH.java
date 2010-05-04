package domain;

import interfaces.Company;
import interfaces.Message;
import interfaces.Story;
// default package



/**
 * Story entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class StoryH  implements Story, java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private Message message;
     private String title;
     private String description;
     private Company client;


    // Constructors

    /** default constructor */
    public StoryH() {
    }

    
    /** full constructor */
    public StoryH(String entityName, Message message, String title, String description, Company client) {
        this.entityName = entityName;
        this.message = message;
        this.title = title;
        this.description = description;
        this.client = client;
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
    

    public Message getMessage() {
        return this.message;
    }
    
    public void setMessage(Message message) {
        this.message = message;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Company getClient() {
        return this.client;
    }
    
    public void setClient(Company client) {
        this.client = client;
    }
   








}