package d_array;

public class Ex04_로또2 
{
	public static void main(String[] args) 
	{
		// 1. 변수선언
		int [][] lotto = new int [5][6];		// 5행 6열
		
		// 2. 임의의 값 지정
		for(int i=0; i<5; i++)
		{
			for (int j=0; j<6; j++)
			{
				lotto[i][j] = (int)(Math.random() * 45) + 1;
			}
		}
		
		// 3. 출력
		for(int i = 0; i < 5; i++)	//줄(행)
		{
			for(int j = 0; j < 6; j++)	//개수(열)
			{
				System.out.print(lotto[i][j] + " / ");
			}
			System.out.println();
		}
		
	}
}
