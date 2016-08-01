import java.util.Scanner;
/**
 *
 *  7.19
 *  (是否排好序了) 编写以下方法，如果参数中的list数组已经按照升序排好了，把返回true。
 *  public static boolean isSorted(int[] list)
 *  编写一个测试程序，提示用户输入一个列表，显示该列表是否已经排好序。
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