package c_calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator {
	// 1) 멤버변수 선언 - 3+5 = 8만 나오면 됨
	JFrame f;
	JTextArea ta;
	JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, pls, min, eqls, mltpl, dvsn;
	
	// 2) 객체생성
	public Calculator() {
		f = new JFrame();
		ta = new JTextArea();
		n1 = new JButton("1");
		n2 = new JButton("2");
		n3 = new JButton("3");
		n4 = new JButton("4");
		n5 = new JButton("5");
		n6 = new JButton("6");
		n7 = new JButton("7");
		n8 = new JButton("8");
		n9 = new JButton("9");
		pls = new JButton("+");
		n0 = new JButton("0");
		eqls = new JButton("=");
		min = new JButton("-");
		mltpl = new JButton("*");
		dvsn = new JButton("/");
	}
	
	// 3) 화면붙이기 및 출력
	void addLayout() {
			JPanel p1 = new JPanel();
			p1.setLayout(new GridLayout(5, 3));
			p1.add(n1);
			p1.add(n2);
			p1.add(n3);
			p1.add(n4);
			p1.add(n5);
			p1.add(n6);
			p1.add(n7);
			p1.add(n8);
			p1.add(n9);
			p1.add(pls);
			p1.add(n0);
			p1.add(eqls);
			p1.add(min);
			p1.add(mltpl);
			p1.add(dvsn);
		f.add(BorderLayout.SOUTH, p1);
		f.add(BorderLayout.CENTER, ta);
		
		f.setBounds(450, 200, 300, 185);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.addLayout();
	}


}

