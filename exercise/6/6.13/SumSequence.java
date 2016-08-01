public class SumSequence {
	public static void main(String[] args) {
		System.out.println("i      m(i)");
		System.out.println("-----------");
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "      " + Sequence(i));
			
		}
		
	}
	
	public static double Sequence(int n) {
		double sum = 0;
		for (int i = 1; i <= n ; i++) {
			sum += (i / (i + 1.0));
			
		}
		return sum;
		
	}
	
}