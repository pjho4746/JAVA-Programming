package Final1;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;

public class JVariousListTest extends JFrame {
	public JVariousListTest() {
		super("JVariousListTest");
		
		buildGUI();
		
		setBounds(300, 200, 300, 220);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void buildGUI() {
		setLayout(new FlowLayout());
		add(createArrayList());
		add(createVectorList());
	}
	private JPanel createArrayList() {//배열로부터 아이템을 공급받아 생성
		JPanel p = new JPanel();
		String[] listData = {"one", "two", "three", "four", "five"};
		JList<String> list = new JList<String>(listData);
		list.setSelectedIndex(1);
		p.add(list);
		return p;
	}
	private JPanel createVectorList() {//벡터로부터 아이템을 공급받아 생성
		JPanel p = new JPanel();
		Vector<String> vListData = new Vector<String>();
		JList<String> list = new JList<String>(vListData);
		vListData.add("축구");
		vListData.add("야구");
		p.add(new JScrollPane(list));
		return p;
	}

	public static void main(String[] args) {
		new JVariousListTest();
	}

}
