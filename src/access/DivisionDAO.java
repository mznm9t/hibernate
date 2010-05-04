package access;
// default package

import interfaces.Division;
import java.util.List;
import domain.DivisionH;
import domain.ID;



/**
 	* A data access object (DAO) providing persistence and search support for Division entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Division
  * @author MyEclipse Persistence Tools 
 */

public class DivisionDAO extends GenericHibernateDAOWhiInterface<Division, DivisionH, ID>  {
	public static final String ENTITY_NAME = "entityName";
	public static final String NAME = "name";

	public List<Division> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
}