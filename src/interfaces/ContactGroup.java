package interfaces; 

import java.io.Serializable;

/**
 * Business Object Interface for the ContactGroup entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>ContactGroup</strong></td><td colspan=3><em>Some grouping for the contact - e.g. who they belong to, or what type of contact they are</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of the group</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>description</td><td><em>A longer description of the group</em></td>
 *  </tr>
 * </table>
 */
public interface ContactGroup extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>The name of the group
     *
     * @return java.lang.String attribute of this ContactGroup.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of the group
     *
     * @param aName set java.lang.String attribute of this ContactGroup.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;


    /**
     * Accessor method for Description.
     * <br>A longer description of the group
     *
     * @return java.lang.String attribute of this ContactGroup.
     */
    public java.lang.String getDescription();

    /**
     * Mutator method for Description.
     * <br>A longer description of the group
     *
     * @param aDescription set java.lang.String attribute of this ContactGroup.
     */
    public void setDescription(java.lang.String aDescription);


    /**
     * The enumeration for Description
     */
    public final static int DESCRIPTION = 1;





}
