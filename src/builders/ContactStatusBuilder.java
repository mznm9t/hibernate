package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import domain.ContactStatusH;
import interfaces.ContactStatus;

public class ContactStatusBuilder implements BuilderI<ContactStatus>{

	private String entityName="ContactStatus";
	private String name=getPrimitiveAttribute("Active");
	private String code=getPrimitiveAttribute("ACT");


	public ContactStatusBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public ContactStatusBuilder withCode(String code) {
		this.code = code;
		return this;
	}
	
	public ContactStatus build() {
		return new ContactStatusH(entityName,name,code);
	}

}
