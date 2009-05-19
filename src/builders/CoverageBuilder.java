package builders;
import static builders.BuilderDirector.*;
import interfaces.ContactGivenType;
import interfaces.Country;
import interfaces.Coverage;
import interfaces.Division;
import interfaces.Employee;
import interfaces.FeatureType;
import interfaces.Journalist;
import interfaces.MentionType;
import interfaces.Office;
import interfaces.PRManager;
import interfaces.Publication;
import interfaces.Story;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import domain.CoverageH;

public class CoverageBuilder implements BuilderI<Coverage> {

	private String entityName=getPrimitiveAttribute("Coverage");
	private Story story=getEntityAttribute(StoryBuilder.class,Story.class);
	private Publication publication=getEntityAttribute(PublicationBuilder.class,Publication.class);
	private Journalist journalist=getEntityAttribute(JournalistBuilder.class,Journalist.class);
	private Date publicationDate=getPrimitiveAttribute(new Date());
	private String filename=getPrimitiveAttribute("/root/uploads/file1.txt");
	private String content=getPrimitiveAttribute("This house is the best house in the universe,full of light and big garden");
	private String title=getPrimitiveAttribute("Your dreamed house");
	private Float evaluation=getPrimitiveAttribute(80f);
	private Float centimetres=getPrimitiveAttribute(10f);
	private String feature=getPrimitiveAttribute("Garder,garage,Alarm,Dog");
	private Boolean contactDetails=getPrimitiveAttribute(true);
	private Date dateRead=getPrimitiveAttribute(new Date());
	private String comments=getPrimitiveAttribute("The house looks fine in this adv but the pictures not very clear");
	private String pictureDescription=getPrimitiveAttribute("Main picture of the front door");
	private String pictureFile=getPrimitiveAttribute("/root/uploads/picture.jpeg");
	private MentionType mentionType=getEntityAttribute(MentionTypeBuilder.class,MentionType.class);
	private String propertyNamed=getPrimitiveAttribute("The mansion");
	private Office office=getEntityAttribute(OfficeBuilder.class,Office.class);
	private Division division=getEntityAttribute(DivisionBuilder.class,Division.class);
	private Boolean researchReports=getPrimitiveAttribute(true);
	private Boolean marketComment=getPrimitiveAttribute(true);
	private ContactGivenType contactGivenType=getEntityAttribute(ContactGivenTypeBuilder.class,ContactGivenType.class);
	private String personNamed=getPrimitiveAttribute("Jhon Lewis");
	private Boolean pictureUsed=getPrimitiveAttribute(true);
	private Date pubDate=getPrimitiveAttribute(new Date());
	private Integer national=getPrimitiveAttribute(800);
	private PRManager prManager=getEntityAttribute(PRManagerBuilder.class,PRManager.class);
	private FeatureType featureType=getEntityAttribute(FeatureTypeBuilder.class,FeatureType.class);
	private Country country=getEntityAttribute(CountryBuilder.class,Country.class);
	private String sequenceNumber=getPrimitiveAttribute("12345");
	private Set<Employee> quotedPersons=getSetAttribute(EmployeeBuilder.class,Employee.class);

	public CoverageBuilder withStory(Story story) {
		this.story = story;
		return this;
	}

	public CoverageBuilder withPublication(Publication publication) {
		this.publication = publication;
		return this;
	}

	public CoverageBuilder withJournalist(Journalist journalist) {
		this.journalist = journalist;
		return this;
	}

	public CoverageBuilder withPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
		return this;
	}

	public CoverageBuilder withFilename(String filename) {
		this.filename = filename;
		return this;
	}

	public CoverageBuilder withContent(String content) {
		this.content = content;
		return this;
	}

	public CoverageBuilder withTitle(String title) {
		this.title = title;
		return this;
	}

	public CoverageBuilder withEvaluation(Float evaluation) {
		this.evaluation = evaluation;
		return this;
	}

	public CoverageBuilder withCentimetres(Float centimetres) {
		this.centimetres = centimetres;
		return this;
	}

	public CoverageBuilder withFeature(String feature) {
		this.feature = feature;
		return this;
	}

	public CoverageBuilder withContactDetails(Boolean contactDetails) {
		this.contactDetails = contactDetails;
		return this;
	}

	public CoverageBuilder withDateRead(Date dateRead) {
		this.dateRead = dateRead;
		return this;
	}

	public CoverageBuilder withComments(String comments) {
		this.comments = comments;
		return this;
	}

	public CoverageBuilder withPictureDescription(String pictureDescription) {
		this.pictureDescription = pictureDescription;
		return this;
	}

	public CoverageBuilder withPictureFile(String pictureFile) {
		this.pictureFile = pictureFile;
		return this;
	}

	public CoverageBuilder withMentionType(MentionType mentionType) {
		this.mentionType = mentionType;
		return this;
	}

	public CoverageBuilder withPropertyNamed(String propertyNamed) {
		this.propertyNamed = propertyNamed;
		return this;
	}

	public CoverageBuilder withOffice(Office office) {
		this.office = office;
		return this;
	}

	public CoverageBuilder withDivision(Division division) {
		this.division = division;
		return this;
	}

	public CoverageBuilder withResearchReports(Boolean researchReports) {
		this.researchReports = researchReports;
		return this;
	}

	public CoverageBuilder withMarketComment(Boolean marketComment) {
		this.marketComment = marketComment;
		return this;
	}

	public CoverageBuilder withContactGivenType(
			ContactGivenType contactGivenType) {
		this.contactGivenType = contactGivenType;
		return this;
	}

	public CoverageBuilder withPersonNamed(String personNamed) {
		this.personNamed = personNamed;
		return this;
	}

	public CoverageBuilder withPictureUsed(Boolean pictureUsed) {
		this.pictureUsed = pictureUsed;
		return this;
	}

	public CoverageBuilder withPubDate(Date pubDate) {
		this.pubDate = pubDate;
		return this;
	}

	public CoverageBuilder withNational(Integer national) {
		this.national = national;
		return this;
	}

	public CoverageBuilder withPrManager(PRManager prManager) {
		this.prManager = prManager;
		return this;
	}

	public CoverageBuilder withFeatureType(FeatureType featureType) {
		this.featureType = featureType;
		return this;
	}

	public CoverageBuilder withCountry(Country country) {
		this.country = country;
		return this;
	}

	public CoverageBuilder withSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public CoverageBuilder withAQuotedPersons(Employee aQuotedPerson) {
		if(quotedPersons==null)quotedPersons=new HashSet<Employee>();
		quotedPersons.add(aQuotedPerson);
		return this;
	}

	@Override
	public Coverage build() {
		return new CoverageH(entityName, story, publication, journalist,
				publicationDate, filename, content, title, evaluation,
				centimetres, feature, contactDetails, dateRead, comments,
				pictureDescription, pictureFile, mentionType, propertyNamed,
				office, division, researchReports, marketComment,
				contactGivenType, personNamed, pictureUsed, pubDate, national,
				prManager, featureType, country, sequenceNumber,quotedPersons);
	}

}
