package c_control;

/*
 * 	for( 초기치 ; 조건문 ; 증가치 ){
 * 		반복구문
 * 	}
 */
public class Ex05_for개념 {
	
	public static void main(String[] args) {
		
		// [예1] 1~10 숫자를 출력
//		for(int i=1; i<=10; i++)
//		{
//			System.out.print(i + " ");
//		}
		
		//[예] A~Z 출력
		for(char alpha = 'A'; alpha<='Z'; alpha++)
			{
				System.out.print(alpha + " ");
			}
		
		//[참고] 	a++;
		//		a=a+2 (a+=2;)
		for(char alpha = 'A'; alpha<='Z'; alpha+=2)
		{
			System.out.print(alpha + " ");
		}
		System.out.println();
		
		//[예3] Z~A출력
		for(char alpha = 'Z'; alpha>='A'; alpha--)		// alpha--와 alpha-=1은 같음
		{
			System.out.print(alpha + " ");
		}
		System.out.println();
		
		//[연습]
		//		1~10까지 숫자의 합을 구하기
		int total = 0;
		for(int i = 1; i<=10; i++)
		{
			total += i;
		}
		System.out.print(total);
	
	}

}
