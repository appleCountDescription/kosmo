package c_control;

public class Ex13_while복습 {
	
	public static void main(String[] args) {
	// [복습]
	// while문을 벗어난 후 sum의 값이 1부터 10까지 더한 55가 출력되도록 밑줄에 들어갈 알맞은 연
		
		int n = 1;
		int sum = 0;
		while(true)
		{
			sum+=n;
			if(n++ == 10)
			break;
		}
		System.out.println("SUM = " + sum);
		
		
	}

}