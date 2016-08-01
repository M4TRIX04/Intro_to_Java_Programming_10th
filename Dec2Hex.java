import java.util.*;

public class Dec2Hex {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int n = input.nextLine();
		
		if (n < 0 || n > 15) {
			System.out.println("You must enter exactly value");
			System.exit(1);
		}
				
		if (n > 9) {
			char value = (char)(55 + n);
			System.out.println("The hex value " + value);
		}
		else {
			System.out.println("The hex value " + n);
		}
	}
}