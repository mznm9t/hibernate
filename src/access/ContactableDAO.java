package access;
// default package


import interfaces.Contactable;

import java.util.List;
import domain.ContactableH;
import domain.ID;

/**
 	* A data access object (DAO) providing persistence and search support for Contactable entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Contactable
  * @author MyEclipse Persistence Tools 
 */

public class ContactableDAO extends GenericHibernateDAOWhiInterface<Contactable,ContactableH, ID>  {
		
		//property constants
	public static final String ENTITY_NAME = "entityName";
	public static final String NOTES = "notes";
	public static final String MAIN_GROUP = "mainGroup";
	public static final String ADDRESS = "address";
	public static final String PHONE1 = "phone1";
	public static final String PHONE2 = "phone2";
	public static final String MOBILE = "mobile";
	public static final String FAX = "fax";
	public static final String EMAIL = "email";
	public static final String WWW = "www";
	public static final String STATUS = "status";
	public static final String CREATED = "created";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String ACCOUNT_MANAGER = "accountManager";
	public static final String KNOWN_AS = "knownAs";
	public static final String IDENTIFIER = "identifier";

	public List<Contactable> findByNotes(Object notes
	) {
		return findByProperty(NOTES, notes
		);
	}
	
	public List<Contactable> findByMainGroup(Object mainGroup
	) {
		return findByProperty(MAIN_GROUP, mainGroup
		);
	}
	
	public List<Contactable> findByAddress(Object address
	) {
		return findByProperty(ADDRESS, address
		);
	}
	
	public List<Contactable> findByPhone1(Object phone1
	) {
		return findByProperty(PHONE1, phone1
		);
	}
	
	public List<Contactable> findByPhone2(Object phone2
	) {
		return findByProperty(PHONE2, phone2
		);
	}
	
	public List<Contactable> findByMobile(Object mobile
	) {
		return findByProperty(MOBILE, mobile
		);
	}
	
	public List<Contactable> findByFax(Object fax
	) {
		return findByProperty(FAX, fax
		);
	}
	
	public List<Contactable> findByEmail(Object email
	) {
		return findByProperty(EMAIL, email
		);
	}
	
	public List<Contactable> findByWww(Object www
	) {
		return findByProperty(WWW, www
		);
	}
	
	public List<Contactable> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List<Contactable> findByCreated(Object created
	) {
		return findByProperty(CREATED, created
		);
	}
	
	public List<Contactable> findByLastUpdate(Object lastUpdate
	) {
		return findByProperty(LAST_UPDATE, lastUpdate
		);
	}
	
	public List<Contactable> findByAccountManager(Object accountManager
	) {
		return findByProperty(ACCOUNT_MANAGER, accountManager
		);
	}
	
	public List<Contactable> findByKnownAs(Object knownAs
	) {
		return findByProperty(KNOWN_AS, knownAs
		);
	}
	
}