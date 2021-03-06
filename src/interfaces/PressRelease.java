package interfaces; 

import java.io.Serializable;

/**
 * Business Object Interface for the PressRelease entity.
 *
 * <table>
 *  <tr>
 *   <td colspan=2><strong>PressRelease</strong></td><td colspan=3><em>A specific release covering a particular story with specific words</em></td>
 *  </tr>
 *  <tr>
 *   <td>&nbsp;</td><td>&nbsp;</td><td>Story</td><td>story</td><td><em>Which story is this press release related to?</em></td>
 *  </tr>
 * </table>
 */
public interface PressRelease extends BusinessObject, Asset, Serializable {




    /**
     * Accessor method for Story.
     * <br>Which story is this press release related to?
     *
     * @return Story attribute of this PressRelease.
     */
    public Story getStory();

    /**
     * Mutator method for Story.
     * <br>Which story is this press release related to?
     *
     * @param aStory set Story attribute of this PressRelease.
     */
    public void setStory(Story aStory);


    /**
     * The enumeration for Story
     */
    public final static int STORY = 0;





}
