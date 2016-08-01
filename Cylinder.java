import java.util.*;
import java.text.*;

public class Cylinder {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius * radius * 3.14159;
		double volume = radius * radius * 3.14159 * length;
		//DecimalFormat df = new DecimalFormat("#.00");
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("The area is " + df.format(area));
		System.out.println("The volume is " + df.format(volume));
	}
}