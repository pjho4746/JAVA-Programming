package JComponent_16_1;

import java.awt.*;
import javax.swing.*;

public class JComponent6 extends JFrame {
	public JComponent6() {
		setTitle("JComponent6");
		
		buildGUI();
		
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		//이미지 체크박스에 사용할 2개의 이미지 객체 생성
		ImageIcon flower1 = new ImageIcon("images/flower.jpg");
		ImageIcon selectedflower2 = new ImageIcon("images/flower1.jpg");
		
		//3개의 체크박스 생성
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true); //체크박스 외곽선이 보이도록 설정
		JCheckBox cherry = new JCheckBox("사과", selectedflower2);
		
		cherry.setBorderPainted(true);//체크박스 외곽선이 보이도록 설정
		cherry.setSelectedIcon(selectedflower2);
		
		//컨텐트팬에 3개의 체크박스 부착
		c.add(apple);
		c.add(pear);
		c.add(cherry);
	}

	public static void main(String[] args) {
		new JComponent6();
	}

}
