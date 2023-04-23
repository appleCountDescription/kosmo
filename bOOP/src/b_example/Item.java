package b_example;

public class Item {
	
	// 멤버변수 no 정수형 변수를 선언(private이라고 지정)
	private int no;
	
	//setter, getter 생성
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String method() {
		return "Item [getNo()=" + getNo() + "]";
	}
	
	//멤버메소드 method() 함수 선언(public)

	
}
