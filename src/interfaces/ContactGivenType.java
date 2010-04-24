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
 * Business Object Interface for the ContactGivenType entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>ContactGivenType</strong></td><td colspan=3><em>A contact given type.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>The name of this contact given type</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Boolean</td><td>website</td><td><em>Any website available.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Boolean</td><td>telephone</td><td><em>Is telephone available.</em></td>
 *  </tr>
 * </table>
 */
public interface ContactGivenType extends BusinessObject, Serializable {

    /**
     * Accessor method for Name.
     * <br>The name of this contact given type
     *
     * @return java.lang.String attribute of this ContactGivenType.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>The name of this contact given type
     *
     * @param aName set java.lang.String attribute of this ContactGivenType.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 0;


    /**
     * Accessor method for Website.
     * <br>Any website available.
     *
     * @return java.lang.Boolean attribute of this ContactGivenType.
     */
    public java.lang.Boolean getWebsite();

    /**
     * Mutator method for Website.
     * <br>Any website available.
     *
     * @param aWebsite set java.lang.Boolean attribute of this ContactGivenType.
     */
    public void setWebsite(java.lang.Boolean aWebsite);


    /**
     * The enumeration for Website
     */
    public final static int WEBSITE = 1;


    /**
     * Accessor method for Telephone.
     * <br>Is telephone available.
     *
     * @return java.lang.Boolean attribute of this ContactGivenType.
     */
    public java.lang.Boolean getTelephone();

    /**
     * Mutator method for Telephone.
     * <br>Is telephone available.
     *
     * @param aTelephone set java.lang.Boolean attribute of this ContactGivenType.
     */
    public void setTelephone(java.lang.Boolean aTelephone);


    /**
     * The enumeration for Telephone
     */
    public final static int TELEPHONE = 2;





}
