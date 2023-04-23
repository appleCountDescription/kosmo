package e_event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

import javax.swing.*;

public class InfoTest {
	// 1. 멤버변수 선언
	JFrame f;	//  JFrame f = null; 이거임
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	JTextArea ta;
	
	// 2. 객체 생성
	InfoTest() {
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
				String msg = ta.getText();
				JOptionPane.showMessageDialog(null, msg + "를 처리"); 			
			}
		});	
		//나머지 버튼도 이벤트 발생
		bShow.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				String msg = ta.getText();
				JOptionPane.showMessageDialog(null, msg + "를 처리"); 			
			}
		});	
		bSearch.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				String msg = ta.getText();
				JOptionPane.showMessageDialog(null, msg + "를 처리"); 			
			}
		});	
		bDelete.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				String msg = ta.getText();
				JOptionPane.showMessageDialog(null, msg + "를 처리"); 			
			}
		});	
		bCancel.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				String msg = ta.getText();
				JOptionPane.showMessageDialog(null, msg + "를 처리"); 			
			}
		});	
		bExit.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});	
		
		//주민번호창에서 포커스이벤트
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
	}
	
	public static void main(String[] args) {
		InfoTest t = new InfoTest();
		t.addLayout();
		t.eventProc();
	}

}
