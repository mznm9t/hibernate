package access;
// default package

import java.util.List;
import domain.ID;
import domain.PublicationH;
import interfaces.Publication;

/**
 	* A data access object (DAO) providing persistence and search support for Publication entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Publication
  * @author MyEclipse Persistence Tools 
 */

public class PublicationDAO extends GenericHibernateDAOWhiInterface<Publication,PublicationH, ID>  {

	public static final String DESCRIPTION = "description";
	public static final String PUBLICATION_NAME = "publicationName";
	public static final String TYPE = "type";
	public static final String VALUE = "value";

	public List<Publication> findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List<Publication> findByPublicationName(Object publicationName
	) {
		return findByProperty(PUBLICATION_NAME, publicationName
		);
	}
	
	public List<Publication> findByType(Object type
	) {
		return findByProperty(TYPE, type
		);
	}
	
	public List<Publication> findByValue(Object value
	) {
		return findByProperty(VALUE, value
		);
	}
	
}