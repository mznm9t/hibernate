package com.fpdsavills.pr.interfaces; 

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import com.inon.websuite.datamanager.runtime.business.BusinessObject;
import java.io.Serializable;

/**
 * Business Object Interface for the ContactEvent entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>ContactEvent</strong></td><td colspan=3><em>An event in which you contact a journalist</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>ContactEventType</td><td>type</td><td><em>The type of this contact event</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Contactable</td><td>ourContact</td><td><em>The contact at our end of the event (normally our employee)</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Contactable</td><td>theirContact</td><td><em>Who is being contacted?</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.util.Date</td><td>whenPlanned</td><td><em>When this contact event is planned, if it is in the future</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.util.Date</td><td>whenHappened</td><td><em>When this contact event occurred</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>content</td><td><em>The content of this contact, e.g. the text of a letter or email, or a description or transcript of a phone call</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>title</td><td><em>The title of this contact event - e.g. Call to John to confirm meeting tomorrow</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>ContactEvent</td><td>followup</td><td><em>The followup required for this event, if any</em></td>
 *  </tr>
 * </table>
 */
public interface ContactEvent extends BusinessObject, Serializable {

    /**
     * Accessor method for Type.
     * <br>The type of this contact event
     *
     * @return ContactEventType attribute of this ContactEvent.
     */
    public ContactEventType getType();

    /**
     * Mutator method for Type.
     * <br>The type of this contact event
     *
     * @param aType set ContactEventType attribute of this ContactEvent.
     */
    public void setType(ContactEventType aType);


    /**
     * The enumeration for Type
     */
    public final static int TYPE = 0;


    /**
     * Accessor method for OurContact.
     * <br>The contact at our end of the event (normally our employee)
     *
     * @return Contactable attribute of this ContactEvent.
     */
    public Contactable getOurContact();

    /**
     * Mutator method for OurContact.
     * <br>The contact at our end of the event (normally our employee)
     *
     * @param aOurContact set Contactable attribute of this ContactEvent.
     */
    public void setOurContact(Contactable aOurContact);


    /**
     * The enumeration for OurContact
     */
    public final static int OURCONTACT = 1;


    /**
     * Accessor method for TheirContact.
     * <br>Who is being contacted?
     *
     * @return Contactable attribute of this ContactEvent.
     */
    public Contactable getTheirContact();

    /**
     * Mutator method for TheirContact.
     * <br>Who is being contacted?
     *
     * @param aTheirContact set Contactable attribute of this ContactEvent.
     */
    public void setTheirContact(Contactable aTheirContact);


    /**
     * The enumeration for TheirContact
     */
    public final static int THEIRCONTACT = 2;


    /**
     * Accessor method for WhenPlanned.
     * <br>When this contact event is planned, if it is in the future
     *
     * @return java.util.Date attribute of this ContactEvent.
     */
    public java.util.Date getWhenPlanned();

    /**
     * Mutator method for WhenPlanned.
     * <br>When this contact event is planned, if it is in the future
     *
     * @param aWhenPlanned set java.util.Date attribute of this ContactEvent.
     */
    public void setWhenPlanned(java.util.Date aWhenPlanned);


    /**
     * The enumeration for WhenPlanned
     */
    public final static int WHENPLANNED = 3;


    /**
     * Accessor method for WhenHappened.
     * <br>When this contact event occurred
     *
     * @return java.util.Date attribute of this ContactEvent.
     */
    public java.util.Date getWhenHappened();

    /**
     * Mutator method for WhenHappened.
     * <br>When this contact event occurred
     *
     * @param aWhenHappened set java.util.Date attribute of this ContactEvent.
     */
    public void setWhenHappened(java.util.Date aWhenHappened);


    /**
     * The enumeration for WhenHappened
     */
    public final static int WHENHAPPENED = 4;


    /**
     * Accessor method for Content.
     * <br>The content of this contact, e.g. the text of a letter or email, or a description or transcript of a phone call
     *
     * @return java.lang.String attribute of this ContactEvent.
     */
    public java.lang.String getContent();

    /**
     * Mutator method for Content.
     * <br>The content of this contact, e.g. the text of a letter or email, or a description or transcript of a phone call
     *
     * @param aContent set java.lang.String attribute of this ContactEvent.
     */
    public void setContent(java.lang.String aContent);


    /**
     * The enumeration for Content
     */
    public final static int CONTENT = 5;


    /**
     * Accessor method for Title.
     * <br>The title of this contact event - e.g. Call to John to confirm meeting tomorrow
     *
     * @return java.lang.String attribute of this ContactEvent.
     */
    public java.lang.String getTitle();

    /**
     * Mutator method for Title.
     * <br>The title of this contact event - e.g. Call to John to confirm meeting tomorrow
     *
     * @param aTitle set java.lang.String attribute of this ContactEvent.
     */
    public void setTitle(java.lang.String aTitle);


    /**
     * The enumeration for Title
     */
    public final static int TITLE = 6;


    /**
     * Accessor method for Followup.
     * <br>The followup required for this event, if any
     *
     * @return ContactEvent attribute of this ContactEvent.
     */
    public ContactEvent getFollowup();

    /**
     * Mutator method for Followup.
     * <br>The followup required for this event, if any
     *
     * @param aFollowup set ContactEvent attribute of this ContactEvent.
     */
    public void setFollowup(ContactEvent aFollowup);


    /**
     * The enumeration for Followup
     */
    public final static int FOLLOWUP = 7;





}
