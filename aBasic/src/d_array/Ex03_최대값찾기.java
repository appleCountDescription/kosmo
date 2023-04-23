package d_array;

/*
 * < 최대값찾기 >

최대값은 배열 중에서 가장 큰 값을 찾아내는 알고리즘이다. 
사람은 데이타를 보면 척보고 어느것이 가장 크고, 
어느것이 가장 작은지 알아낼 수 있다.
그러나 컴퓨터는 본다, 비교한다 라는 기능을 자동으로 할 수 없으므로 
두뇌가 행동하는 것과 같은 기능을 부여해야 한다. 

최대값을 찾는 방법은 이렇다. 
우선 임의의 변수를 정의하고 예를 들어 max 라 하자. 
1. 이 변수에 배열의 첫번째 값을 입력한다. 
2. 이 값이 가장 크다고 가정하고 다음번 방에 있는 데이타와 비교를 한다. 
3. 이 변수에 저장된 값보다 큰 값이 들어오면 더 큰 값으로 저장 한다. 
4. 이 과정(2-3단계)을 배열이 끝날때 까지 반복하면 된다.
 */

public class Ex03_최대값찾기 
{
	
	public static void main(String[] args) 
	{
		int data[] = {12, 55, 98, 17, 63, 9, 120};
		
		int max = data[0];	// max에는 12가 들어 있음
		
		for(int i=0; i<data.length; i++)
		{
			if(data[i] > max) max = data[i];
//			else continue;		//필요 없음
		}
		System.out.println("최대값: " + max);
	}
	
}