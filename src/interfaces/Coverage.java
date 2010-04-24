package interfaces; 

import java.util.Collection;


import java.io.Serializable;

/**
 * Business Object Interface for the Coverage entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Coverage</strong></td><td colspan=3><em>Coverage achieved on a publication.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Country</td><td>country</td><td><em>The country this couverage relates to</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>FeatureType</td><td>featureType</td><td><em>The type of feature</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Float</td><td>centimetres</td><td><em>The number of column centimetres in this article</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Boolean</td><td>researchReports</td><td><em>Were research reports quoted?</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Boolean</td><td>marketComment</td><td><em>If there is any market comment</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Journalist</td><td>journalist</td><td><em>The writer of the story</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Float</td><td>evaluation</td><td><em>Your evaluation score for this story</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>ContactGivenType</td><td>contactGivenType</td><td><em>The contact given type for this coverage.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Publication</td><td>publication</td><td><em>The publication this appears in</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>title</td><td><em>The title of the piece (e.g. the headline if it's a newspaper article)</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>Set:</td><td>Employee</td><td>quotedPerson</td><td><em>The people quoted in this article</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>pictureFile</td><td><em>The filename of a picture associated</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>pictureDescription</td><td><em>Description of the picture with this article</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>content</td><td><em>The content, if it can be transcribed</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>personNamed</td><td><em>The named persons.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Division</td><td>division</td><td><em>The division to which the story applies</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Story</td><td>story</td><td><em>The story this relates to</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>comments</td><td><em>Our comments on the coverage</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Boolean</td><td>pictureUsed</td><td><em>Any picture used.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>filename</td><td><em>The filename of the piece, if it can be scanned or referenced</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>propertyNamed</td><td><em>The named properties.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.util.Date</td><td>dateRead</td><td><em>The date we read and entered this coverage</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Office</td><td>office</td><td><em>The office which this story applies to</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Boolean</td><td>contactDetails</td><td><em>Were our contact details included in the coverage?</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.util.Date</td><td>publicationDate</td><td><em>The date of publication of this story, item etc.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>feature</td><td><em>The name of the feature this appeared in</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>MentionType</td><td>mentionType</td><td><em>The type of mention we got</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>PRManager</td><td>prManager</td><td><em>The PR Manager who is responsible for this coverage</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>sequenceNumber</td><td><em>A unique sequence from the coverage</em></td>
 *  </tr>
 * </table>
 */
public interface Coverage extends BusinessObject, Serializable {

    /**
     * Accessor method for Country.
     * <br>The country this couverage relates to
     *
     * @return Country attribute of this Coverage.
     */
    public Country getCountry();

    /**
     * Mutator method for Country.
     * <br>The country this couverage relates to
     *
     * @param aCountry set Country attribute of this Coverage.
     */
    public void setCountry(Country aCountry);


    /**
     * The enumeration for Country
     */
    public final static int COUNTRY = 0;


    /**
     * Accessor method for FeatureType.
     * <br>The type of feature
     *
     * @return FeatureType attribute of this Coverage.
     */
    public FeatureType getFeatureType();

    /**
     * Mutator method for FeatureType.
     * <br>The type of feature
     *
     * @param aFeatureType set FeatureType attribute of this Coverage.
     */
    public void setFeatureType(FeatureType aFeatureType);


    /**
     * The enumeration for FeatureType
     */
    public final static int FEATURETYPE = 1;


    /**
     * Accessor method for Centimetres.
     * <br>The number of column centimetres in this article
     *
     * @return java.lang.Float attribute of this Coverage.
     */
    public java.lang.Float getCentimetres();

    /**
     * Mutator method for Centimetres.
     * <br>The number of column centimetres in this article
     *
     * @param aCentimetres set java.lang.Float attribute of this Coverage.
     */
    public void setCentimetres(java.lang.Float aCentimetres);


    /**
     * The enumeration for Centimetres
     */
    public final static int CENTIMETRES = 2;


    /**
     * Accessor method for ResearchReports.
     * <br>Were research reports quoted?
     *
     * @return java.lang.Boolean attribute of this Coverage.
     */
    public java.lang.Boolean getResearchReports();

    /**
     * Mutator method for ResearchReports.
     * <br>Were research reports quoted?
     *
     * @param aResearchReports set java.lang.Boolean attribute of this Coverage.
     */
    public void setResearchReports(java.lang.Boolean aResearchReports);


    /**
     * The enumeration for ResearchReports
     */
    public final static int RESEARCHREPORTS = 3;


