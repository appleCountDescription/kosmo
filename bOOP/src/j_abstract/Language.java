package j_abstract;

/*
 * 	abstract: 미완성
 * 		- 메소드: 구현없는 미완성 메소드
 * 				=> overriding 강제성 주기 위해
 * 		- 클래스: 하나라도 미완성 메소드를 가지고 있는 클래스
 * 				미완성 클래스는 객체생성 불가능
 */

public abstract class Language {	
	
	public abstract void greeting();
	
	public void introduce() {
		System.out.println(introduce);
	}
	
	public void message() {
		System.out.println(message);
	}
	
	protected String greeting;
	protected String introduce;
	protected String message;
	
	public Language() {
		greeting = "인사";
		introduce = "소개";
		message = "메시지";
	}
	
	public Language(String greeting, String introduce, String message) {
		this.greeting = greeting;
		this.introduce = introduce;
		this.message = message;
	}
	
	
	
}
