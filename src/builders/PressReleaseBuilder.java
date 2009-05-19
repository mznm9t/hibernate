package builders;

import static builders.BuilderDirector.getEntityAttribute;
import interfaces.PressRelease;
import interfaces.Story;
import domain.PressReleaseH;

public class PressReleaseBuilder implements BuilderI<PressRelease>{


	 private String entityName="PressRelease";
     private Story story=getEntityAttribute(StoryBuilder.class,Story.class);
     

	public PressReleaseBuilder withStory(Story story) {
		this.story = story;
		return this;
	}

	public PressRelease build() {
		return  new PressReleaseH(entityName,story);
	}

}
