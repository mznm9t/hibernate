package domain;
// default package

import interfaces.ContactGivenType;
import interfaces.Country;
import interfaces.Division;
import interfaces.Employee;
import interfaces.FeatureType;
import interfaces.Journalist;
import interfaces.MentionType;
import interfaces.Office;
import interfaces.PRManager;
import interfaces.Publication;
import interfaces.Story;

import java.util.Collection;
import java.util.Date;
import java.util.Set;


/**
 * Coverage entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class CoverageH implements interfaces.Coverage , java.io.Serializable {


    // Fields    

	 private ID id;
     private String entityName;
     private Story story;
     private Publication publication;
     private Journalist journalist;
     private Date publicationDate;
     private String filename;
     private String content;
     private String title;
     private Float evaluation;
     private Float centimetres;
     private String feature;
     private Boolean contactDetails;
     private Date dateRead;
     private String comments;
     private String pictureDescription;
     private String pictureFile;
     private MentionType mentionType;
     private String propertyNamed;
     private Office office;
     private Division division;
     private Boolean researchReports;
     private Boolean marketComment;
     private ContactGivenType contactGivenType;
     private String personNamed;
     private Boolean pictureUsed;
     private Date pubDate;
     private Integer national;
     private PRManager prManager;
     private FeatureType featureType;
     private Country country;
     private String sequenceNumber;
     private Set<Employee> quotedPersons;


    // Constructors

    /** default constructor */
    public CoverageH() {
    }

    
    /** full constructor */
    public CoverageH(String entityName, Story story, Publication publication, Journalist journalist, Date publicationDate, String filename, String content, String title, Float evaluation, Float centimetres, String feature, Boolean contactDetails, Date dateRead, String comments, String pictureDescription, String pictureFile, MentionType mentionType, String propertyNamed, Office office, Division division, Boolean researchReports, Boolean marketComment, ContactGivenType contactGivenType, String personNamed, Boolean pictureUsed, Date pubDate, Integer national, PRManager prManager, FeatureType featureType, Country country, String sequenceNumber,Set<Employee> quotedPersons) {
        this.entityName = entityName;
        this.story = story;
        this.publication = publication;
        this.journalist = journalist;
        this.publicationDate = publicationDate;
        this.filename = filename;
        this.content = content;
        this.title = title;
        this.evaluation = evaluation;
        this.centimetres = centimetres;
        this.feature = feature;
        this.contactDetails = contactDetails;
        this.dateRead = dateRead;
        this.comments = comments;
        this.pictureDescription = pictureDescription;
        this.pictureFile = pictureFile;
        this.mentionType = mentionType;
        this.propertyNamed = propertyNamed;
        this.office = office;
        this.division = division;
        this.researchReports = researchReports;
        this.marketComment = marketComment;
        this.contactGivenType = contactGivenType;
        this.personNamed = personNamed;
        this.pictureUsed = pictureUsed;
        this.pubDate = pubDate;
        this.national = national;
        this.prManager = prManager;
        this.featureType = featureType;
        this.country = country;
        this.sequenceNumber = sequenceNumber;
        this.quotedPersons = quotedPersons;
    }

   
    // Property accessors
    
    public ID getID() {
		return id;
	}


	public void setID(ID iD) {
		id = iD;
	}
	
    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Story getStory() {
        return this.story;
    }
    
    public void setStory(Story story) {
        this.story = story;
    }

    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public Journalist getJournalist() {
        return this.journalist;
    }
    
    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public Date getPublicationDate() {
        return this.publicationDate;
    }
    
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public Float getEvaluation() {
        return this.evaluation;
    }
    
    public void setEvaluation(Float evaluation) {
        this.evaluation = evaluation;
    }

    public Float getCentimetres() {
        return this.centimetres;
    }
    
    public void setCentimetres(Float centimetres) {
        this.centimetres = centimetres;
    }

    public String getFeature() {
        return this.feature;
    }
    
    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Boolean getContactDetails() {
        return this.contactDetails;
    }
    
    public void setContactDetails(Boolean contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Date getDateRead() {
        return this.dateRead;
    }
    
    public void setDateRead(Date dateRead) {
        this.dateRead = dateRead;
    }

    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPictureDescription() {
        return this.pictureDescription;
    }
    
    public void setPictureDescription(String pictureDescription) {
        this.pictureDescription = pictureDescription;
    }

    public String getPictureFile() {
        return this.pictureFile;
    }
    
    public void setPictureFile(String pictureFile) {
        this.pictureFile = pictureFile;
    }

    public MentionType getMentionType() {
        return this.mentionType;
    }
    
    public void setMentionType(MentionType mentionType) {
        this.mentionType = mentionType;
    }

    public String getPropertyNamed() {
        return this.propertyNamed;
    }
    
    public void setPropertyNamed(String propertyNamed) {
        this.propertyNamed = propertyNamed;
    }

    public Office getOffice() {
        return this.office;
    }
    
    public void setOffice(Office office) {
        this.office = office;
    }

    public Division getDivision() {
        return this.division;
    }
    
    public void setDivision(Division division) {
        this.division = division;
    }

    public Boolean getResearchReports() {
        return this.researchReports;
    }
    
    public void setResearchReports(Boolean researchReports) {
        this.researchReports = researchReports;
    }

    public Boolean getMarketComment() {
        return this.marketComment;
    }
    
    public void setMarketComment(Boolean marketComment) {
        this.marketComment = marketComment;
    }

    public ContactGivenType getContactGivenType() {
        return this.contactGivenType;
    }
    
    public void setContactGivenType(ContactGivenType contactGivenType) {
        this.contactGivenType = contactGivenType;
    }

    public String getPersonNamed() {
        return this.personNamed;
    }
    
    public void setPersonNamed(String personNamed) {
        this.personNamed = personNamed;
    }

    public Boolean getPictureUsed() {
        return this.pictureUsed;
    }
    
    public void setPictureUsed(Boolean pictureUsed) {
        this.pictureUsed = pictureUsed;
    }

    public Date getPubDate() {
        return this.pubDate;
    }
    
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Integer getNational() {
        return this.national;
    }
    
    public void setNational(Integer national) {
        this.national = national;
    }

    public PRManager getPrManager() {
        return this.prManager;
    }
    
    public void setPrManager(PRManager prManager) {
        this.prManager = prManager;
    }

    public FeatureType getFeatureType() {
        return this.featureType;
    }
    
    public void setFeatureType(FeatureType featureType) {
        this.featureType = featureType;
    }

    public Country getCountry() {
        return this.country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }
    
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


	@Override
	public void addQuotedPerson(Employee aQuotedPerson) {
		quotedPersons.add(aQuotedPerson);
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public void addQuotedPersons(Collection aQuotedPersons) {
		quotedPersons.addAll(aQuotedPersons);
	}


	@Override
	public void clearQuotedPersons() {
		quotedPersons.clear();
	}


	@Override
	public boolean containsQuotedPerson(Employee aQuotedPerson) {	
		return quotedPersons.contains(quotedPersons);
	}


	@SuppressWarnings("unchecked")
	@Override
	public Collection getQuotedPersons() {
		return quotedPersons;
	}


	@Override
	public Employee[] getQuotedPersonsAsArray() {
		return (Employee[])quotedPersons.toArray();
	}


	@Override
	public void removeQuotedPerson(Employee aQuotedPerson) {
		quotedPersons.remove(aQuotedPerson);
	}
   








}