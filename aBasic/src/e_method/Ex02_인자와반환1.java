package e_method;

public class Ex02_인자와반환1 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 20;
		add(a, b);	//argument(인자, 인수)
	}
	
	//a와 b 값의 합을 구하고 출력
	static void add(int a, int b)	//parameter(매개변수)
	{
		int sum = a + b;
		System.out.println("합: " + sum);
	}
	

}
