package access;
// default package



import interfaces.ContactGivenType;

import java.util.List;
import domain.ContactGivenTypeH;
import domain.ID;



/**
 	* A data access object (DAO) providing persistence and search support for ContactGivenType entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .ContactGivenType
  * @author MyEclipse Persistence Tools 
 */

public class ContactGivenTypeDAO extends GenericHibernateDAOWhiInterface<ContactGivenType, ContactGivenTypeH, ID>  {

	public static final String ENTITY_NAME = "entityName";
	public static final String TELEPHONE = "telephone";
	public static final String WEBSITE = "website";
	public static final String NAME = "name";

	public List<ContactGivenType> findByTelephone(Object telephone
	) {
		return findByProperty(TELEPHONE, telephone
		);
	}
	
	public List<ContactGivenType> findByWebsite(Object website
	) {
		return findByProperty(WEBSITE, website
		);
	}
	
	public List<ContactGivenType> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}

}