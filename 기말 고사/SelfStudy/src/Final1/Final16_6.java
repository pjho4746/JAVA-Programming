package Final1;

import java.awt.*;
import javax.swing.*;

public class Final16_6 extends JFrame {
	public Final16_6() {
		super("üũ�ڽ� �����");
		buildGUI();
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox banna = new JCheckBox("�ٳ���");
		JCheckBox cherry = new JCheckBox("ü��");
		
		cherry.setBorderPainted(true);//üũ�ڽ� �ܰ��� ���̵��� ����
		//cherry.setSelectIcon(--);
		
		c.add(apple);
		c.add(banna);
		c.add(cherry);
	}
	public static void main(String[] args) {
		new Final16_6();
	}

}
