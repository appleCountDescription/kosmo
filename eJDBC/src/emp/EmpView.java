package emp;

// 이하 import 구문
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import emp.model.EmpModel;
import emp.model.EmpModelImpl;
import emp.model.vo.EmpVO;

public class EmpView {

	// 화면 관련 멤버변수
	JFrame j;
	JTextField tfEmpno, tfEname, tfJob, tfMgr, tfHiredate, tfSal, tfComm, tfDeptno;
	JButton bInsert, bUpdate, bDelete, bSelect;
	JTextArea ta;
	
	//DB연동변수
	EmpModel model;	// EmpModel 인터페이스의 객체 생성
	
	// 멤버변수 객체 생성
	EmpView(){
		j = new JFrame("나의 연습");
		tfEmpno = new JTextField(10);
		tfEname = new JTextField(10);
		tfJob = new JTextField(10);
		tfMgr = new JTextField(10);
		tfHiredate = new JTextField(10);
		tfSal = new JTextField(10);
		tfComm = new JTextField(10);
		tfDeptno = new JTextField(10);
		ta = new JTextArea();
		bInsert = new JButton("입력");
		bUpdate = new JButton("수정");
		bDelete = new JButton("삭제");
		bSelect = new JButton("전체검색");
	}
	
	// 화면 구성
	void addLayout() {
		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(1,2));
		
			JPanel pNorth1 = new JPanel();
			pNorth1.setLayout(new GridLayout(4,2));
			pNorth1.add(new JLabel("사번"));		pNorth1.add(tfEmpno);
			pNorth1.add(new JLabel("사원명"));	pNorth1.add(tfEname);
			pNorth1.add(new JLabel("업무"));		pNorth1.add(tfJob);
			pNorth1.add(new JLabel("선임"));	pNorth1.add(tfMgr);
			pNorth1.add(new JLabel("입사일"));	pNorth1.add(tfHiredate);
			pNorth1.add(new JLabel("월급"));		pNorth1.add(tfSal);
			pNorth1.add(new JLabel("보너스"));	pNorth1.add(tfComm);
			pNorth1.add(new JLabel("부서번호"));	pNorth1.add(tfDeptno);
			
			JPanel pNorth2 = new JPanel();
			pNorth2.setLayout(new GridLayout(4,1));
			pNorth2.add(bInsert);
			pNorth2.add(bUpdate);
			pNorth2.add(bDelete);
			pNorth2.add(bSelect);
		
		pNorth.add(pNorth1);
		pNorth.add(pNorth2);
		
		j.add(pNorth, BorderLayout.NORTH);
		j.add(new JScrollPane(ta), BorderLayout.CENTER);

		j.setBounds(200, 200, 600, 500);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// ******************************************************************************
	// 버튼 및 텍스트필드 이벤트 관련
	void eventProc() {	//이벤트들을 한 데에 묶음
		// 입력버튼이 눌렸을 때
		bInsert.addActionListener(new ActionListener() {	// addActionListener: bInsert에서 액션이 발생할 때마다(즉 INSERT를 나타내는 콤보박스를 선택할 때마다) 호출됨 
			public void actionPerformed(ActionEvent ev) {	// actionPerformed: ActionListener 인터페이스의 메소드: 액션이 발생할 때마다 호출됨
				
				//(1) 화면에서 사용자 입력값 받아오기
				int empno = Integer.parseInt(tfEmpno.getText());	// empno의 textField에서 text를 가져옴, 그리고 그걸 int값으로 형변환한 다음 empno 변수에 값을 할당함
				String ename = tfEname.getText();					// ename의 textField에서 text를 가져옴, 그리고 그걸 String형인 ename 변수에 주소값을 할당함
				String job = tfJob.getText();						// 이하 생략
				int mgr = Integer.parseInt(tfMgr.getText());
				String hiredate = tfHiredate.getText();
				int sal = Integer.parseInt(tfSal.getText());
				int comm = Integer.parseInt(tfComm.getText());
				int deptno = Integer.parseInt(tfDeptno.getText());
				
				EmpVO vo = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);	// textField에서 가져온 text값들을 EmpVO 생성자함수의 인자로 집어넣고, 이를 EmpVO 클래스의 객체에 할당함
				
				//(2) 모델단(InfoModel)의 insert() 함수로
				try {
					int result = model.insert(vo);	// EmpModelImpl 클래스 내 insert() 함수에 vo를 넣음. 즉 textField에 넣은 값들을 넣음. 그리고 return result 받음
				}catch(SQLException ex) {
					ta.setText("입력실패" + ex.getMessage());
				}
				
				clearText();
				
			}
		});	// end of bInsert
		
		bUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
				int empno = Integer.parseInt(tfEmpno.getText());
				String ename = tfEname.getText();
				String job = tfJob.getText();
				int mgr = Integer.parseInt(tfMgr.getText());
				String hiredate = tfHiredate.getText();
				int sal = Integer.parseInt(tfSal.getText());
				int comm = Integer.parseInt(tfComm.getText());
				int deptno = Integer.parseInt(tfDeptno.getText());
								
				EmpVO vo = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);

			try {
				int result = model.update(vo);
			} catch(SQLException ex) {
				ta.setText("검색 실패" + ex.getMessage());
			}
			
		}
		});
		
		bDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
			int empno =	Integer.parseInt(tfEmpno.getText());
			try {
				int result = model.delete(empno);
			} catch(SQLException ex) {
				ta.setText("삭제 실패" + ex.getMessage());
			}
			
			clearText();
		}
		});
		
		
		bSelect.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				select();
				
		}
		});
		
		
		
		
		
	}	//endOfEventproc
	
	void select() {
		  try {
			  ArrayList<EmpVO> list = model.select();	// EmpModelImpl에서 오버라이딩하여 재정의된 EmpModel 내의 함수 select()에 리턴값으로 list를 받음
			  
	          ta.setText(" --- 검색 결과 --- \n");
	          for(EmpVO vo : list) {	//데이터타입은 EmpVO이고 변수명은 vo, list라는 동적 배열
	           		ta.append(vo.toString() + "\n");	//setText: 다음 줄이 앞의 줄을 지워버림 append를 써야지 계속해서 씀
	           		//ta.setText(ta.getText()+vo.toString() + "\n");
	           }
	      }catch(SQLException ex) {
	       		ta.setText("검색실패:" + ex.getMessage());
	      }
	}

	void connectDB() {	// 클래스와 DB 연동함
		try {	//	EmpModelImpl() 매소드의 ClassNotFoundException 받아주기 위해 try-catch문 씀
			model = new EmpModelImpl();	// EmpModel의 객체변수 model에 EmpModelImpl() 생성자함수를 사용하여 객체를 생성하고, 그 객체를 model에 할당함. 즉 EmpModel에 정의된 메소드를 EmpModelImpl가 구현하게 함  
			ta.setText("디비연동성공");	
		} catch (ClassNotFoundException e) {
			ta.setText("디비연동실패");
			e.printStackTrace();	// 예외 발생 시 예외 정보를 콘솔창에 출력하는 메소드
		}
	}

	public void clearText() {
		tfEmpno.setText(null);
		tfEname.setText(null);
		tfJob.setText(null);
		tfMgr.setText(null);
		tfHiredate.setText(null);
		tfSal.setText(null);
		tfComm.setText(null);
		tfDeptno.setText(null);
	}

	
	public static void main(String[] args) {
		EmpView view = new EmpView();
		view.addLayout();
		view.eventProc();
		view.connectDB();

	}

}