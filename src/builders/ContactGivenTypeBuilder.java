package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import domain.ContactGivenTypeH;
import interfaces.ContactGivenType;

public class ContactGivenTypeBuilder implements BuilderI<ContactGivenType> {

	private String entityName="ContactGivenType";
    private Boolean telephone=getPrimitiveAttribute(true);
    private Boolean website=getPrimitiveAttribute(true);
    private String name=getPrimitiveAttribute("Website and Telephone given");
	
	public ContactGivenTypeBuilder withTelephone(Boolean telephone) {
		this.telephone = telephone;
		return this;
	}

	public ContactGivenTypeBuilder withWebsite(Boolean website) {
		this.website = website;
		return this;
	}

	public ContactGivenTypeBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public ContactGivenType build() {
		return new ContactGivenTypeH(entityName,telephone,website,name);
	}

}
