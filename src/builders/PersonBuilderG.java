package builders;


import static core.ReflectiveUtil.copyObjectFields;

import interfaces.BusinessObject;
import interfaces.Company;
import interfaces.Person;
import domain.PersonH;
import static builders.BuilderDirector.getEntityAttribute;
import static builders.BuilderDirector.getPrimitiveAttribute;


@SuppressWarnings("unchecked")
public class PersonBuilderG<T extends Person,B extends PersonBuilderG<T,B>> extends ContactableBuilderG<T,B>{
	
	private Company company =getEntityAttribute(CompanyBuilder.class,Company.class);
    private String jobTitle=getPrimitiveAttribute("Engineer");
    private String lastName=getPrimitiveAttribute("Nahhas");
    private String title=getPrimitiveAttribute("Mr");
    private String firstName=getPrimitiveAttribute("Omar");
	private String entityName="Person";
	

	public B withCompany(Company company) {
		this.company =  company;
		return (B)this;
	}
	
	public B withJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
		return (B)this;
	}

	public B withLastName(String lastName) {
		this.lastName = lastName;
		return (B)this;
	}

	public B withTitle(String title) {
		this.title = title;
		return (B)this;
	}

	public B withFirstName(String firstName) {
		this.firstName = firstName;
		return (B)this;
	}

	public T build() {
		BusinessObject superInstance=getSuperInstance();//return an object of the super class
		Person currentInstance=new PersonH( entityName,  company,  jobTitle,  lastName,  title,  firstName);//return on object of the this class 
		//do not change it by createInstance() because it is expected to call different method when this class is extended 
		//and createInstance() is override. 
		copyObjectFields(superInstance,currentInstance,false);//merge both
		return (T)currentInstance;
		
	}
	
	public T createInstance() {
		return (T) new PersonH( entityName,  company,  jobTitle,  lastName,  title,  firstName);
	}
	
	private BusinessObject getSuperInstance(){
		return super.build();
	}
	
}
