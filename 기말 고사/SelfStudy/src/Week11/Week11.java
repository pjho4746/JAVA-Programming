package Week11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Week11 extends JFrame {
	private String[] gender_name = {"남", "여"};
	private JRadioButton[] genders = new JRadioButton[2];
	private JLabel result1 = new JLabel(" ");
	private String[] hobby_name = {"영화", "음악감상", "사진", "운동"};
	private JCheckBox[] hobbies = new JCheckBox[4];
	private JLabel result2 = new JLabel(" ");
	
	public Week11() {
		super("사원등록");
		buildGUI();
		
		setSize(350, 420);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		//성명
		JLabel laname = new JLabel("성명");
		JTextField name = new JTextField(8);
		//성별
		JLabel lagender = new JLabel("성별");
		
		for(int i=0; i<gender_name.length; i++) {
			genders[i] = new JRadioButton(gender_name[i]);
			genders[i].addItemListener(handler); //익명 내부 클래스 사용
		}
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel1.add(laname);
		panel1.add(name);
		panel1.add(lagender);
		ButtonGroup g = new ButtonGroup();
		for(JRadioButton r : genders) {
			g.add(r);
			panel1.add(r);
		}
		//주민등록번호
		JLabel lanumber1 = new JLabel("주민등록번호");
		JTextField number1 = new JTextField(6);
		JLabel lanumber2 = new JLabel("-");
		JTextField number2 = new JTextField(7);
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel2.add(lanumber1);
		panel2.add(number1);
		panel2.add(lanumber2);
		panel2.add(number2);
		//주소
		JLabel laaddress = new JLabel("주소");
		JTextField address = new JTextField(22);
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel3.add(laaddress);
		panel3.add(address);
		//부서명
		JLabel lapart = new JLabel("부서명");
		JTextField part = new JTextField(8);
		JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel4.add(lapart);
		panel4.add(part);
		//취미
		JLabel lahobby = new JLabel("취미");
		JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel5.add(lahobby);
		for(int i=0; i<hobby_name.length; i++) {
			hobbies[i] = new JCheckBox(hobby_name[i]);
			panel5.add(hobbies[i]);
			hobbies[i].addItemListener(handle);
		}
		//자기소개
		JLabel laself = new JLabel("자기소개");
		JTextArea self = new JTextArea(9,22);
		//버튼
		JButton button1 = new JButton("저장");
		//일괄 출력
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				self.append(name.getText()+"\n");
				self.append(result1.getText()+"\n");
				self.append(number1.getText()+"-"+number2.getText()+"\n");
				self.append(address.getText()+"\n");
				self.append(part.getText()+"\n");
			}
			
		});
		
		JButton button2 = new JButton("종료");
		JPanel panel7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel7.add(button1);
		panel7.add(button2);
		
		JPanel panelf1 = new JPanel(new GridLayout(0,1));
		panelf1.add(panel1);
		panelf1.add(panel2);
		panelf1.add(panel3);
		panelf1.add(panel4);
		panelf1.add(panel5);
		panelf1.add(laself);
		
		
		c.add(panelf1, BorderLayout.NORTH);
		c.add(self, BorderLayout.CENTER);
		c.add(panel7, BorderLayout.SOUTH);
				
	}
	
	private ItemListener handler = new ItemListener() {
		private String name;
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED){//선택한 경우
				if(e.getItem()==genders[0])//"남"
					name = "남";
				else
					name="여";
			}
			else
				name="성별을 선택하지 않았습니다";		
			result1.setText(name);
		}
		
	};
	
	private ItemListener handle = new ItemListener() {
		private String name;
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED){//선택한 경우
				if(e.getItem()==hobbies[0])//"영화"
					name = "영화";
				else if(e.getItem()==hobbies[1])//"음악감상"
					name = "음악감상";
				else if(e.getItem()==hobbies[2])//"사진"
					name = "사진";
				else
					name="운동";
			}
			else
				name="취미를 선택하지 않았습니다";		
			result2.setText(name);
		}
		
	};

	public static void main(String[] args) {
		new Week11();
	}
}




