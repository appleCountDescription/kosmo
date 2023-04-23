package b_operator;

import java.util.Scanner;

public class Ex13_도전 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하시오.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
//		if (a > b && a > c)
//		{
//			System.out.println(a + "이(가) 가장 큰 수입니다.");
//		}
//		else if (b > a && b > c)
//		{
//			System.out.println(b + "이(가) 가장 큰 수입니다.");
//		}
//		else if (c > a && c > b)
//		{
//			System.out.println(c + "이(가) 가장 큰 수입니다.");
//		}
		
		int highest = (a>b && a>c)? a : ((b>c)? b : c);
		System.out.println(highest + "이(가) 가장 큰 수입니다.");
	}
}