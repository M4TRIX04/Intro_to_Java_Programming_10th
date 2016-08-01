import java.util.*;

public class Demo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] n = new int[9];
		
		System.out.print("Enter 9 numbers: ");
		
		for (int i = 0; i < n.length; i++)
			n[i] = input.nextInt();
			
		System.out.println(isUnique(n) ? "Yes" : "No");
		
	}	
	
	public static boolean isUnique(int[] n){
		for (int i = 0; i < n.length; i++)
			if (isUnique(i,n))
				return false;
				
		return true;
		
		
	}	
	
	
	public static boolean isUnique(int a, int[] n) {
		for (int i = 0; i < n.length; i++)
			if (i != a && n[i] == n[a])
				return false;
		
		return true;
		
		
	}

}