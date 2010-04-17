package domain;
// default package



/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address  implements java.io.Serializable {


    // Fields    

     private ID ID;
     private Long identifier;
     private String entityName;
     private String postcode;
     private String line4;
     private String line3;
     private String line2;
     private String line1;
     private Long country;


    // Constructors

    /** default constructor */
    public Address() {
    }

    
    /** full constructor */
    public Address(String entityName, String postcode, String line4, String line3, String line2, String line1, Long country) {
        this.entityName = entityName;
        this.postcode = postcode;
        this.line4 = line4;
        this.line3 = line3;
        this.line2 = line2;
        this.line1 = line1;
        this.country = country;
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


	private void setIdentifier(Long identifier) {
			this.identifier = identifier;
	}

    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getPostcode() {
        return this.postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLine4() {
        return this.line4;
    }
    
    public void setLine4(String line4) {
        this.line4 = line4;
    }

    public String getLine3() {
        return this.line3;
    }
    
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public String getLine2() {
        return this.line2;
    }
    
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine1() {
        return this.line1;
    }
    
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public Long getCountry() {
        return this.country;
    }
    
    public void setCountry(Long country) {
        this.country = country;
    }
   








}