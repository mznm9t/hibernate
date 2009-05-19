package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import interfaces.PublicationType;
import domain.PublicationTypeH;

public class PublicationTypeBuilder implements BuilderI<PublicationType>{

	     private String entityName="PublicationType";
	     private String name=getPrimitiveAttribute("Property Weekly Maganzines");
	     private String code=getPrimitiveAttribute("PROWEEK");
	     private Float value=getPrimitiveAttribute(10f);

	    public PublicationTypeBuilder withName(String name) {
	        this.name = name;
	        return this;
	    }

	    public PublicationTypeBuilder withCode(String code) {
	        this.code = code;
	        return this;
	    }

	    public PublicationTypeBuilder withValue(Float value) {
	        this.value = value;
	        return this;
	    }
	    
		public PublicationType build() {
			return new PublicationTypeH( entityName,  name,  code,  value) ;
		}

}
