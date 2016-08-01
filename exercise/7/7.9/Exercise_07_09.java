import java.util.Scanner;
/**
 *  (找出最小元素)编写一个方法，使用下面方法头求出一个整数数组中最小元素：
 *  public static double min(double[] array)
 *  编写测试程序，提示用户输入十个数字，调用这个方法返回最小值，显示其最小值。
 */

public class Exercise_07_09 {
    
    public static void main(String[] args) {
        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        
        System.out.println("The minimum number is " + min(numbers));
        
    } 
    public static double min(double[] array) {
        
        double min  = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) 
                min = array[i];
            
        }
        return min;
        
        
    }
}

