import java.util.*;

public class MySqrt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		long number = input.nextLong();
		
		System.out.println("sqrt(" + number + ") = " + sqrt(number));
		
	}
	
	public static double sqrt(long n) {
		double lastGuess = 9.0, nextGuess;
		
		while (true) {
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if ((lastGuess - nextGuess) < 0.000001)
				break;
			lastGuess = nextGuess;
			
		} 
		
		return nextGuess;
		
	}
	
}