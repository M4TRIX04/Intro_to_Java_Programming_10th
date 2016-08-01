import java.util.*;

public class PalinPrime {
	public static void main(String[] agrs) {
		int t = 1, x = 2;
		while (t <= 100) {
			if (isPrime(x)) {
				if (isPalindrome(x)) {
					System.out.print(x +" ");
					if (t % 10 == 0)
						System.out.println();
					t++;
				}				
			}
			x++;						
		}			
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
	
	public static boolean isPrime(int n) {
    if (n <= 3) {
        return n > 1;
    }
    if (n % 2 == 0 || n % 3 == 0) {
        return false;
    }
 
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
    return true;
	}
}
	