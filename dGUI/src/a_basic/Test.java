package a_basic;

//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * 	화면(컨테이너) 구성방식( layout )
 * 	- FlowLayout
 * 		' 윗줄 상단 중앙으로 배치
 * 		' 컴포넌트의 크기 고정
 * 		' JPanel 기본
 * 	- GridLayout
 * 		' 행열구조로 배치
 * 		' 컴포넌트 크기 동일 / 크기 변동
 * 	- BorderLayout
 * 		' 동(EAST) 서(WEST) 남(SOUTH) 북(NORTH) 중앙(CENTER)에 배치
 * 		' 컴포넌트 크기 변동
 * 		' JFrame 기본
 * 	....
 */

public class Test {
	// (1) 멤버변수 선언 (JFrame 변수 f를 선언)
	JFrame f;	//멤버라서 null값 들어 있음
	JButton b1, b2;
	JTextField tf;
	JTextArea ta;
	JLabel la;
	JCheckBox cb, cb2;
	JRadioButton rb, rb2;
	JComboBox combo;
	
	// (2) 멤버변수 객체 생성
	public Test() {
		f = new JFrame("나의 창");
		b1 = new JButton("확인");
		b2 = new JButton("취소");
		tf = new JTextField(40);
		ta = new JTextArea(10, 50);
		//la = new JLabel("메시지"); - 화면에 한 번 출력하고 끝임, 기능이 따로 없음, 그래서 굳이 멤버변수 만들지 않음
		cb = new JCheckBox("남자");
		cb2 = new JCheckBox("여자");
		rb = new JRadioButton("남성");
		rb2 = new JRadioButton("여성");
		ButtonGroup grp = new ButtonGroup();
		grp.add(rb);
		grp.add(rb2);
		String [] msg = {"서울", "대전", "부산"};
		combo = new JComboBox(msg);
	}
	// (3) 화면 붙이기 및 화면 출력
	void addLayout() {
//		f.setLayout(new FlowLayout());
//		f.setLayout(new GridLayout(5, 2));
		f.setLayout(new BorderLayout(5, 2));
		f.add(BorderLayout.WEST, b1);		//f.add(b1, b2) 이런 거 안 됨
		f.add(BorderLayout.EAST, b2);		//b2가 b1을 덮음(레이아웃)
		f.add(BorderLayout.NORTH, tf);
			JPanel p1 = new JPanel();
			p1.add(new JLabel("메시지"));
			p1.add(ta);
		f.add(BorderLayout.CENTER, p1);
			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(3, 2));
			p2.add(cb);
			p2.add(cb2);
			p2.add(rb);
			p2.add(rb2);
			p2.add(combo);
		f.add(BorderLayout.SOUTH, p2);

//		f.add(cb);
//		f.add(cb2);
//		f.add(rb);
//		f.add(rb2);
//		f.add(combo);

		f.setBounds(450, 200, 500, 450);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.addLayout();
	}

}
