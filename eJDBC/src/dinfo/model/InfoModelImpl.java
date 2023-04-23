package dinfo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dinfo.model.vo.InfoVO;

public class InfoModelImpl implements InfoModel {
	
	public InfoModelImpl() throws ClassNotFoundException {
		// 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 성공");
	}
	/**
	 * 함수명: insert
	 * @param vo: InfoVO
	 * @return: 입력결과
	 * @throws SQLException
	 * 역할: 사용자입력값을 infoVO로 받아서 실제 테이블에 입력하는 함수
	 * 
	 */
	
	@Override
	public void insert(InfoVO vo) throws SQLException {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// 127~: 자기 ip로 연결
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		
		try{
		// 2. 연결객체
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("연결성공");
		
		// 3. sql 문장 - INSERT 문장
			String sql = "INSERT INTO " + "info(tel, name, id, sex, age, home)" + "VALUES(?,?,?,?,?,?)";
		// 4. 전송객체 - PreparedStatement
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTel());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getId());
			ps.setString(4, vo.getSex());
			ps.setInt(5, vo.getAge());
			ps.setString(6, vo.getHome());
			
		// 5. 전송 - executeUpdate
			ps.executeUpdate();
			//int result = ps.executeUpdate();
			//return result;
			
		// 6. 결과 받아 처리
		}finally {
		// 7. 닫기
			con.close();
		}
		
		
	}
	
	
	@Override
	public InfoVO modify(String name, String id, String sex, int age, String home, String tel) throws Exception {
		InfoVO vo = new InfoVO();
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// 127~: 자기 ip로 연결
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		
		try{
		// 2. 연결객체
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("연결성공");
		
		
		// 3. sql 문장 - INSERT 문장
			String sql = "UPDATE info SET name = ?, id = ?, sex =?, age = ?, home = ?  WHERE tel=?";
		// 4. 전송객체 - PreparedStatement
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, id);
			ps.setString(3, sex);
			ps.setInt(4, age);
			ps.setString(5, home);
			ps.setString(6, tel);
			
		// 5. 전송 - executeUpdate
			ps.executeUpdate();
			
		// 6. 결과 받아 처리
		}finally {
		// 7. 닫기
			
			con.close();
		}
		
		return vo;
		
	}
	
	//Delete 누르면 레코드 없애기
	//Cancel을 Modify로 바꾸기
	
	/**
	 * 함수명: selectByPk
	 * @param 사용자가 검색하기를 원하는 전화번호
	 * @return 해당전화번호와 일치하는 정보(레코드)
	 * @throws Exception
	 * 역할: 
	 */
	
	@Override
	public InfoVO selectByPk(String tel) throws Exception {
		InfoVO vo = new InfoVO();
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// 127~: 자기 ip로 연결
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			// 2. 연결객체
			con = DriverManager.getConnection(url, user, pass);

			// 3. sql 문장
			String sql = "SELECT * FROM info " + " WHERE tel=?";
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			
			// 5. 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setTel(rs.getString("TEL"));
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("ID"));
				vo.setSex(rs.getString("SEX"));
				vo.setAge(Integer.parseInt(rs.getString("AGE")));
				vo.setHome(rs.getString("HOME"));
			}
			
			}finally {
			// 7. 닫기
			ps.close();
			con.close();
		}
		
		return vo;
	}
	
	/**
	 * 함수명: selectByPk
	 * @param 사용자가 검색하기를 원하는 전화번호
	 * @return 해당전화번호와 일치하는 정보(레코드)
	 * @throws Exception
	 * 역할: 
	 */
	
	@Override
	public InfoVO selectByPk2(String id) throws Exception {
		InfoVO vo = new InfoVO();
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// 127~: 자기 ip로 연결
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			// 2. 연결객체
			con = DriverManager.getConnection(url, user, pass);

			// 3. sql 문장
			String sql = "SELECT * FROM info " + " WHERE trim(id)=?";
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			// 5. 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setTel(rs.getString("TEL"));
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("ID"));
				vo.setSex(rs.getString("SEX"));
				vo.setAge(Integer.parseInt(rs.getString("AGE")));
				vo.setHome(rs.getString("HOME"));
			}
			
			}finally {
			// 7. 닫기
			ps.close();
			con.close();
		}
		
		return vo;
	}
	
	@Override
	public InfoVO deleteByPK(String tel) throws Exception {
		InfoVO vo = new InfoVO();
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	// 127~: 자기 ip로 연결
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			// 2. 연결객체
			con = DriverManager.getConnection(url, user, pass);

			// 3. sql 문장
			String sql = "DELETE FROM info " + " WHERE tel=?";
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			
			// 5. 전송
			ps.executeUpdate();
			
			vo.setTel(null);
			vo.setName(null);
			vo.setId(null);
			vo.setSex(null);
			vo.setAge(Integer.parseInt(null));
			vo.setHome(null);
			
			ps.executeUpdate();
			
			}finally {
			// 7. 닫기
			con.close();
		}
		
		return vo;
	}
	
	@Override
	public ArrayList<InfoVO> selectAll() throws Exception {
		
		ArrayList<InfoVO> list = new ArrayList<InfoVO>();

		String ur1 = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String pass = "tiger";

		Connection con = null;
		PreparedStatement ps = null;

		try {
						
			// 2. 연결객체
			con = DriverManager.getConnection(ur1, user, pass);
			
			//3. SQL 문장
			String sql = "SELECT * FROM info";
		
			//4. 전송객체 - PreparedStatement
			ps = con.prepareStatement(sql);
			
			//5. 전송 - executeQuery()
			ResultSet rs = ps.executeQuery();

			// 6. 결과받아 처리
			while(rs.next()){
				InfoVO vo = new InfoVO();
				vo.setTel("TEL");
				vo.setName( rs.getString("NAME") );
				vo.setId(rs.getString("ID"));
				vo.setSex(rs.getString("SEX"));
				vo.setAge(rs.getInt("Age"));
				vo.setHome(rs.getString("Home"));
			
				list.add(vo);
			}

		 }finally {
			    // 7. 닫기
			ps.close();
			con.close();
		 }	    
		 return list;
	}

}

