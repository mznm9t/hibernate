package interfaces; 

import java.io.Serializable;

/**
 * Business Object Interface for the PhoneNumber entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>PhoneNumber</strong></td><td colspan=3><em>A phone number including international, dialling code, extension etc.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>areaCode</td><td><em>The city or regional area code</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>theNumber</td><td><em>The phone number itself, as dialled (excluding outside line prefix)</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>countryCode</td><td><em>The country code, including the + sign</em></td>
 *  </tr>
 * </table>
 */
public interface PhoneNumber extends BusinessObject, Serializable {

    /**
     * Accessor method for AreaCode.
     * <br>The city or regional area code
     *
     * @return java.lang.String attribute of this PhoneNumber.
     */
    public java.lang.String getAreaCode();

    /**
     * Mutator method for AreaCode.
     * <br>The city or regional area code
     *
     * @param aAreaCode set java.lang.String attribute of this PhoneNumber.
     */
    public void setAreaCode(java.lang.String aAreaCode);


    /**
     * The enumeration for AreaCode
     */
    public final static int AREACODE = 0;


    /**
     * Accessor method for TheNumber.
     * <br>The phone number itself, as dialled (excluding outside line prefix)
     *
     * @return java.lang.String attribute of this PhoneNumber.
     */
    public java.lang.String getTheNumber();

    /**
     * Mutator method for TheNumber.
     * <br>The phone number itself, as dialled (excluding outside line prefix)
     *
     * @param aTheNumber set java.lang.String attribute of this PhoneNumber.
     */
    public void setTheNumber(java.lang.String aTheNumber);


    /**
     * The enumeration for TheNumber
     */
    public final static int THENUMBER = 1;


    /**
     * Accessor method for CountryCode.
     * <br>The country code, including the + sign
     *
     * @return java.lang.String attribute of this PhoneNumber.
     */
    public java.lang.String getCountryCode();

    /**
     * Mutator method for CountryCode.
     * <br>The country code, including the + sign
     *
     * @param aCountryCode set java.lang.String attribute of this PhoneNumber.
     */
    public void setCountryCode(java.lang.String aCountryCode);


    /**
     * The enumeration for CountryCode
     */
    public final static int COUNTRYCODE = 2;





}
