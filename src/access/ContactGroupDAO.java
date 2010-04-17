package access;
// default package

import java.util.List;
import domain.ContactGroup;
import domain.ID;

/**
 	* A data access object (DAO) providing persistence and search support for ContactGroup entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .ContactGroup
  * @author MyEclipse Persistence Tools 
 */

public class ContactGroupDAO extends GenericHibernateDAO<ContactGroup, ID>  {   
		//property constants
	public static final String ENTITY_NAME = "entityName";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";

	public List<ContactGroup> findByEntityName(Object entityName
	) {
		return findByProperty(ENTITY_NAME, entityName
		);
	}
	
	public List<ContactGroup> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<ContactGroup> findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
}