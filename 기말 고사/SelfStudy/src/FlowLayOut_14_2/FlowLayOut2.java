package FlowLayOut_14_2;

import java.awt.*;
import javax.swing.*;


public class FlowLayOut2 {
	private JFrame frame;
	
	public FlowLayOut2() {
		frame = new JFrame("FlowLayOut2");
		buildGUI();
		frame.setBounds(190, 90, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		JTextField text = new JTextField(10);
		JButton btn = new JButton("Ȯ��");
		JLabel label = new JLabel("Hello World");
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		panel.add(text);
		panel.add(btn);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(label, BorderLayout.SOUTH);
	}
}
