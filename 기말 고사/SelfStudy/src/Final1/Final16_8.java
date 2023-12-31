package Final1;

import java.awt.*;
import javax.swing.*;

public class Final16_8 extends JFrame {
	public Final16_8() {
		super("라디오버튼 만들기 예쩨");
		buildGUI();
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(createRadioPanel());
	}
	private JPanel createRadioPanel() {
		String[] names = {"사과", "배", "체리"};
		JRadioButton[] fruits = new JRadioButton[3];
		
		for(int i=0; i<names.length; i++) {
			fruits[i] = new JRadioButton(names[i]);
		}
		fruits[1].setSelected(true);
		fruits[2].setBorderPainted(true);
		
		ButtonGroup g = new ButtonGroup();
		JPanel panel = new JPanel();
		
		for(JRadioButton r : fruits) {
			g.add(r);
			panel.add(r);
		}
		return panel;
	}
	public static void main(String[] args) {
		new Final16_8();
	}

}
