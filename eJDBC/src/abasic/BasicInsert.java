package abasic;

import java.sql.Connection;		// sql 소속인지 꼭 확인하자
import java.sql.DriverManager;
import java.sql.Statement;

public class BasicInsert {

	public static void main(String[] args) {
		// 1. 드라이버를 메모리에 로딩시키기
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 성공");

		// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.79:1521:xe";
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("연결성공");
			
		// 3. SQL 문장
		String sql = "INSERT INTO emp(empno, ename, sal)" + " VALUES(seq_temp_no.nextval, '고다인', 20000)";
		//String sql = "UPDATE emp SET job='IT' WHERE ename='맹돌이'";

			
		// 4. 전송객체
		Statement stmt = con.createStatement();
		
		// 5. 전송
		stmt.executeUpdate(sql);
		
		// 6. 결과받기 ( 없음)
		
		
		// 7. 닫기
		stmt.close();
		con.close();

		}catch(Exception ex) {
			System.out.println("실패: " + ex.getMessage());
		}
	}

}
