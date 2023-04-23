package e_method;

import java.util.Scanner;

public class Ex08_성적관리 
{
	//멤버변수
	static int kor, eng, math;
	static int total;
	static double avg;
	
	public static void main(String[] args) 
	{
		input();
		calc();
		output();
	}
	
	//국영수 점수 입력
	static void input()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력하시오.");
		kor = input.nextInt();
		System.out.println("영어점수를 입력하시오.");
		eng = input.nextInt();
		System.out.println("수학점수를 입력하시오.");
		math = input.nextInt();
	}
	
	//총점, 평균 구해서 출력
	static void calc()
	{
		total = kor + eng + math;
		avg = (double)total/3;
		System.out.printf("총점: %d, 평균: %f", total, avg);
		System.out.println();
	}
	
	//평균값을 받아서 학점을 구해서 출력
	static void output()
	{
		System.out.print("학점: ");
		if(avg>=90) 
			System.out.println('A');
		else if(avg>=80)
			System.out.println('B');
		else if(avg>=70)
			System.out.println('C');
		else if(avg>=60)
			System.out.println('D');
		else
			System.out.println('F');
	}
	
}
