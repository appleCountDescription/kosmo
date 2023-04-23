package c_sansok;

public class 결과받기 {

	public static void main(String[] args) {

		Item[] i = method();
		for(int j=0; j<i.length; j++) {
			i[j].output();
		}
		// 출력
	}
	
	static Item[] method() {
		Book b = new Book();
		Dvd d = new Dvd();
		Cd c = new Cd();
		
		Item[] i = {b, d, c};		// Item[] i = new Item[3]
		return i;					// i[0] = b; // 부모변수에 자식객체 생성(지정)
									// i[1] = d;
									// i[2] = c;
	}

}
