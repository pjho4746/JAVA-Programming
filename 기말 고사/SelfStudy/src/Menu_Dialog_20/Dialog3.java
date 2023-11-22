package Menu_Dialog_20;

import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuAndFiledDialofEx extends JFrame {
	JLabel imageLabel = new JLabel();
	
	public MenuAndFiledDialofEx() {
		super("MenuAndFiledDialofEx");
		
		add(imageLabel);
		createMenu();
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu fileMenu = new JMenu("File");
		
		JMenuItem openItem = new JMenuItem("Open");
		openItem.addActionListener(new OpenActionListener());
		
		fileMenu.add(openItem);
		mb.add(fileMenu);
	}

	class OpenActionListener implements ActionListener{
		JFileChooser chooser;
		
		openActionListener(){
			chooser = new JFileChooser()
		}
	}
	
	public static void main(String[] args) {
		new MenuAndFiledDialofEx();
	}

}
