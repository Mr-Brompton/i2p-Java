package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.Clicker;

/**
 * Test Case to make sure the clicker does its job
 *
 * Note that it tests all methods with different values to make sure things actually
 * function as specified. I will be expecting this level of testing in your work.
 *
 * Feel free to play with this class in the refactoring exercises,
 * or use it as a "crib sheet" for your own tests, but remember
 * not to submit it if you use this project as a skeleton for your own work.
 */
class ClickerTest {

	@Test
	void testDefaultConstructor() {
		Clicker clicker = new Clicker();
		assertEquals(0, clicker.getValue(), "clicker should default to zero");
	}

	@Test
	void testExplicitConstructor() {
		Clicker clicker = new Clicker(27);
		assertEquals(27, clicker.getValue(), "clicker should start at supplied value");

		clicker = new Clicker(13);
		assertEquals(13, clicker.getValue(), "clicker should start at supplied value");
	}

	@Test
	void testClick() {
		Clicker clicker = new Clicker();

		clicker.click();
		assertEquals(1, clicker.getValue(), "should be 1 after one click");

		clicker.click();
		assertEquals(2, clicker.getValue(), "should be 2 after two clicks");
	}

	@Test
	void testUndo() {
		Clicker clicker = new Clicker();

		clicker.click();
		assertEquals(1, clicker.getValue(), "should be 1 after one click");

		clicker.undo();
		assertEquals(0, clicker.getValue(), "should be back to 0 after undo");
	}

	@Test
	void testIsZero() {
		Clicker clicker = new Clicker();
		assertTrue(clicker.isZero());

		clicker.click();
		assertFalse(clicker.isZero());

		clicker.undo();
		assertTrue(clicker.isZero());
	}
}
