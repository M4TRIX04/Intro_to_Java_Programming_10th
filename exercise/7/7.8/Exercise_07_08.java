import java.util.*;

/**
 * �����µڰ���
 *  (�������ƽ��ֵ)��д�������صķ�����ʹ������ķ���ͷ����һ�������ƽ������
 *  public static int average(int[] array)
 *  public static double average(double[] array)
 *  ��д���Գ�����ʾ�û�����10��double��ֵ���������������Ȼ����ʾƽ��ֵ��
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