package Adapter_18;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Adapter2 extends JFrame {
	private JLabel la; //"hello" ���ڿ��� ����ϱ� ���� ���̺� ������Ʈ
	
	public Adapter2() {
		setTitle("Adapter2");
		
		buildGUI();
		
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null); //��ġ������ ����
		
		contentPane.addMouseListener((MouseListener) new MyMouseListener());
		
		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		
		contentPane.add(la);
	}
	
	class MyMouseListener extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		
	}

	public static void main(String[] args) {
		new Adapter2();
	}

}
