package b_operator;

import java.util.Scanner;

/*
 * 논리연산자
 * 		- 일반논리: && ||				/&& and(직렬) || or(병렬)
 * 		- 이진논리: &   |	 ^
 * 
 * 		A	B		A&&B	A||B
 * 		-------------------------
 * 		0	0		0		0
 * 		0	1		0		1
 * 		1	0		0		1
 * 		1	1		1		1
 * 
 * 		A	B		A&&B	A||B
 * 		-------------------------
 * 		f	f		f		f
 * 		f	t		f		t
 * 		t	f		f		t
 * 		t	t		t		t
 *  
 */


public class Ex06_GeneralLogical {

	public static void main(String[] args) {
		
//		int 성적 = 75;		// 정수형 변수 성적을 선언하고 이 변수에 값 75를 대입
//		char 태도 = 'A';		// 문자형 변수 태도를 선언하고 이 변수에 값 A를 대입
//		
//		if( 성적>=80 || 태도=='A' ) {                                       // if문: 성적이 80 이상이고 태도가 A와 같다면
//			System.out.println("성적이 80점이거나 태도가 A이면 우수상입니다.");		 // 출력하고 한 줄 띄기: 문자 출력
//		}
//		
//		if( 성적>=80 && 태도=='A' ) {										// if문: 성적이 80 이상이고 태도가 A와 같다면
//			System.out.println("성적이 80점이고 태도가 A이면 우수상입니다.");
//		}

		Scanner input = new Scanner(System.in);
		System.out.println("문자 하나 -> ");
		char ch = (char)input.next().charAt(0);
		System.out.println(ch);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자입니다");
		}
	}

}