import java.util.*;

public class Demo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		
		String c = input.nextLine();
		
		int n = c.length();
		
		System.out.println("length: " + n);
		
		for (int i = 0; i < n; i++) {
			//if (pass.charAt(i) <= ('a' + 0) || pass.charAt(i) >= ('z' + 0) || pass.charAt(i) <= ('0' + 0) || pass.charAt(i) <= ('0' + 0))
				System.out.println(c.charAt(i));
			
		}
		System.out.println("0 = " + ('0' + 0));
		System.out.println("c.charAt(1) = " + (c.charAt(1) + 0));
		
	}
		
}