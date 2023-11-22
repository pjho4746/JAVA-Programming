package SetLayOutNull_14_2;

import javax.swing.*;

public class SetLayOutNull {
	private JFrame frame;
	
	public SetLayOutNull() {
		frame = new JFrame("setLayout(null)");
		
		//������ ����
		buildGUI();
		
		frame.setBounds(100, 200, 200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void buildGUI() {
		//��ġ�����ڸ� ������� �ʰ� ������ ������Ʈ ����
		frame.setLayout(null);
		JButton btn;
		
		for(int i=0; i<5; i++) {
			//btn = new JButton(String.valudOf(i+1));
			btn = new JButton(""+(i+1));
			btn.setBounds(0, 40*i, 100, 30);
			frame.add(btn);
		}
		
		
	}
}
