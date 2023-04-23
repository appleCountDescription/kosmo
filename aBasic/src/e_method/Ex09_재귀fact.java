package e_method;

// 5! = 5*4*3*2*1
// 

public class Ex09_재귀fact 
{

	public static void main(String[] args) 
	{
		int fact = 0;
		fact = factFunc(5);
		System.out.println("5! = " + fact);
	}
	
	static int factFunc(int i)
	{
		if(i==1) return 1;	//반드시 끝나는 시점을 만들어야만 함, 안 그러면 무한루프 => 컴퓨터 혹사
		return i * factFunc(i-1);
	}

}
