/**
 * 
 */

package test;

import java.util.Date;

import core.ReflectiveUtil;
import domain.ContactableH;
import domain.PersonH;

import interfaces.Contactable;
import interfaces.Person;
import junit.framework.TestCase;

/**
 * @author omar
 *
 */
public class ReflectiveUtilTest extends TestCase {

	/**
	 * @param name
	 */
	public ReflectiveUtilTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link core.ReflectiveUtil#hasSameValues(java.lang.Object, java.lang.Object)}.
	 */
	public final void testHasSameValues() {
		Date NOW=new Date();
		String KNOWNAS="omar";
		Contactable a=new ContactableH();
		a.setCreated(NOW);
		a.setKnownAs(KNOWNAS);
		Contactable b=new ContactableH();
		b.setCreated(NOW);
		b.setKnownAs(KNOWNAS);
		assertTrue(ReflectiveUtil.hasSameValues(a, b));
		b.setKnownAs("");
		assertFalse(ReflectiveUtil.hasSameValues(a, b));
	}

	/**
	 * Test method for {@link core.ReflectiveUtil#copyObjectFields(java.lang.Object, java.lang.Object)}.
	 */
	public final void testCopyObjectFields() {
		Date NOW=new Date();
		String KNOWNAS="omar";
		Contactable a=new ContactableH();
		a.setCreated(NOW);
		a.setKnownAs(KNOWNAS);
		Person b=new PersonH();
		ReflectiveUtil.copyObjectFields(a, b,true);
		assertTrue(b.getKnownAs().equals("omar"));
		assertTrue(b.getCreated().equals(NOW));
	}

}
