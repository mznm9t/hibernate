package builders;

import static core.ReflectiveUtil.copyObjectFields;
import static builders.BuilderDirector.*;

import java.util.HashSet;
import java.util.Set;

import interfaces.Audience;
import interfaces.BusinessObject;
import interfaces.Company;
import interfaces.Publication;
import interfaces.PublicationType;
import domain.PublicationH;

@SuppressWarnings("unchecked")
public class PublicationBuilderG<T extends Publication, B extends PublicationBuilderG<T, B>>
		extends CompanyBuilderG<T, B> {

	private String entityName="Publication";
	private String description=getPrimitiveAttribute("This is a wonderfull magazine");
	private String publicationName=getPrimitiveAttribute("The Magazine");
	private PublicationType type=getEntityAttribute(PublicationTypeBuilder.class, PublicationType.class);
	private Float value=getPrimitiveAttribute(5f);
	private Set<Audience> audiences=getSetAttribute(AudienceBuilder.class, Audience.class);

	public B withDescription(String description) {
		this.description = description;
		return (B) this;
	}

	public B withPublicationName(String publicationName) {
		this.publicationName = publicationName;
		return (B) this;
	}

	public B withType(PublicationType type) {
		this.type = type;
		return (B) this;
	}

	public B withValue(Float value) {
		this.value = value;
		return (B) this;
	}
	
	public B withAnAudience(Audience anAudience) {
		if(audiences==null)audiences=new HashSet<Audience>();
		audiences.add(anAudience);
		return (B) this;
	}

	public T build() {
		BusinessObject superInstance = getSuperInstance();// return an object of
		// the super class
		Company currentInstance = new PublicationH(entityName, description,
				publicationName, type, value,audiences);// return on object of the this
		// class
		// do not change it by createInstance() because it is expected to call
		// different method when this class is extended
		// and createInstance() is override.
		copyObjectFields(superInstance, currentInstance, false);// merge both
		return (T) currentInstance;

	}

	@Override
	public T createInstance() {
		return (T) new PublicationH(entityName, description, publicationName,
				type, value,audiences);
	}

	private BusinessObject getSuperInstance() {
		return super.build();
	}

}
