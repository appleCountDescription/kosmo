package e_method;
/*
 * 	Call By Reference여야 하는데 왜 원형이 안 바뀌지?
 * 	 => String은 별종
 */

public class Ex05_CallByString {

	public static void main(String[] args) 
	{
		String a = "안녕";
		String b = "홍길동";
		add(a, b);
		System.out.println("A = " + a + ", B = " + b);
	}
	
	static void add(String a, String b)
	{
		a+=b;
		System.out.println("A = " + a + ", B = " + b);
	}

}
