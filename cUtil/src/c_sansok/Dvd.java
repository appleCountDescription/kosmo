package c_sansok;

public class Dvd extends Item {
	
	private String actor;		//protected - 자식에게는 허용
	private String director;
	
	public Dvd() {
		num = "8888";
		title = "팬텀 스레드";
		actor = "다니엘 데이 루이스";
		director = "폴 토마스 앤더슨";
	}
	
	public Dvd(String num, String title, String actor, String director) {
		super.num = num;		//super: 부모의 객체를 지칭
		super.title = title;
		this.actor = actor;
		this.director = director;	
	}
	
	public void output() {
		System.out.println("[" + num + "]" + title + actor + director);
	}

}
