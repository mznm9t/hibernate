package domain;
// default package



/**
 * PhoneNumber entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class PhoneNumberH  implements interfaces.PhoneNumber,java.io.Serializable {


    // Fields    

	 private ID ID;
	 private Long identifier;
     private String entityName;
     private String areaCode;
     private String theNumber;
     private String countryCode;

    // Constructors

    /** default constructor */
    public PhoneNumberH() {
    }

    
    /** full constructor */
    public PhoneNumberH(String entityName, String areaCode, String theNumber, String countryCode) {
        this.entityName = entityName;
        this.areaCode = areaCode;
        this.theNumber = theNumber;
        this.countryCode = countryCode;
    }

   
    // Property accessors

    public ID getID() {
		return ID;
	}


	public void setID(ID iD) {
		ID = iD;
	}


	public Long getIdentifier() {
		return identifier;
	}


	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
	}

    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getAreaCode() {
        return this.areaCode;
    }
    
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getTheNumber() {
        return this.theNumber;
    }
    
    public void setTheNumber(String theNumber) {
        this.theNumber = theNumber;
    }

    public String getCountryCode() {
        return this.countryCode;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
   








}