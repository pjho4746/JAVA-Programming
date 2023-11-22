package BorderLayOut_14_2;

import java.awt.*;
import javax.swing.*;

public class BorderLayOut3 {
	private JFrame frame;
	
	public BorderLayOut3() {
		frame = new JFrame("BorderLayOut3");
		buildGUI();
		frame.setBounds(100, 200, 200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		JTextField text = new JTextField();
		JButton btn = new JButton("확인");
		
		JLabel label = new JLabel("Hello World");
		
		frame.add(text, BorderLayout.CENTER);
		frame.add(btn, BorderLayout.EAST);//동(오른쪽)
		frame.add(label, BorderLayout.SOUTH);//남(아래쪽)
	}
}
