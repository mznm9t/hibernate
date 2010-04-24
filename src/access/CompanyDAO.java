package access;
// default package

import java.util.List;


import interfaces.Company;
import domain.CompanyH;
import domain.ID;

/**
 	* A data access object (DAO) providing persistence and search support for Company entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Company
  * @author MyEclipse Persistence Tools 
 */

public class CompanyDAO extends GenericHibernateDAOWhiInterface<Company, CompanyH, ID>  {
		
	public static final String ENTITY_NAME = "entityName";
	public static final String NAME = "name";
	public static final String MAIN_CONTACT = "mainContact";


	public List<Company> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<Company> findByMainContact(Object mainContact
	) {
		return findByProperty(MAIN_CONTACT, mainContact
		);
	}

}