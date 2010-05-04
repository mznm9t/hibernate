package core;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author omar
 * This helper class allows you to clone a compare object to different types (or same type) based only on thier attributes.
 */

@SuppressWarnings("unchecked")
public abstract class ReflectiveUtil {

	private static final Set FINAL_IMMUTABLE_CLASSES; // set in <clinit>

	public static boolean DEBUG = true;

	static {
		FINAL_IMMUTABLE_CLASSES = new HashSet(17);
		// add some common final/immutable classes:
		FINAL_IMMUTABLE_CLASSES.add(String.class);
		FINAL_IMMUTABLE_CLASSES.add(Byte.class);
		FINAL_IMMUTABLE_CLASSES.add(Short.class);
		FINAL_IMMUTABLE_CLASSES.add(Integer.class);
		FINAL_IMMUTABLE_CLASSES.add(Long.class);
		FINAL_IMMUTABLE_CLASSES.add(Float.class);
		FINAL_IMMUTABLE_CLASSES.add(Double.class);
		FINAL_IMMUTABLE_CLASSES.add(Character.class);
		FINAL_IMMUTABLE_CLASSES.add(Boolean.class);
	}
	
	/**
	 * This method compare two object not necessarily of the same type but with the same attributes .
	 * @param srcObj source object
	 * @param dstObj	destination object
	 * @return	return true if all the attributes in dstObj has the same values as the attributes in srcObj
	 */
	public static boolean hasSameValues(Object srcObj,Object dstObj){
		Map<FieldNameAndType, FieldInObject> srcFields = getAllFields(srcObj);
		Map<FieldNameAndType, FieldInObject> dstFields = getAllFields(dstObj);
		for (FieldNameAndType key : srcFields.keySet()) {
				if (DEBUG) System.out.println ("Comparing - src object key[" + key + "] - [ value =  "+ srcFields.get(key)+ " ]");
				if (DEBUG) System.out.println ("to  - dst contains key : [" + dstFields.containsKey(key) + " ] - [ value ="+ dstFields.get(key)+ " ]");
				if (!dstFields.containsKey(key) || (!equals(srcFields.get(key).value,dstFields.get(key).value)))return false;
			  //  if (DEBUG) System.out.println ("Comparing - dst object key present [" + dstFields.containsKey(key) + " - "+ dstFields.get(key)+ " ]");
			}
		return true;
		
	}
	
	//this method will determine if a specific object is a virtual proxy created with CGLIB
	private static boolean isAVirtualProxy(Object obj){
		if(obj.getClass().getName().contains("EnhancerByCGLIB")) return true;
		else return false;
	}
	

	/* this method return the real object behind a virtual proxy.
	 * @param load if true it will try to load the object before return it.
	 * @return return the real object behind the virtual proxy.
	 */
	private static Object getProxiedObject(Object srcObj,boolean load){
		if(!isAVirtualProxy(srcObj))return null;
		if(load)srcObj.toString();//this will force the load of the object
		Field[] declaredfields = srcObj.getClass().getDeclaredFields();
		for(Field f:declaredfields){
			if(f.getName().contains("LAZY_LOADER")) {
				try {
					f.setAccessible(true);
					srcObj=f.get(srcObj);
				} catch (Exception e) {
					e.printStackTrace();}
				break;
				}
		}return srcObj;
	}
	
	
	/**
	 * This method will make a shadow copy(copy on the references not recursive copy) of the source object into the destination object
	 * Note that they do not need to be of the same type, the method will copy the common attributes.
	 * @param srcObj source object
	 * @param dstObt	destination object
	 * @param override  if selected will override the destination attributes with the source attributes,if the attribute is null it 
	 * will set to null the destination attribute.
	 * @return the destination object , the object that has been modified.
	 */
	public static Object copyObjectFields(Object srcObj,Object dstObt,boolean override){
		populateObject(getAllFields(srcObj),getAllFields(dstObt),override);
		return dstObt;
	}
	
	
	private static Map<FieldNameAndType, FieldInObject> getAllFields(Object srcObj) {
		
		//First we need to check that the object we want to get the fields from is not 
		//not a dynamic proxy created for easy loading. If this is the case we need to extract 
		//the object from the proxy.
		if(isAVirtualProxy(srcObj))srcObj=getProxiedObject(srcObj,true);
		
		// we iterate from the direct class to all the super classes ..
		Map<FieldNameAndType, FieldInObject> srcFields = new HashMap<FieldNameAndType, FieldInObject>();
		for (Class c = srcObj.getClass(); c != Object.class; c = c
				.getSuperclass()) {

			Field[] declaredfields = c.getDeclaredFields();// we get all the
			srcFields.putAll(getFieldValues(srcObj, declaredfields));
		}
		return srcFields;
	}


