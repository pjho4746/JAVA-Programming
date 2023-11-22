package JComponent_16_1;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class JComponent7 extends JFrame {
	//üũ�ڽ� �迭
	private JCheckBox[] fruits = new JCheckBox[3];
	//üũ�ڽ� ���ڿ��� ����� ���ڿ� �迭
	private String[] names= {"���","��", "ü��"};
	//��� ���� ����� ���̺�
	private JLabel sumLabel;
	
	public JComponent7() {
		setTitle("JComponent7");
		
		buildGUI();
		
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		
		//3���� üũ�ڽ��� ����. ����Ʈ�ҿ� �����ϰ� Item ������ ���
		for(int i=0; i<fruits.length; i++) {
			//names[]�� ���ڿ��� üũ�ڽ� ����
			fruits[i] = new JCheckBox(names[i]);
			//üũ�ڽ� �ܰ��� ���̵��� ����
			//fruits[i].setBorderPainted(true);
			
			c.add(fruits[i]); //����Ʈ�ҿ� üũ�ڽ� ����
			fruits[i].addItemListener(handler); //üũ�ڽ��� Item ������ ���
		}
		
		sumLabel = new JLabel("���� 0�� �Դϴ�."); //���� ���� ����ϴ� ���̺� ����
		c.add(sumLabel);
	}
	
	//Item ������ ����
	private ItemListener handler = new ItemListener() {
		private int sum = 0; //������ ��
		
		//üũ�ڽ��� ���� ���°� ���ϸ� itemStateChanged() ȣ���
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()== fruits[0])
					sum+=100;
				else if(e.getItem()== fruits[1])
					sum+=500;
				else
					sum+=20000;
			}
			else {
				if(e.getItem()== fruits[0])
					sum-=100;
				else if(e.getItem()== fruits[1])
					sum-=500;
				else
					sum-=20000;
			}
			sumLabel.setText("���� "+sum+"�� �Դϴ�.");//�� ���
		}
	};
	
	public static void main(String[] args) {
		new JComponent7();
	}

}
