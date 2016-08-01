import java.util.Scanner;
/**
 *
 *  7.13
 *  (随机数选择器) 编写一个方法，返回一个 1 至 54 之间的随机数，不包括传递到参数中的numbers。如下指定这个方法头：
 *  public static int getRandom(int... nubmers)
 *
 */
 
public class Exercise_07_13 {
    
    static final int SIZE = 10;
    public static void main(String[] args) {

        int[] numbers = new int[SIZE];
        //int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers to exclude from random (1-54): ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextInt();
        //for (int i = 0; i < 20; i++) 
            System.out.println("Number generated: " + getRandom(numbers));
    }

    public static int getRandom(int... numbers) {

        int random = (int)(Math.random() * 54 + 1);
        for (int i = 0; i < numbers.length; i++) {
            if (random == numbers[i]) {
                random = (int)(Math.random() * 54 + 1);
                i = -1;  //重置循环
            }
        }
        return random;
    }
    
}