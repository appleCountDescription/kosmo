/*
 * 	함수명: checkLower
 * 	@param: ch
 * 	@return: boolean
 * 	역할: 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true를 반환, 그렇지 않으면 false를 반환하는 메소드
 */

package e_method;

import java.util.Scanner;
/*



(문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 
	대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 
		함수명 : checkUpper
		인자 : char
		리턴(반환) : char
*/

/**
 * 함수명 : checkUpper
 * @param : char
 * @return : char
 * 역할 : 영문자를 입력하여 이 문자를 넘겨받아, 이 문자가 소문자이면 대문자로 변환하여 반환하고, 대문자라면 그대로 반환하는 메소드를 작성하시오.
 */

public class Ex03_연습3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("영문자 입력: ");
		char ch = input.nextLine().charAt(0);
		char result = checkUpper(ch);
		System.out.println("결과: " + result);
	}
	static char checkUpper(char ch) 	//	'a': 97 'A': 65  'A' - 'a' = 32
	{
		if(ch >= 'a' & ch <= 'z')
		{
			return (char)(ch - 32);
		}
		else if(ch>='A' & ch <= 'Z')
		{
			return ch;
		}
		return ' ';
	}

}


//package e_method;
///*
// * 	
// */
//
//import java.util.Scanner;
//
//public class Ex03_연습3 
//{	
//	public static void main(String[] args) 
//	{
//		System.out.print("알파벳을 입력하시오: ");
//		Scanner input = new Scanner(System.in);
//		char alpha = (char)input.next().charAt(0);
//		
//		boolean check = checkLower();	//sum값을 여기에 던져 줌 + 변수명 다른 이름으로 해도 되지만 헷갈리지 않기 위해 이름 맞춤
//		
//		if(alpha >= 'a' & alpha<='z')
//			System.out.println(check);
//		else if(alpha >= 'A' & alpha <= 'Z')
//			System.out.println(!check);
//		else
//			System.out.println("입력 오류입니다.");
//	}
//	
//	static boolean checkLower()	// void는 리턴이 없다는 뜻, int로 바꾸어 줘야 함
//	{
//		boolean check = true;
//		return check;	//반환, 리턴되는 애의 값은 단 하나여야 함
//	}	//수행 안 함
//}


//package e_method;
//
///*
//
//
//
//(문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 
//	대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 
//		함수명 : checkUpper
//		인자 : char
//		리턴(반환) : char
//
//(문제 1) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 
//	true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 
//		함수명 : checkLower
//		인자 : char
//		리턴(반환) : boolean
//
// */
//public class Ex03_연습3 {
//
//	public static void main(String[] args) {
//		boolean rs1 = checkLower('g');
//		System.out.println(rs1);
//		boolean rs2 = checkLower('G');
//		System.out.println(rs2);
//	}
//	/**
//	 * 함수명 : checkLower
//	 * @param : char
//	 * @return : boolean
//	 * 역할 : 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 
//	true을 반환 그렇지 않으면 false을 반환하는 메소드
//	 */
//	static boolean checkLower(char ch) {
//		if( ch>='a' && ch<='z' ) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//
//}