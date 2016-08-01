import java.util.*;

public class Exercise_07_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] num = new int[10];
		int in = 0, t = 0;
		
		for (int i = 0; i < num.length; i++) {
			in = input.nextInt();
			if (isDistinct(num, in)) {
				num[t] = in;
				t++;
			}
		}
		System.out.println("The number of distinct number is " + t);
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < num.length; i++)
			if (num[i] > 0)
				System.out.print(num[i] + " ");
	}
	
	public static boolean isDistinct(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return false;
			}	
		}
		return true;
		
	}
	
}