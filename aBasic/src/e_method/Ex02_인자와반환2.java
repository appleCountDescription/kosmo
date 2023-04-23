package e_method;

public class Ex02_인자와반환2 {
	
	public static void main(String[] args) 
	{
		int sum = add();	//sum값을 여기에 던져 줌 + 변수명 다른 이름으로 해도 되지만 헷갈리지 않기 위해 이름 맞춤
		System.out.println("합 = " + sum);
	}
	
	static int add()	// static void add()에서 void는 리턴이 없다는 뜻, void를 int로 바꾸어 줘야 함
	{
		int a = 10, b = 20;
		int sum = a + b;
		return sum;	//반환, 리턴되는 애의 값은 단 하나여야 함
	}	//수행 안 함
}
