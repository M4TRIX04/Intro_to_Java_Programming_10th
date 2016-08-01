public class PrintASCII {
	public static void main(String[] agrs) {
		for (int i = (int)'!', n = 1; i <= (int)'~'; i++, n++) {
			
			System.out.print((char)(i) + " ");	
			
			if (n % 10 == 0)
				System.out.print("\n");
		}
	}
}