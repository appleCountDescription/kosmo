package d_array;

// 초기화 = 변수선연 + 값지정
/*
 * 		int a; // 변수선언
 * 		a = 10; // 값지정
 * 
 * 		int b = 20; // 초기화
 */

public class Ex00_배열초기화 
{
	public static void main(String[] args) 
	{
		/*
		int [] xx;
		xx = new int [3];
		xx[0] = 100;
		xx[1] = 80;
		xx[2] = 70;
		*/
		
		int [] arr = new int[] {66, 55, 45, 44, 88, 99};
		// int [] arr = {66, 55, 45, 44, 88, 99};			이것도 가능
//		
//		// 출력
//		for(int i=0; i<6; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		int sum = 0;
		// 총합을 구하기
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		
		System.out.println("총합: " + sum);

	}
}