    /**
     * Accessor method for MarketComment.
     * <br>If there is any market comment
     *
     * @return java.lang.Boolean attribute of this Coverage.
     */
    public java.lang.Boolean getMarketComment();

    /**
     * Mutator method for MarketComment.
     * <br>If there is any market comment
     *
     * @param aMarketComment set java.lang.Boolean attribute of this Coverage.
     */
    public void setMarketComment(java.lang.Boolean aMarketComment);


    /**
     * The enumeration for MarketComment
     */
    public final static int MARKETCOMMENT = 4;


    /**
     * Accessor method for Journalist.
     * <br>The writer of the story
     *
     * @return Journalist attribute of this Coverage.
     */
    public Journalist getJournalist();

    /**
     * Mutator method for Journalist.
     * <br>The writer of the story
     *
     * @param aJournalist set Journalist attribute of this Coverage.
     */
    public void setJournalist(Journalist aJournalist);


    /**
     * The enumeration for Journalist
     */
    public final static int JOURNALIST = 5;


    /**
     * Accessor method for Evaluation.
     * <br>Your evaluation score for this story
     *
     * @return java.lang.Float attribute of this Coverage.
     */
    public java.lang.Float getEvaluation();

    /**
     * Mutator method for Evaluation.
     * <br>Your evaluation score for this story
     *
     * @param aEvaluation set java.lang.Float attribute of this Coverage.
     */
    public void setEvaluation(java.lang.Float aEvaluation);


    /**
     * The enumeration for Evaluation
     */
    public final static int EVALUATION = 6;


    /**
     * Accessor method for ContactGivenType.
     * <br>The contact given type for this coverage.
     *
     * @return ContactGivenType attribute of this Coverage.
     */
    public ContactGivenType getContactGivenType();

    /**
     * Mutator method for ContactGivenType.
     * <br>The contact given type for this coverage.
     *
     * @param aContactGivenType set ContactGivenType attribute of this Coverage.
     */
    public void setContactGivenType(ContactGivenType aContactGivenType);


    /**
     * The enumeration for ContactGivenType
     */
    public final static int CONTACTGIVENTYPE = 7;


    /**
     * Accessor method for Publication.
     * <br>The publication this appears in
     *
     * @return Publication attribute of this Coverage.
     */
    public Publication getPublication();

    /**
     * Mutator method for Publication.
     * <br>The publication this appears in
     *
     * @param aPublication set Publication attribute of this Coverage.
     */
    public void setPublication(Publication aPublication);


    /**
     * The enumeration for Publication
     */
    public final static int PUBLICATION = 8;


    /**
     * Accessor method for Title.
     * <br>The title of the piece (e.g. the headline if it's a newspaper article)
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getTitle();

    /**
     * Mutator method for Title.
     * <br>The title of the piece (e.g. the headline if it's a newspaper article)
     *
     * @param aTitle set java.lang.String attribute of this Coverage.
     */
    public void setTitle(java.lang.String aTitle);


    /**
     * The enumeration for Title
     */
    public final static int TITLE = 9;


    /**
     * Accessor method for PictureFile.
     * <br>longTextAttribute The filename of a picture associated
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getPictureFile();

    /**
     * Mutator method for PictureFile.
     * <br>longTextAttribute The filename of a picture associated
     *
     * @param aPictureFile set java.lang.String attribute of this Coverage.
     */
    public void setPictureFile(java.lang.String aPictureFile);


    /**
     * The enumeration for PictureFile
     */
    public final static int PICTUREFILE = 11;


    /**
     * Accessor method for PictureDescription.
     * <br>longTextAttribute Description of the picture with this article
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getPictureDescription();

    /**
     * Mutator method for PictureDescription.
     * <br>longTextAttribute Description of the picture with this article
     *
     * @param aPictureDescription set java.lang.String attribute of this Coverage.
     */
    public void setPictureDescription(java.lang.String aPictureDescription);


    /**
     * The enumeration for PictureDescription
     */
    public final static int PICTUREDESCRIPTION = 12;


    /**
     * Accessor method for Content.
     * <br>The content, if it can be transcribed
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getContent();

    /**
     * Mutator method for Content.
     * <br>The content, if it can be transcribed
     *
     * @param aContent set java.lang.String attribute of this Coverage.
     */
    public void setContent(java.lang.String aContent);


    /**
     * The enumeration for Content
     */
    public final static int CONTENT = 13;


