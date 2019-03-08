package i2p.wk2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import i2p.wk2.Task2;

class Task2Test {

	@Test
		 @DisplayName("Building and checking task2")
	public void testConstructorA() {
		Task2 task2 = new Task2(1, 2);
		int a = task2.a;
		assertEquals(1, a, "First integer was Incorrect");
		}
	public void testConstructorB() {
		Task2 task2 = new Task2(1, 2);
		int a = task2.b;
		assertEquals(2, a, "Second integer was Incorrect");
		}
	
	@Test
		@DisplayName("Test ints are sorted into ascending order. Should be 1, 2")
	public void testOrder1() {
		@SuppressWarnings("unused")
		Task2 task2 = new Task2(1,2);
		int a = Task2.sortedValues[0];
		int b = Task2.sortedValues[1];
		assertEquals(1, a, "First sorted value was incorrect");	
		assertEquals(2, b, "Second sorted value was incorrect");
	}
	@Test
	@DisplayName("Test ints are sorted into ascending order. Should be 4, 9")
public void testOrder2() {
	@SuppressWarnings("unused")
	Task2 task2 = new Task2(9, 4);
	int a = Task2.sortedValues[0];
	int b = Task2.sortedValues[1];
	assertEquals(4, a, "First sorted value was incorrect");	
	assertEquals(9, b, "Second sorted value was incorrect");
}
	@Test
	@DisplayName("Test single int returned when equal. Should be 1")
	public void testEqual() {
		String result = Task2.sort(1, 1);
		assertEquals("1.", result, "value incorrect when input equal");
	}
}
