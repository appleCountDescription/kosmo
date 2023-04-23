package b_example;

public class MainTest {
	
	public static void main(String[] args) {
		
		Book b = new Book();	//메모리에 올라오는 것
		//b.title = "홍길동"; 이렇게 하면 private이 안 보임
		b.setTitle("홍길동");
		b.setIsbn("1004");
		b.setPrice(10000);
		b.setWriter("허균");
		//책번호: 1004
		//가격: 10,000원
		//저자: 허균
		System.out.println(b.toString());
	}

}
