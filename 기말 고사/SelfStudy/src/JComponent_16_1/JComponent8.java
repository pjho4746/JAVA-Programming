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
		//�̹��� ������ư�� ����� ���� 2���� �̹��� ��ü ����
		ImageIcon flower1 = new ImageIcon("images/flower1.jpg");
		ImageIcon flower2 = new ImageIcon("images/flower2.jpg");
		
		//������ư 3�� ����
		String[] fruit_name = {"���", "��", "ü��"};
		JRadioButton[] fruit = new JRadioButton[3];
		
		for(int i=0; i<fruit.length; i++) {
			fruit[i] = new JRadioButton(fruit_name[i]);
		}
		fruit[1].setSelected(true);
		fruit[2].setIcon(flower1);
		fruit[2].setBorderPainted(true); //�̹��� ������ư�� �ܰ��� ���
		fruit[2].setSelectedIcon(flower2);
		
		ButtonGroup g = new ButtonGroup(); //��ư �׷쿡 3���� ������ư ����
		JPanel panel = new JPanel(); //����Ʈ�ҿ� 3���� ������ư ����
		
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
