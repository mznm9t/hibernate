package builders;

import static builders.BuilderDirector.getEntityAttribute;
import static builders.BuilderDirector.getPrimitiveAttribute;
import static core.ReflectiveUtil.copyObjectFields;
import interfaces.BusinessObject;
import interfaces.Company;
import interfaces.Person;
import domain.CompanyH;

@SuppressWarnings("unchecked")
public class CompanyBuilderG <T extends Company,B extends CompanyBuilderG<T,B>> extends ContactableBuilderG<T,B>{

	private String entityName="Company";
	private String name=getPrimitiveAttribute("OMAR S.A.");
    private Person mainContact=getEntityAttribute(PersonBuilder.class,Person.class);
    
	public B withName(String name) {
		this.name = name;
		return (B)this;
	}

	public B withMainContact(Person mainContact) {
		this.mainContact = (Person) mainContact;
		return (B)this;
	}


	public T build() {
		BusinessObject superInstance=getSuperInstance();//return an object of the super class
		Company currentInstance=new CompanyH(entityName,name,mainContact);//return on object of the this class 
		//do not change it by createInstance() because it is expected to call different method when this class is extended 
		//and createInstance() is override. 
		copyObjectFields(superInstance,currentInstance,false);//merge both
		return (T)currentInstance;
		
	}
	
	@Override
	public T createInstance() {
		return  (T) new CompanyH(entityName,name,mainContact);
	}
	
	private BusinessObject getSuperInstance(){
		return super.build();
	}

}
