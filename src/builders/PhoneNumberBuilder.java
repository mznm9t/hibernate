package builders;

import domain.PhoneNumberH;
import interfaces.PhoneNumber;

public class PhoneNumberBuilder implements BuilderI<PhoneNumber> {

	private String entityName="PhoneNumber";
    private String areaCode="02";
    private String theNumber="7689872634";
    private String countryCode="+44";
	
	public PhoneNumberBuilder withEntityName(String entityName) {
		this.entityName = entityName;
		return this;
	}

	public PhoneNumberBuilder withAreaCode(String areaCode) {
		this.areaCode = areaCode;
		return this;
	}

	public PhoneNumberBuilder withTheNumber(String theNumber) {
		this.theNumber = theNumber;
		return this;
	}

	public PhoneNumberBuilder withCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}
    
	public PhoneNumber build() {
		return new PhoneNumberH(entityName,areaCode,theNumber,countryCode);
		
	}
	
}
