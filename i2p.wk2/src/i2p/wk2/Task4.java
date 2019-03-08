package i2p.wk2;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * In this method use a do while loop to read numbers from the user 
		 * and find the smallest and the largest values. 
		 * The loop should end when the user provides the value -1 
		 * and the final minimum and maximum values should be printed after the loop ends
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int biggest = 0;
		int smallest = 2147483647;
		
		int i;
		do {
			i = sc.nextInt();
			if (i > biggest) {biggest = i;}
			if (i < smallest && i > 0) {smallest = i;}
		} while (i >= 0);
		
	    System.out.println("Smallest: " + smallest + "\nBiggest: " + biggest);
	    
	    sc.close();
	}

}
