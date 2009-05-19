package access;
// default package

import interfaces.Audience;

import java.util.List;
import domain.AudienceH;
import domain.ID;



/**
 	* A data access object (DAO) providing persistence and search support for Audience entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Audience
  * @author MyEclipse Persistence Tools 
 */

public class AudienceDAO extends GenericHibernateDAOWhiInterface<Audience, AudienceH, ID>  {

	public static final String DESCRIPTION = "description";
	public static final String NAME = "name";
	public static final String SIZE = "size";

	public List<Audience> findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List<Audience> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<Audience> findBySize(Object size
	) {
		return findByProperty(SIZE, size
		);
	}

}