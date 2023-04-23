package e_event;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import e_event.dto.StudentVO;



public class InfoTest2 {
	// 1. 멤버변수 선언
	JFrame f;	//  JFrame f = null; 이거임
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextArea ta;
	
	ArrayList list = new ArrayList();
	
	// 2. 객체 생성
	InfoTest2() {
		f = new JFrame();
		tfName = new JTextField(15);	//15: 15글자 정도 들어가는 크기
		tfId = new JTextField();
		tfTel = new JTextField();
		tfSex = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
		ta = new JTextArea(20, 20);		// Q. 여기가 어떤 값이든 왜 TextArea가 꽉 참? => FlowLayout이 아니기 때문
	}
	
	//3. 화면 붙이기 & 출력
	void addLayout() {
			JPanel p1 = new JPanel();
			p1.setLayout(new GridLayout(6, 2));
			p1.add(new JLabel("Name"));
			p1.add(tfName);
			p1.add(new JLabel("ID"));
			p1.add(tfId);
			p1.add(new JLabel("Tel"));
			p1.add(tfTel);
			p1.add(new JLabel("Sex"));
			p1.add(tfSex);
			p1.add(new JLabel("Age"));
			p1.add(tfAge);
			p1.add(new JLabel("Home"));
			p1.add(tfHome);
		f.add(BorderLayout.WEST, p1);
			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(1, 6));
			p2.add(bAdd);
			p2.add(bShow);
			p2.add(bSearch);
			p2.add(bDelete);
			p2.add(bCancel);
			p2.add(bExit);
		f.add(BorderLayout.SOUTH, p2);
			//JPanel p3 = new JPanel();
			//p3.add(ta);
		f.add(BorderLayout.CENTER, ta);
		
		f.setBounds(450, 200, 800, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//4. 이벤트 처리
	void eventProc() {
		//[2] 이벤트핸들러 객체 생성
		//EventHdl hdl = new EventHdl();
		//[3] 이벤트 연결
		bAdd.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				StudentVO vo = new StudentVO();	
				vo.setName(tfName.getText());
				vo.setId(tfId.getText());
				vo.setTel(tfTel.getText());
				vo.setSex(tfSex.getText());
				vo.setAge(Integer.parseInt(tfAge.getText()));	// 이거 어케 함?
				vo.setHome(tfHome.getText());
								
				//------------------------------------- 팀장님 스타일
//				String name = tfName.getText();
//				String id = tfId.getText();
//				String tel = tfTel.getText();
//				String sex = tfSex.getText();
//				int age = Integer.parseInt(tfAge.getText());
//				String home = tfHome.getText();
//				StudentVO vo = new StudentVO(name, id, tel, sex, age, home);
				
				cancel();
				list.add(vo);
			}
		});	
		//나머지 버튼도 이벤트 발생
		bShow.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				ta.setText("===== 검색결과 ===== \n");
				for(int i=0; i<list.size(); i++) {
					StudentVO vo = (StudentVO)list.get(i);
					ta.append(vo.toString());
				}
			}
		});	
		bSearch.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				String tel = tfTel.getText();
				for(int i=0; i<list.size(); i++) {
					StudentVO vo = (StudentVO)list.get(i);
					if(tel.equals(vo.getTel())) {
						// vo의 멤버값을 화면에 출력
						tfName.setText(vo.getName());
						tfId.setText(vo.getId());
						tfTel.setText(vo.getTel());
						tfSex.setText(vo.getSex());
						tfAge.setText(String.valueOf(vo.getAge()));	//Integer.parse() 안 먹히는 이유? 무조건 문자열이 나와야 하기 때문
						tfHome.setText(vo.getHome());
						break;
					}
				}
			}
		});	
		bDelete.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				String msg = ta.getText();
				JOptionPane.showMessageDialog(null, msg + "를 처리"); 			
			}
		});	
		bCancel.addActionListener(new ActionListener(){	//Cancel 버튼이 눌렸을 때 이벤트
			public void actionPerformed(ActionEvent e) {
				cancel();
			}	// end of actionPerformed
		});	// end of ActionListener
		bExit.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});	
		
		tfId.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				//입력한 주빈번호값을 얻어오기
				//ex) 801212-1234567
				String id = tfId.getText();
				char sung = id.charAt(7);
				String gender = null;
				if(sung == '1' | sung == '3' | sung == '9') {
					gender = "남성";
				}
				else {
					gender = "여성";
				}
				tfSex.setText(gender);
				
				//-------------------------------------------
				
				String year = id.substring(0,2);
				int intYear = Integer.parseInt(year); // "80" -> 80
				int cen19 = 1800;
				int cen20 = 1900;
				int cen21 = 2000;
				int myYear = 0;
				
				if (sung == '1' | sung == '2') {
					myYear = cen20 + intYear;
				}
				else if (sung == '3' | sung == '4') {
					myYear = cen21 + intYear;
				}
				else if (sung == '9' | sung == '0') {
					myYear = cen19 + intYear;
				}
	
				Calendar c = Calendar.getInstance(); // c를 캘린더 변수로 선언, 
				int thisYear = c.get(Calendar.YEAR); // 연도값만 얻어오기
				
				int age = thisYear - myYear + 1;
				tfAge.setText(Integer.toString(age));
				
				//---------------------------------------------
				
				char chul = id.charAt(8);	// chul - 출신
				String home = "";
				switch(chul) {
				case '0': home = "서울"; break;
				case '1': home = "인천/부산"; break;
				case '2': home = "경기"; break;
				default: home = "제주";
				}
				tfHome.setText(home);

			}
			public void focusGained(FocusEvent e) {
				
			}
		});
	}	//end of eventProc()
	
	void cancel() {		//각 textField와 textArea의 글자를 지우자
		tfName.setText("");	//"" 대신 null 넣어도 됨
		tfId.setText("");
		tfTel.setText("");
		tfSex.setText("");
		tfAge.setText("");
		tfHome.setText("");
	}	//end of cancel()
	
	public static void main(String[] args) {
		InfoTest2 t = new InfoTest2();
		t.addLayout();
		t.eventProc();
	}

}
