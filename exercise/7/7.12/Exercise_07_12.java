import java.util.Scanner;
/**
 *
 *  7.12
 *  (��������) 7.7���е�reverse����ͨ�������鸴�Ƶ���������ʵ������ĵ��á���д�봫�ݵ�ʵ�ε����鵹�ã�Ȼ�󷵻�������顣
 *  ��дһ�����Գ�����ʾ�û�����ʮ�����֣������������������Щ���֣�Ȼ����ʾ��Щ���֡�
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