package domain;

import interfaces.Country;
// default package



/**
 * Address entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class AddressH implements interfaces.Address,java.io.Serializable {


    // Fields    

     private ID id;
     private String entityName;
     private String postcode;
     private String line4;
     private String line3;
     private String line2;
     private String line1;
     private Country country;
     
    // Constructors

    /** default constructor */
    public AddressH() {
    }

    
    /** full constructor */
    public AddressH(String entityName, String postcode, String line4, String line3, String line2, String line1, Country country) {
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

    public Country getCountry() {
        return this.country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }
	
}