package d_constructor;

//	같은 패키지의 Student 클래스 불러옴

public class MainTest {
	
	public static void main(String[] args) {
		// Student 클래스 객체 생성
		Student s = new Student("홍길동", 90, 80, 70);
		//각 멤버변수에 값을 지정
//		s.setName("홍길동");
//		s.setKor(100);
//		s.setEng(70);
//		s.setMath(67);
		
		s.calTotal();
		s.calAvg();
		s.output();
		
		Student s2 = new Student("홍길자", 55, 66, 77);
		s2.calTotal();
		s2.calAvg();
		s2.output();
	}

}
