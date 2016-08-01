/**
 *
 *  7.18
 *  (冒泡排序) 使用冒泡排序算法编写一个排序方法。冒泡排序算法遍历数组几次。在每次遍历中，对相邻的两个元素进行比较。
 *  如果这一对元素是降序，则交换它们的值；否则，保持值不变。由于较小的值像气泡一样逐渐“浮向”顶部，同时较大的值“沉
 *  向”底部，所以，这种技术称为冒泡排序法（bubble sort）或者下沉排序法（sinking sort）。编写一个测试程序，读取10
 *  个double型的值，调用这个方法，然后显示排好序的数字。
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