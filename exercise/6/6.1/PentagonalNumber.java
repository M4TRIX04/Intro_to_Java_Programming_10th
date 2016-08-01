import java.util.*;

public class PentagonalNumber {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		for (int i =1 ; i <= n; i++) {
			System.out.printf("%5d ",getPentagonalNumber(i));
			if (i % 5 == 0)
				System.out.println();
		}		
	}
	
	public static int getPentagonalNumber(int n) {
		int pn = (n * (n * 3 - 1)) / 2;
		return pn;	
	}
}