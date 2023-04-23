package k_interface.yesinterface;

public class MainTest {

	public static void main(String[] args) {
		
		// 1. 오라클 디비에 연결하고 사용한다면?
		// DBDriver db = new OracleDriver();
		
		// 2. 오라클 디비에서 마리아 디비로 변경한다면?
		DBDriver db = new MariadbDriver();
		
		// ************************************
		// 밑의 건 안 바뀜: 인터페이스만 바뀌고, 밑의 것은 표준화함
		db.connect();
		db.insert();

	}

}
