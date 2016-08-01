import java.util.*;

public class FtoC {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double cDegree = input.nextDouble();
		//double fDegree = (9.0/5) * cDegree + 32;
		System.out.println(cDegree + " Celsius is " + ((9.0/5) * cDegree + 32) + " Fahrenheit");
		
	}
}