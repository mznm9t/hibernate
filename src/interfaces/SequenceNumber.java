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
 * Business Object Interface for the SequenceNumber entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>SequenceNumber</strong></td><td colspan=3><em>A generated sequence number, with a name, format and latest value.</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>description</td><td><em>&nbsp;</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>lastString</td><td><em>&nbsp;</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Integer</td><td>last</td><td><em>&nbsp;</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.Integer</td><td>digits</td><td><em>&nbsp;</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>prefix</td><td><em>&nbsp;</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>suffix</td><td><em>&nbsp;</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>java.lang.String</td><td>name</td><td><em>&nbsp;</em></td>
 *  </tr>
 * </table>
 */
public interface SequenceNumber extends BusinessObject, Serializable {

    /**
     * Accessor method for Description.
     * <br>longTextAttribute 
     *
     * @return java.lang.String attribute of this SequenceNumber.
     */
    public java.lang.String getDescription();

    /**
     * Mutator method for Description.
     * <br>longTextAttribute 
     *
     * @param aDescription set java.lang.String attribute of this SequenceNumber.
     */
    public void setDescription(java.lang.String aDescription);


    /**
     * The enumeration for Description
     */
    public final static int DESCRIPTION = 0;


    /**
     * Accessor method for LastString.
     * <br>
     *
     * @return java.lang.String attribute of this SequenceNumber.
     */
    public java.lang.String getLastString();

    /**
     * Mutator method for LastString.
     * <br>
     *
     * @param aLastString set java.lang.String attribute of this SequenceNumber.
     */
    public void setLastString(java.lang.String aLastString);


    /**
     * The enumeration for LastString
     */
    public final static int LASTSTRING = 1;


    /**
     * Accessor method for Last.
     * <br>
     *
     * @return java.lang.Integer attribute of this SequenceNumber.
     */
    public java.lang.Integer getLast();

    /**
     * Mutator method for Last.
     * <br>
     *
     * @param aLast set java.lang.Integer attribute of this SequenceNumber.
     */
    public void setLast(java.lang.Integer aLast);


    /**
     * The enumeration for Last
     */
    public final static int LAST = 2;


    /**
     * Accessor method for Digits.
     * <br>
     *
     * @return java.lang.Integer attribute of this SequenceNumber.
     */
    public java.lang.Integer getDigits();

    /**
     * Mutator method for Digits.
     * <br>
     *
     * @param aDigits set java.lang.Integer attribute of this SequenceNumber.
     */
    public void setDigits(java.lang.Integer aDigits);


    /**
     * The enumeration for Digits
     */
    public final static int DIGITS = 3;


    /**
     * Accessor method for Prefix.
     * <br>
     *
     * @return java.lang.String attribute of this SequenceNumber.
     */
    public java.lang.String getPrefix();

    /**
     * Mutator method for Prefix.
     * <br>
     *
     * @param aPrefix set java.lang.String attribute of this SequenceNumber.
     */
    public void setPrefix(java.lang.String aPrefix);


    /**
     * The enumeration for Prefix
     */
    public final static int PREFIX = 4;


    /**
     * Accessor method for Suffix.
     * <br>
     *
     * @return java.lang.String attribute of this SequenceNumber.
     */
    public java.lang.String getSuffix();

    /**
     * Mutator method for Suffix.
     * <br>
     *
     * @param aSuffix set java.lang.String attribute of this SequenceNumber.
     */
    public void setSuffix(java.lang.String aSuffix);


    /**
     * The enumeration for Suffix
     */
    public final static int SUFFIX = 5;


    /**
     * Accessor method for Name.
     * <br>
     *
     * @return java.lang.String attribute of this SequenceNumber.
     */
    public java.lang.String getName();

    /**
     * Mutator method for Name.
     * <br>
     *
     * @param aName set java.lang.String attribute of this SequenceNumber.
     */
    public void setName(java.lang.String aName);


    /**
     * The enumeration for Name
     */
    public final static int NAME = 6;





}
