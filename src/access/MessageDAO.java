package access;
// default package



import java.util.List;
import domain.ID;
import interfaces.Message;
import domain.MessageH;

/**
 	* A data access object (DAO) providing persistence and search support for Message entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Message
  * @author MyEclipse Persistence Tools 
 */

public class MessageDAO extends GenericHibernateDAOWhiInterface<Message, MessageH, ID>  {
    
	public static final String ENTITY_NAME = "entityName";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";

	
	public List<Message> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<Message> findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}

}