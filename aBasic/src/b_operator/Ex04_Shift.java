package b_operator;

/*
 * 	shift: 모든 비트의 값을 이동하는 연산자, 거의 안 씀, 안 중요함
 * 	
 * 	[예] 
 * 		00000010  << 1 :  00000100
 * 		00000010  >> 1 :  00000001
 */

public class Ex04_Shift {

	public static void main(String[] args) {
		
		int a = 4;  // 00000100 (2의 2승)
		System.out.println( a << 2 ); // 00010000
		System.out.println( a >> 2 ); // 00000001
		System.out.println( a >>> 2 );
	}
	
	/*
	 * << : 왼쪽으로 이동하고 오른쪽에 0 채우기
	 * >> : 오른쪽으로 이동하고 부호와 같은 값으로 채우기
	 * >>> : 오른쪽으로 이동하고 0 채우기
	 */
	
}
