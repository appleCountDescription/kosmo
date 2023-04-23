package cprepared;

import java.sql.*;

/*
 * 	JDBC: Java DataBase Connectivity
 * 	
 */

public class DeptUpdate {
	
	public static void main(String[] args) {
	
		try {
			
			// 1. 드라이버 메모리에 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 연결객체
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// 127~: 자기 ip로 연결
			String user = "scott";
			String pass = "tiger";
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("연결성공");
			
			// 3. SQL 작성
			int deptno = 70;
			String dname = "JAVA";
			String loc = "GASAN";
			
			//*********** (1) SQL 잘 만들기
			String sql = "UPDATE dept SET dname=?, loc=? WHERE deptno=?";

			// 4. 전송객체 => Statement / ******PreparedStatemnt / CallableStatement
			PreparedStatement ps = con.prepareStatement(sql);		// ******* 지정을 잘하자
			 // 데이터베이스라 1부터 시작
			ps.setString(1, dname);
			ps.setString(2, loc);
			ps.setInt(3, deptno);
			
			// 5. 전송 => int executeUpdate() - UPDATE, INSERT, DELETE / DDL
			// 			 ResultSet executeQuery() - SELECT
			int result = ps.executeUpdate();
			
			// 6. 결과받아서 처리
			System.out.println(result + "행을 성공");
			//7. 닫기
			ps.close();	// 자식부터 닫자
			con.close();	//그 다음 부모 닫자
			
		}catch(Exception ex) {
			System.out.println("실패" + ex.getMessage());
			ex.printStackTrace();
		}
		
	}

}
