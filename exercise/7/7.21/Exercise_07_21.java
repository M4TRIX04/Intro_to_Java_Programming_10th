import java.util.Scanner;
/**
 *
 *  7.21
 *  ����Ϸ��������������Ҳ��Ϊ÷��ƿ��߶���ƿ������һ��������ͳ��ʵ����豸������Ӣ����ѧ��ɪ����˹�߶��ٵ������������ġ�
 *  ����һ��������״�ľ��ȷ��ö��֣����ӣ���ֱ�����ӡ����ǴӰ��ӿ����µġ�ÿ�����������ӣ�������50%�Ļ���������߻���
 *  ���ұߡ��ڰ��ӵײ��Ĳ����ж����ۻ�һ����
 *  ��д����ģ�ⶹ��������Ӧ����ʾ�û�������ĸ����Լ������Ĳ�������ӡ�ڸ����·����ģ������䡣
 *  ��ʾ������һ����Ϊslots�����顣����slots�е�ÿ��Ԫ�ش洢����һ��������ĸ�����ÿ���򶼾���һ��·������һ�����С�·��
 *  ��R�ĸ�����ʾ�����µĲ۵�λ�á����磺����·��LRLRLRR���������뵽slots[4]�У�������·��RRLLLL���ԣ�������slots[2]�С�
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