package b_review;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
		CalculatorExpr c = new CalculatorExpr();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두 개를 입력하시오.");
		c.setNum1(sc.nextInt());
		c.setNum2(sc.nextInt());
		
		System.out.println(c.toString());
		
		while(true) {
			System.out.println("\r\n" + "계속 진행하시겠습니까? O/X");
			char inputContinue = sc.next().charAt(0);
			if(inputContinue == 'O') {
				System.out.println("숫자 두 개를 입력하시오.");
				c.setNum1(sc.nextInt());
				c.setNum2(sc.nextInt());
				System.out.println(c.toString());
				continue;
			}
			else if (inputContinue == 'X') {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else {
				System.out.println("입력 오류입니다.");
				break;
			}
		}
	}

}
