// http://java.sun.com/docs/books/tutorial/uiswing/components/table.html 

import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

import java.awt.event.*;

class TableRenderer extends JFrame {

	private JTable table;
	JTextField t_filterText;
	
	TableRenderer() {
		super("���̺� �׽�Ʈ2");
		
		add(createFilterPanel(), BorderLayout.NORTH);
		add(createTablePanel(), BorderLayout.CENTER);
		add(createButtonPanel(), BorderLayout.SOUTH);
		
		setSize(450, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private JPanel createTablePanel() {
		JPanel panel = new JPanel(new BorderLayout());
		//JPanel panel = new JPanel();
		
		/*****************************************************************************/
		String[] columnNames = { "��  ��", "����", "����" };
		Object[][] data = { { "���ָ�", 22, "��" },
								{ "�Ҽ���", 20, "��" } };
		
		//DefaultTableModel tm = new DefaultTableModel(columnNames, 0);			// �� ���̺� �ۼ���
		DefaultTableModel tm = new DefaultTableModel(data, columnNames);	// �ʱⰪ�� ���� ���̺� �ۼ���
		/*****************************************************************************/

		table = new JTable(tm);
		
		table.setRowHeight(30);
		table.setCellSelectionEnabled(false);
		table.setRowSelectionAllowed(true);
		table.setAutoCreateRowSorter(true);
		
		tableSelectionListener();
		
		panel.add(new JScrollPane(table));

		// ǥ ���� ǥ��
		System.out.println("�÷� �� : " + tm.getColumnCount());
		System.out.println("����° �÷� �� : " + tm.getColumnName(2));
		System.out.println("�� �� : " + tm.getRowCount());

		return panel;
	}
	
	private JPanel createButtonPanel() {
		JPanel panel = new JPanel(new GridLayout(0, 4));
		
		JButton button = new JButton("������ ����");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DefaultTableModel dtm = (DefaultTableModel)table.getModel();
						
						dtm.setValueAt("����", 1, 2);
					}
					
				}
		);
		panel.add(button);
		
		
		button = new JButton("�÷� �߰�");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DefaultTableModel dtm = (DefaultTableModel)table.getModel();
						
						String columnName = "���";
						String[] columnData = { "��", "��" };
						dtm.addColumn(columnName, columnData);

						System.out.println("�÷� Ŭ������ : " + dtm.getColumnClass(3));
					}
				}
		);
		panel.add(button);
		
		button = new JButton("��(row) �߰�");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DefaultTableModel dtm = (DefaultTableModel)table.getModel();
						
						String[] rowData = { "ȫ�浿", "20", "��" };
						dtm.addRow(rowData);
					}
				}
		);
		panel.add(button);
		
		button = new JButton("��(row) ����");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DefaultTableModel dtm = (DefaultTableModel)table.getModel();
						
						String[] rowData = { "������", "18", "��" };
						dtm.insertRow(1, rowData);
					}
				}
		);
		panel.add(button);
		
		button = new JButton("�� �̵�");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DefaultTableModel dtm = (DefaultTableModel)table.getModel();
						
						dtm.moveRow(1, 3, 0);
					}
				}
		);
		panel.add(button);
		
		button = new JButton("�� ����");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 2�� �÷��� ����
						TableColumnModel tcm = table.getColumnModel();
						TableColumn tc = tcm.getColumn(2);

						// �� �ʺ� ����
						tc.setPreferredWidth(20);

						// �� ���� ��� ����
						DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
						dtcr.setHorizontalAlignment(SwingConstants.CENTER);

						tc.setCellRenderer(dtcr);
					}
				}
		);
		panel.add(button);

		button = new JButton("����");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DefaultTableModel tm = (DefaultTableModel)table.getModel();

						TableRowSorter<DefaultTableModel> sorter;
						sorter = new TableRowSorter<DefaultTableModel>(tm);
						table.setRowSorter(sorter);

						java.util.List <RowSorter.SortKey> sortKeys = new java.util.ArrayList<RowSorter.SortKey>();
						sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
						sortKeys.add(new RowSorter.SortKey(0, SortOrder.DESCENDING));
						sorter.setSortKeys(sortKeys); 
					}
				}
		);
		panel.add(button);

		button = new JButton("�޺��ڽ�");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 3�� �÷��� ����
						TableColumnModel tcm = table.getColumnModel();
						TableColumn tc = tcm.getColumn(3);

						// �޺��ڽ��� ǥ��
				        JComboBox cb = new JComboBox();
				        cb.addItem("��");
				        cb.addItem("��");
				        cb.addItem("��");
				        cb.addItem("��");

				        DefaultCellEditor dce = new DefaultCellEditor(cb);
						tc.setCellEditor(dce);
					}
				}
		);
		panel.add(button);

		return panel;
	}
	
	private JPanel createFilterPanel() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		t_filterText = new JTextField(10);
		t_filterText.setFocusable(true);
		
		// Whenever t_filterText changes, invoke newFilter.
		t_filterText.getDocument().addDocumentListener(
				new DocumentListener() {
					public void changedUpdate(DocumentEvent e) {
					    newFilter(t_filterText, 0);
					}
					public void insertUpdate(DocumentEvent e) {
						newFilter(t_filterText, 0);
					}
					public void removeUpdate(DocumentEvent e) {
						newFilter(t_filterText, 0);
					}
				}
		);
		
		panel.add(new JLabel("���� : "));
		panel.add(t_filterText);
		
		return panel;
	}
	
    private void newFilter(JTextField filterText, int idx) {
        RowFilter<DefaultTableModel, Object> rf = null;
        
        try {
            rf = RowFilter.regexFilter(filterText.getText(), idx);
        } 
        catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        
		DefaultTableModel tm = (DefaultTableModel)table.getModel();

		TableRowSorter<DefaultTableModel> sorter;
		sorter = new TableRowSorter<DefaultTableModel>(tm);
        
		sorter.setRowFilter(rf);

        table.setRowSorter(sorter);
    }
    
    private void tableSelectionListener() {
    	table.getSelectionModel().addListSelectionListener(
    	        new ListSelectionListener() {
    	            public void valueChanged(ListSelectionEvent event) {
    	                int viewRow = table.getSelectedRow();
    	                
    	                if (viewRow < 0) {
    	                    System.out.println("Selection got filtered away");
    	                }
    	                else {
    	                    int modelRow = table.convertRowIndexToModel(viewRow);
    	                    
    	                    System.out.printf("Selected Row in view: %d. ", viewRow);
    	                    System.out.printf("Selected Row in model: %d.\n", modelRow);
    	                }
    	            }
    	        }
    	);
    }
	
	public static void main(String[] args) {
		new TableRenderer();
	}

}
