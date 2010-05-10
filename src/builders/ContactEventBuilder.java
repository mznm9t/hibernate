package builders;

import static builders.BuilderDirector.lazzyObject;

import java.util.Date;

import domain.ContactEventH;

import interfaces.ContactEvent;
import interfaces.ContactEventType;
import interfaces.Contactable;

public class ContactEventBuilder implements BuilderI<ContactEvent>{

	private String entityName="ContactEvent";
	private String title="This is a communication from me to you";
	private ContactEventType type=lazzyObject(ContactEventTypeBuilder.class,ContactEventType.class);
	private Contactable ourContact=lazzyObject(ContactableBuilder.class,Contactable.class);
	private Contactable theirContact=lazzyObject(ContactableBuilder.class,Contactable.class);
	private String content="This is the content of the communicaiton";
	private ContactEvent followup=lazzyObject(ContactEventBuilder.class,ContactEvent.class);
	private Date whenHappened=new Date();
	private Date whenPlanned=new Date();
	
	public ContactEventBuilder withEntityName(String entityName) {
		this.entityName = entityName;
		return this;
	}

	public ContactEventBuilder withTitle(String title) {
		this.title = title;
		return this;
	}

	public ContactEventBuilder withType(ContactEventType type) {
		this.type = type;
		return this;
	}

	public ContactEventBuilder withOurContact(Contactable ourContact) {
		this.ourContact = ourContact;
		return this;
	}

	public ContactEventBuilder withTheirContact(Contactable theirContact) {
		this.theirContact = theirContact;
		return this;
	}

	public ContactEventBuilder withContent(String content) {
		this.content = content;
		return this;
	}

	public ContactEventBuilder withFollowup(ContactEvent followup) {
		this.followup = followup;
		return this;
	}

	public ContactEventBuilder withWhenHappened(Date whenHappened) {
		this.whenHappened = whenHappened;
		return this;
	}

	public ContactEventBuilder withWhenPlanned(Date whenPlanned) {
		this.whenPlanned = whenPlanned;
		return this;
	}

	@Override
	public ContactEvent build() {
		return new ContactEventH( entityName,title,type,ourContact,theirContact,content,followup,whenHappened,whenPlanned);
	}

}
