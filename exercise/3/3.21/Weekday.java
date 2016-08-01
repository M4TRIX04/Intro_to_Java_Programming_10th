import java.util.*;

public class Weekday {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2016): ");
		int year = input.nextInt();
		System.out.print("enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("enter the day of the month: 1-31: ");		
		int day = input.nextInt();
		if (month == 1) {
			month = 13;
			year -= 1;
		}
		if (month == 2) {
			month = 14;
			year -= 1;
		}
		int century = Math.abs(year / 100);
		int yearOfCentury = year % 100;
		
		int k = (day + (26 * ((month + 1)) / 10) + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
		String w = "";
		switch (k) {
			case 0: w = "Saturday";break;
			case 1: w = "Sunday";break;
			case 2: w = "Monday";break;
			case 3: w = "Tuesday";break;
			case 4: w = "Wednesday";break;
			case 5: w = "Thurday";break;
			case 6: w = "Friday";break;
		}
		System.out.println("Day of the week is " + w);
		//System.out.println(k);
		
	}
	
}