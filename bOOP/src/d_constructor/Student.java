package d_constructor;

/*
 * 	초기화
 * 		int a; // 변수선언(메모리에 공간 할당받음)
 * 		a = 10; //값지정
 * 		int b = 20; // (메모리 할당받자마자) 초기화
 * 		====================================
 * 		Student s = new Student();	// 변수선언 + 객체생성
 * 		s.setName("홍길동");			// 값지정
 * 
 * 	************ 클래스(객체) 초기화: 생성자 함수 사용
 * 					- new 사용 시 호출되는 함수
 * 					- 클래스명과 동일한 함수명
 * 					- 리턴형이 없음 (void도 안 됨)
 * 					- overloading 가능 (인자 다르게 써야 하는구나)
 * 
 * 	[주의] 기본생성자: 인자 없는 생성자
 * 		클래스 안에 생성자 함수가 하나도 없는 경우
 * 		자바가 자동으로 기본 생성자함수를 만들어줌
 * 		public Student(){}
 * 		==> 기본생성자 함수를 꼭 구현할 것임.		
 * 
 * 	[참고] 자바의 명명
 * 	class kosmo {
 * 		int kosmo;			// 멤버변수
 * 		void kosmo(){}		// 멤버메소드
 * 		kosmo(){}			// 생성자함수
 * 	}
 */

	//-----------------
	//this: 객체를 지칭하기 위한 키워드
	//this(): 다른 생성자함수를 호출할 때 사용, 무조건 맨 첫 줄에 기술해야 함(안 그러면 에러 뜸)


public class Student {
	//클래스 안의 변수들: member fields
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	//***************************************
		// 생성자함수 (constructor)
//	Student(){
//		System.out.println("생성자함수");
//		name = "이름없음";
//		kor = 50;
//		eng = 50;
//		math = 50;		// 4줄을 간단히? Student("이름없음", 50, 50, 50);
//						// this("이름없음", 50, 50, 50) <= 이건 무조건 코딩 맨 첫 줄에 나와야 함
//	}
	
	Student(){
		this("이름없음", 50, 50, 50);
		System.out.println("생성자함수");
						// 4줄을 간단히? Student("이름없음", 50, 50, 50);
						// this("이름없음", 50, 50, 50) <= 이건 무조건 코딩 맨 첫 줄에 나와야 함
	}	
	
	Student(String name, int kor, int eng, int math){
		System.out.println("인자 있는 생성자함수");
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	//클래스 안의 함수들: member methods
	public void calTotal() {
		total = kor + eng + math;
	}
	public void calAvg() {
		avg = total / 3;
	}
	public void output() {
		System.out.println(name + "님 점수: " + avg);
	}
	
	// setter / getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}
