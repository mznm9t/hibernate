package core;

import interfaces.BusinessObject;

import java.util.Map;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.event.MergeEvent;
import org.hibernate.event.MergeEventListener;
import org.hibernate.event.SaveOrUpdateEvent;
import org.hibernate.event.SaveOrUpdateEventListener;

import domain.ID;

@SuppressWarnings("serial")
public class IdGenerator implements SaveOrUpdateEventListener, MergeEventListener {

	@Override
	public void onSaveOrUpdate(SaveOrUpdateEvent arg0)
			throws HibernateException {
		
		BusinessObject o=(BusinessObject)arg0.getObject();
		
		if(o.getID()==null) ReflectiveUtil.setField(o, "id" ,new ID(generateID()));
		if(o.getID()==null) throw new HibernateException("Unable to set the id of the entity type "+o.getEntityName());
		else System.out.println("ID generated for entity type" + o.getEntityName());
	}
	
	Long generateID(){
		UUID id=UUID.randomUUID();
		return id.getLeastSignificantBits();
	}

	@Override
	public void onMerge(MergeEvent event) throws HibernateException {
		BusinessObject o=(BusinessObject)event.getOriginal();
		if(o.getID()==null) ReflectiveUtil.setField(o, "id" ,new ID(generateID()));
		if(o.getID()==null) throw new HibernateException("Unable to set the id of the entity type "+event.getEntityName());
		
	}

	@Override
	public void onMerge(MergeEvent event, Map copiedAlready)
			throws HibernateException {
		BusinessObject o=(BusinessObject)event.getOriginal();
		if(o.getID()==null) ReflectiveUtil.setField(o, "id" ,new ID(generateID()));
		if(o.getID()==null) throw new HibernateException("Unable to set the id of the entity type "+event.getEntityName());
		
	}
	
}
