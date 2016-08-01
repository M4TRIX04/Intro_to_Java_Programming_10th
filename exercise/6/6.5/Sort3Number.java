import java.util.*;

public class Sort3Number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		displaySortedNumbers(n1, n2, n3);
		
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double max = num1, tmp = 0;
		if (num2 < num1) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		if (num3 < num2) {
			tmp = num2;
			num2 = num3;
			num3 = tmp;		
		}
		
		System.out.println(num1 + " " + num2 + " " + num3);
		
		
	}
	
}