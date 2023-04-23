package a_datatype;

/*
 * 자바에서 콘솔 입력받기
 * 
 * 	' java.util.Scanner
 * 
 * 
 * 
 * 	' 문자열 입력시: next()와 nextLine() 차이
 * 	' 정수형 입력시: nextInt()
 * 	' 
 */

import java.util.Scanner; // import java.util.*;는 유용한 것 전부 다 쓰겠다

public class EX05_Scanner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("국어점수를 입력->");
		int kor = input.nextInt();
		System.out.println("국어:" + kor);
		
		// 영어점수 입력받아 출력
		System.out.println("영어점수를 입력->");
		int eng = input.nextInt();
		System.out.println("영어:" + eng);
		
		//수학점수 입력받아 출력
		System.out.println("수학점수를 입력->");
		int math = input.nextInt();
		System.out.println("수학:" + math);
		
		// -------------------------------------------
		// 총점 구해서 출력
		int total = kor + eng + math;
		System.out.println("총점:" + total);
		
		// 평균 구해서 출력
		double avg = total / 3.0; // 정수와 정수를 연산하면 정수만 나옴, 그래서 3에다가 소수점을 붙여야 함
		System.out.println("평균:" + avg);
		
	}

}
