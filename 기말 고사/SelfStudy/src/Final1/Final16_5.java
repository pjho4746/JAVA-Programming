package Final1;

//작성
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Final16_5 extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20);//7행
	
	public Final16_5() {
		super("텍스트영역 만들기 예제");
		buildGUI();
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <enter> 키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		//익명내부클래스객체
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				ta.append(t.getText()+"\n");
				t.setText("");
			}
		});
	}
	public static void main(String[] args) {
		new Final16_5();
	}
}
