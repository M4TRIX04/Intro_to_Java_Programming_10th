import java.util.*;

public class Dec2Bin {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		
		String bin = "";
		
		while (decimal != 0) {
			int binValue = decimal % 2;
			char binDigit = (char)(binValue + '0');
			System.out.println(binValue + '0');
			System.out.println(binDigit);
			bin = binDigit + bin;
			decimal = decimal / 2;
			
		}
		
		System.out.println("The binary number is " + bin);
	}
}