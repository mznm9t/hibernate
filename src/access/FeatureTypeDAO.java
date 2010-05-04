package access;
// default package



import interfaces.FeatureType;
import java.util.List;
import domain.FeatureTypeH;
import domain.ID;


/**
 	* A data access object (DAO) providing persistence and search support for FeatureType entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .FeatureType
  * @author MyEclipse Persistence Tools 
 */

public class FeatureTypeDAO extends GenericHibernateDAOWhiInterface<FeatureType, FeatureTypeH, ID>  {
	
	public static final String ENTITY_NAME = "entityName";
	public static final String NAME = "name";
	public static final String CODE = "code";

	public List<FeatureType> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<FeatureType> findByCode(Object code
	) {
		return findByProperty(CODE, code
		);
	}

}