package access;
// default package



import interfaces.MentionType;
import java.util.List;
import domain.ID;
import domain.MentionTypeH;



/**
 	* A data access object (DAO) providing persistence and search support for MentionType entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .MentionType
  * @author MyEclipse Persistence Tools 
 */

public class MentionTypeDAO extends GenericHibernateDAOWhiInterface<MentionType, MentionTypeH, ID>  {

	public static final String NAME = "name";
	public static final String CODE = "code";

	
	public List<MentionType> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<MentionType> findByCode(Object code
	) {
		return findByProperty(CODE, code
		);
	}
	
}