import java.util.*;

public class ShowPattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for lines: ");
		int l = input.nextInt();
		
		displayPattern(l);
		
		
	}
	
	public static void displayPattern(int l) {	
		
		for (int i = 1; i <= l; i++) {
			for (int x = l - i; x > 0 ; x--) {
				System.out.print("  ");	
			}
			for (int y = i; y >= 1; y--) {
				System.out.print(y + " ");
			}
			System.out.print("\n");
		}
		
		
		
	}
	
}