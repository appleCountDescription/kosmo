package dinfo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dinfo.model.InfoModel;
import dinfo.model.InfoModelImpl;
import dinfo.model.vo.InfoVO;

public class InfoView {
	//1. 멤버변수 선언
	JFrame j;
	JTextField tfName, tfId, tfTel,tfSex,tfAge,tfHome;
	JTextArea ta;
	JButton bAdd,bShow,bSearch,bDelete,bModify,bExit;
	
	//DB연동변수
	InfoModel model;
	
	
	//2. 객체 생성
	public InfoView(){
		j=new JFrame("InfoTes");
		tfName = new JTextField(25);
		tfId = new JTextField(25);
		tfTel = new JTextField(25);
		tfSex = new JTextField(25);
		tfAge = new JTextField(25);
		tfHome = new JTextField(25);
		ta = new JTextArea(10,50);
		bAdd = new JButton("bAdd");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Dealete");
		bModify = new JButton("Modify");
		bExit = new JButton("Exit");
		
	
	}
	
	//3. 화면 붙이기 & 출력
	
	void addLayout() {
		j.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(6,1));
		p1.add(tfName);
		p1.add(tfId);
		p1.add(tfTel);
		p1.add(tfSex);
		p1.add(tfAge);
		p1.add(tfHome);
		j.add(BorderLayout.CENTER,p1);
		j.add(BorderLayout.EAST, ta);
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,6));
		p2.add(bAdd);
		p2.add(bShow);
		p2.add(bSearch);
		p2.add(bDelete);
		p2.add(bModify);
		p2.add(bExit);
		j.add(BorderLayout.SOUTH, p2);
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(6,1));
		p3.add(new JLabel("Name"));
		p3.add(new JLabel("ID"));
		p3.add(new JLabel("Tel"));
		p3.add(new JLabel("Sex"));
		p3.add(new JLabel("Age"));
		p3.add(new JLabel("Home"));
		j.add(BorderLayout.WEST, p3);
		
		
		j.setBounds(500, 300, 1000, 550);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//4. 이벤트 처리
	void eventProc() {
		bAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(null, msg+"입력");
				
				//(1) 화면에서 사용자 입력값 받아오기
				String name = tfName.getText();
				String id = tfId.getText();
				String tel = tfTel.getText();
				String sex = tfSex.getText();
				int age = Integer.parseInt(tfAge.getText());
				String home = tfHome.getText();
				//나머지도
				
				
				InfoVO vo = new InfoVO(tel, name, id, sex, age, home);
				
				//(2) 모델단(InfoModel)의 insert() 함수로
				try {
					model.insert(vo);
					//ta.setText(result);
				}catch(Exception ex) {
					ta.setText("입력실패" + ex.getMessage());
				}
				//(3) 화면초기화
				
				clearText();
				selectAll();
				
				String msg = ta.getText();
			JOptionPane.showMessageDialog(null, msg+"입력");
		}
		
	});
		bModify.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			//	String msg = ta.getText();
			//JOptionPane.showMessageDialog(null, msg+"수정");
			
			String name = tfName.getText();
			String id = tfId.getText();
			String tel = tfTel.getText();
			String sex = tfSex.getText();
			int age = Integer.parseInt(tfAge.getText());
			String home = tfHome.getText();
			//나머지도
			
			try {
				model.modify(name, id, sex, age, home, tel);
			} catch(Exception ex) {
				ta.setText("검색 실패" + ex.getMessage());
			}
			
		}
		});
		
		
		bShow.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {

	         	selectAll();
	         	
	          }
	    });
		
		bSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String msg = ta.getText();
			JOptionPane.showMessageDialog(null, msg+"검색");
		}
		});
		
		
		bDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				String msg = ta.getText();
			JOptionPane.showMessageDialog(null, msg+"삭제");
			
			
			String tel = tfTel.getText();
			try {
			InfoVO vo = model.deleteByPK(tel);
			
			} catch(Exception ex) {
				ta.setText("검색 실패" + ex.getMessage());
			}
			
			clearText();
			selectAll();
		}
		});
		
		bExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
		}
		});
		
		// 전화번호 텍스트필드에서 엔터쳤을 때
		tfTel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String tel = tfTel.getText();
				try {
				InfoVO vo = model.selectByPk(tel);
				tfName.setText( vo.getName() );
				tfId.setText(vo.getId() );
				tfSex.setText(vo.getSex() );
				tfAge.setText( String.valueOf(vo.getAge()) );
				tfHome.setText(vo.getHome() );
				
				// 나머지도
				
				} catch(Exception ex) {
					ta.setText("검색 실패" + ex.getMessage());
				}
		}
		});
		
		tfId.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText();
				try {
				InfoVO vo = model.selectByPk2(id);
				tfTel.setText(vo.getTel() );
				tfName.setText( vo.getName() );
				tfSex.setText(vo.getSex() );
				tfAge.setText( String.valueOf(vo.getAge()) );
				tfHome.setText(vo.getHome() );
				
				// 나머지도
				
				} catch(Exception ex) {
					ta.setText("검색 실패" + ex.getMessage());
				}
		}
		});
			
	}
	
	void selectAll() {
		  try {
			  ArrayList<InfoVO> result = model.selectAll();
	          ta.setText(" --- 검색 결과 --- \n");
	          for(InfoVO vo : result) {
	           		ta.append(vo.toString() + "\n");
	           }
	      }catch(Exception ex) {
	       		ta.setText("검색실패:" + ex.getMessage());
	      }
	}
	
	void connectDB() {
		try {
			model = new InfoModelImpl();
			ta.setText("디비연동성공");
		} catch (ClassNotFoundException e) {
			ta.setText("디비연동실패");
			e.printStackTrace();
		}
	}
	
	public void clearText() {
		tfTel.setText(null);
		// 나머지도
	}

	public static void main(String[] args) {
		
		InfoView t = new InfoView();
		t.addLayout();
		t.eventProc();
		t.connectDB();
		
	}

}