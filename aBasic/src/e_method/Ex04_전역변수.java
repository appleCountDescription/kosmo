package e_method;

public class Ex04_전역변수 
{
	static int a = 10, b = 20;
	static int sum = 0;
	
	public static void main(String[] args) 
	{
		add();
		System.out.println("합: " + sum);
	}
	static void add()	//add 함수 호출
	{
		sum = a + b;
	}
	
}
