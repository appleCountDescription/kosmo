package k_interface.nointerface;

public class MainTest {

	public static void main(String[] args) {
		
		// 1. 오라클 디비에 연결하고 사용한다면?
//		OracleDriver ora = new OracleDriver();
//		ora.connectOracle();
//		ora.insertOracle();
		
		// 2. 오라클 디비에서 마리아 디비로 변경한다면?
		MariadbDriver mar = new MariadbDriver();
		mar.connectDB();
		mar.insertDB();
		
		//* 인터페이스 없으면 다 뜯어고쳐야 함
	}

}
