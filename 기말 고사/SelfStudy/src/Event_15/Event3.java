package Event_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//방법3: 내부 클래스 사용
public class Event3 {
	private JFrame frame;
	private JTextField text;
	private JLabel label;
	
	public Event3() {
		frame = new JFrame("Event3");
		
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
		button.addActionListener(new ActionEventHandler());
		
		frame.add(text, BorderLayout.CENTER);
		frame.add(button, BorderLayout.EAST);
		frame.add(label, BorderLayout.SOUTH);
	}
	
	//내부 클래스 작성
	class ActionEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String name = text.getText();
			label.setText("Hello, "+name);
			
			text.setText("");
			
		}
	}
	
	public static void main(String[] args) {
		new Event3();
	}

}
