/**
 *
 *  7.16 (linearSearch)
 *  
 */
 
public class Exercise_07_16 {
    public static void main(String[]  args) {
        long startTime = System.currentTimeMillis();
        int[] list = createList();
        int theKey = key(list);
        
        int at = linearSearch(list, theKey);
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
    
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }            
        }
        return -1;
    }
    
}