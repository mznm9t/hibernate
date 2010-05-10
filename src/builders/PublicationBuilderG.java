package builders;

import static core.ReflectiveUtil.copyObjectFields;
import static builders.BuilderDirector.*;
import interfaces.BusinessObject;
import interfaces.Company;
import interfaces.Publication;
import interfaces.PublicationType;
import domain.PublicationH;

@SuppressWarnings("unchecked")
public class PublicationBuilderG<T extends Publication, B extends PublicationBuilderG<T, B>>
		extends CompanyBuilderG<T, B> {

	private String entityName="Publication";
	private String description="This is a wonderfull magazine";
	private String publicationName="The Magazine";
	private PublicationType type=lazzyObject(PublicationTypeBuilder.class, PublicationType.class);
	private Float value=5f;

	public B withEntityName(String entityName) {
		this.entityName = entityName;
		return (B) this;
	}

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

	public T build() {
		BusinessObject superInstance = getSuperInstance();// return an object of
		// the super class
		Company currentInstance = new PublicationH(entityName, description,
				publicationName, type, value);// return on object of the this
		// class
		// do not change it by createInstance() because it is expected to call
		// different method when this class is extended
		// and createInstance() is override.
		copyObjectFields(superInstance, currentInstance, true);// merge both
		return (T) currentInstance;

	}

	@Override
	public T createInstance() {
		return (T) new PublicationH(entityName, description, publicationName,
				type, value);
	}

	private BusinessObject getSuperInstance() {
		return super.build();
	}

}
