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
		
		//�̹��� üũ�ڽ��� ����� 2���� �̹��� ��ü ����
		ImageIcon flower1 = new ImageIcon("images/flower.jpg");
		ImageIcon selectedflower2 = new ImageIcon("images/flower1.jpg");
		
		//3���� üũ�ڽ� ����
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true); //üũ�ڽ� �ܰ����� ���̵��� ����
		JCheckBox cherry = new JCheckBox("���", selectedflower2);
		
		cherry.setBorderPainted(true);//üũ�ڽ� �ܰ����� ���̵��� ����
		cherry.setSelectedIcon(selectedflower2);
		
		//����Ʈ�ҿ� 3���� üũ�ڽ� ����
		c.add(apple);
		c.add(pear);
		c.add(cherry);
	}

	public static void main(String[] args) {
		new JComponent6();
	}

}
