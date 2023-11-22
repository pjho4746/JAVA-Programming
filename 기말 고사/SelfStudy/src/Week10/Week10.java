package Week10;

import java.awt.*;
import javax.swing.*;


public class Week10 extends JFrame {
	public Week10() {
		super("��� ���");
		
		buildGUI();
			
		setSize(350, 420);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		JLabel laname = new JLabel("����");
		JTextField name = new JTextField(8);
		JLabel lagender = new JLabel("����");
		JTextField gender = new JTextField(3);
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel1.add(laname);
		panel1.add(name);
		panel1.add(lagender);
		panel1.add(gender);
		
		JLabel lanumber1 = new JLabel("�ֹε�Ϲ�ȣ");
		JTextField number1 = new JTextField(6);
		JLabel lanumber2 = new JLabel("-");
		JTextField number2 = new JTextField(7);
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel2.add(lanumber1);
		panel2.add(number1);
		panel2.add(lanumber2);
		panel2.add(number2);
		
		JLabel laaddress = new JLabel("�ּ�");
		JTextField address = new JTextField(22);
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel3.add(laaddress);
		panel3.add(address);
		
		JLabel lapart = new JLabel("�μ���");
		JTextField part = new JTextField(8);
		JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel4.add(lapart);
		panel4.add(part);
		
		JLabel lahobby = new JLabel("���");
		JTextField hobby = new JTextField(22);
		JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel5.add(lahobby);
		panel5.add(hobby);
		
		JLabel laself = new JLabel("�ڱ�Ұ�");
		JTextArea self = new JTextArea(9,22);
		
		JButton button1 = new JButton("����");
		JButton button2 = new JButton("����");
		JPanel panel7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel7.add(button1);
		panel7.add(button2);
		
		JPanel panelf1 = new JPanel(new GridLayout(0,1));
		panelf1.add(panel1);
		panelf1.add(panel2);
		panelf1.add(panel3);
		panelf1.add(panel4);
		panelf1.add(panel5);
		panelf1.add(laself);
		
		add(panelf1, BorderLayout.NORTH);
		add(self, BorderLayout.CENTER);
		add(panel7, BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		new Week10();
	}

}
