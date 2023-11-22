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
		//5개로 나누고 영역 할당
		//위치를 지정하지 않으면 기본적으로 center
		//->5개 보두 center에 부착된 것, 한 영역에는 하나만 유지할 수 있기 때문에 5만 보임
		for(int i=0; i<5; i++) {
			btn = new JButton(""+(i+1));
			frame.add(btn);
		}
	}
}
