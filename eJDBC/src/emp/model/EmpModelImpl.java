package emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import emp.model.vo.EmpVO;

// JDBC: 

public class EmpModelImpl implements EmpModel {		// EmpModel 인터페이스 물려받기: 미완성된 인터페이스를 이 클래스가 완성시켜 줄 것임(오버라이딩을 통해)
	
	// 1. 드라이버 로딩
	
	public EmpModelImpl() throws ClassNotFoundException {	// 생성자, ClassNotFoundException을 생성자에서 직접 처리하지 않고 예외를 connectDB로 던져버림
		Class.forName("oracle.jdbc.driver.OracleDriver");	// 해당 드라이버가 사용될 클래스패스에 드라이버파일(ojdbc6.jar)을 추가하고, Class.forName 함수를 사용해 oracle.jdbc.driver.OracleDriver라는 클래스를 불러옴. 즉 Oracle JDBC 드라이버를 로드함
	}
	
	//2. 메소드 오버라이딩: EmpModelImpl의 상위인 인터페이스 EmpModel에 정의된 메소드를 하위 클래스인 EmpModelImpl에서 재정의함
	//				   즉 추상 클래스와 다름없는 인터페이스에 기능을 넣는 것임

	@Override
	public int insert(EmpVO vo) throws SQLException {		// Oracle SQL의 insert 기능을 담은 메소드. EmpVO 객체에서 empno 등 모든 정보가 담긴 vo 객체를 매개변수로 가져옴. 이 메소드에서 SQLException을 직접 처리하지 않고, 이 메소드를 호출한 쪽에서 예외를 처리하게 함
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// url, 즉 JDBC의 위치를 담은 객체를 만듦. 그 객체에는 jdbc:oracle:thin:@127.0.0.1:1521:xe 값이 담김. jdbc:oracle:thin - Oracle JDBC Thin Driver를 사용함 / 127.0.0.1:1521:xe - IP주소와 포트 번호 SID 값을 나타냄     
		String user = "scott";	// Oracle에 접속할 계정 ID임
		String pass = "tiger";	// Oracle에 접속할 계정 PW임
		Connection con = null;	// Connection 인터페이스는 DB와의 연결을 나타냄. DB와 연결하려면 Connection 객체가 필요함
		int result;	//	변경된 레코드 수 result에다가 넣음
		
		try{	// SQL 쿼리를 실행하는 메소드는 SQLException이 생길 수 있으므로 try-catch를 써 줘야 함
			// 2. 연결객체
			con = DriverManager.getConnection(url, user, pass);	// DriverManager.getConnection() 메소드를 사용하여 DB와 연결 시도함, 인자로는 url, id 그리고 비밀번호가 필요함. DB와 연결시킨 후 연결객체 con에 이 메소드의 주소값을 할당함
			System.out.println("연결성공");
			
				String sql = "INSERT INTO " + "emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";	// sql 쿼리문 작성, ?는 setInt로 설정할 값
			// 4. 전송객체 - PreparedStatement
				PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement(대문자)는 SQL문을 처리하는 데 필요한 인터페이스임. 이 객체에다가 connection 함수에 들어 있는 preparedStatement(sql)(소문자) 함수의 주소값을 할당함. 
																  // preparedStatement()는 DB에 전송할 SQL 쿼리(인자 sql)를 미리 컴파일하고, 이 쿼리를 나중에 실행할 때 재사용할 수 있는 PreparedStatement 객체를 생성하는 메소드임
			
				ps.setInt(1, vo.getEmpno());	// PreparedStatement 안의 함수 setInt()를 통해 쿼리문의 첫 번째 값에 vo.getEmpno()값을 넣음
				ps.setString(2, vo.getEname());	// PreparedStatement 안의 함수 setString()을 통해 쿼리문의 두 번째 값에 vo.getEname()값을 넣음
				ps.setString(3, vo.getJob());	//	... 이하 생략
				ps.setInt(4, vo.getMgr());		//	
				ps.setString(5, vo.getHiredate());	//
				ps.setInt(6, vo.getSal());		//
				ps.setInt(7, vo.getComm());		//
				ps.setInt(8, vo.getDeptno());	//
				
				
			// 5. 전송 - executeUpdate
				result = ps.executeUpdate();	// PreparedStatement를 통해 전달된 SQL 쿼리를 실행하고 업데이트된 레코드의 개수를 반환함, INSERT/UPDATE/DELETE 쿼리를 실행할 때 사용
				
			// 6. 결과 받아 처리
			}finally {	// 쿼리문 실행 이후에는 어떤 일이 있어도 DB연결을 꺼야 하므로 finally를 써야 함
			// 7. 닫기
				con.close();	// JDBC에서 Connection 객체를 종료함
			}
		return result;	// 변경된 레코드 수 반환함
	}
	
