package i2p.wk2;

public class Task7 {

	public static void main(String[] args) {
		// TODO Use a nested for loop to display the times tables from 1x1 to 12x12
		for (int i = 1; i < 13; i++) {
			for (int x = 1; x < 13; x++) {
				int result = i*x;
				
				System.out.println(i + " x " + x + " = " + result);
				
			}	
		}
	}

}
