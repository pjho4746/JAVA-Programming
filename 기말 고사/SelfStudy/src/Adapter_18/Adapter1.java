package Adapter_18;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class Adapter1 extends JFrame {
	private JFrame frame;
	
	public Adapter1() {
		frame = new JFrame("Adapter1");
		
		registerEventListener();
		
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
	
	private void registerEventListener() {
		frame.addWindowListener(handler);
	}
	
	private WindowListener handler = new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.print("종료합니다");
			System.exit(0);
		}
		
	};
	
	public static void main(String[] args) {
		new Adapter1();
	}
}
