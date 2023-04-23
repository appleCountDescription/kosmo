package b_operator;

/*
 * 	대입연산자(=)와 연산자 결합하는 연산
 * 	 - 산술 / 이진논리 / 쉬프트
 * 		
 */

public class Ex10_Assignment {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 7;
		
		a += b;  // a = a + b;와 같음
		System.out.println("+= 결과: " + a);
		
		a -= b;  // a = a - b;와 같음
		System.out.println("+= 결과: " + a);
		a *= b;  // a = a * b;와 같음
		System.out.println("+= 결과: " + a);
		a /= b;  // a = a / b;와 같음
		System.out.println("+= 결과: " + a);
		a %= b;  // a = a % b;와 같음
		System.out.println("+= 결과: " + a);
		
	}

}
