package Event_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//방법4: 익명 내부 클래스 사용
//클래스 이름이 없는 내부 클래스
//상속과 재정의 동시 수행 가능
//내부 클래스 객체를 생성하여 멤버변수로 받아 사용

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
				
		JButton button = new JButton("확인");
		button.addActionListener(handler);
		
		frame.add(text, BorderLayout.CENTER);
		frame.add(button, BorderLayout.EAST);
		frame.add(label, BorderLayout.SOUTH);
	}
	
	//익명 내부 클래스 작성
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
