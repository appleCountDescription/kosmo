package bstatement;

/*
 * 	HR 계정에서 사원테이블(employees)에서 사번, 사원명(full_name), 월급, 부서번호 출력
 * 	-----------------------------------------------------
 * 		부서명      인원수       평균월급
 * 	-----------------------------------------------------
 */
import java.sql.*;

public class EmpSelect2 {
	
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
			String sql = "SELECT d.department_name department_name, count(*) count, avg(e.salary) avg_salary FROM employees e INNER JOIN departments d ON e.department_id = d.department_id GROUP BY d.department_name";
			
			// 4. 전송객체 => Statement / ******PreparedStatemnt / CallableStatement
			Statement stmt = con.createStatement();
			
			// 5. 전송 => int executeUpdate() - UPDATE, INSERT, DELETE / DDL
			// 			 ResultSet executeQuery() - SELECT
			ResultSet result = stmt.executeQuery(sql);
			
			// 6. 결과받아서 처리
			System.out.println("부서명" + "/" + "인원수" + "/" + "평균월급");
			while( result.next() ) {
			String department_name = result.getString("department_name");
			int count = result.getInt("count");
			int avg_salary = result.getInt("avg_salary");
							
			System.out.println(department_name + "/" + count + "/" + avg_salary);
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
