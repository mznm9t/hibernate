package domain;
// default package

import java.util.Date;


/**
 * Coverage entity. @author MyEclipse Persistence Tools
 */

public class Coverage  implements java.io.Serializable {


    // Fields    

     private Long id;
     private String entityName;
     private Long story;
     private Long publication;
     private Long journalist;
     private Long publicationDate;
     private String filename;
     private String content;
     private String title;
     private Float evaluation;
     private Float centimetres;
     private String feature;
     private Boolean contactDetails;
     private Long dateRead;
     private String comments;
     private String pictureDescription;
     private String pictureFile;
     private Long mentionType;
     private String propertyNamed;
     private Long office;
     private Long division;
     private Boolean researchReports;
     private Boolean marketComment;
     private Long contactGivenType;
     private String personNamed;
     private Boolean pictureUsed;
     private String pubDate;
     private Integer national;
     private Date pubDate2;
     private Long prManager;
     private Long featureType;
     private Long country;
     private String sequenceNumber;


    // Constructors

    /** default constructor */
    public Coverage() {
    }

    
    /** full constructor */
    public Coverage(String entityName, Long story, Long publication, Long journalist, Long publicationDate, String filename, String content, String title, Float evaluation, Float centimetres, String feature, Boolean contactDetails, Long dateRead, String comments, String pictureDescription, String pictureFile, Long mentionType, String propertyNamed, Long office, Long division, Boolean researchReports, Boolean marketComment, Long contactGivenType, String personNamed, Boolean pictureUsed, String pubDate, Integer national, Date pubDate2, Long prManager, Long featureType, Long country, String sequenceNumber) {
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
        this.pubDate2 = pubDate2;
        this.prManager = prManager;
        this.featureType = featureType;
        this.country = country;
        this.sequenceNumber = sequenceNumber;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Long getStory() {
        return this.story;
    }
    
    public void setStory(Long story) {
        this.story = story;
    }

    public Long getPublication() {
        return this.publication;
    }
    
    public void setPublication(Long publication) {
        this.publication = publication;
    }

    public Long getJournalist() {
        return this.journalist;
    }
    
    public void setJournalist(Long journalist) {
        this.journalist = journalist;
    }

    public Long getPublicationDate() {
        return this.publicationDate;
    }
    
    public void setPublicationDate(Long publicationDate) {
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

    public Long getDateRead() {
        return this.dateRead;
    }
    
    public void setDateRead(Long dateRead) {
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

    public Long getMentionType() {
        return this.mentionType;
    }
    
    public void setMentionType(Long mentionType) {
        this.mentionType = mentionType;
    }

    public String getPropertyNamed() {
        return this.propertyNamed;
    }
    
    public void setPropertyNamed(String propertyNamed) {
        this.propertyNamed = propertyNamed;
    }

    public Long getOffice() {
        return this.office;
    }
    
    public void setOffice(Long office) {
        this.office = office;
    }

    public Long getDivision() {
        return this.division;
    }
    
    public void setDivision(Long division) {
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

    public Long getContactGivenType() {
        return this.contactGivenType;
    }
    
    public void setContactGivenType(Long contactGivenType) {
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

    public String getPubDate() {
        return this.pubDate;
    }
    
    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public Integer getNational() {
        return this.national;
    }
    
    public void setNational(Integer national) {
        this.national = national;
    }

    public Date getPubDate2() {
        return this.pubDate2;
    }
    
    public void setPubDate2(Date pubDate2) {
        this.pubDate2 = pubDate2;
    }

    public Long getPrManager() {
        return this.prManager;
    }
    
    public void setPrManager(Long prManager) {
        this.prManager = prManager;
    }

    public Long getFeatureType() {
        return this.featureType;
    }
    
    public void setFeatureType(Long featureType) {
        this.featureType = featureType;
    }

    public Long getCountry() {
        return this.country;
    }
    
    public void setCountry(Long country) {
        this.country = country;
    }

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }
    
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
   








}