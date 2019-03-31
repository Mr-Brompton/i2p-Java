package practical;
//---! STANDARD DEVIATION !---
public class Task1 {
	Integer[] myArray = {17, 89, 27, 11, 91, 42, 73, 90, 5, 56};
	int min;
	int max;
	int accTotal;
	int count;
	//following values must be assigned after for loop
	int range;
	int mean;
	public Task1() {
		this.min = Integer.MAX_VALUE;
		this.max = Integer.MIN_VALUE;
		this.accTotal = 0;
		this.count = 0;
		calculate(myArray);
	}
	private void calculate(Integer[] myArray2) {
		// (int i : myArray) throws out of bounds exception
		for (int index = 0; index < myArray.length; index++)/*(int index : myArray)*/ {
			if(myArray[index] < min) {min = myArray[index];}
			if(myArray[index] > max) {max = myArray[index];}
			accTotal += myArray[index];
			count++;	
		}
		range = max - min;
		mean = accTotal / count;
	}
	public void task1() {

		//outputs to console
		System.out.println("min: " + this.min);
		System.out.println("max: " + this.max);
		System.out.println("range: " + this.range);
		System.out.println("mean: " + this.mean);
	}
}
