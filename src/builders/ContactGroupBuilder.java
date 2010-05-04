package builders;

import domain.ContactGroupH;
import interfaces.ContactGroup;

public class ContactGroupBuilder implements BuilderI<ContactGroup> {

	private String entityName="ContactGroup";
	private String name="Main Group";
	private String description="Main group";

	public ContactGroupBuilder withEntityName(String entityName) {
		this.entityName = entityName;
		return this;
	}

	public ContactGroupBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public ContactGroupBuilder withDescription(String description) {
		this.description = description;
		return this;
	}
	
	public ContactGroup build() {
		return new ContactGroupH(entityName,name,description);
	}

}
