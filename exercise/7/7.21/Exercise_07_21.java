import java.util.Scanner;
/**
 *
 *  7.21
 *  （游戏：豆机）豆机，也称为梅花瓶或高尔顿瓶，它是一个用来做统计实验的设备，是用英国科学家瑟弗兰斯高尔顿的名字来命名的。
 *  它是一个三角形状的均匀放置钉字（或钩子）的直立板子。球都是从板子口落下的。每当球碰到钉子，它就有50%的机会落向左边或落
 *  向右边。在板子底部的槽子中都会累积一堆球。
 *  编写程序模拟豆机。程序应该提示用户输入球的个数以及机器的槽数。打印第个球的路径，模拟的下落。
 *  提示：创建一个名为slots的数组。数组slots中的每个元素存储的是一个槽中球的个数。每个球都经过一条路径落入一个槽中。路径
 *  上R的个数表示球落下的槽的位置。例如：对于路径LRLRLRR而，球落入到slots[4]中，而对于路径RRLLLL而言，球落在slots[2]中。
 *
 */
 
public class Exercise_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of balls to drop: ");
        int balls = input.nextInt();
        System.out.print("Enter a nubmer of slots in the bean machine: ");
        int numOfSlots = input.nextInt();
        int[] slots = new int[numOfSlots];
        fall(balls,slots);
        printBalls(balls,slots);
    }
    public static int[] fall(int balls, int[] slots) {
        int step = 0;       
        for (int i = 0; i < balls; i++) {
            int result = 0;
            for (int j = 0; j < slots.length - 1; j++) {
                step = (int)(Math.random() * 2);
                if (step > 0) {
                    System.out.print(" R ");
                    result += 1;
                } else {
                    System.out.print(" L ");
                }
                
            }
            slots[result]++;
            System.out.println();
        }
        return slots;
    }
    public static void printBalls(int balls, int[] slots) {
        for (int i = 0; i < balls; i++) {
            for (int j = 0; j < slots.length; j++) {
                if(i + slots[j] >= balls) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" _ ");
                }                
            }
            System.out.println();
        }
    }
}