package interfaces; 
import java.io.Serializable;

/**
 * Business Object Interface for the FeatureType entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>FeatureType</strong></td><td colspan=3><em>The type of feature: e.g. Cover Story, News Story, Property Feature and Lead Story.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of the feature type</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>code</td><td><em>A unique code</em></td>
 *  </tr>
 * </table>
 */
public interface FeatureType extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>The name of the feature type
     *
     * @return java.lang.String attribute of this FeatureType.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of the feature type
     *
     * @param aName set java.lang.String attribute of this FeatureType.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;


    /**
     * Accessor method for Code.
     * <br>A unique code
     *
     * @return java.lang.String attribute of this FeatureType.
     */
    public java.lang.String getCode();

    /**
     * Mutator method for Code.
     * <br>A unique code
     *
     * @param aCode set java.lang.String attribute of this FeatureType.
     */
    public void setCode(java.lang.String aCode);


    /**
     * The enumeration for Code
     */
    public final static int CODE = 1;





}
