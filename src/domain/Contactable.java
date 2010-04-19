package domain;
// default package



/**
 * Contactable entity. @author MyEclipse Persistence Tools
 */

public class Contactable  implements java.io.Serializable {


    // Fields    

     private Long identifier;
	 private ID ID;
     private String entityName;
     private String notes;
     private ContactGroup mainGroup;
     private Address address;
     private PhoneNumber phone1;
     private PhoneNumber phone2;
     private PhoneNumber mobile;
     private PhoneNumber fax;
     private String email;
     private String www;
     private ContactStatus status;
     private Long created;
     private Long lastUpdate;
     private Long accountManager;
     private String knownAs;
     

    // Constructors

    /** default constructor */
    public Contactable() {
    }

    
    /** full constructor */
    public Contactable(String entityName, String notes, ContactGroup mainGroup, Address address, PhoneNumber phone1, PhoneNumber phone2, PhoneNumber mobile, PhoneNumber fax, String email, String www, ContactStatus status, Long created, Long lastUpdate, Long accountManager, String knownAs) {
        this.entityName = entityName;
        this.notes = notes;
        this.mainGroup = mainGroup;
        this.address = address;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.mobile = mobile;
        this.fax = fax;
        this.email = email;
        this.www = www;
        this.status = status;
        this.created = created;
        this.lastUpdate = lastUpdate;
        this.accountManager = accountManager;
        this.knownAs = knownAs;
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

    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ContactGroup getMainGroup() {
        return this.mainGroup;
    }
    
    public void setMainGroup(ContactGroup mainGroup) {
        this.mainGroup = mainGroup;
    }

    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhone1() {
        return this.phone1;
    }
    
    public void setPhone1(PhoneNumber phone1) {
        this.phone1 = phone1;
    }

    public PhoneNumber getPhone2() {
        return this.phone2;
    }
    
    public void setPhone2(PhoneNumber phone2) {
        this.phone2 = phone2;
    }

    public PhoneNumber getMobile() {
        return this.mobile;
    }
    
    public void setMobile(PhoneNumber mobile) {
        this.mobile = mobile;
    }

    public PhoneNumber getFax() {
        return this.fax;
    }
    
    public void setFax(PhoneNumber fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getWww() {
        return this.www;
    }
    
    public void setWww(String www) {
        this.www = www;
    }

    public ContactStatus getStatus() {
        return this.status;
    }
    
    public void setStatus(Long ContactStatus) {
        this.status = status;
    }

    public Long getCreated() {
        return this.created;
    }
    
    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getAccountManager() {
        return this.accountManager;
    }
    
    public void setAccountManager(Long accountManager) {
        this.accountManager = accountManager;
    }

    public String getKnownAs() {
        return this.knownAs;
    }
    
    public void setKnownAs(String knownAs) {
        this.knownAs = knownAs;
    }
   








}