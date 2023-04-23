package k_interface.yesinterface;

// 1. DBDriver 인터페이스 구현 선언
// 2. 메소드 오버라이딩

public class OracleDriver implements DBDriver {	//인터페이스 물려받는 것: 부모의 미완성인 걸 내가 다 구현해 줄 게

	public OracleDriver() {
		System.out.println("오라클 드라이버");
	}
	
	public void connect() {	// 오버라이딩
		System.out.println("오라클 디비에 연결");
	}
	
	public void insert() {	// 오버라이딩
		System.out.println("오라클에 데이타 입력 작업");
	}
}
