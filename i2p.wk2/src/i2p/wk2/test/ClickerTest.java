package i2p.wk2.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import i2p.wk2.Clicker;

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
}