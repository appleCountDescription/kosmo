package d_array;
/*
 * 		Math.random(): 0.0 <= 임의의 수 < 1.0 실수 - 임의의 수를 하나 던져 줌
 * 				0.89   0.07	  0.56
 * 
 * 		Math.random() * 10
 * 				8.9   0.7	  5.6
 * 
 * 		(int)(Math.random() * 10)
 * 	 			8   0	  5
 */

public class Ex04_로또 
{
	public static void main(String[] args) 
	{
		// 1. 변수선언
		
		int [] lotto = new int[6];	//정수가 6개 있는 공간을 만듦
		
		// 2. 값 지정
		for(int i=0; i<lotto.length; i++)
		{
			lotto[i] = (int)(Math.random() * 45) + 1;
		}
		
		// 3. 출력
		for(int i=0; i<lotto.length; i++)
		{
			System.out.print(lotto[i] + "/");
		}
	}
}
