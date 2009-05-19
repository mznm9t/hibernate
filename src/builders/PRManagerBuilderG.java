package builders;

import static core.ReflectiveUtil.copyObjectFields;
import static builders.BuilderDirector.getPrimitiveAttribute;
import interfaces.BusinessObject;
import interfaces.PRManager;
import domain.PRManagerH;

@SuppressWarnings("unchecked")
public class PRManagerBuilderG<T extends PRManager,B extends PRManagerBuilderG<T,B>> extends PersonBuilderG<T,B> implements BuilderGI<T,B>  {

     private String entityName="PRManager";
     private String fullName=getPrimitiveAttribute("Omar PR Manager Sanchez");


    public B withFullName(String fullName) {
        this.fullName = fullName;
        return (B) this;
    }


	public T build() {
		BusinessObject superInstance=getSuperInstance();//return an object of the super class
		PRManager currentInstance=new PRManagerH(entityName,fullName);//return on object of the this class 
		//do not change it by createInstance() because it is expected to call different method when this class is extended 
		//and createInstance() is override. 
		copyObjectFields(superInstance,currentInstance,false);//merge both
		return (T)currentInstance;
	}

	
	public T createInstance() {
		return (T)new PRManagerH(entityName,fullName);
	}
	
	private BusinessObject getSuperInstance(){
		return super.build();
	}

}
