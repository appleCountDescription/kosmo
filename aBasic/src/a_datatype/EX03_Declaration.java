package a_datatype;

public class EX03_Declaration {

	public static void main(String[] args) {
		
		// (1) 변수선언 + 값 대입
		int kor; // 정수형 변수 kor을 선언한다 
		kor = 30; // kor 변수에 30값을 대입한다
		
		// (2) 변수선언 시 값 대입 (초기화)
		int eng = 30;
		
		// (3) 여러 개 변수 선언 가능
		int math=40, java=50;
		
		//-----------------------------------------
		// 비교
		if( kor == math) { // == 이게 같다는 연산자
			System.out.println("두 점수 동일");
		}else { // == 같지 않을 경우
			System.out.println("두 점수 다름");
		}
		
		//-----------------------------------------
		// 출력
		System.out.println("국어:" + kor + ", 영어" + eng);
		System.out.printf("국어: %d, 영어: %d", kor, eng);
		
		//-----------------------------------------
		// 두 변수의 값 바꾸기: swap
		int a = 10, b = 20; 
		System.out.println("a=" + a + ", b=" + b); // 여기서 a와 b의 값을 바꾸려면 1) a값을 temp으로 빼놓고 2) b값으로 a값을 덮은 다음 3) 빼놨던 a값을 b자리에 넣자
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a + ",b=" + b);
		
	}
}
