package access;
// default package



import java.util.List;

import interfaces.Employee;
import domain.EmployeeH;
import domain.ID;

/**
 	* A data access object (DAO) providing persistence and search support for Employee entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Employee
  * @author MyEclipse Persistence Tools 
 */

public class EmployeeDAO extends GenericHibernateDAOWhiInterface<Employee,EmployeeH, ID>  {
	
	public static final String CURRENT = "current";
	
	public List<Employee> findByCurrent(Object current
	) {
		return findByProperty(CURRENT, current
		);
	}
	
}