package interfaces; 

import java.util.Collection;
import java.io.Serializable;

/**
 * Business Object Interface for the Company entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Company</strong></td><td colspan=3><em>A base class for Publication</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of the company</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Person</td><td>mainContact</td><td><em>The main contact person for this company</em></td>
 *  </tr>
 * </table>
 */
public interface Company extends BusinessObject, Contactable, Serializable {
    /**
     * Accessor method for AccountManager.
     * <br>The account manager or other person within our company who deals with this contact
     *
     * @return Employee attribute of this Company.
     */
    public Employee getAccountManager();

    /**
     * Mutator method for AccountManager.
     * <br>The account manager or other person within our company who deals with this contact
     *
     * @param aAccountManager set Employee attribute of this Company.
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
     * @return PhoneNumber attribute of this Company.
     */
    public PhoneNumber getFax();

    /**
     * Mutator method for Fax.
     * <br>The fax number of the contact
     *
     * @param aFax set PhoneNumber attribute of this Company.
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
     * @return java.lang.String attribute of this Company.
     */
    public java.lang.String getEmail();

    /**
     * Mutator method for Email.
     * <br>The SMTP email address of the contact
     *
     * @param aEmail set java.lang.String attribute of this Company.
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
     * @return ContactGroup attribute of this Company.
     */
    public ContactGroup getMainGroup();

    /**
     * Mutator method for MainGroup.
     * <br>The main contact group for this contact
     *
     * @param aMainGroup set ContactGroup attribute of this Company.
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
     * @return java.lang.String attribute of this Company.
     */
    public java.lang.String getWww();

    /**
     * Mutator method for Www.
     * <br>The website address of the contact (including http://)
     *
     * @param aWww set java.lang.String attribute of this Company.
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
     * @return Address attribute of this Company.
     */
    public Address getAddress();

    /**
     * Mutator method for Address.
     * <br>The address of this Contactable object
     *
     * @param aAddress set Address attribute of this Company.
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
     * @return ContactStatus attribute of this Company.
     */
    public ContactStatus getStatus();

    /**
     * Mutator method for Status.
     * <br>The status of the contact, expressing what we know about how up-to-date the details are
     *
     * @param aStatus set ContactStatus attribute of this Company.
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
     * @return PhoneNumber attribute of this Company.
     */
    public PhoneNumber getPhone1();

    /**
     * Mutator method for Phone1.
     * <br>The first phone number
     *
     * @param aPhone1 set PhoneNumber attribute of this Company.
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
     * @return java.util.Date attribute of this Company.
     */
    public java.util.Date getCreated();

    /**
     * Mutator method for Created.
     * <br>The date this contact was created
     *
     * @param aCreated set java.util.Date attribute of this Company.
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
     * @return PhoneNumber attribute of this Company.
     */
    public PhoneNumber getPhone2();

    /**
     * Mutator method for Phone2.
     * <br>The second phone number
     *
     * @param aPhone2 set PhoneNumber attribute of this Company.
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
     * @return java.lang.String attribute of this Company.
     */
    public java.lang.String getNotes();

    /**
     * Mutator method for Notes.
     * <br>General information on the person or company
     *
     * @param aNotes set java.lang.String attribute of this Company.
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
     * @return java.util.Date attribute of this Company.
     */
    public java.util.Date getLastUpdate();

    /**
     * Mutator method for LastUpdate.
     * <br>The last update of this contact.  If null, considered to be equal to created
     *
     * @param aLastUpdate set java.util.Date attribute of this Company.
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
     * @return PhoneNumber attribute of this Company.
     */
    public PhoneNumber getMobile();

    /**
     * Mutator method for Mobile.
     * <br>The mobile phone number of the contact
     *
     * @param aMobile set PhoneNumber attribute of this Company.
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
     * @return java.lang.String attribute of this Company.
     */
    public java.lang.String getKnownAs();

    /**
     * Mutator method for KnownAs.
     * <br>knownAs
     *
     * @param aKnownAs set java.lang.String attribute of this Company.
     */
    public void setKnownAs(java.lang.String aKnownAs);


    /**
     * The enumeration for KnownAs
     */
    public final static int KNOWNAS = 14;



    /**
     * Get this Company's ContactEvents.
     * <br>A set of contact events for this person or company
     *
     * @return Collection containing the ContactEvents.
     */
    public Collection getContactEvents();

    /**
     * Add a ContactEvent to this Company's ContactEvents.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvent ContactEvent to add to this Company's ContactEvents.
     */
    public void addContactEvent(ContactEvent aContactEvent);

    /**
     * Get the elements in this Company's ContactEvents as an 
     * array of ContactEvent[].
     * <br>A set of contact events for this person or company
     *
     * @return ContactEvent[] containing the elements of this Company's ContactEvents.
     */
    public ContactEvent[] getContactEventsAsArray();

    /**
     * Remove an ContactEvent from this Company's ContactEvents.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvent ContactEvent to remove from this Company's ContactEvents.
     */
    public void removeContactEvent(ContactEvent aContactEvent);

    /**
     * Add a collection of ContactEvents to this Company.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvents Collection to add to this Company's ContactEvents.
     */
    public void addContactEvents(Collection aContactEvents);

    /**
     * Clear this Company's ContactEvents.
     * <br>A set of contact events for this person or company
     */
    public void clearContactEvents();

    /**
     * Does this Company's ContactEvents contain a particular ContactEvent.
     * <br>A set of contact events for this person or company
     *
     * @param aContactEvent ContactEvent that might be in this Company's ContactEvents.
     *
     * @return boolean is the ContactEvent in this Company's ContactEvents.
     */
    public boolean containsContactEvent(ContactEvent aContactEvent);


    /**
     * The enumeration for ContactEvent
     */
    public final static int CONTACTEVENT = 2;




    /**
     * Accessor method for Name.
     * <br>The name of the company
     *
     * @return java.lang.String attribute of this Company.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of the company
     *
     * @param aName set java.lang.String attribute of this Company.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 15;


    /**
     * Accessor method for MainContact.
     * <br>The main contact person for this company
     *
     * @return Person attribute of this Company.
     */
    public Person getMainContact();

    /**
     * Mutator method for MainContact.
     * <br>The main contact person for this company
     *
     * @param aMainContact set Person attribute of this Company.
     */
    public void setMainContact(Person aMainContact);


    /**
     * The enumeration for MainContact
     */
    public final static int MAINCONTACT = 16;





}
