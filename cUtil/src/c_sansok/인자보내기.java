package c_sansok;

public class 인자보내기 {
	public static void main(String[] args) {
		Book b = new Book();
		Dvd d = new Dvd();
		Cd c = new Cd();
		
		method(b, d, c);
	}
	
	static void method(Book b, Dvd d, Cd c) {
		// 출력
		b.output();
		d.output();
		c.output();
	}
	
}