    /**
     * Accessor method for PersonNamed.
     * <br>longTextAttribute The named persons.
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getPersonNamed();

    /**
     * Mutator method for PersonNamed.
     * <br>longTextAttribute The named persons.
     *
     * @param aPersonNamed set java.lang.String attribute of this Coverage.
     */
    public void setPersonNamed(java.lang.String aPersonNamed);


    /**
     * The enumeration for PersonNamed
     */
    public final static int PERSONNAMED = 14;


    /**
     * Accessor method for Division.
     * <br>The division to which the story applies
     *
     * @return Division attribute of this Coverage.
     */
    public Division getDivision();

    /**
     * Mutator method for Division.
     * <br>The division to which the story applies
     *
     * @param aDivision set Division attribute of this Coverage.
     */
    public void setDivision(Division aDivision);


    /**
     * The enumeration for Division
     */
    public final static int DIVISION = 15;


    /**
     * Accessor method for Story.
     * <br>The story this relates to
     *
     * @return Story attribute of this Coverage.
     */
    public Story getStory();

    /**
     * Mutator method for Story.
     * <br>The story this relates to
     *
     * @param aStory set Story attribute of this Coverage.
     */
    public void setStory(Story aStory);


    /**
     * The enumeration for Story
     */
    public final static int STORY = 16;


    /**
     * Accessor method for Comments.
     * <br>Our comments on the coverage
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getComments();

    /**
     * Mutator method for Comments.
     * <br>Our comments on the coverage
     *
     * @param aComments set java.lang.String attribute of this Coverage.
     */
    public void setComments(java.lang.String aComments);


    /**
     * The enumeration for Comments
     */
    public final static int COMMENTS = 17;


    /**
     * Accessor method for PictureUsed.
     * <br>Any picture used.
     *
     * @return java.lang.Boolean attribute of this Coverage.
     */
    public java.lang.Boolean getPictureUsed();

    /**
     * Mutator method for PictureUsed.
     * <br>Any picture used.
     *
     * @param aPictureUsed set java.lang.Boolean attribute of this Coverage.
     */
    public void setPictureUsed(java.lang.Boolean aPictureUsed);


    /**
     * The enumeration for PictureUsed
     */
    public final static int PICTUREUSED = 18;


    /**
     * Accessor method for Filename.
     * <br>The filename of the piece, if it can be scanned or referenced
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getFilename();

    /**
     * Mutator method for Filename.
     * <br>The filename of the piece, if it can be scanned or referenced
     *
     * @param aFilename set java.lang.String attribute of this Coverage.
     */
    public void setFilename(java.lang.String aFilename);


    /**
     * The enumeration for Filename
     */
    public final static int FILENAME = 19;


    /**
     * Accessor method for PropertyNamed.
     * <br>longTextAttribute The named properties.
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getPropertyNamed();

    /**
     * Mutator method for PropertyNamed.
     * <br>longTextAttribute The named properties.
     *
     * @param aPropertyNamed set java.lang.String attribute of this Coverage.
     */
    public void setPropertyNamed(java.lang.String aPropertyNamed);


    /**
     * The enumeration for PropertyNamed
     */
    public final static int PROPERTYNAMED = 20;


    /**
     * Accessor method for DateRead.
     * <br>The date we read and entered this coverage
     *
     * @return java.util.Date attribute of this Coverage.
     */
    public java.util.Date getDateRead();

    /**
     * Mutator method for DateRead.
     * <br>The date we read and entered this coverage
     *
     * @param aDateRead set java.util.Date attribute of this Coverage.
     */
    public void setDateRead(java.util.Date aDateRead);


    /**
     * The enumeration for DateRead
     */
    public final static int DATEREAD = 21;


    /**
     * Accessor method for Office.
     * <br>The office which this story applies to
     *
     * @return Office attribute of this Coverage.
     */
    public Office getOffice();

    /**
     * Mutator method for Office.
     * <br>The office which this story applies to
     *
     * @param aOffice set Office attribute of this Coverage.
     */
    public void setOffice(Office aOffice);


    /**
     * The enumeration for Office
     */
    public final static int OFFICE = 22;


    /**
     * Accessor method for ContactDetails.
     * <br>Were our contact details included in the coverage?
     *
     * @return java.lang.Boolean attribute of this Coverage.
     */
    public java.lang.Boolean getContactDetails();

    /**
     * Mutator method for ContactDetails.
     * <br>Were our contact details included in the coverage?
     *
     * @param aContactDetails set java.lang.Boolean attribute of this Coverage.
     */
    public void setContactDetails(java.lang.Boolean aContactDetails);


    /**
     * The enumeration for ContactDetails
     */
    public final static int CONTACTDETAILS = 23;


