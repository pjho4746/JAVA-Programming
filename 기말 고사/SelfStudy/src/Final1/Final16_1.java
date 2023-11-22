package Final1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Final16_1 extends JFrame {

	public Final16_1() {
		super("JComponent의 공통 메서드 예제");
		buildGUI();
		
		setSize(260, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		
		b2.setEnabled(true);
		
		b3.addActionListener(new ActionListener() {//익명내부클래스객체

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				Final16_1 frame = (Final16_1) b.getTopLevelAncestor();
				frame.setTitle(b.getX()+","+b.getY());
			}
			
		});
	}
	
	public static void main(String[] args) {
		new Final16_1();
	}

}
