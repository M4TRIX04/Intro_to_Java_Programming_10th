/**
 *
 *  7.18
 *  (ð������) ʹ��ð�������㷨��дһ�����򷽷���ð�������㷨�������鼸�Ρ���ÿ�α����У������ڵ�����Ԫ�ؽ��бȽϡ�
 *  �����һ��Ԫ���ǽ����򽻻����ǵ�ֵ�����򣬱���ֵ���䡣���ڽ�С��ֵ������һ���𽥡����򡱶�����ͬʱ�ϴ��ֵ����
 *  �򡱵ײ������ԣ����ּ�����Ϊð�����򷨣�bubble sort�������³����򷨣�sinking sort������дһ�����Գ��򣬶�ȡ10
 *  ��double�͵�ֵ���������������Ȼ����ʾ�ź�������֡�
 *
 */
 
public class Exercise_07_18 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        System.out.print("Unsort: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        int[] sorted = sort(numbers);
        
        System.out.print("Sorted: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        

    }
    
    public static int[] sort(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return  numbers;
    }
}