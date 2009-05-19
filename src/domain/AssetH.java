package domain;

import interfaces.Asset;

// default package



/**
 * Asset entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class AssetH  implements Asset,java.io.Serializable {

	private ID id;
    private String entityName;

    // Constructors

    /** default constructor */
    public AssetH() {
    }
    
    /** full constructor */
    public AssetH(String entityName) {
        this.entityName = entityName;
    }

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
   








}