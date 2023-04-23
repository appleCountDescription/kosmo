package emp.model;

import java.sql.SQLException;
import java.util.ArrayList;

import emp.model.vo.EmpVO;

public interface EmpModel {	// 인터페이스, 메소드를 정의함, 메소드 구현은 이 인터페이스를 implements한 클래스 EmpModelImpl가 시켜줄 거임
	
	int insert(EmpVO vo) throws SQLException;	// EmpVO 객체(Emp의 모든 정보)를 매개변수로 받아 데이터베이스에 새로운 레코드를 삽입함 + SQLException을 던짐
	int update(EmpVO vo) throws SQLException;	// EmpVO 객체(Emp의 모든 정보)를 매개변수로 받아 데이터베이스의 해당 레코드를 업데이트함 + SQLException을 던짐
	int delete(int empno) throws SQLException;	// 매개변수 empno를 받아 데이터베이스의 해당 레코드를 삭제함 + SQLException을 던짐
	ArrayList<EmpVO> select() throws SQLException;	// 데이터베이스에서 모든 레코드를 검색하여 EmpVO 객체의 ArrayList를 반환함 + SQLException을 던짐

	
}