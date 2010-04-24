package com.fpdsavills.pr.interfaces; 

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import com.inon.websuite.datamanager.runtime.business.BusinessObject;
import java.io.Serializable;

/**
 * Business Object Interface for the ContactEventType entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>ContactEventType</strong></td><td colspan=3><em>The type of event - email, letter, phone etc.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of this type - typically Email, Telephone, etc.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>code</td><td><em>A unique code for this type - E for email, T for telephone, L for letter, F for fax, etc.</em></td>
 *  </tr>
 * </table>
 */
public interface ContactEventType extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>The name of this type - typically Email, Telephone, etc.
     *
     * @return java.lang.String attribute of this ContactEventType.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of this type - typically Email, Telephone, etc.
     *
     * @param aName set java.lang.String attribute of this ContactEventType.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;


    /**
     * Accessor method for Code.
     * <br>A unique code for this type - E for email, T for telephone, L for letter, F for fax, etc.
     *
     * @return java.lang.String attribute of this ContactEventType.
     */
    public java.lang.String getCode();

    /**
     * Mutator method for Code.
     * <br>A unique code for this type - E for email, T for telephone, L for letter, F for fax, etc.
     *
     * @param aCode set java.lang.String attribute of this ContactEventType.
     */
    public void setCode(java.lang.String aCode);


    /**
     * The enumeration for Code
     */
    public final static int CODE = 1;





}
