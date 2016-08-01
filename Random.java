import java.util.*;
import java.text.*;

public class Random {
   public static void main(String[] agrs) {
      Scanner input =  new Scanner(System.in);
      //DemicalFormat df = new DemicalFormat("##");
      System.out.print("Enter a integer number for times: ");
      int n;
      n = input.nextInt();
      for (int i =1; i <= 10; i++) {
      	for (int x = 1; x <= 10 ; x++) {
        	System.out.print((10 + (int)(Math.random() * 90)) + "  ");
        	//System.out.printf("%-4d",((int)(Math.random() * (n + 1))));
        }
        System.out.printf("\n");
      }   
   }
}