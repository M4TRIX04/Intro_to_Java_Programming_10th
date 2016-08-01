import java.util.*;

public class DigitPyramid {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of lines: ");
		String number = input.nextLine();
		int l = Integer.parseInt(number);
		for (int i = 1; i <= l; i++) {
			for (int x = l - i; x > 0 ; x--) {
				System.out.printf("%" + number.length() + "s ","");	
			}
			for (int y = i; y >= 1; y--) {
				System.out.printf("%" + number.length() + "d ",y);
			}
			for (int z = 1; z < i; z++) {
				System.out.printf("%" + number.length() +"d ",(z + 1));				
			}
			System.out.print("\n");
		}
	}	
}