package e_method;

public class Ex07_오버로딩_연습 {

	public static void main(String[] args) 
	{
		int a = 2;
		int b = 3;
		int c = 4;
		char d = 'ㅋ';
		multiple(a, b);
		multiple(c, d);
		multiple(a, b, d);
	}
	
	static void multiple(int a, int b)
	{
		System.out.println(a * b);
	}
	
	static void multiple(int c, char d)
	{
		for(int i=0; i<c; i++)
		{
			System.out.print('ㅋ');
		}
		System.out.println();
	}
	
	static void multiple(int a, int b, char d)
	{
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				System.out.print('ㅋ');
			}
			System.out.println();
		}
	}

}
