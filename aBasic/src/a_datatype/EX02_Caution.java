package a_datatype;

public class EX02_Caution {

	public static void main(String[] args) {

		// [원리] 문자형에는 문자형을 대입
		
		// 문자형에 정수를 대입하면?
		char ch = 65;
		System.out.println("ch 값:" + ch);
		
		// 정수형 변수에 문자 대입하면?
		int su = 'A';
		System.out.println("su 값:" + su);

		// 실수형 변수에 정수를 대입하면?
		double d = 100;
		System.out.println("d의 값:" + d);
		
		// 정수형 변수에 실수를 대입하면?
		// int num = 3.6; // 에러발생
		//형변환 (cast)
		int num = (int)3.6;
		System.out.println("num 값:" + num);
		
		// 실수형 float를 사용한다면? (Java에서는 float 안 쓰긴 함)
		float f = 3.6f;
		System.out.println("f 값:" + f);
		
		//int big = 100000000000; // 에러
		long big2 = 100000000000L;
		System.out.println(big2);
	}

}
