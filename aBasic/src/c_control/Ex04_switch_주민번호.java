package c_control;
/*
 * 	switch ( 변수 )
 * 	{
 * 		case 값1: A문장; break;
 * 		case 값2: B문장; break;
 * 		default: Z문장;
 * 	}
 * 	- 변수: 문자형, 정수형, (문자열)   // 문자열 사용할 수 있는 건 1.5버전 이후
 * 	
 */
public class Ex04_switch_주민번호 {
	
	public static void main(String[] args) {
		
		String id = "950701-1234567";
		char chul = id.charAt(8);	// chul - 출신
		String home = "";
		switch(chul)
		{
		case '0': home = "서울"; break;
		case '1': home = "인천/부산"; break;
		case '2': home = "경기"; break;
		default: home = "제주";
		}
		
		System.out.println("출신지:" + home);
		
		// 성별을 구하기 (switch문 이용)
		char numGender = id.charAt(7);
		String gender = "";
		
		switch(numGender)
		{
		case '1':  
		case '3':							// switch문에서 break 있는지 없는지 잘 체크하기
		case '9': gender = "남성"; break;
		
		case '2':
		case '4':
		case '0': gender = "여성"; break;
		default: gender = "알 수 없음";
		}
		
		System.out.println("성별:" + gender);
		
	}

}
