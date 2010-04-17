package access;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T, I extends Serializable> {
	 
    T findById(I id, boolean lock);
 
    List<T> findAll();
 
    List<T> findByExample(T exampleInstance);
 
    T makePersistent(T entity);
 
    void makeTransient(T entity);
}