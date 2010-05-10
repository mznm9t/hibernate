package domain;

import java.util.Collection;

import interfaces.PRManager;
import interfaces.Region;
// default package



/**
 * Office entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class OfficeH extends ContactableH implements interfaces.Office, java.io.Serializable {


    // Fields    

     private String entityName;
     private String description;
     private String name;
     private Region region;
     private PRManager managedBy;


    // Constructors

    /** default constructor */
    public OfficeH() {
    }

    
    /** full constructor */
    public OfficeH(String entityName, String description, String name, Region region, PRManager managedBy) {
        this.entityName = entityName;
        this.description = description;
        this.name = name;
        this.region = region;
        this.managedBy = managedBy;
    }

   
    // Property accessors



    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
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

    public Region getRegion() {
        return this.region;
    }
    
    public void setRegion(Region region) {
        this.region = region;
    }

    public PRManager getManagedBy() {
        return this.managedBy;
    }
    
    public void setManagedBy(PRManager managedBy) {
        this.managedBy = managedBy;
    }


	@Override
	public void addAllManager(PRManager aAllManager) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addAllManagers(Collection aAllManagers) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clearAllManagers() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean containsAllManager(PRManager aAllManager) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Collection getAllManagers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PRManager[] getAllManagersAsArray() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void removeAllManager(PRManager aAllManager) {
		// TODO Auto-generated method stub
	
		
	}
   
    







}