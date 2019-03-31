package practical;
/*
 * Intentionally broken, do not fix.
 */
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

public class ClickerTest {
	@Test
	public void testConstructor() {
		Clicker clicker = new Clicker(27);
		assertEquals(27, clicker.getValue());
		}
	@Test
	public void testClick() {
		Clicker clicker = new Clicker(3);
		clicker.click();
		assertEquals(4, clicker.getValue());
		clicker.click();
		assertEquals(5, clicker.getValue());
		}
	@Test
	public void testClickNegZero() {
		Clicker clicker = new Clicker(-0);
		clicker.click();
		assertEquals(1, clicker.getValue());
		clicker.click();
		assertEquals(2, clicker.getValue());
		}
	@Test
	public void testClickNeg() {
		//This is a design flaw, a clicker should not be able to count negative numbers
		Clicker clicker = new Clicker(-1);
		clicker.click();
		assertEquals(0, clicker.getValue());
		clicker.click();
		assertEquals(1, clicker.getValue());
		}
	@Test
	public void testClickUndoFromZero() {
		Clicker clicker = new Clicker(0);
		clicker.undo();
		//A clicker should not drop below zero (cannot count negative numbers)
		assertEquals(0, clicker.getValue());
		//Clicker should always start at 0, meaning -1 +1 should == 1
		clicker.click();
		assertEquals(1, clicker.getValue());
		}
	 @Test
	public void testClickBig() {
		BigInteger bigInt = new BigInteger("2147483648");
		Clicker clicker = new Clicker(2147483647);
		clicker.click();
		//Can it handle out of bounds int?
		assertEquals(bigInt, clicker.getValue());
		//after counting over boundry should return to max int value
		clicker.undo();
		assertEquals(2147483647, clicker.getValue());
		}
	
	
}