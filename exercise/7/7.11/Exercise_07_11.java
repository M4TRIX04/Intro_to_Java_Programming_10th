import java.util.Scanner;
/**
 *
 *  7.11
 *  (ͳ��ѧ���棺�����׼��) �����ϰ��5.45�������ֵı�׼�����ʹ��һ��������ͬ���ȼ۵Ĺ�ʽ������n�����ı�׼�
 *  Ҫ�������ʽ�����׼�����ʹ��һ�����ݴ洢ÿһ��������ˣ���������ȡƽ��ֵ��ʹ�����ǡ�
 *  ����Ӧ�ð�������ķ�����
 *  public static double deviation(double[] x)
 *  public static double mean(double[] x)
 *  ��д���Գ�����ʾ�û�����10�����֣�Ȼ����ʾƽ��ֵ�ͱ�׼�
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
 