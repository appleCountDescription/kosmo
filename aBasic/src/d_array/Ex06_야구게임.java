package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_야구게임 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int [] baseball = new int[3];
		int [] answer = new int[3];
	
		// 임의의 수를 baseball 변수에 지정
		// [추후에]중복수 배제
		for(int i = 0; i<baseball.length; i++)
		{
			baseball[i] = (int)(Math.random()*10);
			System.out.print(baseball[i]);
		}
		System.out.println("");
		
		System.out.println("숫자 입력 =>");
		String su = input.nextLine();	// "1, 2, 3"
		StringTokenizer st = new StringTokenizer(su, ",");
		for(int i=0; st.hasMoreTokens(); i++)
		{
			answer[i] = Integer.parseInt(st.nextToken());
			System.out.print("["+answer[i]+"]" + " ");
		}
		
		//값비교
		int strike = 0, ball = 0;
		
		for(int i=0; i<baseball.length; i++)		// i: baseball의 인덱스
		{
			for(int j=0; j<answer.length; j++)					// j: answer의 인덱스
			{
				if(baseball[i] == answer[j])
				{
					if(i==j) strike++;
					else ball++;
				}
			}
		}
		System.out.println(strike + "S" + ball + "B");
	}
}
