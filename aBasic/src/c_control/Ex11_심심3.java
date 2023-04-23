package c_control;

import java.util.Scanner;

public class Ex11_심심3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		char alpha = 'A';		// (int)로 굳이 형변환할 필요 없음. 2바이트를 4바이트로 바꿨다가 나중에 2바이트짜리로 출력할 거면 굳이 그 짓을 왜 함?
		int num = 0;
		
		if(n > 6)
		{
			System.out.println("입력오류");
		}
		else
		{
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n - i; j++)
				{
				System.out.print(alpha++ + " ");
				}
				for(int k = 0; k < i; k++)
				{
					System.out.print(num++ + " ");
				}
				System.out.println("");
			}
		}
	}

}