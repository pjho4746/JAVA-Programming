package Final1;

import java.awt.*;
import javax.swing.*;

public class Final16_6 extends JFrame {
	public Final16_6() {
		super("체크박스 만들기");
		buildGUI();
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox banna = new JCheckBox("바나나");
		JCheckBox cherry = new JCheckBox("체리");
		
		cherry.setBorderPainted(true);//체크박스 외곽선 보이도록 설정
		//cherry.setSelectIcon(--);
		
		c.add(apple);
		c.add(banna);
		c.add(cherry);
	}
	public static void main(String[] args) {
		new Final16_6();
	}

}
