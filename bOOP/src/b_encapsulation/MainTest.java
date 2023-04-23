package b_encapsulation;

//	같은 패키지의 Student 클래스 불러옴

public class MainTest {
	
	public static void main(String[] args) {
		Student s = new Student();
		//s.name = "홍길동";
		s.setName("홍길동");
		/*
		 * s.kor = 100;
		 * s.eng = 70;
		 * s.math = 67;
		 */
		
		s.setKor(100);
		s.setEng(70);
		s.setMath(67);
		
		s.calTotal(); // total 지정 방법은 이거 말고는 없음
		// [****] s.total = 290; - 오류
		s.calAvg();
		s.output();
		
	}

}
