package i_exercise;		//다형성 적용: 1) 상속관계 2) 오버라이딩

import java.util.Scanner;

public class MainTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("언어를 선택하세요 (1.한국어 2.영어 3.프랑스어)");
		int langsel = sc.nextInt();
		
		Language lan = null;
		switch(langsel) {
				// (2) 부모변수에 자식객체 생성
		case 1: lan = new Korean(); break;
		case 2: lan = new English(); break;
		case 3: lan = new French(); break;
		}
		
		System.out.println("메세지를 선택하세요 (1.한국어 2.영어 3.프랑스어)");
		int msgsel = sc.nextInt();
		switch(msgsel) {
				// (2) 부모변수에 자식객체 생성
		case 1: lan.greeting(); break;
		case 2: lan.introduce(); break;
		case 3: lan.message(); break;
		}
		
	}

}
