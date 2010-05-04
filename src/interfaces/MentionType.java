package interfaces; 
import java.io.Serializable;

/**
 * Business Object Interface for the MentionType entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>MentionType</strong></td><td colspan=3><em>The type of mention achieved.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of the type</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>code</td><td><em>A code for the type</em></td>
 *  </tr>
 * </table>
 */
public interface MentionType extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>longTextAttribute The name of the type
     *
     * @return java.lang.String attribute of this MentionType.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>longTextAttribute The name of the type
     *
     * @param aName set java.lang.String attribute of this MentionType.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;


    /**
     * Accessor method for Code.
     * <br>longTextAttribute A code for the type
     *
     * @return java.lang.String attribute of this MentionType.
     */
    public java.lang.String getCode();

    /**
     * Mutator method for Code.
     * <br>longTextAttribute A code for the type
     *
     * @param aCode set java.lang.String attribute of this MentionType.
     */
    public void setCode(java.lang.String aCode);


    /**
     * The enumeration for Code
     */
    public final static int CODE = 1;





}
