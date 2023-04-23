package d_array;

import java.util.Scanner;

public class Ex02_성적 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("학생 수를 입력하세요 => ");
		int num = input.nextInt();
		
		int total = 0;
		double avg = 0;
		int [] kor = new int[num];
		
		for(int i=0; i<num; i++)	// i < kor.length 이렇게 해도 됨
		{
			System.out.println(i + "번 학생의 국어점수를 입력하시오.");
			kor[i] = input.nextInt();
			total += kor[i];
			avg = (double)total / num;
		}
		System.out.println("총점: " + total);	
		System.out.print("평균: " + avg);
	}
}
