package b_example;

// 데이터를 저장하는 클래스

public class Book {
	
	private String isbn;	// private - 캡슐화
	private String title;	//1번타이틀
	private String writer;
	private int price;		//setter getter: 건드릴 수 없는 권한

	public void setTitle(String title) {	//2번타이틀 (매개변수)
		this.title = title;	//this라고 해야지 
	}
	public String getTitle() {
		return this.title;	//this 없어도 위의 것 참조 가능
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", price=" + price + "]";
	}
	
}

	

/*
 * 	책의 정보를 관리하는 Book 클래스
 * 	'책번호isbn
 * 	'책제목title
 * 	'저자writer
 * 	'가격price		// 위 4가지 정보를 다 묶는 것이 클래스!
*/