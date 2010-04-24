package domain;
// default package



/**
 * PublicationTypeH entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class PublicationTypeH  implements interfaces.PublicationType, java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private String name;
     private String code;
     private Float value;


    // Constructors

    /** default constructor */
    public PublicationTypeH() {
    }

    
    /** full constructor */
    public PublicationTypeH(String entityName, String name, String code, Float value) {
        this.entityName = entityName;
        this.name = name;
        this.code = code;
        this.value = value;
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

    public Float getValue() {
        return this.value;
    }
    
    public void setValue(Float value) {
        this.value = value;
    }
}