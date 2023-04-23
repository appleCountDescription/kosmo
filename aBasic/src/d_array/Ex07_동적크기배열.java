package d_array;

public class Ex07_동적크기배열 {
	
	public static void main(String[] args) 
	{
		char [][] star = new char[4][];	// 참조형 - new로 메모리 확보해야 함
		
		// 동적크기 설정하면서 값 지정
//		for(int i=0; i<star.length; i++)
//		{
//			
//			star[i] = new char[i+1];
//			
//			for(int j=0; j<i+1; j++)
//			{
//				star[i][j] = '*';
//			}
//		}
//		
//		// 출력
//		for(int i=0; i<star.length; i++)
//		{
//			for(int j=0; j < star[i].length; j++)
//			{
//				System.out.print(star[i][j]);
//			}
//			System.out.println("");
//		}
		
		
		//--------------------------------------------------------

//		4. 합이 가장 큰 행을 구하는 프로그램을 작성하세요.
//		int a[][]=new  int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		
		int a[][]= new  int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		int sum[] = new int[a.length];
		int max = sum[0];
		
		for(int i=0; i<a.length; i++)
		{			
			for(int j=0; j<a[i].length; j++)
			{
				sum[i] += a[i][j];
			}
			System.out.println(sum[i]);
		}
		
		for(int i=0; i<sum.length; i++)
		{
			if(sum[i] > max)
			{
				max = sum[i];
			}
		}
		
		for(int i=0; i<sum.length; i++)
		{
			if(max==sum[i])
				System.out.println("합이 가장 큰 행은 "+(i+1)+"번째 행입니다.");
		}
		
	}

}
