/**
 *
 *  7.16
 *  (ִ��ʱ��) �����������100000������ֵ��һ���ؼ��֡�����һ�µ��ó����嵥7-6�е�linearSearch����ִ��ʱ�䡣
 *  �Ը������������Ȼ�������ó����嵥7-7�е�binarySearch������ִ��ʱ�䡣����ʹ������Ĵ���ģ���ȡִ��ʱ�䣺
 *  long statrTime = System.currentTimeMillis();
 *  perform the task;
 *  long endTime = System.crrentTimeMillis();
 *  long executionTime = endTime - statrTime;
 *
 */
 
public class Exercise_07_16 {
    public static void main(String[]  args) {
        
        int[] list = createList();
        int theKey = key(list);
        
        long startTime = System.currentTimeMillis();
        int at = binarySearch(list, theKey);        
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("====BinarySearch====");
        System.out.println("The key is: " + theKey + ", at " + at + " in array");
        System.out.println("    StartTime: " + startTime);
        System.out.println("      EndTime: " + endTime);
        System.out.println("ExecutionTime: " + executionTime);
        
        System.out.println();
        
        startTime = System.currentTimeMillis();
        at = linearSearch(list, theKey);        
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("====LinearSearch====");
        System.out.println("The key is: " + theKey + ", at " + at + " in array");
        System.out.println("    StartTime: " + startTime);
        System.out.println("      EndTime: " + endTime);
        System.out.println("ExecutionTime: " + executionTime);
    }
    
    public static int[] createList() {
        int[] list = new int[10000000];
        for (int i = 0; i < list.length; i++)
            list[i] = (int)(Math.random()*10000000);
        return list;
    }
    
    public static int key(int[] list) {
        return list[(int)(Math.random()*10000000) + 1];   
    }
    
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }            
        }
        return -1;
    }
    
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }
}