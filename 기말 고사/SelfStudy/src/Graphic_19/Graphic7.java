package Graphic_19;

import java.awt.*;
import javax.swing.*;

public class Graphic7 extends JFrame {
	public Graphic7() {
		super("Graphic7");
		
		buildGUI();
		
		setLocation(500, 200);
		setSize(400, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		ImageCanvas drawingCanvas = new ImageCanvas();
		add(drawingCanvas);
	}
	
	class ImageCanvas extends JComponent{
		Image img = Toolkit.getDefaultToolkit().getImage("images/flower.jpg");

		@Override
		public void paint(Graphics g) {
			g.drawImage(img, 50, 100, this);
			g.drawImage(img, 400, 100, 100, 100, this);
		}
	}
	
	public static void main(String[] args) {
		new Graphic7();
	}

}
