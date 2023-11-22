package GridLayOut_14_2;

import java.awt.*;
import javax.swing.*;

public class GridLayOut1 {
	private JFrame frame;
	
	public GridLayOut1() {
		frame = new JFrame("FridLayOut");
		buildGUI();
		frame.setBounds(100, 200, 200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		//frame.setLayout(new GridLayout(3,2));
		//frame.setLayout(new GridLayout(0,3));
		frame.setLayout(new GridLayout(3,0));
		JButton btn;
		for(int i=0; i<5; i++) {
			btn = new JButton(""+(i+1));
			frame.add(btn);
		}
	}
}
