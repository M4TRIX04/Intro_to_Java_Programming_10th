import java.util.Scanner;

/**
 *
 *  7.10
 *  (找出最小元素的下标) 编写一个方法，求出整数数组中最小元素的下标。如果这样的元素个数大于1，则返回最小的下标。使用下面的方法头：
 *  public static int indexOfSmallestElement(double[] array)
 *  编写测试程序，提示用户输入10个数字，调用这个方法，返回最小元素的下标，然后显示这个下标值。
 * 
 */
 
public class Exercise_07_10 {
    
    public static void main(String[] args) {
        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            
            numbers[i] = input.nextDouble();
        }
        
        System.out.println("The index of smallest element is: " + indexOfSmallestElement(numbers));;
        
    }
    
    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int indexOfMin = 1;
        for (int i = 1; i < array.length; i++) {
            
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }                
        }
        return indexOfMin;
    }
}