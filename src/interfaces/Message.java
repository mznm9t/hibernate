package interfaces; 

import java.io.Serializable;

/**
 * Business Object Interface for the Message entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Message</strong></td><td colspan=3><em>A core message of your organisation - there should not be too many of these</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of the message</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>description</td><td><em>A detailed writeup of the message</em></td>
 *  </tr>
 * </table>
 */
public interface Message extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>The name of the message
     *
     * @return java.lang.String attribute of this Message.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of the message
     *
     * @param aName set java.lang.String attribute of this Message.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;


    /**
     * Accessor method for Description.
     * <br>A detailed writeup of the message
     *
     * @return java.lang.String attribute of this Message.
     */
    public java.lang.String getDescription();

    /**
     * Mutator method for Description.
     * <br>A detailed writeup of the message
     *
     * @param aDescription set java.lang.String attribute of this Message.
     */
    public void setDescription(java.lang.String aDescription);


    /**
     * The enumeration for Description
     */
    public final static int DESCRIPTION = 1;





}
