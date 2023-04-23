package e_event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	//멤버변수선언
	JFrame f;
	JTextField tf;
	//JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton[] b = new JButton[10];
	JButton bAdd,bEqual,bSub,bMul,bDiv;
	
	//계산에 필요한 변수
	int first, second;
	String op;
	
	//객체선언
	public Calculator() {
		f = new JFrame("유치원계산기");
		tf = new JTextField();
		for( int i=0; i<b.length; i++) {
			b[i] = new JButton(String.valueOf(i));
		}

		bAdd = new JButton("+");
		bEqual = new JButton("=");
		bSub= new JButton("-");
		bMul = new JButton("*");
		bDiv = new JButton("/");
		
	}
	//3화면붙이기 및 출력
	void addLayout() {
		f.add(tf);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(5,3));
		
		for(int i=1; i<b.length; i++) {
			p2.add(b[i]);
		}
				
		p2.add(bAdd);
		p2.add(b[0]);
		p2.add(bEqual);
		p2.add(bSub);
		p2.add(bMul);
		p2.add(bDiv);
		
		f.add(p2);
		f.add(BorderLayout.NORTH,tf);

		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 4. 이벤트처리
	void eventProc() {
		// 숫자 버튼 이벤트 처리
		for(int i=0; i<b.length; i++) {
			int su = i;
			b[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String temp = tf.getText();
					tf.setText(temp + b[su].getText());	//su 대신 i를 넣으면 자바가 문제될 거라고 인식해서 에러 띄움, su를 위에다가 선언하고 이렇게 대입하는 게 맞음
				}
			});
		}
		
		// 연산자 버튼 이벤트 처리
		bAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate(bAdd);
			}
		});
		bSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate(bSub);
			}
		});
		bMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate(bMul);
			}
		});
		bDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate(bDiv);
			}
		});
		bEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Integer.parseInt(tf.getText());
				int result = 0;
				switch(op) {
				case "+": result = first + second; break;
				case "-": result = first - second; break;
				case "*": result = first * second; break;
				case "/": result = first / second; break;
				}
				tf.setText(String.valueOf(result));
			}
		});
	}
	
	void calculate(JButton evt) {	//이벤트 발생하니 evt 씀
		op = evt.getText();
		first = Integer.parseInt(tf.getText());
		tf.setText("");
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addLayout();
		cal.eventProc();
	}

}
