package Graphic_19;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTextUI.BasicCaret;

public class Graphic1 extends JFrame {
	public Graphic1() {
		super("Graphic1");
		
		buildGUI();
		
		setLocation(500, 200);
		setSize(400, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		BasicCanvas drawingCanvas = new BasicCanvas();
		this.add(drawingCanvas);
	}
	
	class BasicCanvas extends JComponent{
		
	}
	public static void main(String[] args) {
		new Graphic1();
	}

}