    /**
     * Accessor method for PublicationDate.
     * <br>The date of publication of this story, item etc.
     *
     * @return java.util.Date attribute of this Coverage.
     */
    public java.util.Date getPublicationDate();

    /**
     * Mutator method for PublicationDate.
     * <br>The date of publication of this story, item etc.
     *
     * @param aPublicationDate set java.util.Date attribute of this Coverage.
     */
    public void setPublicationDate(java.util.Date aPublicationDate);


    /**
     * The enumeration for PublicationDate
     */
    public final static int PUBLICATIONDATE = 24;


    /**
     * Accessor method for Feature.
     * <br>longTextAttribute The name of the feature this appeared in
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getFeature();

    /**
     * Mutator method for Feature.
     * <br>longTextAttribute The name of the feature this appeared in
     *
     * @param aFeature set java.lang.String attribute of this Coverage.
     */
    public void setFeature(java.lang.String aFeature);


    /**
     * The enumeration for Feature
     */
    public final static int FEATURE = 25;


    /**
     * Accessor method for MentionType.
     * <br>The type of mention we got
     *
     * @return MentionType attribute of this Coverage.
     */
    public MentionType getMentionType();

    /**
     * Mutator method for MentionType.
     * <br>The type of mention we got
     *
     * @param aMentionType set MentionType attribute of this Coverage.
     */
    public void setMentionType(MentionType aMentionType);


    /**
     * The enumeration for MentionType
     */
    public final static int MENTIONTYPE = 26;


    /**
     * Accessor method for PrManager.
     * <br>The PR Manager who is responsible for this coverage
     *
     * @return PRManager attribute of this Coverage.
     */
    public PRManager getPrManager();

    /**
     * Mutator method for PrManager.
     * <br>The PR Manager who is responsible for this coverage
     *
     * @param aPrManager set PRManager attribute of this Coverage.
     */
    public void setPrManager(PRManager aPrManager);


    /**
     * The enumeration for PrManager
     */
    public final static int PRMANAGER = 27;


    /**
     * Accessor method for SequenceNumber.
     * <br>A unique sequence from the coverage
     *
     * @return java.lang.String attribute of this Coverage.
     */
    public java.lang.String getSequenceNumber();

    /**
     * Mutator method for SequenceNumber.
     * <br>A unique sequence from the coverage
     *
     * @param aSequenceNumber set java.lang.String attribute of this Coverage.
     */
    public void setSequenceNumber(java.lang.String aSequenceNumber);


    /**
     * The enumeration for SequenceNumber
     */
    public final static int SEQUENCENUMBER = 28;



    /**
     * Get this Coverage's QuotedPersons.
     * <br>The people quoted in this article
     *
     * @return Collection containing the QuotedPersons.
     */
    public Collection getQuotedPersons();

    /**
     * Add a Employee to this Coverage's QuotedPersons.
     * <br>The people quoted in this article
     *
     * @param aQuotedPerson Employee to add to this Coverage's QuotedPersons.
     */
    public void addQuotedPerson(Employee aQuotedPerson);

    /**
     * Get the elements in this Coverage's QuotedPersons as an 
     * array of Employee[].
     * <br>The people quoted in this article
     *
     * @return Employee[] containing the elements of this Coverage's QuotedPersons.
     */
    public Employee[] getQuotedPersonsAsArray();

    /**
     * Remove an QuotedPerson from this Coverage's QuotedPersons.
     * <br>The people quoted in this article
     *
     * @param aQuotedPerson Employee to remove from this Coverage's QuotedPersons.
     */
    public void removeQuotedPerson(Employee aQuotedPerson);

    /**
     * Add a collection of QuotedPersons to this Coverage.
     * <br>The people quoted in this article
     *
     * @param aQuotedPersons Collection to add to this Coverage's QuotedPersons.
     */
    public void addQuotedPersons(Collection aQuotedPersons);

    /**
     * Clear this Coverage's QuotedPersons.
     * <br>The people quoted in this article
     */
    public void clearQuotedPersons();

    /**
     * Does this Coverage's QuotedPersons contain a particular Employee.
     * <br>The people quoted in this article
     *
     * @param aQuotedPerson Employee that might be in this Coverage's QuotedPersons.
     *
     * @return boolean is the Employee in this Coverage's QuotedPersons.
     */
    public boolean containsQuotedPerson(Employee aQuotedPerson);


    /**
     * The enumeration for QuotedPerson
     */
    public final static int QUOTEDPERSON = 10;



}
