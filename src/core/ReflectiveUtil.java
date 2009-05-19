package core;


import interfaces.BusinessObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.Class;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author omar
 * This helper class allows you to clone a compare object to different types (or same type) based only on thier attributes.
 */

/**
 * @author omar
 *
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
	 * @throws Exception 
	 */
	public static boolean hasSameValues(Object srcObj,Object dstObj) {
		return hasSameValues(srcObj,dstObj,true);
	}
	
	
	/**
	 * As hasSomeValues(Object,Object) but allows you to choose comparing the one-many relationships or not
	 * If choose to compare this kind attributes, the method will compare all the elements of the source
	 * object and destination object plus the element related through the set attributes. 
	 * @param srcObj - Object a to be compare
	 * @param dstObj - Object b to be compare
	 * @param compareSetAttributes - If true will compare the element of the set attributes(oneToMany relationships)
	 * @return return true if both elements are null or destination object has the same attributes values that the 
	 * source object. Otherwise return false;
	 */
	public static boolean hasSameValues(Object srcObj,Object dstObj,boolean compareSetAttributes) {
		if(srcObj == null && dstObj==null)return true;
		if(srcObj == null || dstObj==null)return false;
		Map<FieldNameAndType, FieldInObject> srcFields = getAllFields(srcObj);
		Map<FieldNameAndType, FieldInObject> dstFields = getAllFields(dstObj);
		for (FieldNameAndType key : srcFields.keySet()) {
				if (DEBUG) System.out.println ("Comparing - src object key[" + key + "] - [ value =  "+ srcFields.get(key)+ " ]");
				if (DEBUG) System.out.println ("to  - dst contains key : [" + dstFields.containsKey(key) + " ] - [ value ="+ dstFields.get(key)+ " ]");
				if (!dstFields.containsKey(key) || (!equals(srcFields.get(key).value, dstFields.get(key).value, compareSetAttributes)))return false;
			  //  if (DEBUG) System.out.println ("Comparing - dst object key present [" + dstFields.containsKey(key) + " - "+ dstFields.get(key)+ " ]");
			}
		return true;
		
	}
	
	/**
	 * This method will tell if the an object has any of his attribute set to null;
	 * @param obj The object to be check
	 * @return	Return true if any of the attributes is null.
	 */
	public static boolean hasAnyNullValues(Object obj){
		if(obj==null)return true;
		Map<FieldNameAndType, FieldInObject> srcFields = getAllFields(obj);
		for (FieldNameAndType key : srcFields.keySet()) {
				if (DEBUG) System.out.println ("Examining if it is null - src object key[" + key + "] - [ value =  "+ srcFields.get(key)+ " ]");
			    if (srcFields.get(key).value == null) return true;
			}
	    return false;
	}
	
	//this method will determine if a specific object is a virtual proxy created with CGLIB
	private static boolean isAVirtualProxy(Object obj){
		if(obj.getClass().getName().contains("EnhancerByCGLIB")) return true;
		if(obj.getClass().getName().contains("javassist")) return true;
		else return false;
	}
	

	/* this method return the real object behind a virtual proxy.
	 * @param load if true it will try to load the object before return it.
	 * @return return the real object behind the virtual proxy.
	 */
	private static Object getProxiedObject(Object srcObj,boolean load){
		if(!isAVirtualProxy(srcObj))return null;
		else if(srcObj.getClass().getName().contains("EnhancerByCGLIB")) return getLocallyProxiedObject(srcObj,load);
		else if(srcObj.getClass().getName().contains("javassist")) return getHiberanteProxiedObject(srcObj);
		else return null;
	}
	
	private static Object getLocallyProxiedObject(Object srcObj,boolean load){
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
	
	
	private static Object getHiberanteProxiedObject(Object srcObj){
		try {
			Field handlerAttribute=srcObj.getClass().getDeclaredField("handler");
			handlerAttribute.setAccessible(true);
			Object handler=handlerAttribute.get(srcObj);
			Method initMethod= handler.getClass().getMethod("getImplementation",new Class[0]);
			return initMethod.invoke(handler, new Object[0]);
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		} catch (IllegalArgumentException e) {		
			e.printStackTrace();
		} catch (NoSuchMethodException e) {		
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}return null;
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
		Set<String> fieldNames=new HashSet<String>();
		if(isAVirtualProxy(srcObj))srcObj=getProxiedObject(srcObj,true);
		
		// we iterate from the direct class to all the super classes ..
		Map<FieldNameAndType, FieldInObject> srcFields = new HashMap<FieldNameAndType, FieldInObject>();
		for (Class c = srcObj.getClass(); c != Object.class; c = c
				.getSuperclass()) {

			Field[] declaredfields = c.getDeclaredFields();// we get all the
			Map<FieldNameAndType, FieldInObject> fieldValues=getFieldValues(srcObj, declaredfields);
			
			//We make sure that we do not compare fields of the super-classes that have been override
			//by the subclass i.e. ID is in Contactable and also in Company which is a subclass of 
			//Contactable. We only want to compare the ID from Company. Not the ID from the superclass.
			
			Collection<FieldNameAndType> itemsToRemove=new ArrayList<FieldNameAndType>();
			for(FieldNameAndType k:fieldValues.keySet()){
				if(!fieldNames.contains(k.fieldName)){
					fieldNames.add(k.fieldName);
				}else itemsToRemove.add(k);
				
			}
			for(FieldNameAndType k:itemsToRemove) fieldValues.remove(k);	
			
			
			srcFields.putAll(fieldValues);
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
		    	
		    		if (override || dstFields.get(key).value == null) {
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
	
	private static boolean equals(Object a,Object b,boolean compareCollections){
		if(a==null && b==null) return true;
		if(a==null && b!=null) {
			System.out.println("Object A is null!");
			return false;
		}
		if(b==null && a!=null) {
			System.out.println("Object B is null!");
			return false;
		}
		if(a instanceof Collection && b instanceof Collection)
			return (compareCollections ? equals4Collections((Set)a,(Set)b): true);
		else if(isAVirtualProxy(a) && isAVirtualProxy(b))
			//if both are virtual proxy will compare the proxied values if loaded.				
			return equals(getProxiedObject(a, false),getProxiedObject(b, false),compareCollections);
		else if(a instanceof BusinessObject && b instanceof BusinessObject)
			return equals4BusinessObjects((BusinessObject)a,(BusinessObject)b);
		else if(b.equals(a) && a.equals(b))
			return true;
		else return false;	
	}
	
	private static boolean equals4BusinessObjects(BusinessObject o1,BusinessObject o2){
		if(o1.getID() == null || o2.getID()==null ) return false;
		else return o1.getID().toString().equals(o2.getID().toString());
	}
	
	private static boolean equals4Collections(Set<BusinessObject> a,Set<BusinessObject> b){
		List<BusinessObject> listA=new ArrayList(a);
		List<BusinessObject> listB=new ArrayList(b);
		
		Comparator<BusinessObject> c=new Comparator<BusinessObject>(){
			@Override
			public int compare(BusinessObject o1, BusinessObject o2) {
				if(o1.equals(o2)) return 0;
				if(o1.getID() == null || o2.getID()==null ) return -1;
				else return o1.getID().toString().compareTo(o2.getID().toString());
			}	
		};
		java.util.Collections.sort(listA, c);
		java.util.Collections.sort(listB, c);
		
		for(BusinessObject o:listA) {
			int index=java.util.Collections.binarySearch(listB, o, c);
			if(index < 0) return false; 
		}
		for(BusinessObject o:listB) {
			int index=java.util.Collections.binarySearch(listA, o, c);
			if(index < 0) return false; 
		}
		return true;
	}
	
	public static void setField(Object obj,String fieldName,Object value){
		try {
			Field field=obj.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(obj, value);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Object getField(Object obj,String fieldName){
		try {
			Field field=obj.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			return field.get(obj);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}return null;
		
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
