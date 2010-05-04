package builders;

import domain.CompanyH;
import interfaces.Company;
import interfaces.Person;
import static builders.BuilderDirector.lazzyObject;
//import static builders.BuilderDirector.lazzyBuild;

public class CompanyBuilder implements BuilderI<Company> {

	
	private String entityName="Company";
	private String name="OMAR S.A.";
    private Person mainContact=lazzyObject(PersonBuilder.class,Person.class);
    
    public CompanyBuilder withEntityName(String entityName) {
		this.entityName = entityName;
		return this;
	}

	public CompanyBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public CompanyBuilder withMainContact(Person mainContact) {
		this.mainContact = (Person) mainContact;
		return this;
	}

	@Override
	public Company build() {
		return  new CompanyH(entityName,name,mainContact);
	}

}
