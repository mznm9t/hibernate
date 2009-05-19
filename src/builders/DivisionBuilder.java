package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import interfaces.Division;
import domain.DivisionH;

public class DivisionBuilder implements BuilderI<Division>{


    private String entityName="Division";
    private String name=getPrimitiveAttribute("North");
     
	public DivisionBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public Division build() {
		return new DivisionH(entityName,name);
	}

}
