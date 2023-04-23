package bstatement;

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
			String sql = "UPDATE dept SET dname='개발', loc='인천' WHERE deptno=50";
								
			// 4. 전송객체 => Statement / ******PreparedStatemnt / CallableStatement
			Statement stmt = con.createStatement();
			
			
			// 5. 전송 => int executeUpdate() - UPDATE, INSERT, DELETE / DDL
			// 			 ResultSet executeQuery() - SELECT
			int result = stmt.executeUpdate(sql);
			
			// 6. 결과받아서 처리
			System.out.println(result + "행을 성공");
			//7. 닫기
			stmt.close();	// 자식부터 닫자
			con.close();	//그 다음 부모 닫자
			
		}catch(Exception ex) {
			System.out.println("실패" + ex.getMessage());
			ex.printStackTrace();
		}
		
	}

}
