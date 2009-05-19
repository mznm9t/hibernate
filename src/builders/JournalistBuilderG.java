package builders;

import static builders.BuilderDirector.getEntityAttribute;
import static builders.BuilderDirector.getPrimitiveAttribute;
import static core.ReflectiveUtil.copyObjectFields;
import interfaces.BusinessObject;
import interfaces.Journalist;
import interfaces.Publication;
import domain.JournalistH;

@SuppressWarnings("unchecked")
public class JournalistBuilderG<T extends Journalist,B extends JournalistBuilderG<T,B>> extends PersonBuilderG<T,B> implements BuilderGI<T,B>  {

	 private String entityName=getPrimitiveAttribute("Journalist");
     private Publication publication=getEntityAttribute(PublicationBuilder.class, Publication.class);
     private Integer frequency=getPrimitiveAttribute(new Integer(7));
  
    
    public B withPublication(Publication publication) {
        this.publication = publication;
        return (B) this;
    }

    
    public B withFrequency(Integer frequency) {
        this.frequency = frequency;
        return (B) this;
    }


	public T build() {
		BusinessObject superInstance=getSuperInstance();//return an object of the super class
		Journalist currentInstance=new JournalistH( entityName,  publication,  frequency);//return on object of the this class 
		//do not change it by createInstance() because it is expected to call different method when this class is extended 
		//and createInstance() is override. 
		copyObjectFields(superInstance,currentInstance,false);//merge both
		return (T)currentInstance;
	}

	
	public T createInstance() {
		return (T)new JournalistH( entityName,  publication,  frequency);
	}
	
	private BusinessObject getSuperInstance(){
		return super.build();
	}

}
