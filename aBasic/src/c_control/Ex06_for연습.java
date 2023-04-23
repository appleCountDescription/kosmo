package c_control;

import java.util.Scanner;

public class Ex06_for연습 {
	
	public static void main(String[] args) {
		
		/*
		 *  문제 1) 1~N까지의 숫자를 다음처럼 출력하라
		 *  1 2 3 4 5
		 *  6 7 8 9 10
		 *  11 12 13 14 15
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		int N = input.nextInt();
		
		for(int i=1; i<=N; i++)		// i값이 5의 배수인 경우 한 줄 개행
		{
			System.out.print(i + " ");
			if(i % 5 == 0)
			{
				System.out.println("");
			}
		}
		
	}

}
