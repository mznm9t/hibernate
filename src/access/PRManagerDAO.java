package access;
// default package

import java.util.List;
import domain.ID;
import domain.PRManager;

/**
 	* A data access object (DAO) providing persistence and search support for PRManager entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .PRManager
  * @author MyEclipse Persistence Tools 
 */

public class PRManagerDAO extends GenericHibernateDAO<PRManager, ID>  {

	public static final String ENTITY_NAME = "entityName";
	public static final String FULL_NAME = "fullName";


	public List<PRManager> findByFullName(Object fullName
	) {
		return findByProperty(FULL_NAME, fullName
		);
	}
	
}