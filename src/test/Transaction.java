package test;

import org.hibernate.Session;

/**
 * @author omar
 * It is an abstract class, created to help in defining the transaction boundaries. Example of use:
 * 			final BusinessObject bo=b.build();
			new Transaction(getSession()) {
				void toDo() {
					session.save(bo);					
				}
			}.execute(); 
 */
public abstract class Transaction {
	
	protected Session session;
	org.hibernate.Transaction t;
	
	public Transaction(Session session) throws Exception {
		super();
		if(session==null) throw new Exception("Session cannot be null");
		this.session = session;
	}

	/**
	 * When extending this class as an anonymous class you would put here all the persistence
	 * action that you want to enclose under the same transaction.
	 */
	abstract void toDo();
	
	/**This method will create a transaction , execute all the persistent tasks included in toDO 
	 * method ,commit the transaction and close the session.
	 * @throws Exception if there have been any problem during the execution of any of persistent 
	 * tasks included in toDO method in which case all the changes would be rollback. 
	 */
	public void execute() throws Exception{
		
		try{
	    t=session.beginTransaction();
		toDo();
		t.commit();
		}catch(Exception e){
			t.rollback();
			throw new Exception("There has been an exception during this transaction," +
					" all the changes has been rolledback",e);
		}finally{
			session.close();
		}
		
	}
}
