package c_array;

import java.util.Scanner;

public class MainTest {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 학생 수는? ");
		int numStud = sc.nextInt();
		
		//***************************
		Student[] s = new Student[numStud];	//여러 명의 학생이니깐 배열로 잡아야 함
		
		// 입력부분
		for(int i=0; i<numStud; i++) {
			s[i] = new Student();
			System.out.print((i+1) + "번째 학생 정보 입력: " + "\r\n");
			sc.nextLine();
			System.out.print("이름: ");
			s[i].setName(sc.nextLine());
			System.out.print("국어 점수: ");
			s[i].setKor(sc.nextInt());
			System.out.print("수학 점수: ");
			s[i].setEng(sc.nextInt());
			System.out.print("영어 점수: ");
			s[i].setMath(sc.nextInt());
			s[i].calTotal();
			s[i].calAvg();
		}
		
		// 결과출력부분
		for(int i=0; i<numStud; i++) {
			s[i].output();
		}

	}

}
