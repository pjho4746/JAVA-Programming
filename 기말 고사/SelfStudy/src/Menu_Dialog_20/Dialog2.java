package Menu_Dialog_20;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OptionPaneEx extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4;
	String[] str = {"로그인", "회원가입"};
	
	public OptionPaneEx() {
		super("OptionPaneEx");
		
		buildGUI();
		
		pack();
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		setLayout(new FlowLayout());
		
		b1 = new JButton("MessageDialog");
		b2 = new JButton("ConfirmDialog");
		b3 = new JButton("InputDialog");
		b4 = new JButton("OptionDialog");
		
		add(b1);
	}
	
	
	
	public static void main(String[] args) {
		new OptionPaneEx();
	}
}
