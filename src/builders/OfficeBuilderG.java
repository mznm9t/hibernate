package builders;
import static builders.BuilderDirector.getEntityAttribute;
import static builders.BuilderDirector.getPrimitiveAttribute;
import static builders.BuilderDirector.getSetAttribute;
import static core.ReflectiveUtil.copyObjectFields;
import interfaces.BusinessObject;
import interfaces.Office;
import interfaces.PRManager;
import interfaces.Region;

import java.util.HashSet;
import java.util.Set;

import domain.OfficeH;

@SuppressWarnings("unchecked")
public class OfficeBuilderG <T extends Office,B extends OfficeBuilderG<T,B>> extends ContactableBuilderG<T,B> {

	private String entityName="Office";
    private String description=getPrimitiveAttribute("North Irland Office");
    private String name=getPrimitiveAttribute("NIRO");
    private Region region=getEntityAttribute(RegionBuilder.class,Region.class);
    private PRManager managedBy=getEntityAttribute(PRManagerBuilder.class, PRManager.class);
	private Set<PRManager> allManagers=getSetAttribute(PRManagerBuilder.class, PRManager.class);
	
	public B withDescription(String description) {
		this.description = description;
		return (B)this;
	}

	public B withName(String name) {
		this.name = name;
		return (B)this;
	}

	public B withRegion(Region region) {
		this.region = region;
		return (B) this;
	}

	public B withManagedBy(PRManager managedBy) {
		this.managedBy = managedBy;
		return (B) this;
	}
	
	public B withAnAllManagers(PRManager managedBy) {
		if(allManagers==null)allManagers=new HashSet<PRManager>();
		allManagers.add(managedBy);
		return (B) this;
	}

	
	
	@Override
	public T build() {
		BusinessObject superInstance=getSuperInstance();//return an object of the super class
		Office currentInstance=new OfficeH(entityName, description, name, region, managedBy, allManagers);//return on object of the this class 
		//do not change it by createInstance() because it is expected to call different method when this class is extended 
		//and createInstance() is override. 
		copyObjectFields(superInstance,currentInstance,false);//merge both
		return (T)currentInstance;
	}
	
	public T createInstance() {
		return (T) new OfficeH(entityName, description, name, region, managedBy, allManagers);
	}
	
	private BusinessObject getSuperInstance(){
		return super.build();
	}
}
