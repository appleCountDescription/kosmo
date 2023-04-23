package b_operator;

import java.util.Scanner;

/*
 * 산술연산자
 * 	 +
 * 	 -
 *   *
 *   /
 *   
 *   %: 나머지 연산자
 */
public class Ex03_Arithmetic {

	public static void main(String[] args) {
	
//		// 나머지 연산자 이용 -> 홀/짝수 구하기
//		int su = 10;                                  
//		if( su % 2 != 0 ) { // su % 2 == 1와 같음
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}
		
		// 숫자 한 개를 입력받아서
		// 그 숫자가 3의 배수인지 여부를 출력하기
		
		Scanner input = new Scanner(System.in);               // input 할 거면 이거 꼭 넣자 절대 빼 놓지 말자
		
		System.out.println("정수를 입력하시오.");                  // 출력하고 한 줄 띄기: "정수를 입력하시오" 출력하기
		int num = input.nextInt();							  // 정수형 변수 num 선언하고 이 변수에 입력값을 대입
		
		if(num % 3 == 0) {                                    // if문: num을 3으로 나눴을 때 나머지가 0이라면
			System.out.println("입력하신 수는 3의 배수입니다.");      // 출력하고 한 줄 띄기: "입력하신 수는 3의 배수입니다." 출력하기
		}else {                                               // else문
			System.out.println("입력하신 수는 3의 배수가 아닙니다.");   // 출력하고 한 줄 띄기: "입력하신 수는 3의 배수가 아닙니다." 출력하기
		}
		
	}

}
