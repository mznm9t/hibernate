package interfaces; 

import java.util.Collection;
import java.io.Serializable;

/**
 * Business Object Interface for the Office entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Office</strong></td><td colspan=3><em>A Savills office.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>PRManager</td><td>managedBy</td><td><em>Who manages this office.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>description</td><td><em>A description</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of the office</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Region</td><td>region</td><td><em>The region this office is in.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>Set:</td><td>PRManager</td><td>allManager</td><td><em>The set of PR Managers who work for this office</em></td>
 *  </tr>
 * </table>
 */
public interface Office extends BusinessObject, Contactable, Serializable {
    /**
     * Accessor method for AccountManager.
     * <br>The account manager or other person within our company who deals with this contact
     *
     * @return Employee attribute of this Office.
     */
    public Employee getAccountManager();

    /**
     * Mutator method for AccountManager.
     * <br>The account manager or other person within our company who deals with this contact
     *
     * @param aAccountManager set Employee attribute of this Office.
     */
    public void setAccountManager(Employee aAccountManager);


    /**
     * The enumeration for AccountManager
     */
    public final static int ACCOUNTMANAGER = 0;


    /**
     * Accessor method for Fax.
     * <br>The fax number of the contact
     *
     * @return PhoneNumber attribute of this Office.
     */
    public PhoneNumber getFax();

    /**
     * Mutator method for Fax.
     * <br>The fax number of the contact
     *
     * @param aFax set PhoneNumber attribute of this Office.
     */
    public void setFax(PhoneNumber aFax);


    /**
     * The enumeration for Fax
     */
    public final static int FAX = 1;


    /**
     * Accessor method for Email.
     * <br>The SMTP email address of the contact
     *
     * @return java.lang.String attribute of this Office.
     */
    public java.lang.String getEmail();

    /**
     * Mutator method for Email.
     * <br>The SMTP email address of the contact
     *
     * @param aEmail set java.lang.String attribute of this Office.
     */
    public void setEmail(java.lang.String aEmail);


    /**
     * The enumeration for Email
     */
    public final static int EMAIL = 3;


    /**
     * Accessor method for MainGroup.
     * <br>The main contact group for this contact
     *
     * @return ContactGroup attribute of this Office.
     */
    public ContactGroup getMainGroup();

    /**
     * Mutator method for MainGroup.
     * <br>The main contact group for this contact
     *
     * @param aMainGroup set ContactGroup attribute of this Office.
     */
    public void setMainGroup(ContactGroup aMainGroup);


    /**
     * The enumeration for MainGroup
     */
    public final static int MAINGROUP = 4;


    /**
     * Accessor method for Www.
     * <br>The website address of the contact (including http://)
     *
     * @return java.lang.String attribute of this Office.
     */
    public java.lang.String getWww();

    /**
     * Mutator method for Www.
     * <br>The website address of the contact (including http://)
     *
     * @param aWww set java.lang.String attribute of this Office.
     */
    public void setWww(java.lang.String aWww);


    /**
     * The enumeration for Www
     */
    public final static int WWW = 5;


    /**
     * Accessor method for Address.
     * <br>The address of this Contactable object
     *
     * @return Address attribute of this Office.
     */
    public Address getAddress();

    /**
     * Mutator method for Address.
     * <br>The address of this Contactable object
     *
     * @param aAddress set Address attribute of this Office.
     */
    public void setAddress(Address aAddress);


    /**
     * The enumeration for Address
     */
    public final static int ADDRESS = 6;


    /**
     * Accessor method for Status.
     * <br>The status of the contact, expressing what we know about how up-to-date the details are
     *
     * @return ContactStatus attribute of this Office.
     */
    public ContactStatus getStatus();

    /**
     * Mutator method for Status.
     * <br>The status of the contact, expressing what we know about how up-to-date the details are
     *
     * @param aStatus set ContactStatus attribute of this Office.
     */
    public void setStatus(ContactStatus aStatus);


    /**
     * The enumeration for Status
     */
    public final static int STATUS = 7;


    /**
     * Accessor method for Phone1.
     * <br>The first phone number
     *
     * @return PhoneNumber attribute of this Office.
     */
    public PhoneNumber getPhone1();

