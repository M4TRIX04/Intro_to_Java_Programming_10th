import java.util.*;

public class CreditCard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		String cardNumber = input.nextLine();
		//int l = cardNumber.length;
		//long number = Long.parseLong(cardNumber);
		System.out.println("Card Brand is " + cardBrand(cardNumber));
		System.out.println("sumOfDoubleEvenPlace is " + sumOfDoubleEvenPlace(cardNumber));
		System.out.println("sumOfOddPlace is " + sumOfOddPlace(cardNumber));
		if (isValid(cardNumber))  
			System.out.println(cardNumber + " is valid");
		else
			System.out.println(cardNumber + " is invalid");
		
	}
	
	public static boolean isValid(String cardNumber) {
		int l = cardNumber.length();
		if (l == 13 || l == 16)
			return true;
		if (prefixMatched(cardNumber))
			return true;
		if ((sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber)) % 10 != 0)
			return true;
		
		return false;
	}
	
	//public static int getDigit(int number) 
	
	public static int sumOfDoubleEvenPlace(String cardNumber) {
		int sum = 0, num = 0, tmp = 0;
		for (int i = 0; i < cardNumber.length(); i += 2) {
			num = cardNumber.charAt(i) - '0';
			if (num * 2 >= 10) {
				tmp = (num * 2) % 10;
				num = (num * 2) / 10 + tmp;
			} else {
			 num = num * 2;	
				
			}
			sum += num;
		}
		return sum;
	}
			
	public static int sumOfOddPlace(String cardNumber) {
		int sum = 0, num = 0, tmp = 0;
		for (int i = 1; i < cardNumber.length(); i += 2) {
			num = cardNumber.charAt(i) - '0';
			sum += num;
		}
		return sum;
	}
	
	public static boolean prefixMatched(String cardNumber) {
		char prefix = cardNumber.charAt(0);
		if (prefix == '4' || prefix == '5' || prefix == '6' || cardNumber.startsWith("37"))
			return true;
		else		
		 return false;
		
	}
	
	public static String cardBrand(String cardNumber) {
		char prefix = cardNumber.charAt(0);
		if (prefix == '4')
			return "Visa";
		else if (prefix == '5')
			return "Master";
		else if (prefix == '6')
			return "Discover";
		else if (cardNumber.startsWith("37"))
			return "American Express";
		else
			return "Unknow";
		
	}
	
}