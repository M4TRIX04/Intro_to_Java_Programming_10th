import java.util.Scanner;
/**
 *
 *  7.11
 *  (统计学方面：计算标准差) 编程练习题5.45计算数字的标准差。本题使用一个和它不同但等价的公式来计算n个数的标准差。
 *  要用这个公式计算标准差，必须使用一个数据存储每一个数，因此，可以在猎取平均值后使用它们。
 *  程序应该包含下面的方法：
 *  public static double deviation(double[] x)
 *  public static double mean(double[] x)
 *  编写测试程序，提示用户输入10个数字，然后显示平均值和标准差。
 *
 */
 
 public class Exercise_07_11 {
     
     public static void main(String[] args) {
         double[] numbers = new double[10];
         Scanner input = new Scanner(System.in);
         System.out.print("Enter ten numbers: ");
         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = input.nextDouble();
             
         }
         
         System.out.println("The mean is " + mean(numbers));
         System.out.println("The standard deviation is " + deviation(numbers));
         
     }
     
     public static double deviation(double[] x) {
        double mean = mean(x);
        double deviation = 0;
        for (int i = 0; i < x.length; i++) {
            deviation += Math.pow(x[i] - mean, 2);
            
        }
        return Math.sqrt(deviation / (x.length - 1));
     }
     
     public static double mean(double[] x) {
         double total = 0;
         for (int i = 0; i < x.length; i++) {
             total += x[i];
             
         }
         return total / x.length;
     }
 }
 