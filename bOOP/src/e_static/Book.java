package e_static; // static: 객체를 공유 + static은 읽는 순간 heap에 메모리 올라옴, 객체가 없어도 static이 있으면 메모리에 올라온다.

/*
 * 	static
 * 		- *****멤버를 공유
 * 		- 멤버변수가 단 한 개 생성
 * 		- 클래스명으로 접근
 * 		- 어떤 애가 '나 이거 객체마다 공유했으면 좋겠어!'하면 씀
 */

public class Book {
	
	private static int count = 0;
	
	public Book(){
		count++;
		System.out.println("책 한 권 생성");
	}
	
	public static int getCount() {
		return count;
	}

}
