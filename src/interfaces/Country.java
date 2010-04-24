package interfaces; 


import java.io.Serializable;

/**
 * Business Object Interface for the Country entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Country</strong></td><td colspan=3><em>A country</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of the country</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>isoCode</td><td><em>The ISO code of the country</em></td>
 *  </tr>
 * </table>
 */
public interface Country extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>The name of the country
     *
     * @return java.lang.String attribute of this Country.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of the country
     *
     * @param aName set java.lang.String attribute of this Country.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;


    /**
     * Accessor method for IsoCode.
     * <br>The ISO code of the country
     *
     * @return java.lang.String attribute of this Country.
     */
    public java.lang.String getIsoCode();

    /**
     * Mutator method for IsoCode.
     * <br>The ISO code of the country
     *
     * @param aIsoCode set java.lang.String attribute of this Country.
     */
    public void setIsoCode(java.lang.String aIsoCode);


    /**
     * The enumeration for IsoCode
     */
    public final static int ISOCODE = 1;





}
