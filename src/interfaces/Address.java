package interfaces; 
import java.io.Serializable;

/**
 * Business Object Interface for the Address entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Address</strong></td><td colspan=3><em>A physical address</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>postcode</td><td><em>The postcode or zip code</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>line4</td><td><em>The fourth line (county or region)</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>line3</td><td><em>The third line (town)</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>line2</td><td><em>The second line (street name and number, or neighbourhood)</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>line1</td><td><em>The first line (building name and number)</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Country</td><td>country</td><td><em>The country in which this address is</em></td>
 *  </tr>
 * </table>
 */
public interface Address extends BusinessObject, Serializable {

    /**
     * Accessor method for Postcode.
     * <br>The postcode or zip code
     *
     * @return java.lang.String attribute of this Address.
     */
    public java.lang.String getPostcode();

    /**
     * Mutator method for Postcode.
     * <br>The postcode or zip code
     *
     * @param aPostcode set java.lang.String attribute of this Address.
     */
    public void setPostcode(java.lang.String aPostcode);


    /**
     * The enumeration for Postcode
     */
    public final static int POSTCODE = 0;


    /**
     * Accessor method for Line4.
     * <br>The fourth line (county or region)
     *
     * @return java.lang.String attribute of this Address.
     */
    public java.lang.String getLine4();

    /**
     * Mutator method for Line4.
     * <br>The fourth line (county or region)
     *
     * @param aLine4 set java.lang.String attribute of this Address.
     */
    public void setLine4(java.lang.String aLine4);


    /**
     * The enumeration for Line4
     */
    public final static int LINE4 = 1;


    /**
     * Accessor method for Line3.
     * <br>The third line (town)
     *
     * @return java.lang.String attribute of this Address.
     */
    public java.lang.String getLine3();

    /**
     * Mutator method for Line3.
     * <br>The third line (town)
     *
     * @param aLine3 set java.lang.String attribute of this Address.
     */
    public void setLine3(java.lang.String aLine3);


    /**
     * The enumeration for Line3
     */
    public final static int LINE3 = 2;


    /**
     * Accessor method for Line2.
     * <br>The second line (street name and number, or neighbourhood)
     *
     * @return java.lang.String attribute of this Address.
     */
    public java.lang.String getLine2();

    /**
     * Mutator method for Line2.
     * <br>The second line (street name and number, or neighbourhood)
     *
     * @param aLine2 set java.lang.String attribute of this Address.
     */
    public void setLine2(java.lang.String aLine2);


    /**
     * The enumeration for Line2
     */
    public final static int LINE2 = 3;


    /**
     * Accessor method for Line1.
     * <br>The first line (building name and number)
     *
     * @return java.lang.String attribute of this Address.
     */
    public java.lang.String getLine1();

    /**
     * Mutator method for Line1.
     * <br>The first line (building name and number)
     *
     * @param aLine1 set java.lang.String attribute of this Address.
     */
    public void setLine1(java.lang.String aLine1);


    /**
     * The enumeration for Line1
     */
    public final static int LINE1 = 4;


    /**
     * Accessor method for Country.
     * <br>The country in which this address is
     *
     * @return Country attribute of this Address.
     */
    public Country getCountry();

    /**
     * Mutator method for Country.
     * <br>The country in which this address is
     *
     * @param aCountry set Country attribute of this Address.
     */
    public void setCountry(Country aCountry);


    /**
     * The enumeration for Country
     */
    public final static int COUNTRY = 5;





}
