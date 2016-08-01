import java.util.Scanner;
/**
 *
 *  7.20
 *  (�޸�ѡ������)��7.11���У�ʹ�õ���ѡ�����򷨶���������ѡ�������ظ����ڵ�ǰ�������ҵ���Сֵ��Ȼ�������Сֵ���
 *  �����еĵ�һ�����ݽ��н�������д��������ظ����ڵ�ǰ�������ҵ����ֵ��Ȼ��������ֵ��������е����һ�������н�����
 *  ��д���Գ��򣬶�ȡ10��double�����֣����ø÷�����Ȼ����ʾ�ź�������ݡ�
 *
 */
public class Exercise_07_20 {
    public static void main(String[] agrs) {
        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) 
            numbers[i] = input.nextDouble();
        System.out.println();
        System.out.println("The sorted numbers is:");
        double[] sortedNumbers = SelectionSort(numbers);
        for (int j = 0; j < sortedNumbers.length; j++) {
            System.out.print(sortedNumbers[j] + " ");
        }
        System.out.println();
    }
    
    public static double[] SelectionSort(double[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            double currentMax = list[i];
            int currentMaxIndex = i;
               
            for (int j = i - 1; j >= 0; j--) {
                if (list[j] > currentMax)  {
                    currentMax = list[j];
                    currentMaxIndex = j;
                        
                }
            }
                
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
        return list;
     }
 }