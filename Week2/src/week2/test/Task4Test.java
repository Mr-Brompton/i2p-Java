package week2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practical.Task4;

class Task4Test {

	@Test
	void test() {
		int[] input = {0,1,2,3,4,5};
		Task4 task4 = new Task4(input);
		assertEquals(task4.biggest, 5, "Test biggest, should be 5");
	}
	@Test
	void test1() {
		int[] input = {0,1,2,3,4,5};
		Task4 task4 = new Task4(input);
		assertEquals(task4.smallest, 0, "Test Smallest should be 0");
	}
	

}
