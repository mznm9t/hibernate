package access;
// default package

import interfaces.Country;

import java.util.List;

import domain.CountryH;
import domain.ID;

/**
 	* A data access object (DAO) providing persistence and search support for Country entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Country
  * @author MyEclipse Persistence Tools 
 */

public class CountryDAO extends GenericHibernateDAOWhiInterface<Country,CountryH,ID>  {
 
	public static final String NAME = "name";
	public static final String ISO_CODE = "isoCode";

	public List<Country> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<Country> findByIsoCode(Object isoCode
	) {
		return findByProperty(ISO_CODE, isoCode
		);
	}	

}