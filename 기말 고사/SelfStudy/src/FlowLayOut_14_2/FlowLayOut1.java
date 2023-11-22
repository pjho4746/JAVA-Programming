package FlowLayOut_14_2;

import java.awt.*;
import javax.swing.*;

public class FlowLayOut1 {

	private JFrame frame;
	
	public FlowLayOut1() {
		frame = new JFrame("flowLayout1");
		buildGUI();
		frame.setBounds(100, 200, 200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		//frame.setLayout(new FlowLayout());
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btn;
		
		for(int i=0; i<5; i++) {
			btn = new JButton(""+(i+1));
			frame.add(btn);
		}
		
	}
}
