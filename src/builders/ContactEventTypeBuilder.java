package builders;
import static builders.BuilderDirector.getPrimitiveAttribute;
import interfaces.ContactEventType;
import domain.ContactEventTypeH;

public class ContactEventTypeBuilder implements BuilderI<ContactEventType> {

	
     private String entityName="ContactEventType";
     private String name=getPrimitiveAttribute("Letter");
     private String code=getPrimitiveAttribute("LETT");

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
