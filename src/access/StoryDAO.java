package access;
// default package

import interfaces.Story;

import java.util.List;

import domain.ID;
import domain.StoryH;



/**
 	* A data access object (DAO) providing persistence and search support for Story entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Story
  * @author MyEclipse Persistence Tools 
 */

public class StoryDAO extends GenericHibernateDAOWhiInterface<Story, StoryH, ID>  {

	public static final String ENTITY_NAME = "entityName";
	public static final String MESSAGE = "message";
	public static final String TITLE = "title";
	public static final String DESCRIPTION = "description";
	public static final String CLIENT = "client";


	public List<Story> findByMessage(Object message
	) {
		return findByProperty(MESSAGE, message
		);
	}
	
	public List<Story> findByTitle(Object title
	) {
		return findByProperty(TITLE, title
		);
	}
	
	public List<Story> findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List<Story> findByClient(Object client
	) {
		return findByProperty(CLIENT, client
		);
	}
	
}