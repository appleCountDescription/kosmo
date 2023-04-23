package e_event;

import java.awt.*;	// 클래스만 허용 (하위폴더는 못 찾음)
import java.awt.event.*;	// event 폴더가 따로 있어서 얘도 import 해 줘야 함
import javax.swing.*;

public class SampleC {
	// 1) 멤버변수 선언
	JFrame f;
	JButton btn;
	JTextField tf;
	
	// 2) 객체 생성
	SampleC() {
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
		//EventHdl hdl = new EventHdl();
		//[3] 이벤트 연결
		btn.addActionListener(new ActionListener(){	//버튼 클릭 시
			public void actionPerformed(ActionEvent e) {
				String msg = tf.getText();
				JOptionPane.showMessageDialog(null, msg + "를 처리"); 			
			}
		});	
			
			// new ActionListener는 못 넣음.
		tf.addActionListener(new ActionListener(){	// 텍스트필드 엔터 쳤을 때
			public void actionPerformed(ActionEvent e) {	
				String msg = tf.getText();
				JOptionPane.showMessageDialog(null, msg + "가 맞습니까"); 				
			}
		});
	}
			
	
	//[1] 이벤트핸들러 - 보통 이너클래스로 만듦
	
	
	
	public static void main(String[] args) {
		SampleC a = new SampleC();		//메인함수가 static이기 때문에, 모든 멤버에 static을 쓸 순 없으니 객체 생성하자
		a.addLayout();
		a.eventProc();
	}

}



/*
 * 이벤트 처리

1) 이벤트 핸들러

- 이벤트 리스너 (인터페이스, interface) 구현(상속)
- 추상메소드(abstract method)를 오버라이딩(overriding)

2) 이벤트 핸들러 객체 생성

3) 핸들러 객체와 이벤트발생 컴포넌트 연결
 */