	@Override
	public int update(EmpVO vo) throws SQLException {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// 127~: 자기 ip로 연결
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		int result;
		
		try{
		// 2. 연결객체
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("연결성공");
		
		
		// 3. sql 문장 - INSERT 문장
			String sql = "UPDATE emp SET ename = ?, job = ?, mgr =?, hiredate = ?, sal = ?, comm = ?, deptno = ?  WHERE empno=?";
		// 4. 전송객체 - PreparedStatement
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getEname());		// 
			ps.setString(2, vo.getJob());
			ps.setInt(3, vo.getMgr());
			ps.setString(4, vo.getHiredate());
			ps.setInt(5, vo.getSal());
			ps.setInt(6, vo.getComm());
			ps.setInt(7, vo.getDeptno());
			ps.setInt(8, vo.getEmpno());
			
			result = ps.executeUpdate();
			return result;
		// 5. 전송 - executeUpdate
			
		// 6. 결과 받아 처리
		}finally {
		// 7. 닫기
			
			con.close();
		}
		
	}


	@Override
	public int delete(int empno) throws SQLException {
		
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// 127~: 자기 ip로 연결
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		PreparedStatement ps = null;
		int result;
		try{
			// 2. 연결객체
			con = DriverManager.getConnection(url, user, pass);

			// 3. sql 문장
			String sql = "DELETE FROM emp WHERE empno=?";
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setInt(1, empno);
			
			// 5. 전송
			result = ps.executeUpdate();
				
			}finally {
			// 7. 닫기
			con.close();
		}
		
		return result;

	}

	@Override
	public ArrayList<EmpVO> select() throws SQLException {	// ArrayList와 EmpVO 객체 내에만 있는 메소드와 변수를 리턴하는 함수 select임
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();		// 동적배열 객체변수 list에 객체 ArrayList<EmpVO>()를 넣음 

		String ur1 = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String pass = "tiger";

		Connection con = null;
		PreparedStatement ps = null;

		try {

			// 2. 연결객체
			con = DriverManager.getConnection(ur1, user, pass);

			//3. SQL 문장
			String sql = "SELECT * FROM emp";

			//4. 전송객체 - PreparedStatement
			ps = con.prepareStatement(sql);

			//5. 전송 - executeQuery()
			ResultSet rs = ps.executeQuery();	// PreparedStatement를 통해 전달된 SQL 쿼리를 실행하고 결과를 반환함, SELECT 쿼리를 실행할 때 사용

			// 6. 결과받아 처리
			while(rs.next()){	//rs.next(): 더 이상 레코드가 없으면 false를 반환함(루프 종료 위해)
				EmpVO vo = new EmpVO();		// EmpVO에서 set 메소드들을 사용하기 위해 객체 생성
				vo.setEmpno(rs.getInt("EMPNO"));	// select 쿼리를 실행해서 나온 empno 컬럼의 int값을 얻어오고, 그 값을 EmpVO 안의 함수 setEmpno()에다가 집어넣음
				vo.setEname( rs.getString("ENAME") );
				vo.setJob(rs.getString("JOB"));
				vo.setMgr(rs.getInt("MGR"));
				vo.setHiredate(rs.getString("HIREDATE"));
				vo.setSal(rs.getInt("SAL"));
				vo.setComm(rs.getInt("COMM"));
				vo.setDeptno(rs.getInt("DEPTNO"));

				list.add(vo);	// ArrayList에다가 vo.setEmpno(rs.getInt("EMPNO"));를 비롯한 모든 set 메소드들을 더함
			}

		 }finally {
			    // 7. 닫기
			ps.close();	//	
			con.close();
		 }	    
		 return list;
	}
}

