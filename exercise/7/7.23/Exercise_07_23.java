/**
 *
 *  7.23
 *  ����Ϸ����������⣩һ��ѧУ��100��������100��ѧ�������еĴ��������ѧ��һ�춼�ǹ��ŵġ�����ѧ����������һ��ѧ�����ã���
 *  ÿ�����ӡ�Ȼ�󣬵ڶ���ѧ������S2��ʾ���ӵڶ������ӣ���L2��ʾ ����ʼ���ر����Ϊ1�Ĺ��ӡ�ѧ��S3�ӵ��������ӿ�ʼ��Ȼ��ı�ÿ��
 *  ���������ӣ�������ǿ��ľ͹��ϣ�������ǹصľʹ򿪣���ѧ��S4�ӹ���L4��ʼ��Ȼ��ı�ÿ�����ĸ����ӵĿ���״̬��ѧ��S5��L5��ʼ��
 *  Ȼ��ı�ÿ����������ӵ�״̬���������ƣ�ֱ��ѧ��S100�ı�L100Ϊֹ��
 *  ��ʾ��ʹ�ô��100��������Ԫ�ص����飬ÿ��Ԫ�ض�����һ�����ӵ��ǿ��ģ�true�����ǹصģ�false������ʼ״̬ʱ�����й��Ӷ��ǹصġ�
 *
 */
 
public class Exercise_07_23 {
    public static void main(String[] args) {
        boolean[] box = new boolean[100];
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j += i) {
                change(box,j - 1);
            }
        }
        printBoxes(box);
    }
    public static void  change(boolean[] box, int n) {
        box[n] = !box[n];
    }
    public static void printBoxes(boolean[] box) {
        for (int n = 1; n <= 100; n++) {
            System.out.printf("%-1c|", (box[n - 1] ? 'O' : '_'));
            if (n % 10 == 0)
                System.out.println();
        }
        
    } 
}