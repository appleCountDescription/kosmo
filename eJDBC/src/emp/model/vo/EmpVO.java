package emp.model.vo;

import lombok.*;
import lombok.Data;
import lombok.NoArgsConstructor;

// EMP 테이블의 레코드를 저장할 수 있는 클래스
// VO(value object, 데이터를 저장하고 전달하기 위한 객체) = DTO
//@NoArgsConstructor
//@Setter
//@Getter
//@ToString
//@Data	// setter, getter, toString 모두
//@AllArgsConstructor	// 인자 있는 생성자함수는 따로 이렇게 써줘야 함
//@NoArgsConstructor	// 기본생성자함수 따로

public class EmpVO {	// 사원의 정보를 담는 클래스

	// 멤버변수 - 이게 있
	private int empno;//사원번호
	private String ename;//이름
	private String job;//업무
	private int mgr;//매니저의 사원번호
	private String hiredate;//입사일
	private int sal;//월급
	private int comm;//보너스
	private int deptno;//부서번호
	
	
	

	//기본생성자 일단 만들기
	public EmpVO() {}
	
	//생성자함수
		public EmpVO(int empno, String ename, String job, int mgr, String hiredate, int sal, int comm, int deptno) {	// 매개변수 - 값을 객체에 넣어 한꺼번에 전달해야 할 때
			super();
			this.empno = empno;	// this.empno(위의 멤버변수 empno)에 INSERT / UPDATE / DELETE / SELECT에 들어갈 empno 값을 넣음
			this.ename = ename;	// 이하 생략
			this.job = job;
			this.mgr = mgr;
			this.hiredate = hiredate;
			this.sal = sal;
			this.comm = comm;
			this.deptno = deptno;
		}
	

	//getter, setter
	public int getEmpno() {
		return empno;	//INSERT / UPDATE / DELETE / SELECT에 들어갈 empno 값이 들어간 멤버변수 empno를 리턴함
	}

	public void setEmpno(int empno) {
		this.empno = empno;	//this.empno(위의 멤버변수 empno)에 INSERT / UPDATE / DELETE / SELECT에 들어갈 empno 값을 넣음
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {	// SELECT창에 띄울 레코드 정보
		return "EmpVO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";	
	}

	
}