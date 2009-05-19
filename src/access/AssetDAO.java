package access;
// default package

import interfaces.Asset;
import domain.AssetH;
import domain.ID;


/**
 	* A data access object (DAO) providing persistence and search support for Asset entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Asset
  * @author MyEclipse Persistence Tools 
 */

public class AssetDAO extends GenericHibernateDAOWhiInterface<Asset, AssetH, ID>  {
	    
}