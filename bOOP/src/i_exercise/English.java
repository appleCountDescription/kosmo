package i_exercise;

public class English extends Language {
	
	public English() {
		this("Hello", "I'm Hong", "Enjoy your lunch");
	}
	
	public English(String greeting, String introduce, String message) {
		super(greeting, introduce, message);	
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
