package d_review;

import java.util.*;  // java.util 다 잡아줌, java.util.ArrayList 포함

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		System.out.println("입력할 계좌 수는?");
//		int su = input.nextInt();
//		Account[] acc = new Account[su];
		
		ArrayList list = new ArrayList(2);	//동적인 배열, 2를 입력해도 세 번째 배열 입력 가능, 왜냐하면 내부적으로 크기를 2에서 4로 늘려줌(이후에도 4에서 8 이런 식으로 무한대로), 지정 안 해도 됨

		while(true) {
//			input.nextLine();
			System.out.println("계좌정보 입력: ");
			String accNum = input.next();
			String name = input.next();
			long money = input.nextLong();
			Account acc = new Account(accNum, name, money);
			list.add(acc);			//여기에 보관
			// list.add(new Account(accNum, name, money)); 이렇게 한 줄로 만들 수도 있음
			System.out.println("종료?(y|n)");
			int answer = input.next().charAt(0);
			if(answer == 'y') break;
		}
		
		// 출력
		for(int i=0; i<list.size(); i++) {
			Account acc = (Account)list.get(i);
			acc.output();
		}
	}
}
