
// 3. 사용자 표 모델 이용
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AbstractTableModelEx extends JFrame {
	
	private JTable mTable;
	
	public AbstractTableModelEx() {
		super("테이블 테스트3");

		buildGUI();
		
		setSize(300,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		JButton button = new JButton("출력");
		
		button.addActionListener(mHandler);
		
		add(createTablePanel(), BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
	}
	
	private JPanel createTablePanel() {
		JPanel panel = new JPanel(new BorderLayout());
		
		// model = 사용자정의 테이블모델 MyTableModel 객체 생성
		MyTableModel model = new MyTableModel();
		// table = model과 연관된 JTable 객체 생성
		mTable = new JTable(model);

		mTable.setRowHeight(30);
		
		// panel에 table 부착
		panel.add(new JScrollPane(mTable));

		return panel;
	}
	
	private ActionListener mHandler = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			//TableModel model = table.getModel();

			int rowNum = mTable.getRowCount();
			int colNum = mTable.getColumnCount();
			
			for ( int c = 0; c < colNum; c++ ) {
				String colName = mTable.getColumnName(c);
				System.out.print(colName + "\t");
			}
			System.out.println();
			
			for ( int r = 0; r < rowNum; r++ ) {
				for ( int c = 0; c < colNum; c++ ) {
					Object cell = mTable.getValueAt(r, c);
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	};
	
	public static void main(String[] args) {
		new AbstractTableModelEx();
	}

}

/*
class MyTableModel extends AbstractTableModel {
	Object[][] data = { { "고주몽", 22, "남" },
						{ "소서노", 20, "여" } };
	
	String[] cn = { "이  름", "나이", "성별" };

	@Override
	public int getRowCount() {
		return data.length;
	}

	@Override
	public int getColumnCount() {
		return cn.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	@Override
	public String getColumnName(int column) {
		return cn[column];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return (columnIndex != 0) ? true : false;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		data[rowIndex] [columnIndex] = aValue;
	}
	
	
}*/
class MyTableModel extends AbstractTableModel {
	Object[][] data = { {"고주몽", "소서노"},
						{22,20},
						{"남", "여"}
	};
	
	String[] cn = { "이  름", "나이", "성별" };

	@Override
	public int getRowCount() {
		return data[0].length;
	}

	@Override
	public int getColumnCount() {
		return cn.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[columnIndex][rowIndex];
	}

	@Override
	public String getColumnName(int column) {
		return cn[column];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return (columnIndex != 0) ? true : false;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		data [columnIndex][rowIndex] = aValue;
	}

}

