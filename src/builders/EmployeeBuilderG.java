package builders;

import static core.ReflectiveUtil.copyObjectFields;
import static builders.BuilderDirector.getPrimitiveAttribute;
import interfaces.BusinessObject;
import interfaces.Employee;
import domain.EmployeeH;

@SuppressWarnings("unchecked")
public class EmployeeBuilderG<T extends Employee,B extends EmployeeBuilderG<T,B>> extends PersonBuilderG<T,B> implements BuilderGI<T,B>  {

    private String entityName="Employee";
	private Boolean current=getPrimitiveAttribute(true);

	
	public EmployeeBuilderG(){}
	
	public EmployeeBuilderG(boolean b){}
	
    public B withCurrent(Boolean current) {
		this.current = current;
		return (B)this;
	}

	public T build() {
		BusinessObject superInstance=getSuperInstance();//return an object of the super class
		Employee currentInstance=new EmployeeH(entityName,current);//return on object of the this class 
		//do not change it by createInstance() because it is expected to call different method when this class is extended 
		//and createInstance() is override. 
		copyObjectFields(superInstance,currentInstance,false);//merge both
		return (T)currentInstance;
	}

	
	public T createInstance() {
		return (T)new EmployeeH(entityName,current);
	}
	
	private BusinessObject getSuperInstance(){
		return super.build();
	}
	
}
