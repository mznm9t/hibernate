package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import domain.MappingToolH;
import interfaces.MappingTool;

public class MappingToolBuilder implements BuilderI<MappingTool> {

	     private String entityName="MappingTool";
	     private String internalValue=getPrimitiveAttribute("InternaV");
	     private String externalValue=getPrimitiveAttribute("ExternalV");
	     private String attributeName=getPrimitiveAttribute("Company Name");
	

		public MappingToolBuilder withInternalValue(String internalValue) {
			this.internalValue = internalValue;
			return this;
		}

		public MappingToolBuilder withExternalValue(String externalValue) {
			this.externalValue = externalValue;
			return this;
		}

		public MappingToolBuilder withAttributeName(String attributeName) {
			this.attributeName = attributeName;
			return this;
		}

	@Override
	public MappingTool build() {
		return new MappingToolH(entityName, internalValue, externalValue, attributeName);
	}

}
