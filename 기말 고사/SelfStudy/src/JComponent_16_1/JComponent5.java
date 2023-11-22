package JComponent_16_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;

public class JComponent5 extends JFrame {
	
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20); //�� �ٿ� 20��, 7�� �Է� ����
	
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
		
		c.add(new JLabel("�Է� �� <Enter>Ű�� �Է��ϼ���"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		//�ؽ�Ʈ�ʵ忡 <Enter>Ű �Է� �� �߻��ϴ� Action �̺�Ʈ�� ������ ���
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				//�ؽ�Ʈ�ʵ��� ���ڿ��� �ؽ�Ʈ���� â�� ����
				ta.append(t.getText()+"\n");
				t.setText("");
			}
			
		});
	}

	public static void main(String[] args) {
		new JComponent5();
	}

}
