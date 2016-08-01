import java.util.*;

public class ComputePai {
   public static void main(String[] agrs) {
      Scanner m = new Scanner(System.in);
      System.out.print("Enter a integer for times: ");
      int n = m.nextInt();
      double a = 1.0;
      double b;
      for (int i = 1 ; i <= n; i++) {
         b = 0;
         if ((i%2) != 0) {
            b = 0-1.0/(i*2+1);
         }
         else{
            b = 1.0/(i*2+1);
         }
         a = a + b;
         //System.out.println("b = " + b);
      }
      double pai = 4 * a;
      System.out.println("P = " + pai);
   }
}