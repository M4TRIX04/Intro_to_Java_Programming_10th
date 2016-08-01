import java.util.*;

public class ReverseInt {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		
		int n = input.nextInt();
		
		System.out.println(n + " reverse into " + reverse(n));	
		
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
	
}