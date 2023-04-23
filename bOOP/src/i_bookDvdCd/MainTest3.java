package i_bookDvdCd;

public class MainTest3 {
	
	public static void main(String[] args) {
		//(1) 부모변수 생성
		Item i = null;		
		System.out.println("원하는 상품 선택: 1.Book 2.Dvd 3.Cd ->");
		int sel = 1; // 사용자 입력값
		switch(sel) {
				// (2) 부모변수에 자식객체 생성
		case 1: i = new Book(); break;
		case 2: i = new Dvd(); break;
		case 3: i = new Cd(); break;
		}
		// (3) 다형성*****************************************
		i.output();
		
		
		
	}

}
