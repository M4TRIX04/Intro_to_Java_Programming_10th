import java.util.Scanner;
/**
 *
 *  7.20
 *  (修改选择排序法)在7.11节中，使用的是选择排序法对数组排序。选择排序法重复地在当前数组中找到最小值，然后将这个最小值与该
 *  数组中的第一个数据进行交换。改写这个程序，重复地在当前数组中找到最大值，然后将这个最大值与该数组中的最后一个数进行交换。
 *  编写测试程序，读取10个double型数字，调用该方法，然后显示排好序的数据。
 *
 */
public class Exercise_07_20 {
    public static void main(String[] agrs) {
        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) 
            numbers[i] = input.nextDouble();
        System.out.println();
        System.out.println("The sorted numbers is:");
        double[] sortedNumbers = SelectionSort(numbers);
        for (int j = 0; j < sortedNumbers.length; j++) {
            System.out.print(sortedNumbers[j] + " ");
        }
        System.out.println();
    }
    
    public static double[] SelectionSort(double[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            double currentMax = list[i];
            int currentMaxIndex = i;
               
            for (int j = i - 1; j >= 0; j--) {
                if (list[j] > currentMax)  {
                    currentMax = list[j];
                    currentMaxIndex = j;
                        
                }
            }
                
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
        return list;
     }
 }