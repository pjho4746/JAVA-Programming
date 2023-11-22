package JComponent_16_1;

import java.awt.*;
import javax.swing.*;

public class JComponent4 extends JFrame {
	public JComponent4() {
		super("JComponent4");
		
		buildGUI();
		
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		Container c = this.getContentPane();
		//c.setLayout(new FlowLayout());
		c.setLayout(new GridLayout(0,2));
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20)); //창의 열 개수 20
		
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과",20));
		
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시...", 20));
	}

	public static void main(String[] args) {
		new JComponent4();
	}

}
