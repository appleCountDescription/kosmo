package d_array;

public class Ex05_정렬 
{
	public static void main(String[] args) 
	{
		int [][] lotto = new int[5][6];		
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<6; j++)
			{
				lotto[i][j] = (int)(Math.random() * 45) + 1;
				for(int k = 0; k<6; k++)
				{
					if (j!=k & lotto[i][j] == lotto[i][k])
						j=0;
				}
			}
		}
		for(int i = 0; i<5 ; i++)	// 6번 돌리는 건 마찬가지
		{
			for(int j = 6; j>0; j--)
			{
				for(int k=0; k<j-1; k++)
				{
					if(lotto[i][k] > lotto[i][k+1])
					{
						int temps;
						temps = lotto[i][k];
						lotto[i][k] = lotto [i][k+1];
						lotto[i][k+1] = temps;
					}
				}
			}
		}
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(lotto[i][j] + " / ");
			}
			System.out.println("");
		}
	}

}

// 로또 한 줄 배열(1차원 배열)

//int [] lotto = new int [6];
//for(int i=0; i<lotto.length; i++)
//{
//	lotto[i] = (int)(Math.random() * 45) + 1;
//}
//
//// 버블정렬
//for(int i = lotto.length; i>0 ; i--)	// 6번 돌리는 건 마찬가지
//{
//	for(int j=0; j<i-1; j++)
//	{
//		if(lotto[j] > lotto[j+1])
//		{
//			int temps;
//			temps = lotto[j];
//			lotto[j] = lotto [j+1];
//			lotto[j+1] = temps;
//		}
//	}
//}
//
//// 출력
//for(int a=0; a<lotto.length; a++)
//{
//	System.out.print(lotto[a] + " / ");
//}