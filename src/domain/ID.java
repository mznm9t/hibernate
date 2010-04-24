package domain;

import java.io.Serializable;


@SuppressWarnings("serial")
public class ID implements Serializable {

	private Long identifier;
	
	private Long getIdentifier() {
		return identifier;
	}

	@SuppressWarnings("unused")
	private void setIdentifier(Long indentifier) {
		this.identifier = indentifier;
	}

	public ID(){
	}
	
	public ID(Long i){
		this.identifier=i;
	}
	
	public String toString()
	{
	return identifier.toString();
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof ID && ((ID)obj).getIdentifier()!=null && ((ID)obj).getIdentifier().equals(identifier));
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}
