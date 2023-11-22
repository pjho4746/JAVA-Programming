package JComponent_16_1;

import java.awt.*;
import javax.swing.*;

public class JComponent8 extends JFrame {
	public JComponent8() {
		setTitle("JComponent8");
		
		buildGUI();
		
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(createRadioPanel());
	}
	private JPanel createRadioPanel() {
		//이미지 라디오버튼을 만들기 위해 2개의 이미지 객체 생성
		ImageIcon flower1 = new ImageIcon("images/flower1.jpg");
		ImageIcon flower2 = new ImageIcon("images/flower2.jpg");
		
		//라디오버튼 3개 생성
		String[] fruit_name = {"사과", "배", "체리"};
		JRadioButton[] fruit = new JRadioButton[3];
		
		for(int i=0; i<fruit.length; i++) {
			fruit[i] = new JRadioButton(fruit_name[i]);
		}
		fruit[1].setSelected(true);
		fruit[2].setIcon(flower1);
		fruit[2].setBorderPainted(true); //이미지 라디오버튼의 외곽선 출력
		fruit[2].setSelectedIcon(flower2);
		
		ButtonGroup g = new ButtonGroup(); //버튼 그룹에 3개의 라디오버튼 삽입
		JPanel panel = new JPanel(); //컨텐트팬에 3개의 라디오버튼 삽입
		
		for(JRadioButton r : fruit) {
			g.add(r);
			panel.add(r);
		}
		return panel;
	}
	
	public static void main(String[] args) {
		new JComponent8();
	}

}
