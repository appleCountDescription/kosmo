package d_array;

/*
 * 5명의 국어점수를 입력하세요
 * (입력예시: 10/10/10/10/10) => 
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02_성적2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("학생 수를 입력하세요");
		int num = input.nextInt();
		int total = 0;
		double avg = 0;
		int [] kor = new int[num];

		
		System.out.println("x명의 국어점수를 입력하세요");
		input.nextLine();
		String score = input.nextLine();
				// score = "55/66/75/69/72"
		StringTokenizer st = new StringTokenizer(score, "/");
		for(int i=0; st.hasMoreTokens(); i++)
		{
			kor[i] = Integer.parseInt(st.nextToken());
			total += kor[i];
			avg = (double)total / num;
		}
		
		System.out.println("총점: " + total);	
		System.out.print("평균: " + avg);
	}
}
