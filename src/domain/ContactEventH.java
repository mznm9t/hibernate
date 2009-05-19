package domain;

import interfaces.ContactEvent;
import interfaces.ContactEventType;
import interfaces.Contactable;

import java.util.Date;
@SuppressWarnings("serial")
public class ContactEventH implements interfaces.ContactEvent, java.io.Serializable {

	private ID id;
	private String entityName;
	private String title;
	private ContactEventType type;
	private Contactable ourContact;
	private Contactable theirContact;
	private String content;
	private ContactEvent followup;
	private Date whenHappened;
	private Date whenPlanned;
	
	public ContactEventH() {}

	public ContactEventH(String entityName, String title,
			ContactEventType type, Contactable ourContact,
			Contactable theirContact, String content, ContactEvent followup,
			Date whenHappened, Date whenPlanned) {
		this.entityName = entityName;
		this.title = title;
		this.type = type;
		this.ourContact = ourContact;
		this.theirContact = theirContact;
		this.content = content;
		this.followup = followup;
		this.whenHappened = whenHappened;
		this.whenPlanned = whenPlanned;
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
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ContactEvent getFollowup() {
		return followup;
	}

	public void setFollowup(ContactEvent followup) {
		this.followup = followup;
	}

	public Contactable getOurContact() {
		return ourContact;
	}

	public void setOurContact(Contactable ourContact) {
		this.ourContact = ourContact;
	}

	public Contactable getTheirContact() {
		return theirContact;
	}

	public void setTheirContact(Contactable theirContact) {
		this.theirContact = theirContact;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ContactEventType getType() {
		return type;
	}

	public void setType(ContactEventType type) {
		this.type = type;
	}

	public Date getWhenHappened() {
		return whenHappened;
	}

	public void setWhenHappened(Date whenHappened) {
		this.whenHappened = whenHappened;
	}

	public Date getWhenPlanned() {
		return whenPlanned;
	}

	public void setWhenPlanned(Date whenPlanned) {
		this.whenPlanned = whenPlanned;
	}	

}
