package practical;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInput {
	public static int[] positiveIntegerArray() {
		ArrayList<Integer> userArray = new ArrayList<Integer>();
		Integer i = 0;
		Integer exit = -1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter number, exit input with -1");
			i = sc.nextInt();
			userArray.add(i);
		} while (i != exit);
		sc.close();
		
		int arrayLength = userArray.size();
		int[] userPositiveInts = new int[arrayLength];
		for (int x = 0; x < arrayLength; x++) {
			userPositiveInts[x] = userArray.get(x);
		}
		return userPositiveInts;
		
	}
	/*used for testing
	public static void main(String[] args) {
		int[] testArray = ConsoleInput.positiveIntegerArray();
		for(int i = 0; i < testArray.length; i++) {
			System.out.println(testArray[i]);
		}
	*/	

	}

