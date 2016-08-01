import java.util.Scanner;

/**
 *
 *  7.10
 *  (�ҳ���СԪ�ص��±�) ��дһ�����������������������СԪ�ص��±ꡣ���������Ԫ�ظ�������1���򷵻���С���±ꡣʹ������ķ���ͷ��
 *  public static int indexOfSmallestElement(double[] array)
 *  ��д���Գ�����ʾ�û�����10�����֣��������������������СԪ�ص��±꣬Ȼ����ʾ����±�ֵ��
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