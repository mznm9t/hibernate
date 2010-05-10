package domain;
// default package



/**
 * PRManager entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class PRManagerH extends PersonH implements interfaces.PRManager,java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private String fullName;


    // Constructors

    /** default constructor */
    public PRManagerH() {
    }

    
    /** full constructor */
    public PRManagerH(String entityName, String fullName) {
        this.entityName = entityName;
        this.fullName = fullName;
    }

   
    // Property accessors

    public ID getID() {
        return this.id;
    }
    
    public void setID(ID id) {
        this.id = id;
    }

    public String getEntityName() {
        return this.entityName;
    }
    
    @SuppressWarnings("unused")
	private void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
   








}