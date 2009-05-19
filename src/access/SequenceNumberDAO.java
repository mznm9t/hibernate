package access;
// default package



import interfaces.SequenceNumber;

import java.util.List;
import domain.ID;
import domain.SequenceNumberH;

/**
 	* A data access object (DAO) providing persistence and search support for SequenceNumber entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .SequenceNumber
  * @author MyEclipse Persistence Tools 
 */

public class SequenceNumberDAO extends GenericHibernateDAOWhiInterface<SequenceNumber, SequenceNumberH, ID>  {

	public static final String SUFFIX = "suffix";
	public static final String PREFIX = "prefix";
	public static final String DIGITS = "digits";
	public static final String LAST = "last";
	public static final String LAST_STRING = "lastString";
	public static final String DESCRIPTION = "description";
	public static final String NAME = "name";

	
	public List<SequenceNumber> findBySuffix(Object suffix
	) {
		return findByProperty(SUFFIX, suffix
		);
	}
	
	public List<SequenceNumber> findByPrefix(Object prefix
	) {
		return findByProperty(PREFIX, prefix
		);
	}
	
	public List<SequenceNumber> findByDigits(Object digits
	) {
		return findByProperty(DIGITS, digits
		);
	}
	
	public List<SequenceNumber> findByLast(Object last
	) {
		return findByProperty(LAST, last
		);
	}
	
	public List<SequenceNumber> findByLastString(Object lastString
	) {
		return findByProperty(LAST_STRING, lastString
		);
	}
	
	public List<SequenceNumber> findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List<SequenceNumber> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
}