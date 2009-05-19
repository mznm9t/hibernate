package domain;

import interfaces.SequenceNumber;

// default package



/**
 * SequenceNumber entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class SequenceNumberH  implements SequenceNumber,java.io.Serializable {


    // Fields    
	 private ID id;
     private String entityName;
     private String suffix;
     private String prefix;
     private Integer digits;
     private Integer last;
     private String lastString;
     private String description;
     private String name;


    // Constructors

    /** default constructor */
    public SequenceNumberH() {
    }

    
    /** full constructor */
    public SequenceNumberH(String entityName, String suffix, String prefix, Integer digits, Integer last, String lastString, String description, String name) {
        this.entityName = entityName;
        this.suffix = suffix;
        this.prefix = prefix;
        this.digits = digits;
        this.last = last;
        this.lastString = lastString;
        this.description = description;
        this.name = name;
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

    public String getSuffix() {
        return this.suffix;
    }
    
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return this.prefix;
    }
    
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getDigits() {
        return this.digits;
    }
    
    public void setDigits(Integer digits) {
        this.digits = digits;
    }

    public Integer getLast() {
        return this.last;
    }
    
    public void setLast(Integer last) {
        this.last = last;
    }

    public String getLastString() {
        return this.lastString;
    }
    
    public void setLastString(String lastString) {
        this.lastString = lastString;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

}