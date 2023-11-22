package Graphic_19;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Graphic3 extends JFrame {
	public Graphic3() {
		super("Graphic3");
		
		buildGUI();
		
		setLocation(500, 200);
		setSize(400, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		BasicCanvas drawingCanvas = new BasicCanvas();
		add(drawingCanvas);
	}
	class BasicCanvas extends JComponent{
		static final int x = 150;
		static final int y = 150;
		@Override
		protected void paintComponent(Graphics g) {
			g.drawString("Hello, World", x, y);
			g.drawLine(x-3, y+10, x+70, y+10);
		}
	}
	public static void main(String[] args) {
		new Graphic3();
	}

}
