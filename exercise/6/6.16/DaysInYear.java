public class DaysInYear {
	public static void main(String[] args) {
		for (int i = 2000; i <= 2020; i++) {
			System.out.println(numberOfDaysInYear(i) + " days in " + i);
			
		}
		
	}
	
	public static int numberOfDaysInYear(int year) {
		//if( (year % 4 == 0 && year % 100 <> 0) && year % 400 == 0)
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 366 : 365 ;
	}
	
}