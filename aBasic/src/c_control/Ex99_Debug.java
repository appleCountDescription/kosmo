package c_control;

public class Ex99_Debug 	// 디버그: 프로그램이 어떻게 구동되는지 아는 구조
							// 숫자 옆에 더블클릭 => 브레이크포인트 생성
							// Run => Debug 클릭
							// F6 누르면서 코드 구동되는 방법 확인
							// 확인 끝나면 브레이크포인트 없애기
{
	
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i=2; i<10; i+=2)		// i= 2, 4, 6, 8
		{
			for(int j=3; j>=0; j--)		// j = 3, 2, 1, 0
			{
				sum = i + j;
			}
		}
		System.out.println(sum);
	}

}
