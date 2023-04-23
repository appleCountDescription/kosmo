package b_operator;

/*
 * 	not: 결과의 반대로 하는 연산자
 * 
 * 		- !: 일반논리 not
 * 		- ~: 이진논리(비트논리)
 */

public class Ex02_Not {
	
	public static void main(String[] args) {
		
		boolean result = 3 > 4;                          // 논리형 변수 result를 선언하고 이 변수에 '3 > 4'를 대입
		System.out.println(result);                      // 출력하고 한 줄 띄기: result값 출력하기
		System.out.println(!result); //일반논리 not: !     // 출력하고 한 줄 띄기: result의 반댓값 출력
		
		// 이진논리 not: ~
		int a = 4;
		// a  0 0000000 00000000 00000000 00000100
		System.out.println(~a);
		// ~a 1 1111111 11111111 11111111 11111011
		
	}

}
