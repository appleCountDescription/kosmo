package c_control;

import java.util.Scanner;

public class Ex14_do_while {

	public static void main(String[] args) {
		
		// 1부터 10까지의 합 ( for 문 )
//		int sum = 0;
//		for(int i=1 ; i<=10 ; i++ ){
//			sum += i;
//		}
//		System.out.println("합:" + sum);
		
		// for ->  while 변경
//		int sum = 0;
//		int i=1;
//		while(i<=10){
//			sum += i;
//			i++;
//		}
//		System.out.println("합:" + sum);
		
		
		// while -> do~while
//		int sum = 0;
//		int i=1;
//		do{
//			sum += i;
//			i++;
//		}while(i<=10);
//		System.out.println("합:" + sum);
		


		Scanner input = new Scanner(System.in);
		
//[1] 반복횟수를 입력받아 구구단 처리 => for문
//		System.out.println("몇번 반복할까요?");
//		int su = input.nextInt();
//		for(int j=0; j<su; j++) {
//			// 구구단 처리
//			System.out.println("단수를 입력->");
//			int dan = input.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan+"*"+i+"="+dan*i);
//			}
//		}
		
//[2] 사용자 종료하길 원할 때까지 반복 => while 문 - 조건을 먼저 비교
//		while(true) {
//			// 구구단 처리
//			System.out.println("단수를 입력->");
//			int dan = input.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan+"*"+i+"="+dan*i);
//			}
//			System.out.println("종료할까요(Y/y)?");
//			input.nextLine();
//			String answer = input.nextLine();
//			if( answer.equals("y") | answer.equals("y")) {
//				break;
//			}
//		}
		

////[3] 사용자 원할 때까지 반복 => do ~ while 문 - 조건을 나중에 비교, 수행을 일단 먼저 함
//		String answer = "";
//		do {
//			// 구구단 처리
//			System.out.println("단수를 입력->");
//			int dan = input.nextInt();
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan+"*"+i+"="+dan*i);
//			}
//			System.out.println("다시할까요(Y/y)?");
//			input.nextLine();
//			answer = input.nextLine();
//		}while(answer.equals("y") | answer.equals("y"));
		
		
	}

}