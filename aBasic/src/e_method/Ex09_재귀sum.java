package e_method;

public class Ex09_재귀sum 
{
	
	public static void main(String[] args) 
	{
		int sum = 0;
		sum = sumFunc(5);
		System.out.println("총합: " + sum);
	}
	// 5+4+3+2+1
	
	static int sumFunc(int i)
	{
		if(i==1) return 1;	//반드시 끝나는 시점을 만들어야만 함, 안 그러면 무한루프 => 컴퓨터 혹사
		return i + sumFunc(i-1);		//자기가 자기를 부르는 것이 재귀함수
	}									
	
	
//	public static void main(String[] args) 
//	{
//		int sum = 0;	//초기화
//		for(int i=1; i<=5; i++)
//		{
//			//sum += i;
//			int exsum = sum;
//			sum = exsum + i;
//			System.out.println(sum + '=' + exsum + '+' + i);
//		}
//		System.out.println("총합: " + sum);		
//	}
}
