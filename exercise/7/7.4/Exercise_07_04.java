import java.util.*;

public class Exercise_07_04 {
	public static void main(String[] args) {
		int[] counts = new int[100];
		
		System.out.print("Read scores: ");
		
		int total = 0, student = 0, up = 0, down = 0;
		long avg;
		total = count(counts);
		
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				student += counts[i];
			}
		}
		avg = total / (long)student;
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0 ) {
				if (i >= avg)
					up += 1;
				else
					down += 1;				
			}
		}
		
		System.out.println("Total: " + total);
		System.out.println("students: " + student);
		System.out.println("Average: " + avg);
		System.out.println("above avg: " + up);
		System.out.println("Under avg: " + down);
	}
	
	public static int count(int[] counts){
		Scanner input = new Scanner(System.in);
		int num, total = 0; // holds user input
		do {
			num = input.nextInt();
			if (num >= 1 && num <= 100)	
				counts[num - 1]++;
				total += num;
		} while (num >=0 );
		return total;
	}

}