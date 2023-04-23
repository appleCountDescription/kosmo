package a_datatype;

// 한 줄 주석
/*
	여러줄 주석
 */
/**
 	여러줄 주석
 */

// 1bit
// 1byte = 8bit
// 1024byte = 1kb
// 1024kb = 1mb
// 1024mb = 1gb
// 1024gb = 1tb

/*
	변수: 메모리에 값을 저장하기 위한 공간의 이름
	
	데이터타입
	- 기본형(primitive type)
		' 논리형 boolean
		' 문자형 char(2B, 2byte)
		' 정수형 int(4B, 일정 숫자까지만) / long(8B)
		' 실수형 double(8B) / float(4B)
	
	
	- 참조형(reference type)
		' 배열 
		' 클래스 
 */
public class EX01_Naming {

	public static void main(String[] args){
		
		// 문자형 변수 ch 선언하기
		// [*] 문자, 숫자, _, $ 조합 가능
		char ch;
		char ch1_test;
		char 한글; // 한글은 가능하지만 권장하지 않음
		//char 1ch; // [에러] 숫자로 시작
		//char ch;  // [에러] 변수명 동일
		
		// 실수형 변수 Ch 선언하기
		double Ch;
		
		// 정수형 변수 abcdef 선언하기
		// [*] 변수명에 길이제한 없음
		int abcdef;
		
		//---------------
		// 값 대입하기
		ch = '김'; // 문자 하나는 '' 표시
		//ch = "김"; // [에러] 문자열(String)형은 "" 표시
		
		// abcdef 변수에 숫자 100을 대입하기(저장하기)
		abcdef = 100;
		
		Ch = 0.3;
		
		// 논리형 변수 b를 선언하고 true 값을 대입하기
		boolean b;
		b = true;
		
		// boolean b = true;
		
	}
}
