package builders;

import interfaces.BusinessObject;

public interface BuilderGI<T extends BusinessObject,B extends BuilderGI<T,B>> {
	
	T build();
	
	T createInstance();

}
