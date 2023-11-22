package Graphic_19;

import java.awt.*;
import javax.swing.*;

public class Graphic5 extends JFrame {
	public Graphic5() {
		super("Graphic5");
		
		buildGUI();
		
		setLocation(500, 200);
		setSize(400, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		CarDrawingCanvas drawingCanvas = new CarDrawingCanvas();
		add(drawingCanvas);
	}
	
	class CarDrawingCanvas extends JComponent{

		@Override
		public void paint(Graphics g) {
			Color c = new Color(225, 0, 0, 128);
			g.setColor(c);
			
			g.fillRect(100, 110, 200, 40);
			g.fillRect(150, 70, 100, 40);
			
			g.setColor(Color.BLACK);
			g.drawOval(125, 150, 30, 30);
			g.drawOval(245, 150, 30, 30);
			g.drawLine(50, 180, 350, 180);
		}
		
	}
	
	public static void main(String[] args) {
		new Graphic5();
	}

}
