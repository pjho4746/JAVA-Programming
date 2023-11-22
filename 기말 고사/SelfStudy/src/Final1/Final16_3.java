package Final1;

import java.awt.*;
import javax.swing.*;


public class Final16_3 extends JFrame {
	public Final16_3() {
		super("setTitle");
		
		buildGUI();
		
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon f1 = new ImageIcon("images/flower.jpg");
		ImageIcon f2 = new ImageIcon("images/flower1.jpg");
		ImageIcon f3 = new ImageIcon("images/flower2.jpg");
		
		JButton btn = new JButton("Call~", f1);
		btn.setPressedIcon(f2);
		btn.setRolloverIcon(f3);
		
		c.add(btn);
		
	}
	public static void main(String[] args) {
		new Final16_3();
	}

}
