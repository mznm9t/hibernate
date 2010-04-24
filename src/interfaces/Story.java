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
 * Business Object Interface for the Story entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Story</strong></td><td colspan=3><em>A story (in general terms) which you might want to get across</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Message</td><td>message</td><td><em>Which message does this story relate to?</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>title</td><td><em>The title of the story</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>description</td><td><em>The description of the story</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Company</td><td>client</td><td><em>Which of your clients this story relates to (if applicable)</em></td>
 *  </tr>
 * </table>
 */
public interface Story extends BusinessObject, Serializable {

    /**
     * Accessor method for Message.
     * <br>Which message does this story relate to?
     *
     * @return Message attribute of this Story.
     */
    public Message getMessage();

    /**
     * Mutator method for Message.
     * <br>Which message does this story relate to?
     *
     * @param aMessage set Message attribute of this Story.
     */
    public void setMessage(Message aMessage);


    /**
     * The enumeration for Message
     */
    public final static int MESSAGE = 0;


    /**
     * Accessor method for Title.
     * <br>The title of the story
     *
     * @return java.lang.String attribute of this Story.
     */
    public java.lang.String getTitle();

    /**
     * Mutator method for Title.
     * <br>The title of the story
     *
     * @param aTitle set java.lang.String attribute of this Story.
     */
    public void setTitle(java.lang.String aTitle);


    /**
     * The enumeration for Title
     */
    public final static int TITLE = 1;


    /**
     * Accessor method for Description.
     * <br>The description of the story
     *
     * @return java.lang.String attribute of this Story.
     */
    public java.lang.String getDescription();

    /**
     * Mutator method for Description.
     * <br>The description of the story
     *
     * @param aDescription set java.lang.String attribute of this Story.
     */
    public void setDescription(java.lang.String aDescription);


    /**
     * The enumeration for Description
     */
    public final static int DESCRIPTION = 2;


    /**
     * Accessor method for Client.
     * <br>Which of your clients this story relates to (if applicable)
     *
     * @return Company attribute of this Story.
     */
    public Company getClient();

    /**
     * Mutator method for Client.
     * <br>Which of your clients this story relates to (if applicable)
     *
     * @param aClient set Company attribute of this Story.
     */
    public void setClient(Company aClient);


    /**
     * The enumeration for Client
     */
    public final static int CLIENT = 3;





}