	private static Map<FieldNameAndType, FieldInObject> getFieldValues(Object srcObj,
			Field[] fields) {

		HashMap<FieldNameAndType, FieldInObject> fieldsMap = new HashMap<FieldNameAndType, FieldInObject>();

		for (int f = 0, fieldsLength = fields.length; f < fieldsLength; ++f) {
			final Field field = fields[f];
			if(field==null) continue;
			final int modifiers = field.getModifiers();
			if ((Modifier.STATIC & modifiers) != 0)
				continue; // the field is static then do not copy it.
			if ((Modifier.FINAL & modifiers) != 0)
				continue; // we do not copy final attributes.
			if ((Modifier.PUBLIC & modifiers) == 0) {// the field is not public
				try {
					field.setAccessible(true);
				} catch (SecurityException e) {
					throw new RuntimeException("cannot access field ["
							+ field.getName() + "] of class ["
							+ srcObj.getClass().getName() + "]: "
							+ e.toString());
				}
				// now we copy the field
				try // to clone and set the field value:
				{
						fieldsMap.put(new FieldNameAndType(field),new FieldInObject(field,srcObj,field.get(srcObj)));

				} catch (Exception e) {
					if (DEBUG)
						e.printStackTrace(System.out);
					throw new RuntimeException("Error retrieving field ["
							+ field.getName() + "] of class ["
							+ srcObj.getClass().getName() + "]: "
							+ e.toString());
				}

			}
		}
		return fieldsMap;

	}

	private static void populateObject(Map<FieldNameAndType, FieldInObject> srcFields,
			Map<FieldNameAndType, FieldInObject> dstFields, boolean override) {
		for (FieldNameAndType key : srcFields.keySet()) {
		    if (DEBUG) System.out.println ("populateObject - src object key[" + key + " - "+ srcFields.get(key)+ " ]");
		    if (dstFields.containsKey(key)){
		    	try {
		    	Field destField=dstFields.get(key).field;
		    	Object destObject=dstFields.get(key).obj;
		    	
		    		if (override || dstFields.get(key) == null) {
			    		destField.set(destObject, srcFields.get(key).value); // populate the field of
																// the destination
																// object overriding the
																// current value if
																// exist or if the current value is null
		    		}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} 
		    }
			if (DEBUG) System.out.println ("populateObject - dst object key present [" + dstFields.containsKey(key) + " - "+ dstFields.get(key)+ " ]");
		}

	}
	
	
	private static boolean equals(Object a,Object b){
		if(a==null && b==null)return true;
		if(a==null && b!=null) return false;
		if(b==null && a!=null) return false;
		if(isAVirtualProxy(a) && isAVirtualProxy(b)){ 
			//if both are virtual proxy will compare the proxied values if loaded.				
			return equals(getProxiedObject(a, false),getProxiedObject(b, false));
		}
		if(b.equals(a) || a.equals(b))return true;
		else return false;	
	}
	
	

}

/**
 * @author omar
 * Helper class use to store the couple of the field and the object
 * This because in order to set a field using reflection you need both i.e. field.set(object) 
 */
class FieldInObject{
	

	Field field;
	Object obj;
	Object value;
	
	public FieldInObject(Field field, Object obj,Object value) {
		super();
		this.field = field;
		this.obj = obj;
		this.value = value;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((field == null) ? 0 : field.hashCode());
		result = prime * result + ((obj == null) ? 0 : obj.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof FieldInObject))
			return false;
		FieldInObject other = (FieldInObject) obj;
		if (field == null) {
			if (other.field != null)
				return false;
		} else if (!field.equals(other.field))
			return false;
		if (this.obj == null) {
			if (other.obj != null)
				return false;
		} else if (!this.obj.equals(other.obj))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "FieldInObject [field=" + field + ", obj=" + obj + ", value - Lazy Value]";
	}
	
}



class FieldNameAndType{
	
	
	@Override
	public String toString() {
		return "FieldNameAndType [fieldName=" + fieldName + ", type=" + type
				+ "]";
	}

	@SuppressWarnings("unchecked")
	Class type;
	String fieldName;

	
	public FieldNameAndType(Field field) {
		super();
		this.fieldName = field.getName();
		this.type = field.getType();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fieldName == null) ? 0 : fieldName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof FieldNameAndType))
			return false;
		FieldNameAndType other = (FieldNameAndType) obj;
		if (fieldName == null) {
			if (other.fieldName != null)
				return false;
		} else if (!fieldName.equals(other.fieldName))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}	
}
