import java.util.Scanner;
/**
 *  (�ҳ���СԪ��)��дһ��������ʹ�����淽��ͷ���һ��������������СԪ�أ�
 *  public static double min(double[] array)
 *  ��д���Գ�����ʾ�û�����ʮ�����֣������������������Сֵ����ʾ����Сֵ��
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

