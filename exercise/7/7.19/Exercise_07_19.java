import java.util.Scanner;
/**
 *
 *  7.19
 *  (�Ƿ��ź�����) ��д���·�������������е�list�����Ѿ����������ź��ˣ��ѷ���true��
 *  public static boolean isSorted(int[] list)
 *  ��дһ�����Գ�����ʾ�û�����һ���б���ʾ���б��Ƿ��Ѿ��ź���
 *
 */
 
public class Exercise_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the list: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        if (isSorted(list))
            System.out.println("Sorted.");
        else
            System.out.println("Unsorted.");
    }
    
    public static boolean isSorted(int[] list) {
        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[i -1])
                return false;
                
        }
        return true;
    }
}