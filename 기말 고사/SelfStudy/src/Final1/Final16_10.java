package Final1;
//작성
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

public class Final16_10 extends JFrame {
	private Vector<PhoneInfo> mData = new Vector<PhoneInfo>();
	public Final16_10() {
		super("ComboBoxList");
		readData();
		buildGUI();
		setBounds(120, 120, 300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		JComboBox<PhoneInfo>cbox = new JComboBox<PhoneInfo>(mData);
		cbox.setMaximumRowCount(3);
		
		cbox.addItemListener(choiceEventListener);
		cbox.addActionListener(selectEventListener);
		
		setLayout(new FlowLayout());
		add(new JLabel("이름"));
		add(cbox);
	}
	private void readData() {
		mData.add(new PhoneInfo("홍길동", "1990/01/01", "010-111-2222"));
		mData.add(new PhoneInfo("일지매", "010-999-9999"));
	}
	private ItemListener choiceEventListener = new ItemListener() {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED)
				System.out.print("Selected...");
			else
				System.out.println("Deselected...");
			((PhoneInfo)e.getItem()).show();
		}
	};
	private ActionListener selectEventListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox<PhoneInfo> cb = (JComboBox<PhoneInfo>) e.getSource();
			System.out.print("선택");
			((PhoneInfo)(cb.getSelectedItem())).show();
		}
	};
	class PhoneInfo{
		private String name;
		private String birthday;
		private String PhoneNum;
		
		PhoneInfo(String name, String birthday, String PhoneNum){
			this.name = name;
			this.birthday = birthday;
			this.PhoneNum = PhoneNum;
		}
		PhoneInfo(String name, String PhoneNum){
			this.name = name;
			this.PhoneNum = PhoneNum;
		}
		void show() {
			System.out.print(name);
			if(birthday != null)
				System.out.print(birthday);
			else
				System.out.print("\n");
			System.out.println(PhoneNum);
		}
		//객체의 문자정보를 "Class(이름)@16진수의 해시 코드"로 Console 창에 출력
		public String toString() {return name;}
	}
	public static void main(String[] args) {
		new Final16_10();
	}

}
