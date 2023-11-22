//컴퓨터공학과 20200769 박지호
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
   
     public Window() {
         
          super("사원등록");
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          Container c = getContainer();
          c.setLayout(new);
          
          buildGUI();
         
          setSize(350, 420);
          setResizable(false);
          setVisible(true);
         
     }
     private void buildGUI() {
  
    	 
    	 JLabel lblId =new JLabel("성명");
         JLabel lblPwd=new JLabel("성별");
         JLabel lblHp=new JLabel("주민등록번호");
         JLabel lblAddr=new JLabel("주소");
         JLabel lblAge =new JLabel("부서명");
         JLabel lblhob =new JLabel("취미");
         JLabel lbSelf =new JLabel("자기소개");
        
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
        
         JButton btnCancel = new JButton("저장");      
         JButton btnSubmit = new JButton("종료");

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