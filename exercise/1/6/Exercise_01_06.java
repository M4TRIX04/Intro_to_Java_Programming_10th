public class Exercise_01_06 {
  public static void main(String[] args) {
    System.out.println("1 + 2 + 3 +...+ 9 = " + sumIt(9));
  }
  
  public static int sumIt(int a) {
    int sum = 0;
    for (int i = 1; i <= a; i++) {
      sum += i;
    }
    return sum;
  }
} 