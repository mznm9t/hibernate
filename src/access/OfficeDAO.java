package access;
// default package

import java.util.List;


import domain.ID;
import domain.Office;

/**
 	* A data access object (DAO) providing persistence and search support for Office entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Office
  * @author MyEclipse Persistence Tools 
 */

public class OfficeDAO extends GenericHibernateDAO<Office, ID>  {

	public static final String ENTITY_NAME = "entityName";
	public static final String DESCRIPTION = "description";
	public static final String NAME = "name";
	public static final String REGION = "region";
	public static final String MANAGED_BY = "managedBy";
	
	public List<Office> findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List<Office> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<Office> findByRegion(Object region
	) {
		return findByProperty(REGION, region
		);
	}
	
	public List<Office> findByManagedBy(Object managedBy
	) {
		return findByProperty(MANAGED_BY, managedBy
		);
	}

}