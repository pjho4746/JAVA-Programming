package JComponent_16_1;

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class JComponent2 extends JFrame {
	public JComponent2() {
		super("JComponent2");
		
		buildGUI();
		
		setSize(200, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		//문자열 레이블 생성
		JLabel textLabel = new JLabel("사랑합니다");
		
		//이미지 레이블 생성
		ImageIcon flower = new ImageIcon("images/flower.jpg"); //이미지 로딩
		JLabel imageLabel = new JLabel(flower);
		
		//문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("images/flower1.jpg"); //이미지 로딩
		JLabel label = new JLabel("보고싶으면 전화하세요",
				normalIcon, SwingConstants.CENTER);//레이블 형성
		//컨텐트판에 3개의 레이블 부착
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
	}

	public static void main(String[] args) {
		new JComponent2();
	}

}
