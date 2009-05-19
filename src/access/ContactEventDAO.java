package access;
// default package

import java.util.List;
import domain.ContactEventH;
import domain.ID;
import interfaces.ContactEvent;

/**
 	* A data access object (DAO) providing persistence and search support for Publication entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Publication
  * @author MyEclipse Persistence Tools 
 */

public class ContactEventDAO extends GenericHibernateDAOWhiInterface<ContactEvent,ContactEventH, ID>  {

	public static final String CONTENT = "content";
	public static final String TITLE = "title";
	public static final String TYPE = "type";
	public static final String WHENHAPPENED = "whenHappened";
	public static final String WHENPLANNED = "whenPlanned";
	public static final String FOLLOWUP = "followup";
	public static final String OURCONTACT = "ourContact";
	public static final String THEIRCONTACT = "theirContact";


	public List<ContactEvent> findByContent(Object content
	) {
		return findByProperty(CONTENT, content
		);
	}
	
	public List<ContactEvent> findByTitle(Object title
	) {
		return findByProperty(TITLE, title
		);
	}
	
	public List<ContactEvent> findByType(Object type
	) {
		return findByProperty(TYPE, type
		);
	}
	
	
	public List<ContactEvent> findByWhenHappened(Object whenHappened
	) {
		return findByProperty(WHENHAPPENED, whenHappened
		);
	}
	
	public List<ContactEvent> findByWhenPlanned(Object whenPlanned
	) {
		return findByProperty(WHENPLANNED, whenPlanned
		);
	}
	
	public List<ContactEvent> findByFollowup(Object followup
	) {
		return findByProperty(FOLLOWUP, followup
		);
	}
	
	
	public List<ContactEvent> findByOurContact(Object ourContact
	) {
		return findByProperty(OURCONTACT, ourContact
		);
	}
	
	public List<ContactEvent> findByTheirContact(Object theirContact
	) {
		return findByProperty(THEIRCONTACT, theirContact
		);
	}
	
}