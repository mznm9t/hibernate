package interfaces; 

import java.io.Serializable;

/**
 * Business Object Interface for the Audience entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Audience</strong></td><td colspan=3><em>An audience that you want to reach</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>description</td><td><em>A more detailed description of the audience</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of the audience</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Integer</td><td>size</td><td><em>The approximate size of the audience in number of people or organisations</em></td>
 *  </tr>
 * </table>
 */
public interface Audience extends BusinessObject, Serializable {

    /**
     * Accessor method for Description.
     * <br>A more detailed description of the audience
     *
     * @return java.lang.String attribute of this Audience.
     */
    public java.lang.String getDescription();

    /**
     * Mutator method for Description.
     * <br>A more detailed description of the audience
     *
     * @param aDescription set java.lang.String attribute of this Audience.
     */
    public void setDescription(java.lang.String aDescription);


    /**
     * The enumeration for Description
     */
    public final static int DESCRIPTION = 0;


    /**
     * Accessor method for Name.
     * <br>The name of the audience
     *
     * @return java.lang.String attribute of this Audience.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of the audience
     *
     * @param aName set java.lang.String attribute of this Audience.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 1;


    /**
     * Accessor method for Size.
     * <br>The approximate size of the audience in number of people or organisations
     *
     * @return java.lang.Integer attribute of this Audience.
     */
    public java.lang.Integer getSize();

    /**
     * Mutator method for Size.
     * <br>The approximate size of the audience in number of people or organisations
     *
     * @param aSize set java.lang.Integer attribute of this Audience.
     */
    public void setSize(java.lang.Integer aSize);


    /**
     * The enumeration for Size
     */
    public final static int SIZE = 2;





}
