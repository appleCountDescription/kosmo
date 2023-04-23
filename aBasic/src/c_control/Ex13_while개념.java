package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex13_while개념 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		//System.in 입력
		
		// 1~10까지의 합을 for문으로 작성 => while문으로 변경
		/*
		int sum = 0;
		
		int i = 1;
		while (i <= 10)
		{
			sum += i;
			i++;
		}
		
		System.out.println("총합: " + sum);
		*/
		
		/*
		 * 구구단의 단수를 입력받아 구구단을 출력
		 * while 이용
		 */
		

//		int a = 0;
//		int b = input.nextInt();
//		
//		int i = 1;
//		while (i<=9)
//		{
//			a = b * i;
//			System.out.print(a + " ");
//			i++;
//		}
		
		/*
		 * 	문장을 입력 받아 단어를 출력하기
		 * 	
		 */
		
		String msg = input.nextLine();
		StringTokenizer st = new StringTokenizer(msg, "/");	// 토큰: 하나의 문장으로부터 분할한 한 덩어리(문자를 분할한 단위) (단어별로 나누고 싶으면 이용)
		while(st.hasMoreTokens())		//토큰이 되어 여기 들어옴 => 그 다음 문장이 또 있느냐(지정할 토큰이 있냐)
		{
			String temp = st.nextToken();	//
			System.out.println(temp);
		}
		
		// 갯수가 정해져 있으면 for문
		// 안 정해져 있다? while문
		
	}

}
