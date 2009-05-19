package access;
// default package



import interfaces.PressRelease;

import java.util.List;

import domain.ID;
import domain.PressReleaseH;

/**
 	* A data access object (DAO) providing persistence and search support for PressRelease entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .PressRelease
  * @author MyEclipse Persistence Tools 
 */

public class PressReleaseDAO extends GenericHibernateDAOWhiInterface<PressRelease, PressReleaseH, ID>  {

	
	public static final String STORY = "story";


	public List<PressRelease> findByStory(Object story
	) {
		return findByProperty(STORY, story
		);
	}
	

}