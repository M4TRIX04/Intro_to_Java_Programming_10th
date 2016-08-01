public class PrimeNumber {
	public static void main(String[] agrs) {
		final int NUBMER_OF_PRIMES = 500;
		final int NUBMER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		
		System.out.println("The first 50 prime nubmers are \n");
		
		while (count < NUBMER_OF_PRIMES) {
			
			if (isPrime(number)){
				count++;
				
				if (count % NUBMER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);	
				}
				else {
					System.out.print(number + " ");
				}
			}
			number++;
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