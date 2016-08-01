public class ReservePrime {
	public static void main(String[] args) {
		int x = 1, y = 2;
		while (x <= 100) {
			if (isPrime(y) && isPrime(reverse(y))) {
				System.out.print(y + " ");
			if (x % 10 ==0)
				System.out.println();
				x++;
			}
			y++;
			
		}
		
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