package builders;

import static builders.BuilderDirector.*;
import interfaces.Address;
import interfaces.ContactEvent;
import interfaces.ContactGroup;
import interfaces.ContactStatus;
import interfaces.Contactable;
import interfaces.Employee;
import interfaces.PhoneNumber;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import domain.ContactableH;

@SuppressWarnings("unchecked")
public class ContactableBuilderG<T extends Contactable,B extends ContactableBuilderG<T,B>> implements BuilderGI<T,B> {

	private String entityName = "Contactable";
	private String notes = getPrimitiveAttribute("No notes");
	private ContactGroup mainGroup = getEntityAttribute(ContactGroupBuilder.class,ContactGroup.class);
	private Address address = getEntityAttribute(AddressBuilder.class,Address.class);
	private PhoneNumber phone1 = getEntityAttribute(PhoneNumberBuilder.class,PhoneNumber.class);
	private PhoneNumber phone2 = getEntityAttribute(PhoneNumberBuilder.class,PhoneNumber.class);
	private PhoneNumber mobile = getEntityAttribute(PhoneNumberBuilder.class,PhoneNumber.class);
	private Employee accountManager = getEntityAttribute(EmployeeBuilder.class,Employee.class);
	private ContactStatus status = getEntityAttribute(ContactStatusBuilder.class,ContactStatus.class);
	private PhoneNumber fax = getEntityAttribute(PhoneNumberBuilder.class,PhoneNumber.class);
	private String email=getPrimitiveAttribute("test@com.com");
	private String www=getPrimitiveAttribute("www.test.com");
	
	private Date created=new Date();
	private Date lastUpdate=new Date();
	
	private String knownAs="The Contactable";
	
	private Set<ContactEvent> contactEvents=getSetAttribute(ContactEventBuilder.class,ContactEvent.class);

	public B withNotes(String notes) {
		this.notes = notes;
		return (B)this;
	}

	public B withMainGroup(ContactGroup mainGroup) {
		this.mainGroup = mainGroup;
		return (B)this;
	}

	public B withAddress(Address address) {
		this.address = address;
		return (B)this;
	}

	public B withPhone1(PhoneNumber phone1) {
		this.phone1 = phone1;
		return (B)this;
	}

	public B withPhone2(PhoneNumber phone2) {
		this.phone2 = phone2;
		return (B)this;
	}

	public B withMobile(PhoneNumber mobile) {
		this.mobile = mobile;
		return (B)this;
	}

	public B withFax(PhoneNumber fax) {
		this.fax = fax;
		return (B)this;
	}
	
	public B withStatus(ContactStatus status) {
		this.status = status;
		return (B)this;
	}

	public B withAccountManager(Employee accountManager) {
		this.accountManager = accountManager;
		return (B)this;
	}

	public B withEmail(String email) {
		this.email = email;
		return (B)this;
	}

	public B withWww(String www) {
		this.www = www;
		return (B)this;
	}

	
	public B withCreated(Date created) {
		this.created = created;
		return (B)this;
	}

	public B withLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
		return (B)this;
	}

	

	public B withKnownAs(String knownAs) {
		this.knownAs = knownAs;
		return (B)this;
	}
	
	public B withAContactEvent(ContactEvent c){
		if(contactEvents==null)contactEvents=new HashSet<ContactEvent>();
		contactEvents.add(c);
		return (B) this;
	}

	public T createInstance() {
		
		return (T) new ContactableH( entityName,  notes,  mainGroup,  address,  phone1,  phone2,  mobile,  fax,  email,  www,  status,  created,  lastUpdate,  accountManager,  knownAs , contactEvents);
	}


	public T build() {
		Contactable c=new ContactableH( entityName,  notes,  mainGroup,  address,  phone1,  phone2,  mobile,  fax,  email,  www,  status,  created,  lastUpdate,  accountManager,  knownAs , contactEvents);
		return (T)c;
		
	}

}