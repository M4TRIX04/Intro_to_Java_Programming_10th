public class Dice {
	public static void main(String[] args) {
		
		int result = roll();
		if (result == 7 || result == 11) {
			System.out.println("You win");
			
		} else if (result == 2 || result == 3 || result == 12) {
			System.out.println("You lost");
			
		} else if (result == 4 || result == 5 || result == 6 || result == 8 || result == 9 || result == 10) {
			System.out.println("Point is " + result);
			while (true) {
				int result2 = roll();
				System.out.println("Point is " + result2);
				
				if (result2 == 7) {
					System.out.println("You lost");
					System.exit(1); 
					
				}
				if (result2 == result) {
					System.out.println("You win");
					System.exit(1);
					
				}
				
				
				
			} 
			
			
			
		}
		
		
		
	}
	
	public static int dice1() {
		
		return (1 + (int)(Math.random() * 6));
		
	}
	
	public static int dice2() {
		return (1 + (int)(Math.random() * 6));
		
	}
	
	public static int roll() {
		int d1 = dice1();
		int d2 = dice1();
		
		int sum = d1 + d2;
		System.out.println("You rolled " + d1 + " + " + d2 + " = " + sum);
		
		return sum;
		
	} 
	
}