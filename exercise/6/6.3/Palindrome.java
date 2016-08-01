import java.util.*;
public class Palindrome {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int n = input.nextInt();
		
		System.out.println(isPalindrome(n));
		
	}
	
	static int reverse(int n) {
		int result = 0,tmp = 0;
		while (n >= 10) {
			result += (n % 10);
			tmp = tmp * 10 + (n % 10);
			n = n / 10;			
			
		}
		tmp = tmp * 10 + (n % 10);
		return tmp;
	}
	
	static boolean isPalindrome(int n) {
		return reverse(n) == n;
		
	}
	
	
}