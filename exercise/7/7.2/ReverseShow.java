import java.util.*;

public class ReverseShow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] num = new int[10];
		//for (int i: num)
		for (int i = 0; i < num.length; i++)
			num[i] = input.nextInt();
		
			
		for (int i = num.length - 1; i >= 0; i--)
			System.out.print(num[i] + " ");
		
		
		
	}
	
	
}