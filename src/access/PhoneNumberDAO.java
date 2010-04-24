package access;
// default package

import interfaces.PhoneNumber;

import java.util.List;

import domain.ID;
import domain.PhoneNumberH;


/**
 	* A data access object (DAO) providing persistence and search support for PhoneNumber entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .PhoneNumber
  * @author MyEclipse Persistence Tools 
 */

public class PhoneNumberDAO extends GenericHibernateDAOWhiInterface<PhoneNumber,PhoneNumberH, ID>  {
	
	public static final String ENTITY_NAME = "entityName";
	public static final String AREA_CODE = "areaCode";
	public static final String THE_NUMBER = "theNumber";
	public static final String COUNTRY_CODE = "countryCode";

	public List<PhoneNumber>findByAreaCode(Object areaCode
	) {
		return findByProperty(AREA_CODE, areaCode
		);
	}
	
	public List<PhoneNumber>findByTheNumber(Object theNumber
	) {
		return findByProperty(THE_NUMBER, theNumber
		);
	}
	
	public List<PhoneNumber>findByCountryCode(Object countryCode
	) {
		return findByProperty(COUNTRY_CODE, countryCode
		);
	}
}