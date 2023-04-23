package c_sansok;

public class Item extends Object {	// Object가 부모의 부모 격(최상위 클래스), extends Object 안 써도 됨
	
	protected String num;		// 번호
	protected String title;		// 제목
	
	public Item(){		//초기화
		num = "0000";
		title = "제목없음";
		System.out.println("부모 기본 생성자");	//먼저 출력
	}
	
	public Item(String num, String title) {
		this.num = num;
		this.title = title;
		System.out.println("부모 인자 생성자");
	}
	
	public void output() {
		System.out.println("[" + num + "]" + title);
	}

}
