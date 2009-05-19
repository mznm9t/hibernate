package builders;
import static builders.BuilderDirector.getPrimitiveAttribute;
import domain.SequenceNumberH;
import interfaces.SequenceNumber;

public class SequenceNumberBuilder implements BuilderI<SequenceNumber> {

	 private String entityName="SequenceNumber";
     private String suffix=getPrimitiveAttribute("PG");
     private String prefix=getPrimitiveAttribute("PEX");
     private Integer digits=getPrimitiveAttribute(6);
     private Integer last=getPrimitiveAttribute(123454);
     private String lastString=getPrimitiveAttribute("PEX123454PG");
     private String description=getPrimitiveAttribute("Company Sequence Numbers");
     private String name=getPrimitiveAttribute("Company Reference Generator");
	
	
	public SequenceNumberBuilder withEntityName(String entityName) {
		this.entityName = entityName;return this;
	}



	public SequenceNumberBuilder withSuffix(String suffix) {
		this.suffix = suffix;return this;
	}



	public SequenceNumberBuilder withPrefix(String prefix) {
		this.prefix = prefix;return this;
	}



	public SequenceNumberBuilder withDigits(Integer digits) {
		this.digits = digits;return this;
	}



	public SequenceNumberBuilder withLast(Integer last) {
		this.last = last;return this;
	}



	public SequenceNumberBuilder withLastString(String lastString) {
		this.lastString = lastString;return this;
	}



	public SequenceNumberBuilder withDescription(String description) {
		this.description = description;return this;
	}



	public SequenceNumberBuilder withName(String name) {
		this.name = name;return this;
	}

	@Override
	public SequenceNumber build() {
		return new SequenceNumberH(entityName, suffix, prefix, digits, last, lastString, description, name);
	}

}
