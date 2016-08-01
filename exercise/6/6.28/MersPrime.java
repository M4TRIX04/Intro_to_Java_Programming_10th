public class MersPrime {
	public static void main(String[] args) {
		
		System.out.println("p          2^p -1");
		System.out.println("----------------");
		double p = 2;
		while (p <= 31) {
			if (isPrime(Math.pow(2,p) - 1))
				System.out.println((int)p + "           " + (int)(Math.pow(2,p) - 1));
			p++;
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
	
	public static boolean isPrime(double n) {
    if (n <= 3) {
        return n > 1;
    }
    if (n % 2 == 0 || n % 3 == 0) {
        return false;
    }
 
    for (double i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
    return true;
	}
}