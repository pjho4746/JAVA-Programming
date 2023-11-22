package BorderLayOut_14_2;

import java.awt.*;
import javax.swing.*;

public class BorderLayOut1 {
	private JFrame frame;
	
	public BorderLayOut1() {
		frame = new JFrame("BorderLayOut1");
		buildGUI();
		frame.setBounds(100, 200, 200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void buildGUI() {
		frame.setLayout(new BorderLayout());
		JButton btn;
		//5���� ������ ���� �Ҵ�
		//��ġ�� �������� ������ �⺻������ center
		//->5�� ���� center�� ������ ��, �� �������� �ϳ��� ������ �� �ֱ� ������ 5�� ����
		for(int i=0; i<5; i++) {
			btn = new JButton(""+(i+1));
			frame.add(btn);
		}
	}
}
