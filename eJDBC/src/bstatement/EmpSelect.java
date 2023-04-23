package bstatement;

/*
 * 	HR 계정에서 사원테이블(employees)에서 사번, 사원명(full_name), 월급, 부서번호 출력
 */
import java.sql.*;

public class EmpSelect {
	
	public static void main(String[] args) {
		
		try {
			// 1. 드라이버 메모리에 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 연결객체
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// 127~: 자기 ip로 연결
			String user = "HR";
			String pass = "hr";
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("연결성공");
			
			// 3. SQL 작성
			String sql = "SELECT employee_id, first_name || ' ' || last_name full_name, salary, department_id FROM employees";	// insert와 update가 되고 commit이 되었어야지 delete가 됨
			
			// 4. 전송객체 => Statement / ******PreparedStatemnt / CallableStatement
			Statement stmt = con.createStatement();
			
			// 5. 전송 => int executeUpdate() - UPDATE, INSERT, DELETE / DDL
			// 			 ResultSet executeQuery() - SELECT
			ResultSet result = stmt.executeQuery(sql);
			
			// 6. 결과받아서 처리
			while( result.next() ) {
			int employee_id = result.getInt("employee_id");
			String full_name = result.getString("full_name");
			int salary = result.getInt("salary");
			int department_id = result.getInt("department_id");
							
			System.out.println(employee_id + "/" + full_name + "/" + salary + "/" + department_id);
			};
			
			//7. 닫기
			stmt.close();	// 자식부터 닫자
			con.close();	//그 다음 부모 닫자
			
			
		}catch(Exception ex) {
			System.out.println("실패" + ex.getMessage());
			ex.printStackTrace();
		}
		
	}

}
