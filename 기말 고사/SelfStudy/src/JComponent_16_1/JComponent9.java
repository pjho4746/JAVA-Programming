package JComponent_16_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JComponent9 extends JFrame {
	private JRadioButton[] radio = new JRadioButton[3]; //라디오버튼 배열
	private String[] text = {"사과", "배", "체리"};
	private ImageIcon[] image = {
			new ImageIcon("images/flower.jpg"),
			new ImageIcon("images/flower1.jpg"),
			new ImageIcon("images/flower2.jpg"),
	}; 
	private JLabel imageLabel = new JLabel(); //이미지가 출력될 레이블
	
	public JComponent9() {
		setTitle("JComponent9");
		
		buildGUI();
		
		setSize(250,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(createRadioPanel(), BorderLayout.NORTH); //컨텐트팬의 NORTH에 라디오 패널 부착
		c.add(createImagePanel(), BorderLayout.CENTER); //컨텐트팬의 CENTER에 이미지 레이블
	}
	//JPanel : 컴포넌트를 그룹별로 묶어서 처리할 때 사용
	private JPanel createRadioPanel() {
		JPanel radioPanel = new JPanel(); //3개의 라디오버튼을 부착할 패널
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup(); //버튼 그룹 객체 생성
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]); //라디오 버튼 생성
			g.add(radio[i]); //그룹에도 추가하고
			
			radioPanel.add(radio[i]); //패널에도 추가해야 함(단순히 그룹 추가는 안됨)
			
			radio[i].addActionListener(handler); //각 버튼마다 이벤트
		}
		radio[2].setSelected(true);//체리 라디오버튼을 선택 상태로 설정
		return radioPanel;
	}
	
	private JPanel createImagePanel() {
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);//이미지의 중앙 정렬
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(imageLabel);
		
		return panel;
	}
	
	//Item 리스너 대신 Action 리스너 작성
	private ActionListener handler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton src = (JRadioButton) e.getSource();
			
			for(int i=0; i<radio.length; i++) {
				if(src==radio[i]) {
					imageLabel.setIcon(image[i]);
					break;
				}
			}
			
		}
		
	};
	
	public static void main(String[] args) {
		new JComponent9();
	}

}
