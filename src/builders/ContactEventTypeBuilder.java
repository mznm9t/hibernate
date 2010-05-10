package builders;

import interfaces.ContactEventType;
import domain.ContactEventTypeH;

public class ContactEventTypeBuilder implements BuilderI<ContactEventType> {

	
     private String entityName="ContactEventType";
     private String name="Letter";
     private String code="LETT";

   
	public ContactEventTypeBuilder withEntityName(String entityName) {
		this.entityName = entityName;
		return this;
	}


	public ContactEventTypeBuilder withName(String name) {
		this.name = name;
		return this;
	}


	public ContactEventTypeBuilder withCode(String code) {
		this.code = code;
		return this;
	}


	@Override
	public ContactEventType build() {
		return new ContactEventTypeH( entityName,name,code);
	}

}
