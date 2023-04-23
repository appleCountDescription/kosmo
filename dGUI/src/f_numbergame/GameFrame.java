package f_numbergame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameFrame 
	extends JFrame implements ActionListener{	// 프레임이 되어버리는 것	- 부모(JFrame)의 함수 다 갖다 쓸 수 있음
												// 인터페이스한테도 물려받고 부모클래스한테도 물려받고 + 인터페이스는 여러 개 있어도 됨
	int getsu = 4;	// 개수 선언하고 값 대입
	JButton[][] la = new JButton[getsu][getsu];		// 

	char[][] answer = new char[getsu][getsu];
	
	//첫 번째 버튼정보
	JButton firstClick;
	int firstRow, firstCol;
	
	
	// 1. 객체생성 및 화면구성
	public GameFrame() {
		setLayout(new GridLayout(getsu, getsu));
		for(int row=0; row<getsu; row++) {
			for(int col=0; col<getsu; col++) {
				la[row][col] = new JButton();
				add(la[row][col]);
				answer[row][col] = '0';
				
				//이벤트 등록
				la[row][col].addActionListener(this);
			}
		}
		setBounds(100, 100, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// JFrame이 부모클래스니깐 JFrame.EXIT_ON_CLOSE 안 써도 됨
	}
	
	// 2. 랜덤 문자를 지정
	void initChar() {
		char alpha = '0';
		DASI:
		for(int i=0; i<getsu*getsu; /**/ ) {
			// 임의의 알파벳 만들기
			if(i%2==0) {
				alpha = (char)('A' + (int)(Math.random()*26));		//char + int는 int값이니깐 다시 형변환
				// 기존에 이미 해당 알파벳이 있는지 확인
				for(int r=0; r<getsu; r++) {		//2차원 배열? 무조건 2중for문
					for(int c=0; c<getsu; c++) {
						if(answer[r][c]==alpha) 
							continue DASI;
					}
				}
				
			}
			// 임의의 위치를 지정해서 answer에 저장
			boolean ok = false;
			do {
				int row = (int)(Math.random()*getsu);
				int col = (int)(Math.random()*getsu);
				
				if (answer[row][col] == '0') {
					answer[row][col] = alpha;
					i++;
					ok = true;
				}
				
			}while(!ok);
		}
		
	}
	
	// 3. 버튼에 문자 보여주기
	void showAnswer() {
		// 화면에 정답 보이기
		for(int row=0; row<getsu; row++) {
			for(int col=0; col<getsu; col++) {
				la[row][col].setText(String.valueOf(answer[row][col]));
			}
		}
		/*
		try {
		Thread.sleep(2000);		// 2000: 2초 후에 사라짐
		}catch(Exception ex) {}
		
		// 화면에 정답 가리기
		for(int row=0; row<getsu; row++) {
			for(int col=0; col<getsu; col++) {
				la[row][col].setText(null);
			}
		}
		*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton evtBtn = (JButton)e.getSource();
		
		for(int row=0; row<getsu; row++) {
			for(int col=0; col<getsu; col++) {
				if(la[row][col] == evtBtn) {
					
					//첫번째로 선택한 버튼인지?
					if(firstClick == null) {
						evtBtn.setBackground(Color.yellow);
						firstClick = evtBtn;
						firstRow = row;
						firstCol = col;
					}else {	// 두 번째로 선택한 버튼
						evtBtn.setBackground(Color.red);
						//**********************
						if(answer[firstRow][firstCol] == answer[row][col]) {
							firstClick.setBackground(Color.gray);
							evtBtn.setBackground(Color.gray);
						}else {
							firstClick.setBackground(null);
						}
						
						
						firstClick = null;
					}
				}
			}
		}
	}
}


