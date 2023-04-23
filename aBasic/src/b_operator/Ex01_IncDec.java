package b_operator;

/*
 * 증가(++) / 감소(--) 연산자
 * 정수형 변수 a에 5 저장
 */

public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5; // 정수형 변수 a를 선언하고 이 변수에 값 5를 대입
		int b = 7; // 정수형 변수 b를 선언하고 이 변수에 값 7을 대입
		
		System.out.println("A=" + ++a + ",B=" + --b); // 출력하고 한 줄 띄기: a값에 1 더하고 a 출력, b값에 1 빼고 b 출력
		System.out.println("A=" + a-- + ",B=" + b--); // 출력하고 한 줄 띄기: a값 출력 후 1 더하고, b값 출력 후 1 빼기
		System.out.println("A=" + a + ",B=" + b);     // 출력하고 한 줄 띄기: a값 출력 후 b값 출력
		
		//----------------------------
		
//		int result = ++a; // a = a + 1
//						  // int result = a;
//
//		int result2 = a++; // int result2 = a;
//						   // a = a + 1;
//		
//						   // **** 서순의 차이!
//		
//		System.out.println(result);
//		System.out.println(result2);
//		System.out.println(a);
		
		//--------------------------------
		
		
//		System.out.println("A=" + a + ", B=" + b);          // 출력하고 한 줄 띄기: a값 출력하고 b값 출력하기
//		System.out.println("A=" + a + 1 + ", B=" + b + 1);  // 출력하고 한 줄 띄기: a값 출력하고 1 출력하고 b값 출력하고 1 출력하기
//		System.out.println("A=" + (a+1) + ", B=" + (b+1));  // 출력하고 한 줄 띄기: a+1값 출력하고 b+1값 출력하기
		
//		a = a + 1;
//		b = b - 1;
//		System.out.println("A=" + a + ", B=" + b);
//		
//		a++;
//		b--;
//		System.out.println("A=" + a + ", B=" + b);
//		
//		++a;
//		--b;
//		System.out.println("A=" + a + ", B=" + b);
		
//		a = a + 1; // (0)
//		a++; // (1)
//		++a; // (2)
//		
//		System.out.println(a);
	}

}
