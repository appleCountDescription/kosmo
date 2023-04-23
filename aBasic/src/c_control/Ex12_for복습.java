package c_control;

/*
 * 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램
 * 
 * 	입력
 * 	3 4
 *  출력
 *  1 2 3 4 
 *  2 4 6 8
 *  3 6 9 12
 * 
 */

import java.util.Scanner;

public class Ex12_for복습 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("입력");
		int row = input.nextInt();
		int col = input.nextInt();
	
		System.out.println("출력");
		for(int i = 1; i<=row; i++)	// i: 행
		{
			for(int j = 1; j<=col; j++)	// j: 열
			{
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
	}
	
}
