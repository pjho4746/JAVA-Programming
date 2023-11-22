package JComponent_16_1;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class JComponent7 extends JFrame {
	//체크박스 배열
	private JCheckBox[] fruits = new JCheckBox[3];
	//체크박스 문자열로 사용할 문자열 배열
	private String[] names= {"사과","배", "체리"};
	//계산 합을 출력할 레이블
	private JLabel sumLabel;
	
	public JComponent7() {
		setTitle("JComponent7");
		
		buildGUI();
		
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		//3개의 체크박스를 생성. 컨텐트팬에 삽입하고 Item 리스너 등록
		for(int i=0; i<fruits.length; i++) {
			//names[]의 문자열로 체크박스 생성
			fruits[i] = new JCheckBox(names[i]);
			//체크박스 외곽선 보이도록 설정
			//fruits[i].setBorderPainted(true);
			
			c.add(fruits[i]); //컨텐트팬에 체크박스 삽입
			fruits[i].addItemListener(handler); //체크박스에 Item 리스너 등록
		}
		
		sumLabel = new JLabel("현재 0원 입니다."); //가격 합을 출력하는 레이블 생성
		c.add(sumLabel);
	}
	
	//Item 리스너 구현
	private ItemListener handler = new ItemListener() {
		private int sum = 0; //가격의 합
		
		//체크박스의 선택 상태가 변하면 itemStateChanged() 호출됨
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()== fruits[0])
					sum+=100;
				else if(e.getItem()== fruits[1])
					sum+=500;
				else
					sum+=20000;
			}
			else {
				if(e.getItem()== fruits[0])
					sum-=100;
				else if(e.getItem()== fruits[1])
					sum-=500;
				else
					sum-=20000;
			}
			sumLabel.setText("현재 "+sum+"원 입니다.");//합 출력
		}
	};
	
	public static void main(String[] args) {
		new JComponent7();
	}

}
