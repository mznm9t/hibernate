package domain;

import interfaces.MappingTool;

// default package



/**
 * MappingTool entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class MappingToolH  implements MappingTool,java.io.Serializable {

	 private ID id;
     private String entityName;
     private String internalValue;
     private String externalValue;
     private String attributeName;


    // Constructors

    /** default constructor */
    public MappingToolH() {
    }

	
    
    /** full constructor */
    public MappingToolH(String entityName, String internalValue, String externalValue, String attributeName) {
        this.entityName = entityName;
        this.internalValue = internalValue;
        this.externalValue = externalValue;
        this.attributeName = attributeName;
    }

   
    // Property accessors
    public String getEntityName() {
        return this.entityName;
    }
    
    @SuppressWarnings("unused")
	private void setEntityName(String entityName) {
        this.entityName = entityName;
    }

	@Override
	public ID getID() {
		return this.id;
	}
	
	@SuppressWarnings("unused")
	private void setID(ID id) {
		this.id = id;
	}
    
    public String getInternalValue() {
        return this.internalValue;
    }
    
    public void setInternalValue(String internalValue) {
        this.internalValue = internalValue;
    }

    public String getExternalValue() {
        return this.externalValue;
    }
    
    public void setExternalValue(String externalValue) {
        this.externalValue = externalValue;
    }

    public String getAttributeName() {
        return this.attributeName;
    }
    
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }


}