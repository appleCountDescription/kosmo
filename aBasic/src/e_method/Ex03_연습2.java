package e_method;

public class Ex03_연습2 
{
	public static void main(String[] args) 	// 출력
	{
		char [] result = input();
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
	
	static char[] input()
	{
		char ko = 'A', en = 'C', math = 'B';
		char [] result = {ko, en, math};
		return result;
	}

}
