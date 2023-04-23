//자바프로젝트명: bOOp

/*
 * 	캡슐화
 * 		멤버변수: private
 * 		멤버메소드: public
 * 		
 */

package c_array;

public class Student {
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public void calTotal() {
		total = kor + eng + math;
	}
	public void calAvg() {
		avg = total / 3;
	}
	public void output() {
		System.out.println(name + " 총점: " + total + " 평균: " + avg);
	}
	
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
