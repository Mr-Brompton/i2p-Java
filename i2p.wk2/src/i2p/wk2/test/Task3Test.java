package i2p.wk2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import i2p.wk2.Task3;

class Task3Test {

	@Test
	@DisplayName("Test Triangle Area")
	void testTArea() {
		assertEquals(7.5, Task3.checkShape('T', 5, 3, 0), "Area of Triangle wrong. Should be 7.5");
	}
	@Test
	@DisplayName("Test Square Area")
	void testSArea() {
		assertEquals(25, Task3.checkShape('S', 5, 5, 0), "Area of Square wrong. Should be 25");
	}
	@Test
	@DisplayName("Test Rectangle Area")
	void testRArea() {
		assertEquals(15, Task3.checkShape('R', 5, 3, 0), "Area of rectangle wrong. Should be 15");
	}
	@Test
	@DisplayName("Test Circle Area")
	void testCArea() {
		assertEquals(28.27, Task3.checkShape('C', 0, 0, 3), "Area of Circle wrong. Should be 28.27");
	}

}
