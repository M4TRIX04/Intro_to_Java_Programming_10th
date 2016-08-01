public class Exercise_07_07 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            
            counts[(int)(Math.random()*10)]++;
            
        }
        for (int n = 0; n < 10; n++) {
            
            System.out.println(n + ": " + counts[n]);
            
        }
        
    }
    
    
}