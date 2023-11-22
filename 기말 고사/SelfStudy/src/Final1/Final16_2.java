package Final1;

import java.awt.*;
import javax.swing.*;


public class Final16_2 extends JFrame {
	public Final16_2() {
		super("레이블 예제");
		
		buildGUI();
		
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		//문자열 레이블 형성
		JLabel textLabel = new JLabel("사랑합니다");
		
		//이미지 레이블 형성
		ImageIcon beauty = new ImageIcon("images/flower.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		//문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("images/flower1.jpg");
		JLabel label = new JLabel("보고 싶으면 전화하세요", normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
	}
	
	public static void main(String[] args) {
		new Final16_2();
	}

}
