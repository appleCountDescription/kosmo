package a_basic;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 extends JFrame {	// ctrl + shift + o
									// 부모는 하나, 나머지는 모두 객체생성 직접 해야 함
	// 1> 멤버변수 선언
	JButton b2;
	
	// 2> 멤버변수 객체 생성
	public Test2() {
		super("나의 창2");
		b2 = new JButton("확인");
	}
	
	// 3> 화면 붙이기 & 출력
	void addLayout() {
		add(b2);
		setBounds(300, 300, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//f함수 없으니깐 앞에 f. 빼주기
	}
	
	public static void main(String[] args) {
	
		Test2 t2 = new Test2();
		t2.addLayout();
	}
	

}
