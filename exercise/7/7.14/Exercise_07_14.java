import java.util.Scanner;

/**
 *
 *  7.14
 *  (����gcd) ��дһ�����������ظ�����ȷ�������������Լ����ָ���������ͷ������ʾ��
 *  public static int gcd(int... numbers)
 *  ��д���Գ�����ʾ�û�����5�����֣����ø÷����ҳ���Щ�������Լ��������ʾ������Լ����
 *
 */
 
public class Exercise_07_14 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();
        System.out.println("The gcd is " + gcd(numbers));
    }
    
    public static int gcd(int... numbers) {
        int gcd = 1;
        int min = getMin(numbers);
        int length = numbers.length - 1;
        int count = 0;
        for (int i = 2; i <= min; i ++) {
            for (int n = 0; n <= length; n++) {
                if (numbers[n] % i == 0) {
                    count++;
                    if (count == length)
                        gcd = i;
                } else {
                    count = 0;
                }
            }                
        }
        return gcd;
    }
    
    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}