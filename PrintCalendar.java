public class PrintCalendar {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter full year (e.g., 2016): ");
		int year = input.nextInt();
		
		System.out.print("Enter month as a number between 1 and 12: ");
		int month = input.nextInt();
		
		printCalendar(year, month);
		
	}
	
	public static void printCalendar(int year, int month) {
		System.out.print(month + "  " + year);
	}
	
	public static void printMonthTitle(int year, int month) {
		
	}
	
	public static void printMonthBody(int year, int month) {
		
	}
	
	public static String getMonthName(int month) {
		return "January";
	}
	
	public static int getStartDay(int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}
	
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		for (int = 1800; i < year; i++)
			if (isLeapYear(i))
				total += 366;
			else
				total += 365;
				
		for (i = 1; i < month; i++)
			total += getNumberOfDaysInMonth(year, i);
		
		return total;
	}
	
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month  ==11)
			return 30;
		if (month == 2) 
			return isLeapYear(year) ? 29 : 28;
		return 0;
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 ==0 && year % 100 !=0);
	}
}