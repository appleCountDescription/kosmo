package e_method;

import java.util.Scanner;

import f_exception.MyException;

public class Ex10_오늘도입사 
{
	public static void main(String[] args) 
	{
		int i = 0;	//이걸 없애고
		while (i<1){	// 이걸 true로 놓고
			try{	//catch를 쓰기 위해 어쩔 수 없이 씀
				int num = solution();
				int count369 = output(num);
				System.out.print("손뼉 친 횟수: ");
				System.out.println(count369);
				break;
			}
			catch(Exception ex)	{// 1~100,000 수가 아닐 때를 위한 예외
			
				System.out.println("1 이상 100,000 미만 수를 입력해야 합니다. 수를 다시 입력하시오.");
			}
		}
		// if(false) 넣기
	}
	
	static int solution() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 몇까지 게임을 진행하시겠습니까?: ");
		int num = sc.nextInt();		// 수 입력
		if(num <1 | num > 100000)
			throw new Exception();	// 1~100,000 수가 아닐 때를 위한 예외
		return num;
	}
		
	static int output(int num) {
		int count369 = 0;		//3, 6, 9 몇 번 있는지 세려고
		for(int i=1; i<=num; i++) {
			int answer = i;		// i라는 수가 곧 답변이므로
			boolean answer369 = false;
			
			while(answer != 0) {
				int remainder = answer%10;
				if (remainder==3 | remainder==6 | remainder==9) {
					answer369 = true;
					count369++;
					if (answer == num) {
						System.out.print(i);
						break;
					}
					System.out.print(i + ", ");
					break;
				}
				answer /= 10;
			}
		}
		System.out.println("에 숫자가 3, 6, 9가 포함되어 총 " + count369 + "회 손뼉을 칩니다.");
		return count369;
	}
}
