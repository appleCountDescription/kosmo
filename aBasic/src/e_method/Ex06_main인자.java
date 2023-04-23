package e_method;

public class Ex06_main인자 
{
	public static void main(String[] args) 	// main의 함수는 무조건 void, 인자는 실행할 때 받음
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
