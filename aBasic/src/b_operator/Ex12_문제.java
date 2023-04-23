package b_operator;

import java.util.Scanner;

public class Ex12_문제 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("[윤년 계산기] 연도를 입력하시오.");
		int year = input.nextInt();
		
		if (year % 100 == 0  &&  year % 400 != 0) 
		{
			System.out.println("평년입니다.");
		}
		else if (year % 4 != 0)
		{
			System.out.println("평년입니다.");
		}
		else
		{
			System.out.println("윤년입니다.");
		}
	}
}