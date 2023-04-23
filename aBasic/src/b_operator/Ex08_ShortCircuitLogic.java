package b_operator;

/*
 * 	ShortCircuitLogic : 일반논리( &&, || )한테 적용 - 자바에만 있음
 * 
 * 	==> 이진논리연산자를 사용하면 이 원리를 적용하지 않음
 */

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3;
		if( a>3 && ++a>3) {   // a>3에서 false가 나오면 괄호속에 있는 게 false인 거니깐, 뒤의 ++a>3은 아예 계산 안 해 버림. 그래서 컴파일하면 3이 뜸. 다른 언어면 4가 뜸
			System.err.println("조건만족"); // 출력?
		}
		System.out.println("a=" + a); // a= ????
		
		if( a > 1 || ++a > 3) {  // 마찬가지. a>1가 true니깐 그냥 괄호 안은 볼 것도 없이 true임. 그러니 뒤에 ++a>3 계산 안 함. 컴파일하면 3이 뜸.
			System.out.println("조건만족2"); // 출력
		}
		System.out.println("a=" + a); // a = ??????
		
//		int a = 3;
//		if( a>3 & ++a>3) {   // 아까와 달리 이진논리연산자를 사용하기 때문에 숏서킷로직 적용 안 함
//			System.err.println("조건만족"); // 출력?
//		}
//		System.out.println("a=" + a); // a= ????
//		
//		if( a > 1 | ++a > 3) {  // 아까와 달리 이진논리연산자를 사용하기 때문에 숏서킷로직 적용 안 함 (2)
//			System.out.println("조건만족2"); // 출력
//		}
//		System.out.println("a=" + a); // a = ??????
		

	}

}
