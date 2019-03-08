package main.java;

import main.resource.Nouns;
import main.resource.Opening;

public class Main {

	public static void main(String[] args) {
		/* 1
		 * Uses greeting constructor to create a greeting object.
		 */
		int randomA = (int) (Math.random()*10);
		int randomB = (int) (Math.random()*10);
		Greeting greeting = new Greeting(Opening.iJustNeedAnOpening[randomA], Nouns.giveMeANoun[randomB]);
		/*2
		 * call attribute from the greeting object to print the greeting.
		 * This section will call method from the greeting class to refresh the greeting.
		 * Then it will ask if you would like to run the program again
		 * if yes the greeting will be refreshed and we loop back to step two.
		 * if no program says farewell, closes and exits. 
		 */
		System.out.println(greeting.sayHi);
		
	}

}
