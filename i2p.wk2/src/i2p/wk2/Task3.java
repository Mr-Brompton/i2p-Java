package i2p.wk2;

public class Task3 {
	static double area;
	public static double areaOfCircle(double radius) {
		double rad = radius*radius;
		area = Math.PI*rad;		
		System.out.println( "The circle's area is " + area + ".");
		double roundedArea = Math. round(area * 100.0) / 100.0;
		System.out.println( "Rounded to " + roundedArea + ".");
		return roundedArea;
	}
	public static double areaOfquad(double length, double height) {
		area = length*height;
		System.out.println( "The quad's area is " + area + ".");
		return area;
	}
	public static double areaOftriangle(double length, double height) {
		area = length*height/2;
		System.out.println( "The triangle's area is " + area + ".");
		return area;
	}
/*
 *
 * Now add another method, 
 * which has a first parameter of a single character (T=triangle, S=square, R=rectangle, C=circle) 
 * and enough extra parameters for the dimensions. 
 * This method should select and call the appropriate method from above and pass the parameters through. 
 * Choose a sensible name for your new method. 
 * Write JUnit tests to check your new method with different shapes and different values.
 *
 */
public static double checkShape(char shape, int height, int length, int radius) {
	double lastArea;
	switch (shape) {
	case 'T': lastArea = areaOftriangle(length, height);
		break;
	case 'S': lastArea = areaOfquad(length, height);
	break;
	case 'R': lastArea = areaOfquad(length, height);
	break;
	case 'C': lastArea = areaOfCircle(radius);
	break;
	
	default: lastArea = 0;
	}
	return lastArea;
}
	
}
