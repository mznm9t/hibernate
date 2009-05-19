package domain;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import interfaces.Address;
import interfaces.ContactEvent;
import interfaces.ContactGroup;
import interfaces.ContactStatus;
import interfaces.PhoneNumber;
// default package
import interfaces.Employee;



/**
 * Contactable entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class ContactableH  implements interfaces.Contactable,java.io.Serializable {


    // Fields    
	 private ID id;
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
     private Date created;
     private Date lastUpdate;
     private Employee accountManager;
     private String knownAs;
     private Set<ContactEvent> contactEvents;
     

    // Constructors

    /** default constructor */
    public ContactableH() {
    }

    
    /** full constructor */
    public ContactableH(String entityName, String notes, ContactGroup mainGroup, Address address, PhoneNumber phone1, PhoneNumber phone2, PhoneNumber mobile, PhoneNumber fax, String email, String www, ContactStatus status, Date created, Date lastUpdate, Employee accountManager, String knownAs,Set<ContactEvent> contactEvents) {
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
        this.contactEvents = contactEvents;
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
    
    public void setStatus(ContactStatus status) {
        this.status = status;
    }

    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Employee getAccountManager() {
        return this.accountManager;
    }
    
    public void setAccountManager(Employee accountManager) {
        this.accountManager = accountManager;
    }

    public String getKnownAs() {
        return this.knownAs;
    }
    
    public void setKnownAs(String knownAs) {
        this.knownAs = knownAs;
    }


	@Override
	public void addContactEvent(ContactEvent aContactEvent) {
		contactEvents.add(aContactEvent);
	}


	@SuppressWarnings("unchecked")
	@Override
	public void addContactEvents(Collection aContactEvents) {
		contactEvents.addAll(aContactEvents);	
	}

	@Override
	public void clearContactEvents() {
		contactEvents.clear();
	}


	@Override
	public boolean containsContactEvent(ContactEvent aContactEvent) {
		return contactEvents.contains(aContactEvent);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection getContactEvents() {
		return contactEvents;
	}


	@Override
	public ContactEvent[] getContactEventsAsArray() {
		return (ContactEvent[]) contactEvents.toArray(new ContactEvent[0]);
	}


	@Override
	public void removeContactEvent(ContactEvent aContactEvent) {
		contactEvents.remove(aContactEvent);	
	}

}