package practical;
/* Task 2
 *  Add a method which takes two integers and returns them in ascending order in a String. 
 *  if the numbers are equal, the program should just return one value. 
 *  Use an If else construct for this. 
 *  Hint: you can join strings together with “+”.Write and run JUnit tests to check your method with different values
 *
 *	!!I would like to rewrite this, I'm kind of using two half solutions mashed together. A better approach would be to just create a SortedInts class, and return an instance of SortedInts.
 */
public class Task2 {
	public int a;
	public int b;
    public static int[] sortedValues = new int[2];
    
    
    
	public Task2(int valueA, int valueB) { 
		//construct attributes
		this.a = valueA;
		this.b = valueB;
		sort(valueA, valueB);
	}
	
	
	
	
	public static String sort(int a, int b) {	
		String sortedIntsAsString;
		if ( a > b ) {
			sortedValues[0] = b;
			sortedValues[1] = a;
		}
		else if( b > a ) {
			sortedValues[0] = a;
			sortedValues[1] = b;
		}
		else if ( a == b ) {
			sortedValues[0] = a;
			sortedValues[1] = b;
			System.out.println("Numbers are the same");
		}
		else {
		System.out.println("ERRORCODE: fU84r\nSomething went wrong, numbers not set");
		}
		if (sortedValues[0] == sortedValues[1]) {
			sortedIntsAsString = sortedValues[0] + ".";
		}
		else {
			sortedIntsAsString = sortedValues[0] + ", " + sortedValues[1];
		}
		return sortedIntsAsString;
	}
	
}
