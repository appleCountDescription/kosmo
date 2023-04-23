//자바프로젝트명: bOOp

/*
 * 	캡슐화
 * 		멤버변수: private
 * 		멤버메소드: public
 * 		
 */

package b_encapsulation;

public class Student {
	//클래스 안의 변수들: member fields
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
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
