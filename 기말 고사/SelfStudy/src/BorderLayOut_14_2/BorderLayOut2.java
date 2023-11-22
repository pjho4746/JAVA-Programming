package BorderLayOut_14_2;

import java.awt.*;
import javax.swing.*;

public class BorderLayOut2 {
private JFrame frame;
	
	public BorderLayOut2() {
		frame = new JFrame("BorderLayOut2");
		buildGUI();
		frame.setBounds(100, 200, 200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		frame.setLayout(new BorderLayout());
		JButton btn;
		
		btn = new JButton("1");
		frame.add(btn, BorderLayout.NORTH);
		
		btn = new JButton("2");
		frame.add(btn, BorderLayout.WEST);
		
		btn = new JButton("3");
		frame.add(btn, BorderLayout.SOUTH);
		
		btn = new JButton("4");
		frame.add(btn, BorderLayout.EAST);
		
		btn = new JButton("5");
		frame.add(btn);
		//frame.add(btn, BorderLayout.CENTER);

	}
}
