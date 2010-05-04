package builders;

import static builders.BuilderDirector.*;
import interfaces.Address;
import interfaces.ContactGroup;
import interfaces.ContactStatus;
import interfaces.Contactable;
import interfaces.Employee;
import interfaces.PhoneNumber;

import java.util.Date;

import domain.ContactableH;

@SuppressWarnings("unchecked")
public class ContactableBuilderG<T extends Contactable,B extends ContactableBuilderG<T,B>> implements BuilderGI<T,B> {

	private String entityName = "Contactable";
	private String notes = "No notes";
	private ContactGroup mainGroup = lazzyObject(ContactGroupBuilder.class,ContactGroup.class);
	private Address address = lazzyObject(AddressBuilder.class,Address.class);
	private PhoneNumber phone1 = lazzyObject(PhoneNumberBuilder.class,PhoneNumber.class);
	private PhoneNumber phone2 = lazzyObject(PhoneNumberBuilder.class,PhoneNumber.class);
	private PhoneNumber mobile = lazzyObject(PhoneNumberBuilder.class,PhoneNumber.class);
	private Employee accountManager = lazzyObject(EmployeeBuilder.class,Employee.class);
	private ContactStatus status = lazzyObject(ContactStatusBuilder.class,ContactStatus.class);
	private PhoneNumber fax = lazzyObject(PhoneNumberBuilder.class,PhoneNumber.class);
	private String email="test@com.com";
	private String www="www.test.com";
	
	private Date created=new Date();
	private Date lastUpdate=new Date();
	
	private String knownAs="The Contactable";
	

	public B withEntityName(String entityName) {
		this.entityName = entityName;
		return (B)this;
	}

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


	public T createInstance() {
		
		return (T) new ContactableH( entityName,  notes,  mainGroup,  address,  phone1,  phone2,  mobile,  fax,  email,  www,  status,  created,  lastUpdate,  accountManager,  knownAs);
	}


	public T build() {
		Contactable c=new ContactableH( entityName,  notes,  mainGroup,  address,  phone1,  phone2,  mobile,  fax,  email,  www,  status,  created,  lastUpdate,  accountManager,  knownAs);
		return (T)c;
		
	}

}