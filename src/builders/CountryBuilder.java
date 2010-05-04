package builders;

import domain.CountryH;
import interfaces.Country;

public class CountryBuilder implements BuilderI<Country>{


	 private String entityName="Country";
     private String name="Spain";
     private String isoCode="SP";
     
     
 	
	 public CountryBuilder withEntityName(String entityName) {
		this.entityName = entityName;
		return this;
	}

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
