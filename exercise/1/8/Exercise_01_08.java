public class Exercise_01_08 {
  public static void main(String[] args) {
    double C = getC(5.5);
    double S = getS(5.5);
    
    System.out.println("r = 5.5, C = " + C);
    System.out.println("r = 5.5, S = " + S);
  }
  
  public static double getC(double r) {
    return 2 * r * 3.1415;
  }
  
  public static double getS(double r) {
    return r * r * 3.1415;
  }
}