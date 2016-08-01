import java.util.*;

public class FutureInv {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double rate = input.nextDouble();
		
		double monthlyRate = (rate/100)/12;
		
		System.out.println("Years    Future Value");
		
		for (int i = 1; i <= 30; i++) {
			
			System.out.println(i + "      " + futureInvestmentValue(amount, monthlyRate, i));
			
		}
		
		
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		
		return investmentAmount * Math.pow((1 + monthlyInterestRate),years * 12);
		
	}
	
}