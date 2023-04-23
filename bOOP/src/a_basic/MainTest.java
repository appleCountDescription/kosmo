package a_basic;
// OOP - Object oriented Program 객체지향 프로그램
public class MainTest {

	public static void main(String[] args) {
		
		// 1) 클래스 변수 선언
		Student s;   // Student - 클래스 이름, s - 클래스의 변수 이름
		// 2) (반드시) 객체 생성 (new 만들기)
		s = new Student(); // 그 객체를 가르키는 변수 - s, 객체 - new Student
						   // Student s = new Student();와 같음
		// 3) 값지정 / 처리
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 70;
		s.math = 67;
		//s.calTotal();
		//확인
		s.total = 290;
		System.out.println("총점확인: " + s.total);
		s.calAvg();
		s.output();
	}

}
