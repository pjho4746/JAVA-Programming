package Event_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//���4: �͸� ���� Ŭ���� ���
//Ŭ���� �̸��� ���� ���� Ŭ����
//��Ӱ� ������ ���� ���� ����
//���� Ŭ���� ��ü�� �����Ͽ� ��������� �޾� ���

public class Event4 {
	private JFrame frame;
	private JTextField text;
	private JLabel label;
	
	public Event4() {
		frame = new JFrame("Event4");
		
		buildGUI();
		
		frame.setSize(200, 80);
		frame.setLocation(500, 300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		text = new JTextField();
		label = new JLabel("Hello World");
				
		JButton button = new JButton("Ȯ��");
		button.addActionListener(handler);
		
		frame.add(text, BorderLayout.CENTER);
		frame.add(button, BorderLayout.EAST);
		frame.add(label, BorderLayout.SOUTH);
	}
	
	//�͸� ���� Ŭ���� �ۼ�
	private ActionListener handler = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String name = text.getText();
			label.setText("Hello, "+name);
			
			text.setText("");
			
		}
	};
	
	public static void main(String[] args) {
		new Event4();
	}

}
