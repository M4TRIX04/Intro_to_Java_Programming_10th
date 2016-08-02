/**
 *
 *  7.22
 *  ����Ϸ���˻ʺ󣩾���İ˻ʺ�������Ҫװ�˸��ʺ���������ϣ��κ������ʺ󶼲��ܻ��๥������û�������ʺ�����ͬһ�У�ͬһ��
 *  ��ͬһ�Խ��ϣ������� �Ľ�������кܶࡣ��д������ʾһ�������Ľ��������
 *
 */
 
public class Exercise_07_22 {
    public static void main(String[] args) {
        int[][] grid = new int[8][8];
        int realQueen = 1;
        int count = 0;
        int countQueen = 0;
        int x = 0;
        int y = 0;
        long startTime = System.currentTimeMillis();
        while (countQueen < 8) {
            x = getPosition();
            y = getPosition();
            
            if (allClear(grid,x,y)) {
                grid[x][y] = realQueen;
                System.out.print("(" + x + "," + y + ")");
                countQueen++;
                count++;
            }
            long checkTime = System.currentTimeMillis();
            if (checkTime - startTime > 50) {
                clearGrid(grid);
                countQueen = 0;
                startTime = System.currentTimeMillis();
            }
            
        }
        System.out.println();
        System.out.println("Grids: " + count);
        System.out.println();
        //System.out.println("countQueen: " + countQueen);
        showQueens(grid);
    }
    
    public static int getPosition() {
        return (int)(Math.random() * 8);
    }
    
    public static boolean allClear(int[][] grid, int x, int y) {
        return (vSafe(grid, x, y) && hSafe(grid, x, y) && xSafe(grid, x, y));
    }
    
    public static boolean vSafe(int[][] grid, int x, int y) {
        for (int i = 0; i < 8; i++) {
            if (grid[x][i] == 1) return false;
        }
        return true;
    }
    
    public static boolean hSafe(int[][] grid, int x, int y) {
        for (int i = 0; i < 8; i++) {
            if (grid[i][y] == 1) return false;
        }
        return true;
    }
    
    public static boolean xSafe(int[][] grid, int x, int y) {
        int x1 = x;
        int y1 = y;
        while (x1 >= 0 && y1 >= 0) {
            if (grid[x1][y1] == 1) return false;
            x1--;
            y1--;
        } 
        x1 = x;
        y1 = y;
        while (x1 < 8 && y1 >= 0) {
            if (grid[x1][y1] == 1) return false;
            x1++;
            y1--;
        } 
        x1 = x;
        y1 = y;
        while (x1 < 8 && y1 < 8) {
            if (grid[x1][y1] == 1) return false;
            x1++;
            y1++;
        } 
        x1 = x;
        y1 = y;
        while (x1 >=0 && y1 < 8) {
            if (grid[x1][y1] == 1) return false;
            x1--;
            y1++;
        } 
        return true;
    }
    public static void showQueens(int[][] grid) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%-1c|", (grid[i][j]) == 1 ? 'Q' : '_');
            }
            System.out.println();
        }
    }
    public static void clearGrid(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {

            for (int k = 0; k < grid[i].length; k++) {
                grid[k][i] = 0;
            }
        }

    }
    
}