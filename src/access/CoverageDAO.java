package access;
// default package




import interfaces.Coverage;

import java.util.List;



import domain.CoverageH;
import domain.ID;

/**
 	* A data access object (DAO) providing persistence and search support for Coverage entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Coverage
  * @author MyEclipse Persistence Tools 
 */

public class CoverageDAO extends GenericHibernateDAOWhiInterface<Coverage,CoverageH, ID>  {
	
	public static final String STORY = "story";
	public static final String PUBLICATION = "publication";
	public static final String JOURNALIST = "journalist";
	public static final String PUBLICATION_DATE = "publicationDate";
	public static final String FILENAME = "filename";
	public static final String CONTENT = "content";
	public static final String TITLE = "title";
	public static final String EVALUATION = "evaluation";
	public static final String CENTIMETRES = "centimetres";
	public static final String FEATURE = "feature";
	public static final String CONTACT_DETAILS = "contactDetails";
	public static final String DATE_READ = "dateRead";
	public static final String COMMENTS = "comments";
	public static final String PICTURE_DESCRIPTION = "pictureDescription";
	public static final String PICTURE_FILE = "pictureFile";
	public static final String MENTION_TYPE = "mentionType";
	public static final String PROPERTY_NAMED = "propertyNamed";
	public static final String OFFICE = "office";
	public static final String DIVISION = "division";
	public static final String RESEARCH_REPORTS = "researchReports";
	public static final String MARKET_COMMENT = "marketComment";
	public static final String CONTACT_GIVEN_TYPE = "contactGivenType";
	public static final String PERSON_NAMED = "personNamed";
	public static final String PICTURE_USED = "pictureUsed";
	public static final String PUB_DATE = "pubDate";
	public static final String NATIONAL = "national";
	public static final String PR_MANAGER = "prManager";
	public static final String FEATURE_TYPE = "featureType";
	public static final String COUNTRY = "country";
	public static final String SEQUENCE_NUMBER = "sequenceNumber";
	
	public List<Coverage> findByStory(Object story
	) {
		return findByProperty(STORY, story
		);
	}
	
	public List<Coverage> findByPublication(Object publication
	) {
		return findByProperty(PUBLICATION, publication
		);
	}
	
	public List<Coverage> findByJournalist(Object journalist
	) {
		return findByProperty(JOURNALIST, journalist
		);
	}
	
	public List<Coverage> findByPublicationDate(Object publicationDate
	) {
		return findByProperty(PUBLICATION_DATE, publicationDate
		);
	}
	
	public List<Coverage> findByFilename(Object filename
	) {
		return findByProperty(FILENAME, filename
		);
	}
	
	public List<Coverage> findByContent(Object content
	) {
		return findByProperty(CONTENT, content
		);
	}
	
	public List<Coverage> findByTitle(Object title
	) {
		return findByProperty(TITLE, title
		);
	}
	
	public List<Coverage> findByEvaluation(Object evaluation
	) {
		return findByProperty(EVALUATION, evaluation
		);
	}
	
	public List<Coverage> findByCentimetres(Object centimetres
	) {
		return findByProperty(CENTIMETRES, centimetres
		);
	}
	
	public List<Coverage> findByFeature(Object feature
	) {
		return findByProperty(FEATURE, feature
		);
	}
	
	public List<Coverage> findByContactDetails(Object contactDetails
	) {
		return findByProperty(CONTACT_DETAILS, contactDetails
		);
	}
	
	public List<Coverage> findByDateRead(Object dateRead
	) {
		return findByProperty(DATE_READ, dateRead
		);
	}
	
	public List<Coverage> findByComments(Object comments
	) {
		return findByProperty(COMMENTS, comments
		);
	}
	
	public List<Coverage> findByPictureDescription(Object pictureDescription
	) {
		return findByProperty(PICTURE_DESCRIPTION, pictureDescription
		);
	}
	
	public List<Coverage> findByPictureFile(Object pictureFile
	) {
		return findByProperty(PICTURE_FILE, pictureFile
		);
	}
	
	public List<Coverage> findByMentionType(Object mentionType
	) {
		return findByProperty(MENTION_TYPE, mentionType
		);
	}
	
	public List<Coverage> findByPropertyNamed(Object propertyNamed
	) {
		return findByProperty(PROPERTY_NAMED, propertyNamed
		);
	}
	
	public List<Coverage> findByOffice(Object office
	) {
		return findByProperty(OFFICE, office
		);
	}
	
	public List<Coverage> findByDivision(Object division
	) {
		return findByProperty(DIVISION, division
		);
	}
	
	public List<Coverage> findByResearchReports(Object researchReports
	) {
		return findByProperty(RESEARCH_REPORTS, researchReports
		);
	}
	
	public List<Coverage> findByMarketComment(Object marketComment
	) {
		return findByProperty(MARKET_COMMENT, marketComment
		);
	}
	
	public List<Coverage> findByContactGivenType(Object contactGivenType
	) {
		return findByProperty(CONTACT_GIVEN_TYPE, contactGivenType
		);
	}
	
	public List<Coverage> findByPersonNamed(Object personNamed
	) {
		return findByProperty(PERSON_NAMED, personNamed
		);
	}
	
	public List<Coverage> findByPictureUsed(Object pictureUsed
	) {
		return findByProperty(PICTURE_USED, pictureUsed
		);
	}
	
	public List<Coverage> findByPubDate(Object pubDate
	) {
		return findByProperty(PUB_DATE, pubDate
		);
	}
	
	public List<Coverage> findByNational(Object national
	) {
		return findByProperty(NATIONAL, national
		);
	}
	
	public List<Coverage> findByPrManager(Object prManager
	) {
		return findByProperty(PR_MANAGER, prManager
		);
	}
	
	public List<Coverage> findByFeatureType(Object featureType
	) {
		return findByProperty(FEATURE_TYPE, featureType
		);
	}
	
	public List<Coverage> findByCountry(Object country
	) {
		return findByProperty(COUNTRY, country
		);
	}
	
	public List<Coverage> findBySequenceNumber(Object sequenceNumber
	) {
		return findByProperty(SEQUENCE_NUMBER, sequenceNumber
		);
	}

}