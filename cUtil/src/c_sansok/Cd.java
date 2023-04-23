package c_sansok;

public class Cd extends Item {
	
	private String artist;
	
	public Cd() {
		num = "7777";
		title = "가장 보통의 존재";
		artist = "언니네 이발관";
	}
	
	public Cd(String num, String title, String artist) {
		super.num = num;		//super: 부모의 객체를 지칭
		super.title = title;
		this.artist = artist;
	}
	
	public void output() {
		System.out.println("[" + num + "]" + title + artist);
	}

}
