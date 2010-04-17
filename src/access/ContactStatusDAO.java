package access;
// default package

import java.util.List;


import domain.ContactStatus;
import domain.ID;

/**
 	* A data access object (DAO) providing persistence and search support for ContactStatus entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .ContactStatus
  * @author MyEclipse Persistence Tools 
 */

public class ContactStatusDAO extends GenericHibernateDAO<ContactStatus, ID>  {
	   
	public static final String ENTITY_NAME = "entityName";
	public static final String NAME = "name";
	public static final String CODE = "code";

	public List<ContactStatus> findByEntityName(Object entityName
	) {
		return findByProperty(ENTITY_NAME, entityName
		);
	}
	
	public List<ContactStatus> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<ContactStatus> findByCode(Object code
	) {
		return findByProperty(CODE, code
		);
	}
	


}