package c_control;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 	[참고]	9 / '9' / "9"	3개는 각각 다름 - 숫자 9, 문자 9, 문자열 9
 * 
 * 			"800102-1234567"
 * 			"000505-4123456"
 * 
 * 			"80" -> 80
 * 
 * 			1 | 2 -> 1900 + 80 = 1980
 * 			3 | 4 -> 2000 + 01 = 2001
 */
public class Ex03_나이구하기 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하시오('-'도 입력).");
		String id = input.nextLine();
		String year = id.substring(0,2);		// '1'
		char gender = id.charAt(7);				// "80"
		
		// 문자열 나이를 정수로 변환
		int intYear = Integer.parseInt(year); // "80" -> 80
		int cen19 = 1800;
		int cen20 = 1900;
		int cen21 = 2000;
		int myYear = 0;
		
		//만일 gender 문자가 '1'이거나 '2'라면
		// 1900에 intYear를 더한 값을 myYear에 저장한다
		// 그렇지 않고 만일 gender 문자가 '3'이거나 '4'라면
		// 2000에 intYear를 더한 값을 myYear에 저장한다
		
		if (gender == '1' | gender == '2')
		{
			myYear = cen20 + intYear;
		}
		else if (gender == '3' | gender == '4')
		{
			myYear = cen21 + intYear;
		}
		else if (gender == '9' | gender == '0')
		{
			myYear = cen19 + intYear;
		}
		
		System.out.println("태어난연도: " + myYear);
		
		// 올해년도 구하기
		Calendar c = Calendar.getInstance(); // c를 캘린더 변수로 선언, 
		int thisYear = c.get(Calendar.YEAR); // 연도값만 얻어오기
		
		// 한국나이 구하기
		int age = thisYear - myYear + 1;
		System.out.println("한국나이: " + age);
		
		
		
	}

}
