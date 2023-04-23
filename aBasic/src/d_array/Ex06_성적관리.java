package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_성적관리 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("학생 수를 입력하세요.");
		int numStudent = input.nextInt();
		input.nextLine();
		
		int n = 0;
		
		int total = 0;
		double avg = 0.0;
		
		int [] kor = new int[numStudent];
		int [] eng = new int[numStudent];
		int [] math = new int[numStudent];
		
		int korTotal = 0;
		double korAvg = (double)korTotal/3; 
		int engTotal = 0;
		double engAvg = (double)engTotal/3; 
		int mathTotal = 0;
		double mathAvg = (double)mathTotal/3; 

		for(int i=0; i<numStudent; i++)	
		{		
			System.out.println(i + 1 + "째 학생의 성적을 입력 -> ");
			String score = input.nextLine();
			StringTokenizer st = new StringTokenizer(score, "/");
			// 40/50/60
			for(int j=0; st.hasMoreTokens(); j++)
			{
				kor[j] = Integer.parseInt(st.nextToken());
				eng[j] = Integer.parseInt(st.nextToken());
				math[j] = Integer.parseInt(st.nextToken());
				
				total = kor[j] + eng[j] + math[j];
				avg = (double)total / 3;		
				
				
				
				
				if(j==4)
				{
					System.out.println("국어과목 총점 " + korTotal + "이고 평균은 " + avg + "입니다");
				}
			}
			
		}		
	}
}


// System.out.println(k + 1 + "째 학생의 총점 " + total + "이고 평균은 " + avg + "입니다");
// System.out.println("국어과목 총점 " + korTotal + "이고 평균은 " + avg + "입니다");