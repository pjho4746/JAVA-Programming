package Event_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//���5: �͸� ���� Ŭ���� �ӽ� ��ü ���
public class Event5 {
	private JFrame frame;
	private JTextField text;
	private JLabel label;
	
	public Event5() {
		frame = new JFrame("Event5");
		
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
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = text.getText();
				label.setText("Hello, "+name);
				
				text.setText("");
			}
		});
		
		frame.add(text, BorderLayout.CENTER);
		frame.add(button, BorderLayout.EAST);
		frame.add(label, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new Event5();
	}

}
