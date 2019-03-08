package uk.ac.uos.i2p;

/**
 * This is an example class
 *
 * Feel free to play with it in the refactoring exercises,
 * but remember not to submit it if you use this project as a skeleton for your own work.
 */
public class Clicker {
	private int value;

	public Clicker(int value) {
		this.value = value;
	}

	public Clicker() {
		this(0);
	}

	public void click() {
		value = value + 1;
	}

	public void undo() {
		value = value - 1;
	}

	public int getValue() {
		return value;
	}

	public boolean isZero() {
		return value == 0;
	}

	static void checkMagic(Clicker clicker) {
		for (int i = 0; i < Main.magic.length(); ++i) {
			checkForA(clicker, i);
		}
	}

	static void checkForA(Clicker clicker, int i) {
		if (Main.magic.charAt(i) == 'a') {
			clicker.click();
		}
	}
}