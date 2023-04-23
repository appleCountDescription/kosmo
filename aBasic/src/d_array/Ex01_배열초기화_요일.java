package d_array;

import java.util.Calendar;

public class Ex01_배열초기화_요일 
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();	// new를 안 씀 - 새로운 걸 쓰는 게 아니라 자바의 내부적인 자료를 이용하기 때문
		System.out.println( c.get( Calendar.YEAR) + "년" );
		System.out.println( c.get( Calendar.MONTH)+1 + "월" );	// *********month 뒤에다가는 1을 더하거나 빼기를 해야 함
		System.out.println( c.get( Calendar.DATE) + "일");
		
		// 시, 분, 초
		System.out.println( c.get( Calendar.HOUR) + "시");
		System.out.println( c.get( Calendar.MINUTE) + "분");
		System.out.println( c.get( Calendar.SECOND) + "초");
		
		// 요일
		String [] yoil = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println( yoil[c.get( Calendar.DAY_OF_WEEK) - 1] + "요일");		//
		
	}
}

