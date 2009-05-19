package builders;

import interfaces.BusinessObject;

public interface BuilderI<T> {

	BusinessObject build();
	
}
