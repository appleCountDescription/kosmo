package c_control;

import java.util.Scanner;

public class Ex02_if_학번 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("학번을 입력하시오.");
		String hakbun = input.nextLine();
		
		// sunbstring ( 시작인덱스, 끝인덱스-1 )
		String year = hakbun.substring(0, 4);  // 0부터 시작해서 4 앞의 것 까지			// 배열형 변수 year 선언, substring으로 hakbun에서 0번째에서 3번째 수까지 불러오고 그 값을 year에 대입하기
//		System.out.println(year);												// year 값 출력하고 한 줄 띄기
		
		// 학번에서 다섯 번째 문자를 얻어 와 univ 변수에 공대인지 사회대인지 저장하기
		// univ 변수 출력
		char num_univ = hakbun.charAt(4);										// 문자형 변수 unm_univ 선언, chartAt로 hakbun에서 4번째 수 불러오고 그 값을 unm_univ에 대입하기
		String univ = "";
		String num_dept = hakbun.substring(5, 7);
		String dept = "";
		
		if(num_univ =='1')
		{
			univ = "공대";					// 여섯 번째와 일곱 번째 문자를 얻어 와서
			if(num_dept.equals("11"))		// 11이라면 "컴퓨터학과" dept 변수에 저장
			{								
				dept = "컴퓨터학과";
			}
			if(num_dept.equals("12"))
			{
				dept = "소프트웨어학과";
			}
			if(num_dept.equals("13"))
			{
				dept = "모바일학과";
			}
			if(num_dept.equals("22"))
			{
				dept = "자바학과";
			}
			if(num_dept.equals("33"))
			{
				dept = "서버학과";
			}
		}
		else if (num_univ == '2')
		{
			univ = "사회대";
			if(num_dept.equals("11"))		// 11이라면 "컴퓨터학과" dept 변수에 저장
			{								
				dept = "사회학과";
			}
			if(num_dept.equals("12"))
			{
				dept = "경영학과";
			}
			if(num_dept.equals("13"))
			{
				dept = "경제학과";
			}
		}
//		System.out.println(univ);
//		System.out.println(dept);
		
		System.out.printf("%s은(는) %s년도에 입학한 %s %s 학생입니다.", hakbun, year, univ, dept);			//printf는 '양식에 맞춰 출력', f는 format의 f
	}

}
