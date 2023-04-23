package e_method;

/*
 * 	Call By Value: 인자가 기본형인 경우 - 원본에 영향 X
 */

public class Ex05_CallByValue 
{
	public static void main(String[] args) 
	{
		int a=10, b=20;
		add(a, b);
		System.out.println("A= " + a + ", B= " + b);	// add 함수 날아갔으니 다시 a=10이고 b=20이다.
	}
	
	static void add(int a, int b)
	{
		a+=b;
		System.out.println("A= " + a + ", B= " + b);	//이거 끝나면 add 함수 날아감
	}
	
}
