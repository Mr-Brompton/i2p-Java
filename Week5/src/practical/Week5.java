package practical;

import java.util.ArrayList;
import java.util.List;

public class Week5 {
		@SuppressWarnings("unused")
		private Integer[] intArray;
		private int max;
		private int min;
		private int range;
		private double mean;
		@SuppressWarnings("unused")
		private double standardDeviation;
		public double variance;
		
		public Week5(Integer[] intArray) {
			this.intArray = intArray;
			//this.max = IntegerArrayTools.max(intArray);
			//this.min = IntegerArrayTools.min(intArray);
			//this.range = IntegerArrayTools.range(intArray);
			//this.mean = IntegerArrayTools.mean(intArray);
			//this.variance = IntegerArrayTools.variance(intArray);
			//this.standardDeviation = IntegerArrayTools.standardDeviation(intArray);
		}
	public static void main(String[] args) {
		/*
		 *  TODO
		 *  -Write a method public void task1() which creates an array of integers to store the following list of integers (17, 89, 27, 11, 91, 42, 73, 90, 5, 56). 
		 *  -Use one or more loops to identify the minimum, 
		 *  -maximum, 
		 *  -range, 
		 *  - mean and 
		 *  -[not working]standard deviation of this population of numbers and output these values. 
		 *  
		 *  -Test the method by calling it from the main method and running the class as a Java Application 
		 *  
		 *  - Write a method public List<Integer> task2a() 
		 *  - using nested for loops to calculate all possible results from summing the outcomes of two six-sided dice 
		 *  - and store each result as elements in an ArrayList (it should have 36 elements) 
		 *  - then return the list. 
		 *  
		 *  - Test the method by calling it from a JUnit test case
		 *  
		 *  - Write a method public List<Integer> task2b(List<Integer> list) 
		 *  - which takes the result of task2a() 
		 *  - and collects only the distinct values, 
		 *  - then returns the results. 
		 *  
		 *  Test the method by calling it from a JUnit test casE
		 *  
		 *  Write a method public List<Integer> task2b(List<Integer> list) 
		 *  which takes the result of task2a() and collects only the distinct values, 
		 *  then returns the results. 
		 *  
		 *  Test the method by calling it from a JUnit test case
		 *  
		 *  Using multi-dimensional arrays, represent the following matrix
		 * 123
		 * 456
		 * 
		 *  Using multi-dimensional arrays and appropriate loop constructs, multiply the two matrices below
		 * 234
		 * 101
		 * 432
		 * 
		 * 535
		 * 101
		 * 323
		 * 
		 * 
		 */
		Integer[] arrayOfIntegers = {17, 89, 27, 11, 91, 42, 73, 90, 5, 56};
		Week5 week5 = new Week5(arrayOfIntegers);
		//week5.displayStats();
		week5.task2a();
		}
		
	
	// Write a method public void task1() which creates an array of integers to store the following list of integers (17, 89, 27, 11, 91, 42, 73, 90, 5, 56). 
			public void task1() {
				//Integer[] arrayOfIntegers = {17, 89, 27, 11, 91, 42, 73, 90, 5, 56};
				//Week5 week5 = new Week5(arrayOfIntegers);
				//week5.displayStats();
				
			}
			
			public void displayStats() {
				System.out.println("max: " + this.max);
				System.out.println("min: " + this.min);
				System.out.println("range: " + this.range);
				System.out.println("mean: " + this.mean);
				//System.out.println("variance: " + this.variance);
				//System.out.println("Standard Deviation: " + this.standardDeviation);
				}
			public List<Integer> task2a(){
				/*
				 * a method using nested for loops to calculate all possible results from summing the outcomes of two six-sided dice 
		 *  and store each result as elements in an ArrayList (it should have 36 elements) 
		 *  then return the list. 
				 */
				List<Integer> resultArray = new ArrayList<Integer>();
				for (int i = 1; i < 7; ++i) {
					for (int x = 1; x < 7; ++x) {
						resultArray.add(i * x);
						//System.out.println(i + " x " + x + " = " + i*x);
					}
					for (int i1 : resultArray) {
					     System.out.print(i1 + ", ");
					    }
				}
				return resultArray;
				}
			
			/**
			 * public List<Integer> task2b(List<Integer> list) 
		 *  which takes the result of task2a() 
		 *  and collects only the distinct values, 
		 *  then returns the results. 
			 */
			List<Integer> list = task2a();
			public List<Integer> task2b(List<Integer> list){
				List<Integer> distinctList = new ArrayList<Integer>();
				boolean isNumberInNewList = false;
				for (int i : list) {
					for (int x : distinctList) {
						if (list.get(i) == distinctList.get(x)) {isNumberInNewList = true;}
						if (!isNumberInNewList) {distinctList.add(list.get(i));}
					}
				}
			
				
				return distinctList;
				
				
			}
}