    /**
     * Mutator method for Phone1.
     * <br>The first phone number
     *
     * @param aPhone1 set PhoneNumber attribute of this Office.
     */
    public void setPhone1(PhoneNumber aPhone1);


    /**
     * The enumeration for Phone1
     */
    public final static int PHONE1 = 8;


    /**
     * Accessor method for Created.
     * <br>The date this contact was created
     *
     * @return java.util.Date attribute of this Office.
     */
    public java.util.Date getCreated();

    /**
     * Mutator method for Created.
     * <br>The date this contact was created
     *
     * @param aCreated set java.util.Date attribute of this Office.
     */
    public void setCreated(java.util.Date aCreated);


    /**
     * The enumeration for Created
     */
    public final static int CREATED = 9;


    /**
     * Accessor method for Phone2.
     * <br>The second phone number
     *
     * @return PhoneNumber attribute of this Office.
     */
    public PhoneNumber getPhone2();

    /**
     * Mutator method for Phone2.
     * <br>The second phone number
     *
     * @param aPhone2 set PhoneNumber attribute of this Office.
     */
    public void setPhone2(PhoneNumber aPhone2);


    /**
     * The enumeration for Phone2
     */
    public final static int PHONE2 = 10;


    /**
     * Accessor method for Notes.
     * <br>General information on the person or company
     *
     * @return java.lang.String attribute of this Office.
     */
    public java.lang.String getNotes();

    /**
     * Mutator method for Notes.
     * <br>General information on the person or company
     *
     * @param aNotes set java.lang.String attribute of this Office.
     */
    public void setNotes(java.lang.String aNotes);


    /**
     * The enumeration for Notes
     */
    public final static int NOTES = 11;


    /**
     * Accessor method for LastUpdate.
     * <br>The last update of this contact.  If null, considered to be equal to created
     *
     * @return java.util.Date attribute of this Office.
     */
    public java.util.Date getLastUpdate();

    /**
     * Mutator method for LastUpdate.
     * <br>The last update of this contact.  If null, considered to be equal to created
     *
     * @param aLastUpdate set java.util.Date attribute of this Office.
     */
    public void setLastUpdate(java.util.Date aLastUpdate);


    /**
     * The enumeration for LastUpdate
     */
    public final static int LASTUPDATE = 12;


    /**
     * Accessor method for Mobile.
     * <br>The mobile phone number of the contact
     *
     * @return PhoneNumber attribute of this Office.
     */
    public PhoneNumber getMobile();

    /**
     * Mutator method for Mobile.
     * <br>The mobile phone number of the contact
     *
     * @param aMobile set PhoneNumber attribute of this Office.
     */
    public void setMobile(PhoneNumber aMobile);


    /**
     * The enumeration for Mobile
     */
    public final static int MOBILE = 13;


    /**
     * Accessor method for KnownAs.
     * <br>knownAs
     *
     * @return java.lang.String attribute of this Office.
     */
    public java.lang.String getKnownAs();

    /**
     * Mutator method for KnownAs.
     * <br>knownAs
     *
     * @param aKnownAs set java.lang.String attribute of this Office.
     */
    public void setKnownAs(java.lang.String aKnownAs);


    /**
     * The enumeration for KnownAs
     */
    public final static int KNOWNAS = 14;



    /**
     * Get this Office's ContactEvents.
     * <br>A set of contact events for this person or company
     *
     * @return Collection containing the ContactEvents.
     */
    public Collection getContactEvents();

    /**
     * Add a ContactEvent to this Office's ContactEvents.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvent ContactEvent to add to this Office's ContactEvents.
     */
    public void addContactEvent(ContactEvent aContactEvent);

    /**
     * Get the elements in this Office's ContactEvents as an 
     * array of ContactEvent[].
     * <br>A set of contact events for this person or company
     *
     * @return ContactEvent[] containing the elements of this Office's ContactEvents.
     */
    public ContactEvent[] getContactEventsAsArray();

    /**
     * Remove an ContactEvent from this Office's ContactEvents.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvent ContactEvent to remove from this Office's ContactEvents.
     */
    public void removeContactEvent(ContactEvent aContactEvent);

