package domain;

import interfaces.PressRelease;
import interfaces.Story;

// default package



/**
 * PressRelease entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class PressReleaseH  implements PressRelease,java.io.Serializable {


    // Fields    
	 private ID id;
     private String entityName;
     private Story story;


    // Constructors

    /** default constructor */
    public PressReleaseH() {
    }

	
    /** full constructor */
    public PressReleaseH(String entityName, Story story) {
        this.entityName = entityName;
        this.story = story;
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

    public Story getStory() {
        return this.story;
    }
    
    public void setStory(Story story) {
        this.story = story;
    }
   








}