//자바프로젝트명: bOOp

package a_basic;

public class Student {
	//클래스 안의 변수들: member fields
	String name;
	int kor, eng, math;
	int total;
	double avg;
	
	//클래스 안의 함수들: member methods
	void calTotal() {
		total = kor + eng + math;
	}
	void calAvg() {
		avg = total / 3;
	}
	void output() {
		System.out.println(name + "님 점수: " + avg);
	}
}
