//��ǻ�Ͱ��а� 20200769 ����ȣ
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
   
     public Window() {
         
          super("������");
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          Container c = getContainer();
          c.setLayout(new);
          
          buildGUI();
         
          setSize(350, 420);
          setResizable(false);
          setVisible(true);
         
     }
     private void buildGUI() {
  
    	 
    	 JLabel lblId =new JLabel("����");
         JLabel lblPwd=new JLabel("����");
         JLabel lblHp=new JLabel("�ֹε�Ϲ�ȣ");
         JLabel lblAddr=new JLabel("�ּ�");
         JLabel lblAge =new JLabel("�μ���");
         JLabel lblhob =new JLabel("���");
         JLabel lbSelf =new JLabel("�ڱ�Ұ�");
        
         add(lblId);
         add(lblPwd);
         add(lblHp);
         add(lblAddr);
         add(lblAge);
         add(lblhob);
         add(lbSelf);
         
         JTextField txtId =new JTextField(8);
         JTextField txtPwd =new JTextField(3);
         
         JLabel lblhipen1 = new JLabel("-");
         
         JTextField txtHp1 = new JTextField(6);
         JTextField txtHp2 = new JTextField(7);
         JTextField txtAddr = new JTextField(22);
         JTextField txtAge = new JTextField(8);
         JTextField txthob = new JTextField(22);
         JTextField txtSelf = new JTextField(22);
        
         JButton btnCancel = new JButton("����");      
         JButton btnSubmit = new JButton("����");

         lblId.setBounds(20, 30, 100, 20);
         lblPwd.setBounds(20, 60, 100, 20);
         lblHp.setBounds(20, 90, 100 , 20);
         lblAddr.setBounds(20, 120, 100, 20);
         lblAge.setBounds(20, 150, 100, 20);
         lblhob.setBounds(20, 180, 100, 20);
         lbSelf.setBounds(20, 210, 100, 20);
         
         txtId.setBounds(120, 30, 150, 20);
         txtPwd.setBounds(120, 60, 150, 20);
         txtHp1.setBounds(120, 90, 60, 20);
         lblhipen1.setBounds(190, 90, 10, 20);
         txtHp2.setBounds(210, 90, 60, 20);
         txtAddr.setBounds(120, 120, 150, 20);
         txtAge.setBounds(120, 150, 150, 20);
         txthob.setBounds(120, 180, 150, 20);
         txtSelf.setBounds(120, 210, 150, 100);
         
         
         Panel paButton = new Panel();
         paButton.add(btnSubmit);
         paButton.add(btnCancel);
         paButton.setBounds(0, 320, 370, 370);
      
            
         add(txtId);
         add(txtPwd);
         add(txtHp1);
         add(lblhipen1);
         add(txtHp2);
         add(txtAddr);
         add(txtAge);
         add(txthob);
         add(txtSelf);
         add(paButton);
     }

	public static void main(String[] args) {
		new Window();
	}

}