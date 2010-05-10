package core;

import interfaces.BusinessObject;

import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.event.SaveOrUpdateEvent;
import org.hibernate.event.SaveOrUpdateEventListener;

import domain.ID;

@SuppressWarnings("serial")
public class IdGenerator implements SaveOrUpdateEventListener {

	@Override
	public void onSaveOrUpdate(SaveOrUpdateEvent arg0)
			throws HibernateException {
		
		BusinessObject o=(BusinessObject)arg0.getObject();
		if(o.getID()==null) ReflectiveUtil.setField(o, "id" ,new ID(generateID()));
		if(o.getID()==null) throw new HibernateException("Unable to set the id of the entity type "+arg0.getEntityName());
	}
	
	Long generateID(){
		UUID id=UUID.randomUUID();
		return id.getLeastSignificantBits();
	}
	
}
