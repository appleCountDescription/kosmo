package f_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		
		String [] str = {"행복하자", "맛점", "멍때리기"};
		try {
			for(int i=0; i<3; i++) {	// i가 3일 때와 4일 때의 차이를 살펴보자
				System.out.println(str[i]); //str[3]
			}
			System.out.println("예외가 발생할 여지가 있는 구문");
			return;	//끝내겠다 + System.exit(0); <= 이거는 그냥 끝냄
		}catch(Exception ex) {	// catch가 예외를 잡아내면 try 내의 문장은 출력 안 됨 + catch는 없어도 됨, try만 있어도 됨
			System.out.println("예외 발생" + ex.getMessage());
		}finally {	// finally 쓰는 이유: 
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 정상 종료");	//return이 있으니깐 i=3일 때 출력 안 됨
	}
	
}
