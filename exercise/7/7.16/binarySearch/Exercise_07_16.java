/**
 *
 *  7.16 (BinarySearch)
 *  
 */
 
public class Exercise_07_16 {
    public static void main(String[]  args) {
        long startTime = System.currentTimeMillis();
        int[] list = createList();
        int theKey = key(list);
        
        int at = binarySearch(list, theKey);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("The key is: " + theKey + ", at " + at + " in array");
        System.out.println("    StartTime: " + startTime);
        System.out.println("      EndTime: " + endTime);
        System.out.println("ExecutionTime: " + executionTime);
    }
    public static int[] createList() {
        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++)
            list[i] = (int)(Math.random()*100000);
        return list;
    }
    
    public static int key(int[] list) {
        return list[(int)(Math.random()*100000) + 1];   
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