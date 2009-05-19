package builders;
import static builders.BuilderDirector.*;
import domain.StoryH;
import interfaces.Company;
import interfaces.Message;
import interfaces.Story;

public class StoryBuilder implements BuilderI<Story> {

    private String entityName="Story";
	private Message message=getEntityAttribute(MessageBuilder.class, Message.class);
    private String title=getPrimitiveAttribute("A never ending story");
    private String description=getPrimitiveAttribute("Very beatifull and inspiring story");
    private Company client=getEntityAttribute(CompanyBuilder.class, Company.class);
    
	   
    public StoryBuilder withMessage(Message message) {
		this.message = message;return this;
	}

	public StoryBuilder withTitle(String title) {
		this.title = title;return this;
	}

	public StoryBuilder withDescription(String description) {
		this.description = description;return this;
	}

	public StoryBuilder withClient(Company client) {
		this.client = client;return this;
	}
	
	@Override
	public Story build() {
		return new StoryH(entityName, message, title, description, client);
	}

}
