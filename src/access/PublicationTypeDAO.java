package access;
// default package

import interfaces.PublicationType;

import java.util.List;
import domain.ID;
import domain.PublicationTypeH;

/**
 	* A data access object (DAO) providing persistence and search support for PublicationTypeH entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .PublicationTypeH
  * @author MyEclipse Persistence Tools 
 */

public class PublicationTypeDAO extends GenericHibernateDAOWhiInterface<PublicationType, PublicationTypeH, ID>  {

	public static final String NAME = "name";
	public static final String CODE = "code";
	public static final String VALUE = "value";

	
	public List<PublicationType> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<PublicationType> findByCode(Object code
	) {
		return findByProperty(CODE, code
		);
	}
	
	public List<PublicationType> findByValue(Object value
	) {
		return findByProperty(VALUE, value
		);
	}
}