package Graphic_19;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Graphic4 extends JFrame {
	public Graphic4() {
		super("Graphic4");
		
		buildGUI();
		
		setLocation(500, 200);
		setSize(400, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		CarDrawingCanvas drawingcanvas = new CarDrawingCanvas();
		add(drawingcanvas);
	}
	
	class CarDrawingCanvas extends JComponent{

		@Override
		public void paint(Graphics g) {
			g.drawRect(100, 110, 200, 40);
			g.drawRect(150, 70, 100, 40);
			g.drawOval(125, 150, 30, 30);
			g.drawOval(245, 150, 30, 30);
			g.drawLine(50, 180, 350, 180);
		}
	}
	
	public static void main(String[] args) {
		new Graphic4();
	}

}
