package j_abstract;

public class Korean extends Language {

	public Korean() {
		this("안녕하세요", "홍길동입니다", "오늘도 맛점");
	}
	
	public Korean(String greeting, String introduce, String message) {
		super(greeting, introduce, message);	
	}
	
	public void output(int i) {
	}
	
	public void greeting() {
		System.out.println(greeting);
	}
	
	public void introduce() {
		System.out.println(introduce);
	}
	
	public void message() {
		System.out.println(message);
	}
	
}
