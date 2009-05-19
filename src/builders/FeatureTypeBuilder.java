package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import interfaces.FeatureType;
import domain.FeatureTypeH;

public class FeatureTypeBuilder implements BuilderI<FeatureType>{


	 private String entityName="FeatureType";
     private String name=getPrimitiveAttribute("Garden");
     private String code=getPrimitiveAttribute("GARDEN");
     
   
	public FeatureTypeBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public FeatureTypeBuilder withCode(String code) {
		this.code = code;
		return this;
	}
     
	public FeatureType build() {
		return  new FeatureTypeH(entityName,name,code);
	}

}
