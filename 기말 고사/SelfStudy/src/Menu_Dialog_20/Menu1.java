package Menu_Dialog_20;

import javax.swing.*;

public class Menu1 extends JFrame {
	private JLabel imgLabel = new JLabel(); //빈 이미지를 가진 레이블

	public Menu1() {
		setTitle("Menu1");
		
		createMenu();
		buildGUI();
		
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		add(imgLabel);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		this.setJMenuBar(mb); //메뉴바를 프레임에 부착
		
		JMenu screenMenu = new JMenu("Screen");
		mb.add(screenMenu);
		
		JMenuItem[] menuItem = new JMenulItem[4];
		String[] string = {"Load", "Hide", "ReShow", "Exit"};
		
		MenuActionListener listener = new MenuActionListener();
		
	}
	class MenuActionListene implements ActionListener

	public static void main(String[] args) {
		new Menu1();
	}

}
