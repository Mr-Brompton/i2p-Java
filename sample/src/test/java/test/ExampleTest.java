package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.Clicker;

/**
 * Examples of common assertions used in tests
 *
 * Feel free to play with this class in the refactoring exercises,
 * or use it as a "crib sheet" for your own tests, but remember
 * not to submit it if you use this project as a skeleton for your own work.
 *
 * @see https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
 */
class ExampleTest {

	@Test
	void testBasicMaths() {
		// usage: assertEquals(expected value, actual value, message if it fails)
		assertEquals(4, 2+2, "two plus two should be 4");
	}

	@Test
	void testNotNull() {
		Clicker clicker = new Clicker();

		// usage: assertNotNull(value, message if it fails)
		assertNotNull(clicker, "clicker should not be null");
	}

	@Test
	void testTrueFalse() {
		Clicker clicker = new Clicker();

		// usage: assertTrue(value, message if it fails)
		assertTrue(clicker.isZero(), "clicker should be zero");

		clicker.click();

		// usage: assertFalse(value, message if it fails)
		assertFalse(clicker.isZero(), "clicker should not be zero after click");
	}
}
