package practical;

import java.math.BigInteger;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput;
		BigInteger[] twenty1Powers = new BigInteger[22];
		System.out.println("Please enter a positive Integer...");
		userInput = sc.nextInt();
		if (userInput < 0) {
			System.out.println("Don't be so negative! Try something a little more positive...");
			userInput = sc.nextInt();
		}
		
		else if(userInput >= 0) {
			//some code goes here.
			//write to display first 21 powers of userInput
			BigInteger i1, i2;
			String userInputString = String.valueOf(userInput);
			i1 = new BigInteger(userInputString);
			for (int i = 0; i<=21; i++) {
				int exponent = i;
				i2 = i1.pow(exponent);
				twenty1Powers[i] = i2;
				System.out.println(twenty1Powers[i]);
			}
		}
		else {System.out.println("Erm... something went wrong, are you sure that was a number?");}
		
		sc.close();

	}

}
