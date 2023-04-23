package b_example;

public class ItemTest {
	
	public static void main(String[] args) {
		
		// Item 클래스를 객체 생성
		Item it = new Item();
		
		//Item 객체에 멤버변수에 1004를 지정
		it.setNo(1004);
		
		//Item 객체에 no 값을 화면 출력
		System.out.println("값: " + it.getNo());
		
		//Item 객체에 method()호출
		it.method();
		
	}

}
