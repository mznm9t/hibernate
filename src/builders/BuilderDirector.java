package builders;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.LazyLoader;

public class BuilderDirector {
    	
	public static EmployeeBuilder aEmployee(){
		return new EmployeeBuilder();
		}
	
	public static PersonBuilder aPerson(){
		return new PersonBuilder();
	}
	
	public static ContactableBuilder aContactable(){
		return new ContactableBuilder(); 
	}
	
	public static AddressBuilder anAddress(){
		return new AddressBuilder(); 
	}
	
	public static CompanyBuilder aCompany(){
		return new CompanyBuilder(); 
	}
	
	public static ContactGroupBuilder aContactGroup() {
		return new ContactGroupBuilder();
	}
	
	public static ContactStatusBuilder aContactStatus() {
		return new ContactStatusBuilder();
	}

	public static CountryBuilder aCountry(){
		 return new CountryBuilder();
	}

	public static PhoneNumberBuilder aPhoneNumber(){
		 return new PhoneNumberBuilder();
	}
	
	public static PublicationBuilder aPublication(){
		 return new PublicationBuilder();
	}

	public static JournalistBuilder aJournalist(){
		 return new JournalistBuilder();
	}
	
	public static PublicationTypeBuilder aPublicationType(){
		 return new PublicationTypeBuilder();
	}
	
	public static ContactEventTypeBuilder aContactEventType(){
		 return new ContactEventTypeBuilder();
	}
	
	public static ContactEventBuilder aContactEvent(){
		 return new ContactEventBuilder();
	}
	
	@SuppressWarnings("unchecked")
	public static <R extends BuilderI<T>,T> T lazzyObject(Class<R> builderClass,Class<T> entityClass){	
		return (T)Enhancer.create(entityClass,new LazyAttributeLoader(builderClass));		
	}
	
}

class LazyAttributeLoader implements LazyLoader{
	
	@SuppressWarnings("unchecked")
	Class builderClass;
	
	public LazyAttributeLoader() {
	}
	
	@SuppressWarnings("unchecked")
	public<R extends BuilderI> LazyAttributeLoader(Class<R> builderClass){
		this.builderClass=builderClass;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object loadObject() throws Exception {
		return ((BuilderI)builderClass.newInstance()).build();
	}
	
}
