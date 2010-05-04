package domain;

import interfaces.MentionType;

// default package



/**
 * MentionType entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class MentionTypeH  implements MentionType, java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private String name;
     private String code;


    // Constructors

    /** default constructor */
    public MentionTypeH() {
    }

    
    /** full constructor */
    public MentionTypeH(String entityName, String name, String code) {
        this.entityName = entityName;
        this.name = name;
        this.code = code;
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