package interfaces; 

import java.util.Collection;
import java.io.Serializable;

/**
 * Business Object Interface for the Employee entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Employee</strong></td><td colspan=3><em>One of our employees who can be on our end of a contact event</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Boolean</td><td>current</td><td><em>Is this employee working for us at the present time?</em></td>
 *  </tr>
 * </table>
 */
public interface Employee extends BusinessObject, Person, Serializable {
    /**
     * Accessor method for AccountManager.
     * <br>The account manager or other person within our company who deals with this contact
     *
     * @return Employee attribute of this Employee.
     */
    public Employee getAccountManager();

    /**
     * Mutator method for AccountManager.
     * <br>The account manager or other person within our company who deals with this contact
     *
     * @param aAccountManager set Employee attribute of this Employee.
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
     * @return PhoneNumber attribute of this Employee.
     */
    public PhoneNumber getFax();

    /**
     * Mutator method for Fax.
     * <br>The fax number of the contact
     *
     * @param aFax set PhoneNumber attribute of this Employee.
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
     * @return java.lang.String attribute of this Employee.
     */
    public java.lang.String getEmail();

    /**
     * Mutator method for Email.
     * <br>The SMTP email address of the contact
     *
     * @param aEmail set java.lang.String attribute of this Employee.
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
     * @return ContactGroup attribute of this Employee.
     */
    public ContactGroup getMainGroup();

    /**
     * Mutator method for MainGroup.
     * <br>The main contact group for this contact
     *
     * @param aMainGroup set ContactGroup attribute of this Employee.
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
     * @return java.lang.String attribute of this Employee.
     */
    public java.lang.String getWww();

    /**
     * Mutator method for Www.
     * <br>The website address of the contact (including http://)
     *
     * @param aWww set java.lang.String attribute of this Employee.
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
     * @return Address attribute of this Employee.
     */
    public Address getAddress();

    /**
     * Mutator method for Address.
     * <br>The address of this Contactable object
     *
     * @param aAddress set Address attribute of this Employee.
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
     * @return ContactStatus attribute of this Employee.
     */
    public ContactStatus getStatus();

    /**
     * Mutator method for Status.
     * <br>The status of the contact, expressing what we know about how up-to-date the details are
     *
     * @param aStatus set ContactStatus attribute of this Employee.
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
     * @return PhoneNumber attribute of this Employee.
     */
    public PhoneNumber getPhone1();

    /**
     * Mutator method for Phone1.
     * <br>The first phone number
     *
     * @param aPhone1 set PhoneNumber attribute of this Employee.
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
     * @return java.util.Date attribute of this Employee.
     */
    public java.util.Date getCreated();

    /**
     * Mutator method for Created.
     * <br>The date this contact was created
     *
     * @param aCreated set java.util.Date attribute of this Employee.
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
     * @return PhoneNumber attribute of this Employee.
     */
    public PhoneNumber getPhone2();

    /**
     * Mutator method for Phone2.
     * <br>The second phone number
     *
     * @param aPhone2 set PhoneNumber attribute of this Employee.
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
     * @return java.lang.String attribute of this Employee.
     */
    public java.lang.String getNotes();

    /**
     * Mutator method for Notes.
     * <br>General information on the person or company
     *
     * @param aNotes set java.lang.String attribute of this Employee.
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
     * @return java.util.Date attribute of this Employee.
     */
    public java.util.Date getLastUpdate();

    /**
     * Mutator method for LastUpdate.
     * <br>The last update of this contact.  If null, considered to be equal to created
     *
     * @param aLastUpdate set java.util.Date attribute of this Employee.
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
     * @return PhoneNumber attribute of this Employee.
     */
    public PhoneNumber getMobile();

    /**
     * Mutator method for Mobile.
     * <br>The mobile phone number of the contact
     *
     * @param aMobile set PhoneNumber attribute of this Employee.
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
     * @return java.lang.String attribute of this Employee.
     */
    public java.lang.String getKnownAs();

    /**
     * Mutator method for KnownAs.
     * <br>knownAs
     *
     * @param aKnownAs set java.lang.String attribute of this Employee.
     */
    public void setKnownAs(java.lang.String aKnownAs);


    /**
     * The enumeration for KnownAs
     */
    public final static int KNOWNAS = 14;



    /**
     * Get this Employee's ContactEvents.
     * <br>A set of contact events for this person or company
     *
     * @return Collection containing the ContactEvents.
     */
    public Collection getContactEvents();

