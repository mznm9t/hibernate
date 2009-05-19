package interfaces; 

import java.io.Serializable;

/**
 * Business Object Interface for the MappingTool entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>MappingTool</strong></td><td colspan=3><em>This entity is to provide a mapping function so values from  files can map to the values in the data model</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>externalValue</td><td><em>the value in the file for which mapping is required</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>internalValue</td><td><em>the value in the database</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>attributeName</td><td><em>the name of the attribute for which mapping is being done</em></td>
 *  </tr>
 * </table>
 */
public interface MappingTool extends BusinessObject, Serializable {

    /**
     * Accessor method for ExternalValue.
     * <br>the value in the file for which mapping is required
     *
     * @return java.lang.String attribute of this MappingTool.
     */
    public java.lang.String getExternalValue();

    /**
     * Mutator method for ExternalValue.
     * <br>the value in the file for which mapping is required
     *
     * @param aExternalValue set java.lang.String attribute of this MappingTool.
     */
    public void setExternalValue(java.lang.String aExternalValue);


    /**
     * The enumeration for ExternalValue
     */
    public final static int EXTERNALVALUE = 0;


    /**
     * Accessor method for InternalValue.
     * <br>the value in the database
     *
     * @return java.lang.String attribute of this MappingTool.
     */
    public java.lang.String getInternalValue();

    /**
     * Mutator method for InternalValue.
     * <br>the value in the database
     *
     * @param aInternalValue set java.lang.String attribute of this MappingTool.
     */
    public void setInternalValue(java.lang.String aInternalValue);


    /**
     * The enumeration for InternalValue
     */
    public final static int INTERNALVALUE = 1;


    /**
     * Accessor method for AttributeName.
     * <br>the name of the attribute for which mapping is being done
     *
     * @return java.lang.String attribute of this MappingTool.
     */
    public java.lang.String getAttributeName();

    /**
     * Mutator method for AttributeName.
     * <br>the name of the attribute for which mapping is being done
     *
     * @param aAttributeName set java.lang.String attribute of this MappingTool.
     */
    public void setAttributeName(java.lang.String aAttributeName);


    /**
     * The enumeration for AttributeName
     */
    public final static int ATTRIBUTENAME = 2;





}
