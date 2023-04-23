package cprepared;

import java.sql.*;

/*
 * 	JDBC: Java DataBase Connectivity
 * 	
 */

public class DeptSelect {
	
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
			String sql = "SELECT * FROM dept";	// insert와 update가 되고 commit이 되었어야지 delete가 됨

			// 4. 전송객체 => Statement / ******PreparedStatemnt / CallableStatement
			PreparedStatement ps = con.prepareStatement(sql);	// sql 문장 먼저 지정
			
			// 5. 전송 => int executeUpdate() - UPDATE, INSERT, DELETE / DDL
			// 			 ResultSet executeQuery() - SELECT
			ResultSet result = ps.executeQuery();	//*****여기에 sql 절대 지정하면 안 됨
			
			// 6. 결과받아서 처리
			while( result.next() ) {
				int deptno = result.getInt("DEPTNO");
				String dname = result.getString("DNAME");
				String loc = result.getString("LOC");
				
				System.out.println(deptno + "/" + dname + "/" + loc);
			};

			//7. 닫기
			ps.close();	// 자식부터 닫자
			con.close();	//그 다음 부모 닫자
			
		}catch(Exception ex) {
			System.out.println("실패" + ex.getMessage());
			ex.printStackTrace();
		}
		
	}

}
