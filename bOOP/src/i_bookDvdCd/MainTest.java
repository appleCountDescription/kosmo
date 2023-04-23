package i_bookDvdCd;

public class MainTest {
	
	public static void main(String[] args) {
		
		Book b = new Book();
		b.output();
		System.out.println("--------------");
		Book b2 = new Book("1234", "자바책", "김자바", "코스모");
		b2.output();
		
		Dvd d = new Dvd();
		Cd c = new Cd();

	}

}
