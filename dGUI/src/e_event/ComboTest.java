package e_event;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ComboTest {

	// (1) 변수선언
	JFrame f;							// ********멤버변수 만들기
	JComboBox cbYear,cbMonth,cbDay;		// 멤버변수 만들기
	JButton btn;						// 멤버변수 만들기
	JLabel lbDate;						// 멤버변수 만들기

	// (2) 객체생성
	ComboTest(){	//******객체생성하기 - 기본생성자는 무조건 만들어 놓고 보자
		f = new JFrame("콤보박스 예제");	//JFrame의 인스턴스화 (프레임의 제목은 "콤보박스 예제"

		//2020~2030년까지의 JComboBox를 만들기 위해 객체 생성
		Integer[] strY = new Integer[11];	// 2020~2030년 만들기
		for(int i=0, year=2020; i<strY.length; i++, year++)
			strY[i] = year;
		cbYear = new JComboBox(strY);		//JComboBox의 인스턴스화(2020~2030 값 대입, 콤보박스 목록에 저 숫자들 띄우자)

		//1~12월까지의 JComboBox를 만들기 위해 객체 생성
		Integer[] strM = new Integer[12];	//1~12월 만들기
		for(int i=0; i<strM.length; i++)	
			strM[i] = i+1;
		cbMonth = new JComboBox(strM);		// JComboBox의 인스턴스화(1~12 값 대입, 콤보박스 목록에 저 숫자들 띄우자)
		
		//일을 나타내는 JComboBox를 만들기 위해 일단 객체 생성
		cbDay = new JComboBox();		// JComboBox의 인스턴스화를 하되,일은 31일, 30일, 29일, 28일의 경우가 각각 다르므로, 일단 값을 만들지 않고 보류하자
		
		//누르면 요일이 나오는 JButton을 만들기 위해 일단 객체 생성
		btn = new JButton("▶");			// JButton의 인스턴스화(▶ 값 대입, 버튼 위에 ▶ 띄우자)

		//요일을 글씨로 나타내는 JLabel을 만들기 위해 일단 객체 생성
		lbDate = new JLabel("요일");		// 원래는 JLabel을 인스턴스화할 필요가 없지만, 요일만큼은 일자마다 달라지므로 일단 객체를 생성해 두자
	}

	// (3) 화면 붙이기 & 출력
	void addLayout() {		//*******화면 붙이기 & 출력
		f.setLayout(new BorderLayout());	// setLayout(): 컨테이너의 배치 관리자를 설정, new BorderLayout(): 컨테이너를 5개 영역(동서남북 + 중앙)으로 나누어 컴포넌트들을 배치함
											// 즉, set으로 컨테이너 배치를 설정할 건데, 그 값이 뭐냐(어디에 배치할 거냐)? new BorderLayout()의 값이다 ㅇㅇ
		JPanel jp = new JPanel();			// JPanel의 인스턴스화
		jp.add(cbYear);						// cbYear 콤보박스를 JPanel에다 더함
		jp.add(new JLabel("년"));				// "년"이라는 JPanel에다 더함
		jp.add(cbMonth);					// JPanel에 계속 더하는 것 반복
		jp.add(new JLabel("월"));
		jp.add(cbDay);
		jp.add(new JLabel("일"));
		jp.add(btn);
		jp.add(lbDate);
		f.add(jp);							// JPanel을 JFrame에다 더함
		f.setBounds(100, 100, 400, 200);	//JFrame의 위치와 크기 설정
		f.setVisible(true);					//JFrame을 화면에 보이게 할 건지?
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// JFrame끄면 콘솔 작동독 그만둘 건지
	}

	// (4) 이벤트 처리
	void eventProc() {		//이벤트 프로시저 함수를 만들자 - 이벤트 데이터를 일반적인 방식으로 설명하기 위해
		// 연도 콤보박스 선택 시
		cbYear.addActionListener(new ActionListener(){		// addActionListener: cbYear에서 액션이 발생할 때마다(즉 연도를 나타내는 콤보박스를 선택할 때마다) 호출됨 
															// ActionListener: 인터페이스, 주로 이벤트 핸들러 클래스로 쓰임
			public void actionPerformed(ActionEvent e) {	// actionPerformed: ActionListener 인터페이스의 메소드: 액션이 발생할 때마다 호출됨
				setDay();		//ActionListener 내부에서 호출되는 메소드: cbYear에서 액션이 발생할 때마다 이 메소드가 호출됨	
			}		
		});
		// 월 콤보박스 선택 시
		cbMonth.addActionListener(new ActionListener(){		//연도를 나타내는 콤보박스를 선택할 때마다 호출됨
			public void actionPerformed(ActionEvent e) {
				setDay();		// cbMonth에서 액션이 발생할 때마다 이 메소드가 호출됨	
			}		
		});
		
		// 버튼 클릭시
		btn.addActionListener(new ActionListener(){			// 버튼 클릭할 때마다 호출됨
			public void actionPerformed(ActionEvent e) {
				setDate();		// btn에서 액션이 발생할 때마다 이 메소드가 호출됨
			}		
		});
		
	} // end of eventProc()
	
	// (4-1) 이벤트 처리하는 데에 필요한 함수 1
	void setDate() {
		int y = (Integer)cbYear.getSelectedItem();	//각각의 콤보박스에서 선택값을 얻어옴 (년,월,일) get: 값을 가져온다
		int m = (Integer)cbMonth.getSelectedItem();
		int d = (Integer)cbDay.getSelectedItem();
		System.out.println(y+"/"+m+"/"+d);
		
		Calendar cal = Calendar.getInstance();	// Calendar 객체 인스턴스화
		cal.set(y, m-1, d);						// Calendar 객체의 set 함수에 날짜값 지정(날짜지정)
		int yoil = cal.get(Calendar.DAY_OF_WEEK);	// 해당하는 날짜의 요일을 얻어오기
		System.out.println(yoil+"요일");
		String strDate[] = {"일","월","화","수","목","금","토"};	// 요일 설정
		lbDate.setText( strDate[yoil-1]+ "요일" );	// 요일값을 라벨(화면)에 설정 (서양기준이라서 yoil-1을 해 줘야 함)
	}
	
	// (4-2) 이벤트 처리하는 데에 필요한 함수 2
	void setDay() {
		int lastDays[]= {31,28,31,30,31,30,			// 월마다 마지막 날의 일수를 정수형 배열로 설정하기
						31,31,30,31,30,31};
		Integer year = (Integer)cbYear.getSelectedItem();	// 선택된 연도값 반환(Integer형인 변수 year을 선언, cbYear의 인자가 Integer형 배열인 만큼, 이를 Integer형으로 형변환하기)
		
		if( year%4==0 && year%100!=0 || year%400==0 )		// 윤년 구하기
			lastDays[1]=29;
		else
			lastDays[1]=28;
		
		Integer month = (Integer)cbMonth.getSelectedItem();		// 선택된 월값 가져오기(Integer형인 변수 month를 선언, cbMonth의 인자가 Integer형 배열인 만큼, 이를 Integer형으로 형변환하기)
		System.out.println(year+"년 " + month + "월");
		
		cbDay.removeAllItems();		// 일수 초기화하기(
		for(int i=1; i<=lastDays[month-1]; i++)		// for문을 통해 선택된 월값의 일수 구하기(1월이면 31일, 4월이면 30일 등)
			cbDay.addItem(i);		// 콤보박스에 일수 넣기		
	}
	
	// (5) 첫 화면에 띄울 것
	void initial() {	//현재 날짜를 구해오는 애
		Calendar cal = Calendar.getInstance();
		cbYear.setSelectedItem(cal.get(Calendar.YEAR));		//올해값 설정
		cbMonth.setSelectedItem(cal.get(Calendar.MONTH) + 1);	// 이번달값 설정
		setDay();	//	일 가져와서
		cbDay.setSelectedItem(cal.get(Calendar.DATE));	//오늘의 일값 설정
		
		setDate();	
	}
	
	// (6) 위 메소드들 전부 호출
	public static void main(String[] args) {
		ComboTest c = new ComboTest(); // 객체 생성
		c.addLayout(); // 화면 붙이기 & 출력
		c.initial(); // 첫 화면에 띄울 것 먼저
		c.eventProc();	// 이벤트(콤보박스 선택, 버튼 클릭) 프로시저로, 이벤트 데이터를 일반적인 방식으로 설명함
	}

}

