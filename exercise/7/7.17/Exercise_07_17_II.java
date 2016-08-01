import java.util.Scanner;

public class Exercise_07_17_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int[] score = new int[n];
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student #" + (i + 1) + "'s name: ");
            name[i] = input.next();
            System.out.print("Enter student #" + (i + 1) + "'s score: ");
            score[i] = input.nextInt();
        }
        sort(score,name);
    }
    
    public static void sort(int[] score, String[] name) {
        int tempScore = 0;
        String tempName = "";
        for (int i = 0; i < score.length; i++) {
            for (int n = i + 1; n < score.length; n++) {
                if (score[n] > score[i]) {
                    tempScore = score[n];
                    score[n] = score[i];
                    score[i] = tempScore;
                    tempName = name[n];
                    name[n] = name[i];
                    name[i] = tempName;
                }
            }
        }
        for (int j = 0; j < score.length; j++) {
            System.out.println("Student: " + name[j] + " , Score: " + score[j]);
        }
    }
    
    
}