package builders;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.LazyLoader;

public class BuilderDirector {
    
	static BuilderDirector director=new BuilderDirector();
	
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

	@SuppressWarnings("unchecked")
	public static <R extends BuilderI> R lazzyBuild(Class<R> builderClass){	
		return (R)Enhancer.create(builderClass,new LazyBuilder(builderClass));		
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

	class LazyBuilder implements LazyLoader{
		
		@SuppressWarnings("unchecked")
		Class builderClass;
		
		public LazyBuilder() {
		}
		
		@SuppressWarnings("unchecked")
		public LazyBuilder(Class builderClass){
			this.builderClass=builderClass;
		}
		
		@Override
		public Object loadObject() throws Exception {
			return builderClass.newInstance();
		}
		
	}
