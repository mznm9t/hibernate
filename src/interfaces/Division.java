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
 * Business Object Interface for the Division entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>Division</strong></td><td colspan=3><em>A division of Savills.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of the division</em></td>
 *  </tr>
 * </table>
 */
public interface Division extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>longTextAttribute The name of the division
     *
     * @return java.lang.String attribute of this Division.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>longTextAttribute The name of the division
     *
     * @param aName set java.lang.String attribute of this Division.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;





}
