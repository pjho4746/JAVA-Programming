package Event_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//방법2: 일반 클래스 사용
public class Event2 {
	private JFrame frame;
	private JTextField text;
	private JLabel label;
	
	public Event2() {
		frame = new JFrame("Event2");
		
		buildGUI();
		
		frame.setSize(200, 80);
		frame.setLocation(500, 300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		text = new JTextField();
		label = new JLabel("Hello World");
		
		JButton button = new JButton("확인");
		button.addActionListener(new ActionEventHandler(text, label));
		
		frame.add(text, BorderLayout.CENTER);
		frame.add(button, BorderLayout.EAST);
		frame.add(label, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new Event2();
	}
	
}

class ActionEventHandler implements ActionListener {
	private JTextField text;
	private JLabel label;
	
	ActionEventHandler(JTextField text, JLabel label){
		this.text = text;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = text.getText();
		label.setText("Hello, "+name);
		
		text.setText("");
		
	}
}
