package e_method;

import java.util.Scanner;

public class Ex08_성적관리2 	//전부 다 지역변수로 잡기
							//인자, 리턴값
{
	
	public static void main(String[] args) 
	{	
		int [] subject = input();
		double avg = calc(subject);
		output(avg);
	}
	
	//국영수 점수 입력
	static int [] input()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력하시오.");
		int kor = input.nextInt();
		System.out.println("영어점수를 입력하시오.");
		int eng = input.nextInt();
		System.out.println("수학점수를 입력하시오.");
		int math = input.nextInt();
		int [] subject = {kor, eng, math};
		return subject;
	}
	
	//총점, 평균 구해서 출력
	static double calc(int [] subject)
	{
		int total = 0;
		double avg = 0.0;
		for(int i=0; i<subject.length; i++)
		{
			total += subject[i];
		}
		avg = (double)total / 3;
		System.out.printf("총점: %d, 평균: %f", total, avg);
		System.out.println("");
		return avg;
	}
	
	//평균값을 받아서 학점을 구해서 출력
	static void output(double avg)
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
