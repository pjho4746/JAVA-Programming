package JPanel_14_2;

import java.awt.*;
import javax.swing.*;

public class JPanel1 {
	private JFrame frame;
	
	public JPanel1() {
		frame = new JFrame("JPanel1");
		buildGUI();
		frame.setBounds(100, 200, 200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		JTextField text = new JTextField(10);
		JButton button = new JButton("»Æ¿Œ");
		JLabel label = new JLabel("HelloWorld");
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(text);
		panel.add(button);
		
		panel.setBackground(Color.ORANGE);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(label, BorderLayout.SOUTH);
	}
}
