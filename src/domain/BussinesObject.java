package domain;

public class BussinesObject {
	  protected ID ID;
	  protected Long identifier;
	  protected String entityName;
	  
	  public ID getID() {
			return ID;
		}


		public void setID(ID iD) {
			ID = iD;
		}
		
		public Long getIdentifier() {
				return identifier;
		}


		private void setIdentifier(Long identifier) {
				this.identifier = identifier;
		}

	    public String getEntityName() {
	        return this.entityName;
	    }
	    
	    public void setEntityName(String entityName) {
	        this.entityName = entityName;
	    }

}
