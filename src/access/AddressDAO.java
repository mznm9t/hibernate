package access;
// default package

import java.util.List;
import domain.Address;
import domain.ID;

/**
 	* A data access object (DAO) providing persistence and search support for Address entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Address
  * @author MyEclipse Persistence Tools 
 */

public class AddressDAO extends GenericHibernateDAO<Address, ID>  {     
	public static final String ENTITY_NAME = "entityName";
	public static final String POSTCODE = "postcode";
	public static final String LINE4 = "line4";
	public static final String LINE3 = "line3";
	public static final String LINE2 = "line2";
	public static final String LINE1 = "line1";
	public static final String COUNTRY = "country";

	public List<Address> findByPostcode(Object postcode
	) {
		return findByProperty(POSTCODE, postcode
		);
	}
	
	public List<Address> findByLine4(Object line4
	) {
		return findByProperty(LINE4, line4
		);
	}
	
	public List<Address> findByLine3(Object line3
	) {
		return findByProperty(LINE3, line3
		);
	}
	
	public List<Address> findByLine2(Object line2
	) {
		return findByProperty(LINE2, line2
		);
	}
	
	public List<Address> findByLine1(Object line1
	) {
		return findByProperty(LINE1, line1
		);
	}
	
	public List<Address> findByCountry(Object country
	) {
		return findByProperty(COUNTRY, country
		);
	}
	

}