package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_성적관리2 
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students? ");
        int numStudents = input.nextInt();

        int[] korScores = new int[numStudents];
        int[] engScores = new int[numStudents];
        int[] mathScores = new int[numStudents];
        int[] totalScores = new int[numStudents];

        // Input student scores
        for (int i = 0; i < numStudents; i++) 
        {
            System.out.print((i+1) + "th student's score of kor/eng/math -> ");
            String scores = input.next();
            StringTokenizer st = new StringTokenizer(scores, "/");
            korScores[i] = Integer.parseInt(st.nextToken());
            engScores[i] = Integer.parseInt(st.nextToken());
            mathScores[i] = Integer.parseInt(st.nextToken());
            totalScores[i] = korScores[i] + engScores[i] + mathScores[i];
        }

        // Calculate and print student total and average scores
        System.out.println("[결과]");
        for (int i = 0; i < numStudents; i++) 
        {
            double avgScore = (double) totalScores[i] / 3;
            System.out.printf("%dth student total: %d, avg: %f", (i+1), totalScores[i], avgScore);
            System.out.println("");
        }

        // Calculate and print subject total and average scores
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        for (int i = 0; i < numStudents; i++) 
        {
            korTotal += korScores[i];
            engTotal += engScores[i];
            mathTotal += mathScores[i];
        }
        double korAvg = (double) korTotal / numStudents;
        double engAvg = (double) engTotal / numStudents;
        double mathAvg = (double) mathTotal / numStudents;
        System.out.println("------------------------------------------------------------");
        System.out.printf("kor total: %d, avg: %f", korTotal, korAvg);
        System.out.println("");
        System.out.printf("eng total: %d, avg: %f", engTotal, engAvg);
        System.out.println("");
        System.out.printf("math total: %d, avg: %f", mathTotal, mathAvg);
    }
}