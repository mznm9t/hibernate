package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import domain.RegionH;
import interfaces.Region;

public class RegionBuilder implements BuilderI<Region>{


	 private String entityName="Region";
     private String name=getPrimitiveAttribute("North");
     private String code=getPrimitiveAttribute("NOR");
     

	public RegionBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public RegionBuilder withCode(String code) {
		this.code = code;
		return this;
	}
     
	public Region build() {
		return  new RegionH(entityName,name,code);
	}

}
