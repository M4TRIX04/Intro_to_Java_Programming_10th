/**
 *
 *  7.23
 *  （游戏：储物柜难题）一个学校有100个储物柜和100个学生。所有的储物柜在上学第一天都是关着的。随着学生进来，第一个学生（用）打开
 *  每个柜子。然后，第二个学生（用S2表示）从第二个柜子（用L2表示 ）开始，关闭相隔为1的柜子。学生S3从第三个柜子开始，然后改变每个
 *  第三个柜子（如果它是开的就关上，如果它是关的就打开）。学生S4从柜子L4开始，然后改变每个第四个柜子的开闭状态。学生S5从L5开始，
 *  然后改变每个第五个柜子的状态，依此类推，直到学生S100改变L100为止。
 *  提示：使用存放100个布尔型元素的数组，每个元素都表明一个柜子的是开的（true）还是关的（false）。初始状态时，所有柜子都是关的。
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