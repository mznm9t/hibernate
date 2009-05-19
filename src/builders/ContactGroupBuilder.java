package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import domain.ContactGroupH;
import interfaces.ContactGroup;

public class ContactGroupBuilder implements BuilderI<ContactGroup> {

	private String entityName="ContactGroup";
	private String name=getPrimitiveAttribute("Main Group");
	private String description=getPrimitiveAttribute("Main group");

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
