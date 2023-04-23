package dinfo.model;

import java.sql.SQLException;
import java.util.ArrayList;

import dinfo.model.vo.InfoVO;

public interface InfoModel {	//개발: 인터페이스부터 만들기

	/**
	 * 함수명: insert
	 * @param vo: InfoVO
	 * @return: 입력결과
	 * @throws SQLException
	 * 역할: 사용자입력값을 infoVO로 받아서 실제 테이블에 입력하는 함수
	 * 
	 */

	void insert(InfoVO vo) throws SQLException;

	InfoVO modify(String name, String id, String sex, int age, String home, String tel) throws Exception;

	/**
	 * 함수명: selectByPk
	 * @param 사용자가 검색하기를 원하는 전화번호
	 * @return 해당전화번호와 일치하는 정보(레코드)
	 * @throws Exception
	 * 역할: 
	 */

	InfoVO selectByPk(String tel) throws Exception;

	/**
	 * 함수명: selectByPk
	 * @param 사용자가 검색하기를 원하는 전화번호
	 * @return 해당전화번호와 일치하는 정보(레코드)
	 * @throws Exception
	 * 역할: 
	 */

	InfoVO selectByPk2(String id) throws Exception;

	InfoVO deleteByPK(String tel) throws Exception;

	ArrayList<InfoVO> selectAll() throws Exception;

}