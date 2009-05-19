package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import domain.CountryH;
import interfaces.Country;

public class CountryBuilder implements BuilderI<Country>{


	 private String entityName="Country";
     private String name=getPrimitiveAttribute("Spain");
     private String isoCode=getPrimitiveAttribute("SP");
     

	public CountryBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public CountryBuilder withIsoCode(String isoCode) {
		this.isoCode = isoCode;
		return this;
	}
     
	public Country build() {
		return  new CountryH(entityName,name,isoCode);
	}

}
