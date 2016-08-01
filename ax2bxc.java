import java.util.*;

public class ax2bxc {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double r1 = 0;
		double r2 = 0;
		double key = (b * b) - (4 * a * c);
		if (key < 0) {
			System.out.println("The equantion has no real roots");
		}
		if (key == 0) {
			r1 = (Math.pow(key,0.5) - b) / (2 * a);
			System.out.println("The equation has one root " + r1);
		}
		if (key > 0) {
			r1 = (Math.pow(key,0.5) - b) / (2 * a);
			r2 = (-(Math.pow(key,0.5)) - b) / (2 * a);
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
	}
}