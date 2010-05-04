package domain;

import interfaces.ContactGivenType;
// default package



/**
 * ContactGivenType entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class ContactGivenTypeH  implements ContactGivenType, java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private Boolean telephone;
     private Boolean website;
     private String name;


    // Constructors

    /** default constructor */
    public ContactGivenTypeH() {
    }

    
    /** full constructor */
    public ContactGivenTypeH(String entityName, Boolean telephone, Boolean website, String name) {
        this.entityName = entityName;
        this.telephone = telephone;
        this.website = website;
        this.name = name;
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

    public Boolean getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(Boolean telephone) {
        this.telephone = telephone;
    }

    public Boolean getWebsite() {
        return this.website;
    }
    
    public void setWebsite(Boolean website) {
        this.website = website;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   








}