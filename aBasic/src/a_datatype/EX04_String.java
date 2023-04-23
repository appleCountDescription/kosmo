package a_datatype;

/*
	- 문자 : 글자 하나
			char ( 기본형 ) : ''

	- 문자열 : 글자 0개 이상 - 연산하면 안 되는 숫자들은 문자열로 입력 (ex. 비밀번호, 주민등록번호 등)
			 string ( 참조형 ) : ""
			 
			 * 참조형은 new 를 이용해서 객체를 생성하기
			 
			 *********** 자바 String
			 * 유일하게 딱 하나 ---> new 생략 가능 
			 * 그러므로, 기본형 / 참조형 / String 이런 식으로, String은 별종이라고 생각하자!

 */
public class EX04_String {

	public static void main(String[] args) {
		
		int age = 33;
		
		//String name;
		//name = new String("홍길동");
		//--------------------------------------------------------------
		
		//String name2 = new String("홍길동"); <= name2의 주소는 name의 주소와 다름
		
		
		String name = "홍길동"; 
		String name2 = "홍길동"; // new 안 쓰면 name과 name2의 주소가 같아짐
		
		System.out.println("첫 번째 사람은 " + name + "입니다");
		System.out.println("두 번째 사람은 " + name2 + "입니다");
		
		//name이라고 하는 변수와 name2라고 하는 변수가 같다면, "이름이 동일합니다"를 출력해 주세요.
		if( name == name2 ) {
			System.out.println("주소가 동일합니다");
		}else {
			System.out.println("주소가 다릅니다"); // 문자열의 값 비교할 때 연산자 '==' 안 씀
		}
		
		// 문자열의 값 비교
		if( name.equals(name2)) {
			System.out.println("이름 동일 ^^");
			
		}
		
	}
}
