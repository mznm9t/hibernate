package access;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.HibernateSessionFactory;



/**
 * @author omar
 *
 * @param <T>
 * @param <I>
 */

public abstract class GenericHibernateDAO<T, I extends Serializable> implements
		GenericDAO<T, I> {

	private Class<T> persistentClass;
	private Session session;
	private Logger log;

	/**
	 * General constructor
	 * This will create a session for the thread.
	 */
	public GenericHibernateDAO() {
		initDAO();
		setSession(HibernateSessionFactory.getSession());
	}
	
	/**
	 * Constructor with session,this will use the session passed, during live of this instance of the DAO class.
	 * This will create a session for the thread.
	 */
	public GenericHibernateDAO(Session session) {
		this.session=session;
		initDAO();
		
	}
	
	@SuppressWarnings("unchecked")
	private void initDAO(){
		// This one use the method getClass that in this case
		// returns a parameterizedType GenericHibernateDAO<T,I extends
		// Serializable>
		ParameterizedType parameterizedType = ((ParameterizedType) getClass()
				.getGenericSuperclass());
		// now we get the the real type of first of the parameters <T>
		this.persistentClass = (Class<T>) parameterizedType
				.getActualTypeArguments()[0];
		this.log = LoggerFactory.getLogger(this.persistentClass);
	}


	/**
	 * Will attach an object to the session.
	 * Assuming the the object is already persisted in the DB and has not been modified.
	 * @param instance
	 */
	public void attachClean(T instance) {
	        log.debug("attaching clean  " + this.persistentClass.getName() + " instance");
	        try {
	            getSession().lock(instance, LockMode.NONE);
	            log.debug("attach successful");
	        } catch (RuntimeException re) {
	            log.error("attach failed", re);
	            throw re;
	        }
	    }

	/**
	 * Will attach an instance to the session.
	 * Assuming the instance has been modify or it is not on the DB.
	 * @param instance
	 */
	public void attachDirty(T instance) {
	       makePersistent(instance);
	    }

	/**
	 * Like ROLLBACK
	 */
	public void clear() {
		getSession().clear();
	}

	/**
	 * Remove the instance from the session and from the DB.
	 * @param persistentInstance
	 */
	public void delete(T persistentInstance) {
		log.debug("deleting " + this.persistentClass.getName() + " instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/** Find all
	 * @see access.GenericDAO#findAll()
	 */
	public List<T> findAll() {
		return findByCriteria();
	}

	/**
	 * It will execute a query based on an undefined number of Criterion.
	 * Use this inside subclasses as a convenience method.
	 * @param criterion
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(Criterion... criterion) {
		// this use vargs of java 1.5 it allows to define methods with variable
		// number of arguments
		Criteria crit = getSession().createCriteria(getPersistentClass());
		for (Criterion c : criterion) {
			crit.add(c);
		}
		return crit.list();
	}


	/** Finds by example
	 * @see access.GenericDAO#findByExample(java.lang.Object)
	 */
	public List<T> findByExample(T instance) {
		return findByExample(instance,null);
	}

	/**
	 * Find by example with excluded properties
	 * @param exampleInstance
	 * @param excludeProperty
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByExample(T exampleInstance, String[] excludeProperty) {	
		log.debug("finding " + this.persistentClass.getName()
				+ "instance by example");
		try {
			Criteria crit = getSession().createCriteria(getPersistentClass());
			Example example = Example.create(exampleInstance);
			for (String exclude : excludeProperty) {
				example.excludeProperty(exclude);
			}
			crit.add(example);
			List<T> results = crit.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/*
	 * This method returns an entity by id.
	 * 
	 * @see access.GenericDAO#findById(java.io.Serializable, boolean)
	 * 
	 * @param id it is the actual instance that represent the id
	 * 
	 * @param lock if set to true,Hibernate will send a lock to the database raw
	 * until the transaction is finished
	 * 
	 * @return the instance from the database or null if not found
	 */
	@SuppressWarnings("unchecked")
	public T findById(I id, boolean lock) {
		log.debug("finding " + this.persistentClass.getName()
					+ "instance by ID");
		try {
		T entity;
		// using lock and LockMode.UPGRADE, the session will skip the cache and
		// go to the database
		if (lock)
			entity = (T) getSession().load(getPersistentClass(), id,
					LockMode.UPGRADE);
		else
			entity = (T) getSession().load(getPersistentClass(), id);
		return entity;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public T findById(I id) {
		return findById(id,false);
	}


	/**
	 * It will return instances of entities that match propertyName=value
	 * @param propertyName	the attribute of the object
	 * @param value	the value that needs to be equal
	 * @return the list of found instances of that entity
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByProperty(String propertyName, Object value) {
	      log.debug("finding " + this.persistentClass.getName() + "  instance with property: " + propertyName
	            + ", value: " + value);
	      try {
	         String queryString = "from " + this.persistentClass.getName() + "  as model where model." 
	         						+ propertyName + "= ?";
	         Query queryObject = getSession().createQuery(queryString);
			 queryObject.setParameter(0, value);
			 return queryObject.list();
	      } catch (RuntimeException re) {
	         log.error("find by property name failed", re);
	         throw re;
	      }
		}
	
	 /**
	 * Like COMMIT the pending changes that has not been committed yet by the
	 * transaction
	 * 
	 */
	public void flush() {
		getSession().flush();
	}
	 
	 
	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	 

	protected Session getSession() {
		if (session == null)
			throw new IllegalStateException(
					"Session has not been set on DAO before usage");
		return session;
	}

	/*
	 * This method will save or update an entity on the database
	 * 
	 * @see access.GenericDAO#makePersistent(java.lang.Object)
	 * 
	 * @return the same entity after been saved
	 */
	public T makePersistent(T entity) {
		log.debug("Making Persistent " + this.persistentClass.getName() + " instance");
		try {
			getSession().saveOrUpdate(entity);
			log.debug("makePersistent successful");
		} catch (RuntimeException re) {
			log.error("makePersistent failed", re);
			throw re;
		}
		return entity;
	}

	/*
	 * This method will remove an entity from the database and from the session.
	 * 
	 * @see access.GenericDAO#makeTransient(java.lang.Object)
	 */
	public void makeTransient(T entity) {
		delete(entity);
	}

    @SuppressWarnings("unchecked")
	public T merge(T detachedInstance) {
        log.debug("merging " + this.persistentClass.getName() + " instance");
        try {
            T result = (T) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
	
	/**
	 * This method will save a new instance
	 * If the instance already exist on the database it will return an exception or will duplicate the instance
	 * @param transientInstance the instance that is not in the database
	 * @return the instance once is been saved.
	 */
	public T save(T transientInstance) {
		log.debug("saving " + this.persistentClass.getName() + " instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		return transientInstance;
	}
	


	public void setSession(Session s) {
		this.session = s;
	}

}