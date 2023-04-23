package i_exercise;

public class Language {
	
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
