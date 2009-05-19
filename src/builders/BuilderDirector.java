package builders;

import interfaces.BusinessObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.LazyLoader;

/**
 * @author omar
 * 
 */
public class BuilderDirector {

	public static enum DefaultPoliciy {
		NODEF, BASIC, COMPLETE, TEST
	};

	private static final ThreadLocal<DefaultPoliciy> currentDefaultPoliciy = new ThreadLocal<DefaultPoliciy>();

	@SuppressWarnings("unchecked")
	private static final ThreadLocal<Map<Class, BusinessObject>> entityMap4Testing = new ThreadLocal<Map<Class, BusinessObject>>();

	public static CompanyBuilder aCompany() {
		return new CompanyBuilder();
	}

	public static ContactableBuilder aContactable() {
		return new ContactableBuilder();
	}
	
	public static ContactEventBuilder aContactEvent() {
		return new ContactEventBuilder();
	}

	public static ContactEventTypeBuilder aContactEventType() {
		return new ContactEventTypeBuilder();
	}

	public static ContactGivenTypeBuilder aContactGivenType() {
		return new ContactGivenTypeBuilder();
	}

	public static ContactGroupBuilder aContactGroup() {
		return new ContactGroupBuilder();
	}

	public static ContactStatusBuilder aContactStatus() {
		return new ContactStatusBuilder();
	}

	public static CountryBuilder aCountry() {
		return new CountryBuilder();
	}

	public static CoverageBuilder aCoverage() {
		return new CoverageBuilder();
	}

	public static DivisionBuilder aDivision() {
		return new DivisionBuilder();
	}

	public static EmployeeBuilder aEmployee() {
		return new EmployeeBuilder();
	}

	public static FeatureTypeBuilder aFeatureType() {
		return new FeatureTypeBuilder();
	}

	public static JournalistBuilder aJournalist() {
		return new JournalistBuilder();
	}

	public static MappingToolBuilder aMappingTool() {
		return new MappingToolBuilder();
	}

	public static MentionTypeBuilder aMentionType() {
		return new MentionTypeBuilder();
	}

	public static MessageBuilder aMessage() {
		return new MessageBuilder();
	}

	public static AddressBuilder anAddress() {
		return new AddressBuilder();
	}
	
	public static AssetBuilder anAsset() {
		return new AssetBuilder();
	}
	
	public static AudienceBuilder anAudience() {
		return new AudienceBuilder();
	}
	
	public static OfficeBuilder anOffice() {
		return new OfficeBuilder();
	}
	
	public static PersonBuilder aPerson() {
		return new PersonBuilder();
	}
	
	public static PhoneNumberBuilder aPhoneNumber() {
		return new PhoneNumberBuilder();
	}
	
	public static PressReleaseBuilder aPressRelease() {
		return new PressReleaseBuilder();
	}
	
	public static PRManagerBuilder aPRManager() {
		return new PRManagerBuilder();
	}
	
	public static PublicationBuilder aPublication() {
		return new PublicationBuilder();
	}
	
	public static PublicationTypeBuilder aPublicationType() {
		return new PublicationTypeBuilder();
	}
	
	public static RegionBuilder aRegion() {
		return new RegionBuilder();
	}
	
	public static SequenceNumberBuilder aSequenceNumber() {
		return new SequenceNumberBuilder();
	}
	
	
	public static StoryBuilder aStory() {
		return new StoryBuilder();
	}
	
	/**
	 * Return the currently configured default policy, the configuration is per
	 * Thread not static.
	 * 
	 * @return the currently configured default policy or in not default policy
	 *         configured returns DefaultPolicy.BASIC
	 */
	public static DefaultPoliciy getDefaultPoliciy() {
		return currentDefaultPoliciy.get() == null ? DefaultPoliciy.BASIC
				: currentDefaultPoliciy.get();
	}
	
	/**
	 * This method will return an instance of an Entity depending of the default
	 * policy currently configured. For entities instances all the default
	 * policies return null except the COMPLETE policy which return a lazy load
	 * instance of an entity that will be loaded when accessing it.
	 * 
	 * @param builderClass
	 *            Class of the builder used to build the entity
	 * @param entityClass
	 *            Class of the entity to be build.
	 * @return depending on the default policy it will return an a lazy load
	 *         instance of an entity that will be loaded when accessing it.
	 */
	@SuppressWarnings("unchecked")
	public static <R extends BuilderI<T>, T> T getEntityAttribute(
			Class<R> builderClass, Class<T> entityClass) {
		switch (getDefaultPoliciy()) {
		case TEST:
			return (T) getEntityMap4Testing().get(entityClass);
		case COMPLETE:
			return (T) Enhancer.create(entityClass, new LazyAttributeLoader(
					builderClass));
		default:
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static Map<Class, BusinessObject> getEntityMap4Testing(){
		if (entityMap4Testing.get()==null){
			entityMap4Testing.set(new HashMap<Class, BusinessObject>());
		}
		return entityMap4Testing.get();
	}
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * This method will return a value depending of the default policy currently
	 * configured. For primitive values all the default policies return the
	 * value except the NODEF policy which return null;
	 * 
	 * @param <T>
	 *            the default value type
	 * @param defaultValue
	 *            the default value
	 * @return depending on the default policy returns a value or not.
	 */
	public static <T> T getPrimitiveAttribute(T defaultValue) {
		switch (getDefaultPoliciy()) {
		case NODEF:
			return null;
		default:
			return defaultValue;
		}
	}

	/**
	 * @param <R>
	 * @param <T>the default value type
	 * @param builderClass
	 *            Class of the builder used to build the entity stored in the
	 *            Set
	 * @param entityClass
	 *            Class of the entity to be build in the Set
	 * @return return a Set or null depending on the default policy currently
	 *         configured
	 */
	@SuppressWarnings("unchecked")
	public static <R extends BuilderI<T>, T> Set<T> getSetAttribute(
			Class<R> builderClass, Class<T> entityClass) {
		Set<T> returnSet = new HashSet<T>();
		switch (getDefaultPoliciy()) {
		case TEST:
			T alreadyCreatedElement = (T) getEntityMap4Testing().get(entityClass);
			if(alreadyCreatedElement!=null) returnSet.add(alreadyCreatedElement);
			break;
		case COMPLETE:
			T lazzyElement = (T) Enhancer.create(entityClass,
					new LazyAttributeLoader(builderClass));
			returnSet.add(lazzyElement);
			break;
		}
		return returnSet;
	}

	public static void setDefaultPoliciy(DefaultPoliciy d) {
		currentDefaultPoliciy.set(d);
	}

}

class LazyAttributeLoader implements LazyLoader {

	@SuppressWarnings("unchecked")
	Class builderClass;

	public LazyAttributeLoader() {
	}

	@SuppressWarnings("unchecked")
	public <R extends BuilderI> LazyAttributeLoader(Class<R> builderClass) {
		this.builderClass = builderClass;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object loadObject() throws Exception {
		return ((BuilderI) builderClass.newInstance()).build();
	}

}
