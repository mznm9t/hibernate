package access;
// default package

import interfaces.MappingTool;

import java.util.List;
import domain.ID;
import domain.MappingToolH;

/**
 	* A data access object (DAO) providing persistence and search support for MappingTool entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .MappingTool
  * @author MyEclipse Persistence Tools 
 */

public class MappingToolDAO extends GenericHibernateDAOWhiInterface<MappingTool, MappingToolH, ID>  {
	  
	public static final String INTERNAL_VALUE = "internalValue";
	public static final String EXTERNAL_VALUE = "externalValue";
	public static final String ATTRIBUTE_NAME = "attributeName";

	
	public List<MappingTool> findByInternalValue(Object internalValue
	) {
		return findByProperty(INTERNAL_VALUE, internalValue
		);
	}
	
	public List<MappingTool> findByExternalValue(Object externalValue
	) {
		return findByProperty(EXTERNAL_VALUE, externalValue
		);
	}
	
	public List<MappingTool> findByAttributeName(Object attributeName
	) {
		return findByProperty(ATTRIBUTE_NAME, attributeName
		);
	}

}