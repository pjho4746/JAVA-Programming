package Final1;
//(작성)
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Final16_9 extends JFrame {
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = {"사과", "배", "체리"};
	private ImageIcon[] images = {
			new ImageIcon("images/flower.jpg"),
			new ImageIcon("imgaes/flower1.jpg"),
			new ImageIcon("images/flower2.jpg")
	};
	private JLabel imageLabel = new JLabel();
	
	public Final16_9() {
		super("라디오버튼 ActionEvent 예제");
		buildGUI();
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(createRadioPanel(), BorderLayout.NORTH);
		c.add(createImagePanel(), BorderLayout.CENTER);
	}
	private JPanel createRadioPanel() {
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addActionListener(handler);
		}
		radio[2].setSelected(true);
		return radioPanel;
	}
	private JPanel createImagePanel() {
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);//중앙정렬
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(imageLabel);
		return panel;
	}
	private ActionListener handler = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton src = (JRadioButton)e.getSource();
			for(int i =0; i<radio.length; i++) {
				if(src==radio[i]) {
					imageLabel.setIcon(images[i]);
					break;
				}
			}
		}
		
	};
	public static void main(String[] args) {
		new Final16_9();
	}

}
