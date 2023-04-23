package e_method;
/*
 * 	Call By Reference: 인자가 참조형인 경우
 * 						- 원래값이 변경됨
 */

public class Ex05_CallByReference 
{
	public static void main(String[] args) 
	{
	StringBuilder a = new StringBuilder("안녕");
	StringBuilder b = new StringBuilder("맛점");
	add(a, b);
	System.out.println("A = " + a + ", B = " + b);
	}
	
	static void add(StringBuilder a, StringBuilder b)
	{
		a.append(b);
		System.out.println("A = " + a + ", B = " + b);
	}
}
