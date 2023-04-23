package d_review;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("입력할 계좌 수는?");
		int su = input.nextInt();
				
		Account[] acc = new Account[su];
		for(int i=0; i<acc.length; i++) {
			input.nextLine();
			System.out.println("계좌정보 입력: ");
			String accNum = input.nextLine();
			String name = input.nextLine();
			long money = input.nextLong();
			acc[i] = new Account(accNum, name, money);		// 세터? 생성자?
		}
		
		for(int i=0; i<acc.length; i++) {
			acc[i].output();
		}
	}
}
