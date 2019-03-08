package i2p.wk2;

import java.util.Scanner;

/*
 * add a main method. 
 * Use a while loop to sum a set of values entered by the user. 
 * The loop should end immediately a negative value is provided or the sum exceeds 1024.
 * 
 */
public class Task5 {
	public static void main (String Args[]) {
		Scanner sc = new Scanner(System.in);
		int i;
		int total = 0;
		do {
			i = sc.nextInt();
			total += i;
		} while (total <= 1024 && i > 0);
		sc.close();
	}
}
