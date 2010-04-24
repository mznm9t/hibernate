package interfaces; 

import java.io.Serializable;

/**
 * Business Object Interface for the ContactStatus entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>ContactStatus</strong></td><td colspan=3><em>The status of a contact - are they current, expired, unknown?</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of this status</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>code</td><td><em>A unique code for this status</em></td>
 *  </tr>
 * </table>
 */
public interface ContactStatus extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>The name of this status
     *
     * @return java.lang.String attribute of this ContactStatus.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of this status
     *
     * @param aName set java.lang.String attribute of this ContactStatus.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;


    /**
     * Accessor method for Code.
     * <br>A unique code for this status
     *
     * @return java.lang.String attribute of this ContactStatus.
     */
    public java.lang.String getCode();

    /**
     * Mutator method for Code.
     * <br>A unique code for this status
     *
     * @param aCode set java.lang.String attribute of this ContactStatus.
     */
    public void setCode(java.lang.String aCode);


    /**
     * The enumeration for Code
     */
    public final static int CODE = 1;





}
