package JComponent_16_1;

import java.awt.*;
import javax.swing.*;

public class JComponent3 extends JFrame {
	public JComponent3() {
		super("JComponent3");
		
		buildGUI();
		
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		//3���� �̹����� ���Ϸκ��� �о���δ�.
		ImageIcon flower1 = new ImageIcon("images/flower.jpg");
		ImageIcon flower2 = new ImageIcon("images/flower1.jpg");
		ImageIcon flower3 = new ImageIcon("images/flower2.jpg");
		
		//���� �̹����� ���� ��ư ����
		JButton btn = new JButton("call~", flower1);
		btn.setPressedIcon(flower2);
		btn.setRolloverIcon(flower3);
		
		c.add(btn);		
	}

	public static void main(String[] args) {
		new JComponent3();
	}

}
