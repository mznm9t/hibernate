package access;
// default package

import interfaces.Region;

import java.util.List;
import domain.ID;
import domain.RegionH;

/**
 	* A data access object (DAO) providing persistence and search support for RegionH entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .RegionH
  * @author MyEclipse Persistence Tools 
 */

public class RegionDAO extends GenericHibernateDAOWhiInterface<Region, RegionH, ID>  {

	public static final String NAME = "name";
	public static final String CODE = "code";

	public List<Region> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<Region> findByCode(Object code
	) {
		return findByProperty(CODE, code
		);
	}
}