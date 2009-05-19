package domain;

import java.util.Collection;
import java.util.Set;

import interfaces.PRManager;
import interfaces.Region;
// default package



/**
 * Office entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class OfficeH extends ContactableH implements interfaces.Office, java.io.Serializable {


    // Fields    

	 private ID id;
     private String entityName;
     private String description;
     private String name;
     private Region region;
     private PRManager managedBy;
	 private Set<PRManager> allManagers;


    // Constructors

    /** default constructor */
    public OfficeH() {
    }

    
    /** full constructor */
    public OfficeH(String entityName, String description, String name, Region region, PRManager managedBy,Set<PRManager> allManagers) {
        this.entityName = entityName;
        this.description = description;
        this.name = name;
        this.region = region;
        this.managedBy = managedBy;
        this.allManagers=allManagers;
    }

   
    // Property accessors

    public ID getID() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setID(ID id) {
		this.id = id;
	}
	
	
    public String getEntityName() {
        return this.entityName;
    }
    
    @SuppressWarnings("unused")
	private void setEntityName(String entityName) {
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
		allManagers.add(aAllManager);
	}


	@SuppressWarnings("unchecked")
	@Override
	public void addAllManagers(Collection aAllManagers) {
		allManagers.addAll(aAllManagers);
		
	}


	@Override
	public void clearAllManagers() {
		allManagers.clear();
	}


	@Override
	public boolean containsAllManager(PRManager aAllManager) {
		return allManagers.contains(aAllManager);
	}


	@SuppressWarnings("unchecked")
	@Override
	public Collection getAllManagers() {
		return allManagers;
	}


	@Override
	public PRManager[] getAllManagersAsArray() {
		return (PRManager[])allManagers.toArray();
	}

	@Override
	public void removeAllManager(PRManager aAllManager) {
		allManagers.remove(aAllManager);
	}
   
    







}