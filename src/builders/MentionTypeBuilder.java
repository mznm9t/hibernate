package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import interfaces.MentionType;
import domain.MentionTypeH;

public class MentionTypeBuilder implements BuilderI<MentionType>{


	 private String entityName="MentionType";
     private String name=getPrimitiveAttribute("First Page Journal");
     private String code=getPrimitiveAttribute("FIRSTPAGE");
     
   
	public MentionTypeBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public MentionTypeBuilder withCode(String code) {
		this.code = code;
		return this;
	}
     
	public MentionType build() {
		return  new MentionTypeH(entityName,name,code);
	}

}
