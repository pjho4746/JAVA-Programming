package Final1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Final16_11 extends JFrame {
	private JList<String> mList;
	private JTextField mTvInput;
	private JButton mBtnAdd, mBtdDel;
	private Vector<String> mData = new Vector<String>();
	
	public Final16_11() {
		super("JList Test");
		buildGUI();
		registerListener();
		setBounds(100, 200, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildGUI() {
		mData.add("사과");
		mData.add("오렌지");
		mList = new JList<String>(mData); //벡터를 리스트에
		mList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(createInputPanel(), BorderLayout.NORTH);
		add(new JScrollPane(mList), BorderLayout.CENTER);
	}
	
	private JPanel createInputPanel() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		mTvInput=new JTextField(20);
		p.add(mTvInput);
		
		mBtnAdd = new JButton("추가");
		p.add(mBtnAdd);
		mBtdDel = new JButton("삭제");
		p.add(mBtdDel);
		return p;
	}
	private void registerListener() {
		mBtnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = mTvInput.getText();
				mData.add(s);
				mList.updateUI();
				mTvInput.setText("");
			}
		});
		mBtdDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int idx = mList.getSelectedIndex();
				mData.remove(idx);
				mList.updateUI();
				
				mTvInput.setText("");
			}
			
		});
		
		mList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(e.getValueIsAdjusting()) {
					int idx = e.getFirstIndex();
					System.out.println(idx);
					mTvInput.setText(mList.getSelectedValue());
				}
			}
			
		});
	}
	
	public static void main(String[] args) {
		new Final16_11();
	}

}
