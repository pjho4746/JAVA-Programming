package Final1;
//(작성)
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Final16_7 extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = {"사과", "배", "체리"};
	private JLabel sumLabel;
	
	public Final16_7() {
		super("체크박스와 ItemEvent 예제");
		buildGUI();
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 2000원"));
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);//외곽선이 보임
			c.add(fruits[i]);
			fruits[i].addItemListener(handler);//익명내부클래스
		}
		sumLabel = new JLabel("현재 0원입니다.");
		c.add(sumLabel);
	}
	private ItemListener handler = new ItemListener() {
		private int sum = 0;
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==fruits[0]) sum+=100;
				else if(e.getItem()==fruits[1]) sum+=500;
				else sum+=2000;
			}
			else {
				if(e.getItem()==fruits[0]) sum-=100;
				else if(e.getItem()==fruits[1]) sum-=500;
				else sum-=2000;
			}
			sumLabel.setText("현재"+sum+"원입니다.");
		}
	};
	public static void main(String[] args) {
		new Final16_7();
	}

}
