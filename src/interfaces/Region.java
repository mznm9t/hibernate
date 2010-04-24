package interfaces; 


import java.io.Serializable;

/**
 * Business Object Interface for the Region entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Region</strong></td><td colspan=3><em>A region.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The region name.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>code</td><td><em>The region code.</em></td>
 *  </tr>
 * </table>
 */
public interface Region extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>longTextAttribute The region name.
     *
     * @return java.lang.String attribute of this Region.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>longTextAttribute The region name.
     *
     * @param aName set java.lang.String attribute of this Region.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;


    /**
     * Accessor method for Code.
     * <br>longTextAttribute The region code.
     *
     * @return java.lang.String attribute of this Region.
     */
    public java.lang.String getCode();

    /**
     * Mutator method for Code.
     * <br>longTextAttribute The region code.
     *
     * @param aCode set java.lang.String attribute of this Region.
     */
    public void setCode(java.lang.String aCode);


    /**
     * The enumeration for Code
     */
    public final static int CODE = 1;





}
