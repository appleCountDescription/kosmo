package e_event;

import java.awt.*;	// 클래스만 허용 (하위폴더는 못 찾음)
import java.awt.event.*;	// event 폴더가 따로 있어서 얘도 import 해 줘야 함
import javax.swing.*;

public class SampleA {
	// 1) 멤버변수 선언
	JFrame f;
	JButton btn;
	JTextField tf;
	
	// 2) 객체 생성
	SampleA() {
		f = new JFrame("창");
		btn = new JButton("버튼");
		tf = new JTextField("글씨를 입력하세요", 20);
	}
	
	// 3) 화면구성 및 출력
	void addLayout() {
			JPanel p = new JPanel();
			p.add(tf);
			p.add(btn);
		f.add(BorderLayout.CENTER, p);
		
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 4) 이벤트처리
	void eventProc() {
		//[2] 이벤트핸들러 객체 생성
		//EventHdl hdl = new EventHdl();		// 여기서 객체 hdl을 생성하면
		//[3] 이벤트 연결
		btn.addActionListener(new EventHdl());		// 그 객체를 btn에다가 연결 (addActionListener 자체는 btn 객체의 함수가 맞음)
		tf.addActionListener(new EventHdl());		// 그 객체를 tf에다가 연결 (addActionListener 자체는 tf 객체의 함수가 맞음)
	}
	
	//[1] 이벤트핸들러 - 보통 이너클래스로 만듦
	class EventHdl implements ActionListener{	// ActionListener 자체가 인터페이스임
		public void actionPerformed(ActionEvent e) {		// 오버라이딩임, JVM이 actionPerformed를 불러줌
			JOptionPane.showMessageDialog(null, "이벤트발생"); 		// 단순한 메시지창 - 연결 아무랑도 안 함 - null값 Q.			
		}	
		
	}
	
	
	public static void main(String[] args) {
		SampleA a = new SampleA();		//메인함수가 static이기 때문에, 모든 멤버에 static을 쓸 순 없으니 객체 생성하자
		a.addLayout();
		a.eventProc();
	}

}



// 