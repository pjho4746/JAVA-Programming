package JComponent_16_1;

import java.awt.*;
import javax.swing.*;

public class JComponent4 extends JFrame {
	public JComponent4() {
		super("JComponent4");
		
		buildGUI();
		
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		Container c = this.getContentPane();
		//c.setLayout(new FlowLayout());
		c.setLayout(new GridLayout(0,2));
		
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(20)); //â�� �� ���� 20
		
		c.add(new JLabel("�а�"));
		c.add(new JTextField("��ǻ�Ͱ��а�",20));
		
		c.add(new JLabel("�ּ�"));
		c.add(new JTextField("�����...", 20));
	}

	public static void main(String[] args) {
		new JComponent4();
	}

}
