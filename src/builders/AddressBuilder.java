package builders;

import domain.AddressH;
import interfaces.Address;
import interfaces.Country;
import static builders.BuilderDirector.*;

public class AddressBuilder implements BuilderI<Address> {

	 private String entityName="Address";
     private String postcode=getPrimitiveAttribute("E10PF");
     private String line1=getPrimitiveAttribute("Flat 77");
     private String line2=getPrimitiveAttribute("245");
     private String line3=getPrimitiveAttribute("Jamaica Street");
     private String line4=getPrimitiveAttribute("London");
     private Country country= getEntityAttribute(CountryBuilder.class, Country.class);
	
     
		public Address build() {
			return new AddressH(entityName,postcode,line4,line3,line2,line1,country);
		}


		public AddressBuilder withPostcode(String postcode) {
			this.postcode = postcode;
			return this;
		}

		public AddressBuilder withLine4(String line4) {
			this.line4 = line4;
			return this;
		}

		public AddressBuilder withLine3(String line3) {
			this.line3 = line3;
			return this;
		}

		public AddressBuilder withLine2(String line2) {
			this.line2 = line2;
			return this;
		}

		public AddressBuilder withLine1(String line1) {
			this.line1 = line1;
			return this;
		}

		public AddressBuilder withCountry(Country country) {
			this.country = country;
			return this;
		}
	
}
