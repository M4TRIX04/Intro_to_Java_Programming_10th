import java.util.*;

public class ClassABCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of students: ");
		int s = input.nextInt();
		
		int[] scrs = new int[s];
		System.out.print("Enter " + s + " scores: ");
		for (int i = 0; i < s; i++) {
			//System.out.print("Enter a scores for No." + (i + 1) + ": ");
			scrs[i] = input.nextInt();
				
		}
			
		int max = scrs[0];
		for (int i = 1; i < scrs.length; i++)
			if (scrs[i] > max)
				max = scrs[i];
				
		for (int i = 0; i < scrs.length; i++) {
			System.out.println("Student " + (i + 1) + " score is " + scrs[i] + " and grade is " + Grade(scrs[i],max));
		
		}
			
		//System.out.println(max);
		
			
	}
	
	public static String Grade(int a, int max) {
		if (a >= (max - 10))
			return "A";
		else if (a >= (max - 20))
			return "B";
		else if (a >= (max - 30))
			return "C";
		else if (a >= (max - 40))
			return "D";
		else
			return "F";
		
		
	}
	
}