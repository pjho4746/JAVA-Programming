import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LayoutTest2 {
	private JFrame frame;
	private CardLayout card = new CardLayout();
	private JPanel p_card;
	
	public LayoutTest2() {
		frame = new JFrame("Layout Test");
		
		buildGUI();
		createCardPanel();
		
		
		frame.setSize(200,300);
		frame.setLocation(100,200);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		autoChange();
		
	}
	private void buildGUI() {
		frame.add(createCardPanel(), BorderLayout.CENTER);
		JButton btn = new JButton("마지막");
		frame.add(btn, BorderLayout.SOUTH);
		
		//이벤트 처리
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(p_card, "page5");
				
			}
			
		});
		
		}
	public JPanel createCardPanel() {
		p_card = new JPanel();
		p_card.setLayout(card);
		for(int i=0; i<5; i++) {
			String s = "" + (i+1);
			p_card.add(s, new JButton(s));
		}
		return p_card;
	}
	private void autoChange() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			card.next(frame.getContentPane());
		}
	}
	
	public static void main(String[] args) {
		new LayoutTest2();
	}
}
