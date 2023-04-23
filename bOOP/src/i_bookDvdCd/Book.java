package i_bookDvdCd;

/*
 * 	
 */

public class Book extends Item {
	
	private String writer;
	private String publisher;
	
	public Book () {		//무조건 기본
		this("9999", "복음주의자", "알퐁스 도데", "프랑슈");
//		num = "9999";	
//		title = "복음주의자";
//		writer = "알퐁스 도데";
//		publisher = "프랑슈";
		System.out.println("Book 기본 생성자");		//세 번째로 출력
	}
	
	public Book(String num, String title, String writer, String publisher) {
//		super.num = num;		//super: 부모의 객체를 지칭
//		super.title = title;	// 부모의 멤버를 지칭
		super(num, title);
		this.writer = writer;
		this.publisher = publisher;	
		System.out.println("Book 인자 생성자");		//두 번째로 출력
	}
	
	public void output() {
		System.out.println("[" + num + "]" + title + writer + publisher);
	}

}

/*
 * 오버라이딩
 * 	' 상속관계에서 함수명이 동일해야 함
 * 	' 인자와 리턴값도 동일해야 함
 * 	' 접근지정자는 동일하거나 접근범위가 더 큰 지정자여야 함
 */