    /**
     * Add a collection of ContactEvents to this Office.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvents Collection to add to this Office's ContactEvents.
     */
    public void addContactEvents(Collection aContactEvents);

    /**
     * Clear this Office's ContactEvents.
     * <br>A set of contact events for this person or company
     */
    public void clearContactEvents();

    /**
     * Does this Office's ContactEvents contain a particular ContactEvent.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvent ContactEvent that might be in this Office's ContactEvents.
     *
     * @return boolean is the ContactEvent in this Office's ContactEvents.
     */
    public boolean containsContactEvent(ContactEvent aContactEvent);


    /**
     * The enumeration for ContactEvent
     */
    public final static int CONTACTEVENT = 2;




    /**
     * Accessor method for ManagedBy.
     * <br>Who manages this office.
     *
     * @return PRManager attribute of this Office.
     */
    public PRManager getManagedBy();

    /**
     * Mutator method for ManagedBy.
     * <br>Who manages this office.
     *
     * @param aManagedBy set PRManager attribute of this Office.
     */
    public void setManagedBy(PRManager aManagedBy);


    /**
     * The enumeration for ManagedBy
     */
    public final static int MANAGEDBY = 15;


    /**
     * Accessor method for Description.
     * <br>A description
     *
     * @return java.lang.String attribute of this Office.
     */
    public java.lang.String getDescription();

    /**
     * Mutator method for Description.
     * <br>A description
     *
     * @param aDescription set java.lang.String attribute of this Office.
     */
    public void setDescription(java.lang.String aDescription);


    /**
     * The enumeration for Description
     */
    public final static int DESCRIPTION = 16;


    /**
     * Accessor method for Name.
     * <br>longTextAttribute The name of the office
     *
     * @return java.lang.String attribute of this Office.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>longTextAttribute The name of the office
     *
     * @param aName set java.lang.String attribute of this Office.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 17;


    /**
     * Accessor method for Region.
     * <br>The region this office is in.
     *
     * @return Region attribute of this Office.
     */
    public Region getRegion();

    /**
     * Mutator method for Region.
     * <br>The region this office is in.
     *
     * @param aRegion set Region attribute of this Office.
     */
    public void setRegion(Region aRegion);


    /**
     * The enumeration for Region
     */
    public final static int REGION = 18;



    /**
     * Get this Office's AllManagers.
     * <br>The set of PR Managers who work for this office
     *
     * @return Collection containing the AllManagers.
     */
    public Collection getAllManagers();

    /**
     * Add a PRManager to this Office's AllManagers.
     * <br>The set of PR Managers who work for this office
     *
     * @param aAllManager PRManager to add to this Office's AllManagers.
     */
    public void addAllManager(PRManager aAllManager);

    /**
     * Get the elements in this Office's AllManagers as an 
     * array of PRManager[].
     * <br>The set of PR Managers who work for this office
     *
     * @return PRManager[] containing the elements of this Office's AllManagers.
     */
    public PRManager[] getAllManagersAsArray();

    /**
     * Remove an AllManager from this Office's AllManagers.
     * <br>The set of PR Managers who work for this office
     *
     * @param aAllManager PRManager to remove from this Office's AllManagers.
     */
    public void removeAllManager(PRManager aAllManager);

    /**
     * Add a collection of AllManagers to this Office.
     * <br>The set of PR Managers who work for this office
     *
     * @param aAllManagers Collection to add to this Office's AllManagers.
     */
    public void addAllManagers(Collection aAllManagers);

    /**
     * Clear this Office's AllManagers.
     * <br>The set of PR Managers who work for this office
     */
    public void clearAllManagers();

    /**
     * Does this Office's AllManagers contain a particular PRManager.
     * <br>The set of PR Managers who work for this office
     *
     * @param aAllManager PRManager that might be in this Office's AllManagers.
     *
     * @return boolean is the PRManager in this Office's AllManagers.
     */
    public boolean containsAllManager(PRManager aAllManager);


    /**
     * The enumeration for AllManager
     */
    public final static int ALLMANAGER = 19;



}
