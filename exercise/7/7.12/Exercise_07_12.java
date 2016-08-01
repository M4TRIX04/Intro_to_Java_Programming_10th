import java.util.Scanner;
/**
 *
 *  7.12
 *  (倒置数组) 7.7节中的reverse方法通过把数组复制到新数组中实现数组的倒置。改写针传递到实参的数组倒置，然后返回这个数组。
 *  编写一个测试程序，提示用户输入十个数字，调用这个方法倒置这些数字，然后显示这些数字。
 *
 */
 
public class Exercise_07_12 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            
        }
        
        reverse(numbers);
    } 
    
    public static void reverse(int[] array) {
        System.out.print("The reversed result is: ");
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i-1] +" ");
        }
        
    }
}