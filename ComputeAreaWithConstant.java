import java.util.*;
public class ComputeAreaWithConstant {
   public static void main(String[] agrs) {
      final double PI = 3.14159;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number for radius:");
      double r = input.nextDouble();
      double area = r * r * PI;
      System.out.println("The area for the circle of radius " + r + " is " + area);
   }
}