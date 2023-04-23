package f_singleton;

/*
 * 	****싱글톤 패턴****
 * 		: 객체를 단 한 개로 공유하고자 할 때
 */

public class DBConnect {
	
//	static {
//		System.out.println("스태틱초기화");
//	}
		
	private DBConnect(){	//private 거는 이유: 못 바꾸게
		//여기에 static이 못 오는 이유 다시 고민하기
		System.out.println("실제로 디비연결");
	}
	
	private static DBConnect conn;	//초기값은 null, 앞에 private 없어도 됨
	public static DBConnect getInstance() {
		if(conn==null) conn = new DBConnect();
		return conn;
	}
	
}
