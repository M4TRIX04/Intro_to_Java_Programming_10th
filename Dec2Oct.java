import java.util.*;

public class Dec2Oct {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		
		String oct = "";
		
		while (decimal != 0) {
			int octValue = decimal % 8;
			char octDigit = (char)(octValue + '0');
			//System.out.println(binValue + '0');
			//System.out.println(binDigit);
			oct = octDigit + oct;
			decimal = decimal / 8;
			
		}
		
		System.out.println("The Octal number is " + oct);
	}
}