package practical;

public class Task4 {
	public int[] input;
	public int biggest;
	public int smallest;
	public Task4(int[] input) {
		this.input = input;
		this.smallest = getSmallest(input);
		this.biggest = getbBiggest(input);
	}
	private int getbBiggest(int[] input) {
		int biggestInt = 0;
		int i = 0;
		do {
			
			if (input[i] > biggestInt) {biggestInt = input[i];}
			i++;
		} while (i < input.length);
		
		return biggestInt;
	}
	private int getSmallest(int[] input) {
		int smallestInt = 2147483647;
		int i = 0;
		do {
			if (input[i] < smallestInt && input[i] > -1) {smallestInt = input[i];}
			i++;
		} while (i < input.length);
		
		return smallestInt;
	}
	public static void main(String[] args) {
		Task4 task4 = new Task4(ConsoleInput.positiveIntegerArray());
		System.out.println(task4.biggest);
		System.out.println(task4.smallest);
	}
}













/*
public class Task4 {
	public int biggest;
	public int smallest;
	
	public Task4(int smallest, int biggest) {
		this.smallest = smallest;
		this.biggest = biggest;
		FindSmallestAndLargest();
		PrintSmallestAndLargest();
	}

	private void PrintSmallestAndLargest() {
		 System.out.println("Smallest: " + smallest + "\nBiggest: " + biggest);		
	}

	private String FindSmallestAndLargest(InputStream in,PrintStream out) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(in);
		int biggest = 0;
		int smallest = 2147483647;
		out.println("Enter first number, exit input with -1");
		
		int i;
		do {
			out.println("Enter next number, exit input with -1");
			i = sc.nextInt();
			if (i > biggest) {biggest = i;}
			if (i < smallest && i > 0) {smallest = i;}
		} while (i >= 0);
		
	    
	    sc.close();
		return "Smallest: " + smallest + "\nBiggest: " + biggest;

		/*
		 * In this method use a do while loop to read numbers from the user 
		 * and find the smallest and the largest values. 
		 * The loop should end when the user provides the value -1 
		 * and the final minimum and maximum values should be printed after the loop ends
		 * 
		 
		
	}

	*/   