    /**
     * Add a ContactEvent to this Employee's ContactEvents.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvent ContactEvent to add to this Employee's ContactEvents.
     */
    public void addContactEvent(ContactEvent aContactEvent);

    /**
     * Get the elements in this Employee's ContactEvents as an 
     * array of ContactEvent[].
     * <br>A set of contact events for this person or company
     *
     * @return ContactEvent[] containing the elements of this Employee's ContactEvents.
     */
    public ContactEvent[] getContactEventsAsArray();

    /**
     * Remove an ContactEvent from this Employee's ContactEvents.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvent ContactEvent to remove from this Employee's ContactEvents.
     */
    public void removeContactEvent(ContactEvent aContactEvent);

    /**
     * Add a collection of ContactEvents to this Employee.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvents Collection to add to this Employee's ContactEvents.
     */
    public void addContactEvents(Collection aContactEvents);

    /**
     * Clear this Employee's ContactEvents.
     * <br>A set of contact events for this person or company
     */
    public void clearContactEvents();

    /**
     * Does this Employee's ContactEvents contain a particular ContactEvent.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvent ContactEvent that might be in this Employee's ContactEvents.
     *
     * @return boolean is the ContactEvent in this Employee's ContactEvents.
     */
    public boolean containsContactEvent(ContactEvent aContactEvent);


    /**
     * The enumeration for ContactEvent
     */
    public final static int CONTACTEVENT = 2;



    /**
     * Accessor method for Company.
     * <br>The main or only company this person works for or is speaking for
     *
     * @return Company attribute of this Employee.
     */
    public Company getCompany();

    /**
     * Mutator method for Company.
     * <br>The main or only company this person works for or is speaking for
     *
     * @param aCompany set Company attribute of this Employee.
     */
    public void setCompany(Company aCompany);


    /**
     * The enumeration for Company
     */
    public final static int COMPANY = 15;


    /**
     * Accessor method for JobTitle.
     * <br>The job title (Managing Director, Consultant) of the person
     *
     * @return java.lang.String attribute of this Employee.
     */
    public java.lang.String getJobTitle();

    /**
     * Mutator method for JobTitle.
     * <br>The job title (Managing Director, Consultant) of the person
     *
     * @param aJobTitle set java.lang.String attribute of this Employee.
     */
    public void setJobTitle(java.lang.String aJobTitle);


    /**
     * The enumeration for JobTitle
     */
    public final static int JOBTITLE = 16;


    /**
     * Accessor method for LastName.
     * <br>The last name of the person
     *
     * @return java.lang.String attribute of this Employee.
     */
    public java.lang.String getLastName();

    /**
     * Mutator method for LastName.
     * <br>The last name of the person
     *
     * @param aLastName set java.lang.String attribute of this Employee.
     */
    public void setLastName(java.lang.String aLastName);


    /**
     * The enumeration for LastName
     */
    public final static int LASTNAME = 17;


    /**
     * Accessor method for Title.
     * <br>The title (Mr, Miss, Dr etc.) of the person
     *
     * @return java.lang.String attribute of this Employee.
     */
    public java.lang.String getTitle();

    /**
     * Mutator method for Title.
     * <br>The title (Mr, Miss, Dr etc.) of the person
     *
     * @param aTitle set java.lang.String attribute of this Employee.
     */
    public void setTitle(java.lang.String aTitle);


    /**
     * The enumeration for Title
     */
    public final static int TITLE = 18;


    /**
     * Accessor method for FirstName.
     * <br>The first (i.e. given) name of the person
     *
     * @return java.lang.String attribute of this Employee.
     */
    public java.lang.String getFirstName();

    /**
     * Mutator method for FirstName.
     * <br>The first (i.e. given) name of the person
     *
     * @param aFirstName set java.lang.String attribute of this Employee.
     */
    public void setFirstName(java.lang.String aFirstName);


    /**
     * The enumeration for FirstName
     */
    public final static int FIRSTNAME = 19;






    /**
     * Accessor method for Current.
     * <br>Is this employee working for us at the present time?
     *
     * @return java.lang.Boolean attribute of this Employee.
     */
    public java.lang.Boolean getCurrent();

    /**
     * Mutator method for Current.
     * <br>Is this employee working for us at the present time?
     *
     * @param aCurrent set java.lang.Boolean attribute of this Employee.
     */
    public void setCurrent(java.lang.Boolean aCurrent);


    /**
     * The enumeration for Current
     */
    public final static int CURRENT = 20;





}
