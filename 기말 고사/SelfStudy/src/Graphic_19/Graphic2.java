package Graphic_19;

import java.awt.Graphics;

import javax.swing.*;

public class Graphic2 extends JFrame {
	public Graphic2() {
		super("Graphic2");
		
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
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawLine(0, 0, 100, 50);
		}
	}
	public static void main(String[] args) {
		new Graphic2();
	}

}
