package a_datatype;

import java.util.Scanner;

public class Ex09_복습 {
	
	public static void main(String[] args) {

		// 0. 입력받을 수 있는 구조를 만들자
		Scanner input = new Scanner(System.in);
		
		//System.out.println("이름을 입력하세요");
		// 1. 입력받아 변수에 저장
		//String irum = input.nextLine();
		//System.out.println("당신의 이름: " + irum + "입니다");
		//System.out.printf("당신의 이름: %s입니다", irum);
		
		//System.out.println("다른 이름을 입력하세요");
		//String irum2 = input.next();
		//System.out.println("당신의 이름: " + irum2 + "입니다");
		//System.out.printf("당신의 이름: %s입니다", irum2);
		
		//---------------------------------------
		// 2. 나이를 입력받고 키를 입력받아
		//    화면출력
		
//		System.out.println("나이를 입력하시오.");
//		String age = input.next();
//		System.out.println("키를 입력하시오.");
//		String height = input.next();
//		
//		System.out.printf("나이: %s, 키: %s cm", age, height);
		
		System.out.println("나이를 입력하시오.");
		int age = input.nextInt();
		System.out.println("키를 입력하시오.");
		double height = input.nextDouble();
		
		System.out.printf("나이: %d, 키: %f cm", age, height);
		
		
	}

}
