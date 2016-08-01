import java.util.*;

public class PointIn {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double dis = Math.pow((x * x + y * y),0.5);
		if (dis <= 10) 
			System.out.println("Point (" + x +" , " + y + ") is in the circle.");
		else
			System.out.println("Point (" + x +" , " + y + ") is NOT in the circle.");
	}
}