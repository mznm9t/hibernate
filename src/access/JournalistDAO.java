package access;
// default package



import interfaces.Journalist;

import java.util.List;
import domain.ID;
import domain.JournalistH;

/**
 	* A data access object (DAO) providing persistence and search support for Journalist entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Journalist
  * @author MyEclipse Persistence Tools 
 */

public class JournalistDAO extends GenericHibernateDAOWhiInterface<Journalist,JournalistH, ID>  {

	public static final String PUBLICATION = "publication";
	public static final String FREQUENCY = "frequency";
	
	public List<Journalist> findByPublication(Object publication
	) {
		return findByProperty(PUBLICATION, publication
		);
	}
	
	public List<Journalist> findByFrequency(Object frequency
	) {
		return findByProperty(FREQUENCY, frequency
		);
	}
}