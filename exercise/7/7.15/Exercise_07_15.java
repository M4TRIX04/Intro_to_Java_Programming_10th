import java.util.Scanner;
/**
 *
 *  7.15
 *  (�����ظ�) ʹ������ķ���ͷ��д�����������������ظ����ֵ�ֵ��
 *  public static in[] eliminateDuplicates(int[] list)
 *  ��дһ�����Գ��򣬶�ȡ10�����������ø÷�����Ȼ����ʾ�����
 *
 */
 
public class Exercise_07_15 {
    public static void main(String[] args) {
        int[] list = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        int[] dupList = eliminateDuplicates(list);
        for (int m = 0; m < dupList.length; m++)
            System.out.print(dupList[m] + " ");
    }
    
    public static int[] eliminateDuplicates(int[] list) {

        int[] temp = new int[list.length];
        int tempIndex = 0;
        for (int i = 0; i < list.length; i++) {

            boolean isDuplicate = false;
            for (int k = 0; k < list.length; k++) {
                if (temp[k] == list[i]) {
                    isDuplicate = true;

                }
            }
            if (!isDuplicate) {
                temp[tempIndex++] = list[i];
            }

        }
        int[] trimmedArray = new int[tempIndex];
        for (int i = 0; i < tempIndex; i++) {
            trimmedArray[i] = temp[i];
        }

        return trimmedArray;
    }
}