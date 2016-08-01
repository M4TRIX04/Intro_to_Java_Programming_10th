import java.util.*;

public class DigiSum {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int a = number % 10;
		int b = (number / 10) % 10;
		int c = number / 100;
		int sum = a + b + c;
		System.out.println("The sum of the digits is " + sum);
		
	}
}