package c_control;

public class Ex08_for중첩연습 
{
	public static void main(String[] args) 
	{
		
		// 연습문제 1
//		for(int i = 0; i<26; i++)
//		{
//			for(char c = 'A'; c <= 'A' + i; c++)
//			{
//				System.out.print(c + " ");
//			}
//			System.out.println("");
//		}

		//-------------------------------------------------------
		
		// 연습문제 2
//		for(int i = 0; i<26; i++)
//		{
//			for(char c = 'A'; c <= 'Z' - i; c++)
//			{
//				System.out.print(c + " ");
//			}
//			System.out.println("");
//		}
		
		//-------------------------------------------------------
		
		// 연습문제 3
//		for(int i = 0; i<26; i++)
//		{
//			for(char c = (char)('A' + i); c <= 'Z'; c++)
//			{
//				System.out.print(c + " ");
//			}
//			System.out.println("");
//		}
		
		//-------------------------------------------------------
		
		//연습문제 4
//		for(int i = 0; i<26; i++)
//		{
//			for(char c = 'Z'; c >= 'Z' - i; c--)
//			{
//				System.out.print(c + " ");
//			}
//			System.out.println("");
//		}
		
		//-------------------------------------------------------
		
		//연습문제 5
		for(int i = 0; i<26; i++)
			{
					for(char c = (char)('A' + i); c <= 'Z'; c++)
					{
						System.out.print(c + " ");
					}
					System.out.println("");
					for(int j = 0; j<=i; j++)
					{
						System.out.print("  ");
					}
			}
		
	}
}