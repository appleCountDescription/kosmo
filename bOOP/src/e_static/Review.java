package e_static;

class Item{
	int 일반변수 = 10;
	static int 스태틱변수 = 20;
	
	void 일반함수() {
		일반변수 = 1;
		스태틱변수 = 1;
	}
	
	static void 스태틱함수() {
		스태틱변수 = 2;
		//일반변수 = 2; - 에러 - static은 static만 접근 가능, static은 static부터 읽어냄
	}
}
public class Review {
	public static void main(String[] args) {
		Item i = new Item();
		i.일반변수 = 100;			//이게 정상인 코딩, 스태틱이 유별난 거임
		
		// Item i2 = new Item();
		// i2.스태틱변수 = 200;
		Item.스태틱변수 = 200;
		
		Item i3 = new Item();
		i3.일반함수();
		
		Item.스태틱함수();
		
	}

}
