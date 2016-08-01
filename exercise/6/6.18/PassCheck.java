import java.util.*;

public class PassCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		
		String c = input.nextLine();
		
		System.out.println(Check(c) ? "Valid Password" : "Invalid Password");
		
	}
	
	public static boolean Check(String pass) {
		int n = pass.length();
		
		if (n < 8)
			return false;
			
		for (int i = 0; i < n; i++) {
			if (pass.charAt(i) < ('A' + 0) && pass.charAt(i) > ('Z' + 0) || pass.charAt(i) < ('a' + 0) && pass.charAt(i) > ('z' + 0) || pass.charAt(i) < ('0' + 0) && pass.charAt(i) < ('9' + 0))
				return false;
			
		}
		
		int num = 0;
		for (int i = 0; i < n; i++) {
			if (pass.charAt(i) >= ('0' + 0) && pass.charAt(i) <= ('9' + 0))
				num += 1;
			
		}
		
		if (num < 2)
			return false;
			
		return true;
		
	}
	
}