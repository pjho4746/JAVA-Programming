package JComponent_16_1;

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class JComponent2 extends JFrame {
	public JComponent2() {
		super("JComponent2");
		
		buildGUI();
		
		setSize(200, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		//���ڿ� ���̺� ����
		JLabel textLabel = new JLabel("����մϴ�");
		
		//�̹��� ���̺� ����
		ImageIcon flower = new ImageIcon("images/flower.jpg"); //�̹��� �ε�
		JLabel imageLabel = new JLabel(flower);
		
		//���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("images/flower1.jpg"); //�̹��� �ε�
		JLabel label = new JLabel("��������� ��ȭ�ϼ���",
				normalIcon, SwingConstants.CENTER);//���̺� ����
		//����Ʈ�ǿ� 3���� ���̺� ����
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
	}

	public static void main(String[] args) {
		new JComponent2();
	}

}
