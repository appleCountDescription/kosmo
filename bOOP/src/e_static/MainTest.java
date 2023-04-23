package e_static;

public class MainTest {
	
	public static void main(String[] args) {	//main, 매개변수는 String[], 리턴형 없음, 메서드는 퍼블릭, static이면 메모리에 먼저 올라갔다는 뜻
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		//System.out.println("책 갯수: " + b1.getCount());
		//System.out.println("책 갯수: " + b2.getCount());
		//System.out.println("책 갯수: " + b3.getCount());
		
		System.out.println("책 갯수: " + Book.getCount()); // 객체명이 아닌 클래스명으로 접근
	}

}
/* 
 * Math m = new Math();  객체 생성
 * m.random();  이렇게 사용
 * 
 * 그런데
 * Math.random();   random()이 static이기 때문에 객체 없이 클래스에 접근
 * 
 * 
 */