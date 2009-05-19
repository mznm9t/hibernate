package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import domain.AudienceH;
import interfaces.Audience;

public class AudienceBuilder implements BuilderI<Audience>{


	 private String entityName="Audience";
	 private String name=getPrimitiveAttribute("Students");
     private String description=getPrimitiveAttribute("Students In London");
     private Integer size=getPrimitiveAttribute(1000);

	public AudienceBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public AudienceBuilder withDescription(String description) {
		this.description = description;
		return this;
	}
	
	public AudienceBuilder withSize(Integer size) {
		this.size = size;
		return this;
	}
     
	public Audience build() {
		return  new AudienceH(entityName,description,name,size);
	}

}
