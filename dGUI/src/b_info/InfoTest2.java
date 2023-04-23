package b_info;

import java.awt.*;
import javax.swing.*;

public class InfoTest2 {
	// 1. 멤버변수 선언
	JFrame f;	//  JFrame f = null; 이거임
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JButton b, bShow, bSearch, bDelete, bCancel, bExit;
	JTextArea ta;
	
	// 2. 객체 생성
	InfoTest2() {
		f = new JFrame();
		tfName = new JTextField(15);	//15: 15글자 정도 들어가는 크기
		tfId = new JTextField();
		tfTel = new JTextField();
		tfSex = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		b = new JButton("Add");
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
			p2.add(b);
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
	public static void main(String[] args) {
		InfoTest2 t = new InfoTest2();
		t.addLayout();
	}

}
