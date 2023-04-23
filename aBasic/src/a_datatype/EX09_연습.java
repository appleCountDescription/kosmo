package a_datatype;

import java.util.Scanner;

public class EX09_연습
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 두 개 입력하시오.");
		int num = input.nextInt();
		int num2 = input.nextInt();
		
		int plus = num + num2;
		int minus = num - num2;
		int times = num * num2;
		double division = (num * 1.0) / (num2 * 1.0);

		System.out.println("두 수를 더한 값: " + plus);
		System.out.println("두 수를 뺀 값: " + minus);
		System.out.println("두 수를 곱한 값: " + times);
		System.out.println("두 수를 나눈 값: " + division);
	}
}