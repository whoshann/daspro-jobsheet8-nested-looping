package jobsheet10;

import java.util.Scanner;

public class GroupScore17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int score = 0;
        float avgScore;

        while (i <= 6) {
            System.out.println("Input Grades For Group " + i);

            float totalScore = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Input grades (1-100) score from rater group " + j + " = ");
                score = input.nextInt();
                totalScore += score;
            }
            avgScore = (totalScore / 5);
            System.out.println("Average grades of group " + i + " : " + avgScore);
            i++;
        }

    }
}