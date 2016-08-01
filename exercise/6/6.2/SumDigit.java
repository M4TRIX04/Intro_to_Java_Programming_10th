import java.util.*;

public class SumDigit {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		
		long n = input.nextLong();
		
		System.out.println(n + "'s digit sum is " + sumDigit(n));
		
		
	}
	static long sumDigit(long n) {
		long result = 0;
		while (n >= 10) {
			result += (n % 10);
			n = n / 10;
						
		}
		result += n;
		return result;
		
	}
	
	
}