package e_method;

//	static 함수에서는 static 함수나 변수만 접근가능

public class Ex01_static 
{
	
	public static void main(String[] args) 
	{
		System.out.println("메인 시작");
		method();
		System.out.println("메인 끝");
	}
	
	static void method() 
	{
		System.out.println("함수 실행");
	}

}
