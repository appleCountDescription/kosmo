package e_method;

import java.util.*;

public class Ex00_복습3 {

	public static void main(String[] args) {
		char [][] result = input();
		output(result);
	}
	
	static void output(char [][] result) 
	{
		// 문자 배열에 저장된 문자들을 화면에 출력한다.
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[i].length; j++)
			{
				System.out.print(result[i][j]);
			}
			System.out.println("");
		}
	}
	
	static char[][] input() {
		// 두 정수와 알파벳 문자 하나를 입력받는다
		//		[예] 3 4 F
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int second = in.nextInt();
		char ch = in.nextLine().charAt(1);
		char [][] result = makeSquare(first, second, ch);
		return result;
	}
	
	static char[][] makeSquare(int f, int s, char c) {
		char [][] ch = new char [f][s];
		// 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
		//		입력받은 문자를 시작으로 저장한다. 
		/*
		 * 		F	G	H	I
		 * 		J	K	L	M
		 * 		N	O	P	Q
		 */
		 for(int i = 0; i < f; i++)
		 {
			 for(int j = 0; j < s; j++)
			 {
				 ch[i][j] = c++;
			 }
		 }
		 return ch;		
	}

}
