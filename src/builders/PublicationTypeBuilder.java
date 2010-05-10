package builders;

import interfaces.PublicationType;
import domain.PublicationTypeH;

public class PublicationTypeBuilder implements BuilderI<PublicationType>{

	     private String entityName="PublicationType";
	     private String name="Property Weekly Maganzines";
	     private String code="PROWEEK";
	     private Float value=10f;

		public PublicationTypeBuilder withEntityName(String entityName) {
	        this.entityName = entityName;
	        return this;
	    }

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
