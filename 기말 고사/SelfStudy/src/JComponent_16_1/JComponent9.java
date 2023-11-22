package JComponent_16_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JComponent9 extends JFrame {
	private JRadioButton[] radio = new JRadioButton[3]; //������ư �迭
	private String[] text = {"���", "��", "ü��"};
	private ImageIcon[] image = {
			new ImageIcon("images/flower.jpg"),
			new ImageIcon("images/flower1.jpg"),
			new ImageIcon("images/flower2.jpg"),
	}; 
	private JLabel imageLabel = new JLabel(); //�̹����� ��µ� ���̺�
	
	public JComponent9() {
		setTitle("JComponent9");
		
		buildGUI();
		
		setSize(250,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(createRadioPanel(), BorderLayout.NORTH); //����Ʈ���� NORTH�� ���� �г� ����
		c.add(createImagePanel(), BorderLayout.CENTER); //����Ʈ���� CENTER�� �̹��� ���̺�
	}
	//JPanel : ������Ʈ�� �׷캰�� ��� ó���� �� ���
	private JPanel createRadioPanel() {
		JPanel radioPanel = new JPanel(); //3���� ������ư�� ������ �г�
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup(); //��ư �׷� ��ü ����
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]); //���� ��ư ����
			g.add(radio[i]); //�׷쿡�� �߰��ϰ�
			
			radioPanel.add(radio[i]); //�гο��� �߰��ؾ� ��(�ܼ��� �׷� �߰��� �ȵ�)
			
			radio[i].addActionListener(handler); //�� ��ư���� �̺�Ʈ
		}
		radio[2].setSelected(true);//ü�� ������ư�� ���� ���·� ����
		return radioPanel;
	}
	
	private JPanel createImagePanel() {
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);//�̹����� �߾� ����
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(imageLabel);
		
		return panel;
	}
	
	//Item ������ ��� Action ������ �ۼ�
	private ActionListener handler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton src = (JRadioButton) e.getSource();
			
			for(int i=0; i<radio.length; i++) {
				if(src==radio[i]) {
					imageLabel.setIcon(image[i]);
					break;
				}
			}
			
		}
		
	};
	
	public static void main(String[] args) {
		new JComponent9();
	}

}
