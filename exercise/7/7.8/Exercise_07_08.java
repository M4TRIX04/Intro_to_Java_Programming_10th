import java.util.*;

/**
 * 第七章第八题
 *  (求数组的平均值)编写两个重载的方法，使用下面的方法头返回一个数组的平均数：
 *  public static int average(int[] array)
 *  public static double average(double[] array)
 *  编写测试程序，提示用户输入10个double型值，调用这个方法，然后显示平均值。
 */

public class Exercise_07_08 {
    public static void main(String[] args) {
        
        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i ++) {
            numbers[i] = input.nextDouble();
            
        }
        
        System.out.println("The average is " + average(numbers));
        
    }
    public static int average(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }
    public static double average(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }
}