package interfaces; 


import java.io.Serializable;

/**
 * Business Object Interface for the PublicationType entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>PublicationType</strong></td><td colspan=3><em>The type of publication - this could be magazine, newspaper, radio station, business organisation</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>code</td><td><em>The unique code for this type</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of this type</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Float</td><td>value</td><td><em>The value of cm's.</em></td>
 *  </tr>
 * </table>
 */
public interface PublicationType extends BusinessObject, Serializable {

    /**
     * Accessor method for Code.
     * <br>The unique code for this type
     *
     * @return java.lang.String attribute of this PublicationType.
     */
    public java.lang.String getCode();

    /**
     * Mutator method for Code.
     * <br>The unique code for this type
     *
     * @param aCode set java.lang.String attribute of this PublicationType.
     */
    public void setCode(java.lang.String aCode);


    /**
     * The enumeration for Code
     */
    public final static int CODE = 0;


    /**
     * Accessor method for Name.
     * <br>The name of this type
     *
     * @return java.lang.String attribute of this PublicationType.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of this type
     *
     * @param aName set java.lang.String attribute of this PublicationType.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 1;


    /**
     * Accessor method for Value.
     * <br>The value of cm's.
     *
     * @return java.lang.Float attribute of this PublicationType.
     */
    public java.lang.Float getValue();

    /**
     * Mutator method for Value.
     * <br>The value of cm's.
     *
     * @param aValue set java.lang.Float attribute of this PublicationType.
     */
    public void setValue(java.lang.Float aValue);


    /**
     * The enumeration for Value
     */
    public final static int VALUE = 2;





}
