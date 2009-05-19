package domain;

import interfaces.Country;
// default package



/**
 * Country entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class CountryH  implements Country,java.io.Serializable {


    // Fields    

	 private ID id;
     private String entityName;
     private String name;
     private String isoCode;


    // Constructors

    /** default constructor */
    public CountryH() {
    }

    
    /** full constructor */
    public CountryH(String entityName, String name, String isoCode) {
        this.entityName = entityName;
        this.name = name;
        this.isoCode = isoCode;
    }

    public ID getID() {
		return this.id;
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

    public String getIsoCode() {
        return this.isoCode;
    }
    
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

}