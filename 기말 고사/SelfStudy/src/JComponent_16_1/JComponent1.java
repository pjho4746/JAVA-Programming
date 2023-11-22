package JComponent_16_1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JComponent1 extends JFrame {
	public JComponent1() {
		super("JComponent1");
		
		buildGUI();
		
		setSize(260, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disable Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		
		b2.setEnabled(false); //버튼 비활성화
		
		//방법5: 익명 내부 클래스 임시 객체 사용
		b3.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				JComponent1 frame = (JComponent1) b.getTopLevelAncestor();
				
				frame.setTitle(b.getX()+","+b.getY()); //타이틀에 버튼 좌표 출력
			}
		});
		c.add(b1);
		c.add(b2);
		c.add(b3);
	}

	public static void main(String[] args) {
		new JComponent1();
	}

}
