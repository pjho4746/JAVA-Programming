package JPanel_14_2;

import java.awt.*;
import javax.swing.*;

public class JPanel2 {
private JFrame frame;
	
	public JPanel2() {
		frame = new JFrame("JPanel2");
		buildGUI();
		frame.setBounds(100, 200, 200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		frame.add(createInputPanel(), BorderLayout.CENTER);
		
		JLabel label = new JLabel("HelloWorld");
		frame.add(label, BorderLayout.SOUTH);
	}
	private JPanel createInputPanel() {
		JTextField text = new JTextField(10);
		JButton button = new JButton("»Æ¿Œ");
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(text);
		panel.add(button);
		
		panel.setBackground(Color.ORANGE);
		
		return panel;
	}
}
