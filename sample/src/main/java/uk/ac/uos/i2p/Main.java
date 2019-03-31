package uk.ac.uos.i2p;

public class Main {

	/**
	 * This is the "entry point" to your application.
	 *
	 * When you "run" your project as a "Java Application" it starts here.
	 *
	 * This is just example code.
	 *
	 * If you use this project as a skeleton for your own work, you will need to
	 * replace the contents of this method with something which uses your own classes.
	 */
	public static void main(String[] args) {
		final String magic = "abracadabra";

		Clicker clicker = new Clicker();
		for (int i = 0; i < magic.length(); ++i) {
			if (magic.charAt(i) == 'a') {
				clicker.click();
			}
		}

		System.out.println("the word '" + magic + "' contains the letter 'a' " +
				clicker.getValue() + " times");
	}
}
