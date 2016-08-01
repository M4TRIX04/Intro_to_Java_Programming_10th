import java.util.*;

public class Feet2Meter {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feets: ");
		double feet = input.nextDouble();
		double meter = feet * 0.305;
		System.out.print(feet + " feet is " + meter + " meters.");
	
		
	}
}