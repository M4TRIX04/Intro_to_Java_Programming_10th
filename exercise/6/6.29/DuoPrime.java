public class DuoPrime {
	public static void main(String[] args) {
		for (int i = 2, n = 1; i <= 2000; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.print("(" + i + ", " + (i + 2) + ")  ");
			if (n % 5 ==0)
				System.out.println();
			n++;	
				
			}
			
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
	
}