package builders;

import static builders.BuilderDirector.getPrimitiveAttribute;
import interfaces.Message;
import domain.MessageH;

public class MessageBuilder implements BuilderI<Message>{


	 private String entityName="Message";
	 private String name=getPrimitiveAttribute("Students Message");
     private String description=getPrimitiveAttribute("Message for students");

	public MessageBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public MessageBuilder withDescription(String description) {
		this.description = description;
		return this;
	}
	
	public Message build() {
		return  new MessageH(entityName,description,name);
	}

}
