package e_method;

import java.util.*;

public class Ex00_복습2 {

	static int jumsu;
	
	public static void main(String[] args) {
		String result = func();
		// 여기서 합격 여부를 출력하려면?
		System.out.println("결과:" + result);
		method();
	}

	/** 
	 *  	- 점수를 입력받아 합격여부 확인하는 메소드
	 */
	static  String func() {
		Scanner in = new Scanner(System.in);	
		System.out.println("점수입력->");
		jumsu = in.nextInt();
		if( jumsu >= 80) return "합격";
		else return "불합격";
	}
	
	/**
	 * 점수를 넘겨받아 성적을 구하는 메소드
	 */
	static void method() 
	{
		System.out.print("학점: ");
		switch(jumsu / 10)
		{
			case 10: 
			case 9: System.out.println('A'); break;
			case 8: System.out.println('B'); break;
			default: System.out.println('F');
		}
	}

}
