package domain;

import interfaces.Division;
// default package



/**
 * Division entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class DivisionH  implements Division,java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private String name;


    // Constructors

    /** default constructor */
    public DivisionH() {
    }

    
    /** full constructor */
    public DivisionH(String entityName, String name) {
        this.entityName = entityName;
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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   








}