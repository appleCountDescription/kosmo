package c_control;

public class Ex01_if_주민번호 {
	
	public static void main(String[] args) {
		
//		String id = new String("950701-1234567");		// 주민번호는 연산하면 안 되니 string
		String id = "950701-1234567";  // 0부터 셈: 012345678910111213							// 배열형 변수 id 선언 후 숫자 대입
		char sung = id.charAt(7);																// 문자형 변수 sung 선언 후 7번째 숫자 대입
		String gender = "";  // "";는 미리미리 세팅해 놓자												// 문자형 변수 gender 선언 후 빈 거 대입
		if(sung == '1' | sung == '3' | sung == '9') // 주민번호의 1은 숫자1이 아니라 문자1임을 유념하자		// if문: sung이 1이거나 3이거나 9면
		{
			gender = "남자";
		}
		else if (sung == '2' | sung == '4' | sung == '0')
		{
			gender = "여자";
		}
		else
		{
			gender = "동포";
		}
		System.out.println("당신은 " + gender + "입니다.");
		// sung 문자가 1이면 남자 출력하고, 그렇지 않으면 여자출력
	}

}
