package j_abstract;

public class French extends Language {
	
	public French() {
		this("Salut", "Je suis Hong", "Bon appétit");
	}
	
	public French(String greeting, String introduce, String message) {
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
