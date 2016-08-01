import java.util.*;

public class DisplayTime {
   public static void main(String[] agrs) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an Integer Seconds: ");
      int seconds = input.nextInt();
      int minutes = seconds / 60;
      int remainingSeconds = seconds % 60;
      System.out.println(seconds + " seconds is " + minutes + " minutes and " +
        remainingSeconds + " seconds.");
   }
}