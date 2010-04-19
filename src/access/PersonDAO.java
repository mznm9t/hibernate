package access;
// default package

import java.util.List;
import domain.ID;
import domain.Person;

/**
 	* A data access object (DAO) providing persistence and search support for Person entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Person
  * @author MyEclipse Persistence Tools 
 */

public class PersonDAO extends GenericHibernateDAO<Person, ID>  {

	public static final String ENTITY_NAME = "entityName";
	public static final String COMPANY = "company";
	public static final String JOB_TITLE = "jobTitle";
	public static final String LAST_NAME = "lastName";
	public static final String TITLE = "title";
	public static final String FIRST_NAME = "firstName";

	public List<Person> findByCompany(Object company
	) {
		return findByProperty(COMPANY, company
		);
	}
	
	public List<Person> findByJobTitle(Object jobTitle
	) {
		return findByProperty(JOB_TITLE, jobTitle
		);
	}
	
	public List<Person> findByLastName(Object lastName
	) {
		return findByProperty(LAST_NAME, lastName
		);
	}
	
	public List<Person> findByTitle(Object title
	) {
		return findByProperty(TITLE, title
		);
	}
	
	public List<Person> findByFirstName(Object firstName
	) {
		return findByProperty(FIRST_NAME, firstName
		);
	}
	
}