package Event_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//방법1: 현재 클래스 사용
public class Event1 implements ActionListener {
	private JFrame frame;
	private JTextField text;
	private JLabel label;
	
	public Event1() {
		frame = new JFrame("Event1");
		
		buildGUI();
		
		frame.setSize(200, 80);
		frame.setLocation(500, 300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	private void buildGUI() {
		text = new JTextField();
		JButton button = new JButton("확인");
		//리스너 연결시 리스너로부터 구현된 this 전달
		button.addActionListener(this);
		
		label = new JLabel("Hello World");
		
		frame.add(text, BorderLayout.CENTER);
		frame.add(button, BorderLayout.EAST);
		frame.add(label, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new Event1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = text.getText();
		label.setText("Hello, "+name);
		
		text.setText("");
		
	}
	
}
