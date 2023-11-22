package JComponent_16_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;

public class JComponent5 extends JFrame {
	
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20); //한 줄에 20개, 7줄 입력 가능
	
	public JComponent5() {
		setTitle("JComponent5");
		
		buildGUI();
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter>키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		//텍스트필드에 <Enter>키 입력 때 발생하는 Action 이벤트의 리스너 등록
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				//텍스트필드의 문자열을 텍스트영역 창에 붙임
				ta.append(t.getText()+"\n");
				t.setText("");
			}
			
		});
	}

	public static void main(String[] args) {
		new JComponent5();
	}

}
