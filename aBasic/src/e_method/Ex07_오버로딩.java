package e_method;

/*
 * 	오버로딩(overloading)
 * 	 - (같은 역할을 하기 때문에) 동일한 함수명을 지닌 함수들
 * 	 - 구별방법: 인자의 자료형이나 개수 달라야 함
 */

public class Ex07_오버로딩 {

	public static void main(String[] args) 
	{
		String a = new String("홍길순");
		StringBuffer b = new StringBuffer("홍길자");
		char[] c = new char[] {'홍', '길', '동'};
		
		// add()에서 넘겨받은 인자의 값에 "화이팅!!" 문자 붙이기
		add(a);
		add(b);
		add(c);
	}
	
	static void add(String a)
	{
		a += " 화이팅!";
		System.out.println(a);
	}
	static void add(StringBuffer b)
	{
		b.append(" 화이팅!");
		System.out.println(b);
	}
	static void add(char[] c)
	{
		for(int i=0; i<3; i++)
		{
			System.out.print(c[i]);
		}
		System.out.println(" 화이팅!");
	}
}

