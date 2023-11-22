//컴퓨터공학과 20200769 박지호
import javax.swing.*;
import java.awt.*;

public class RegMember2 extends JFrame {
	 JLabel lblId, lblPwd,  lblHp, lblAddr,lblAge, lblhob, lbSelf;
     JTextField txtId, txtPwd, txtName, txthob, txtSelf;
     JTextField txtHp1, txtHp2;
     JTextField txtAddr,txtAge;
     JButton btnSubmit, btnCancel;
     Checkbox cbMale,cbFeMale;
     Checkbox cbHobby1, cbHobby2, cbHobby3, cbHobby4;
   
     public RegMember2 {
         
          super("사원 등록");
          setLayout(null);
          
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          buildGUI();
          

          //
          setSize(350, 420);
          setResizable(false);
          setVisible(true);
         
     }
     private void buildGUI() {
    	 lblId =new JLabel("성명");
         lblPwd=new JLabel("성별");
         lblHp=new JLabel("주민등록번호");
         lblAddr=new JLabel("주소");
         lblAge =new JLabel("부서명");
         lblhob =new JLabel("취미");
         lbSelf =new JLabel("자기소개");
         
        
         add(lblId);
         add(lblPwd);
         add(lblHp);
         add(lblAddr);
         add(lblAge);
         add(lblhob);
         add(lbSelf);
         
         txtId =new JTextField(8);
         //txtPwd =new JTextField(3);
         JLabel lblhipen1 = new JLabel("-");
         txtHp1 = new JTextField(6);
         txtHp2 = new JTextField(7);
         txtAddr = new JTextField(22);
         //txtAge = new JTextField(8);
         //txthob = new JTextField(22);
         txtSelf = new JTextField(22);
         
         Panel panGen = new Panel(new FlowLayout(FlowLayout.LEFT));
         CheckboxGroup group = new CheckboxGroup();
         cbMale = new Checkbox("남자",group,true);
         cbFeMale = new Checkbox("여자",group,false);
        
         panGen.add(cbMale);
         panGen.add(cbFeMale);
         panGen.setBounds(120, 55, 150, 20);        
         
         Panel panHobby = new Panel(new FlowLayout(FlowLayout.LEFT));
         cbHobby1 = new Checkbox("영화");
         cbHobby2 = new Checkbox("음악감상");
         cbHobby3 = new Checkbox("사진");
         cbHobby4 = new Checkbox("운동");
         panHobby.add(cbHobby1);
         panHobby.add(cbHobby2);
         panHobby.add(cbHobby3);
         panHobby.add(cbHobby4);
        
         panHobby.setBounds(120, 175, 300, 20);
         
         btnCancel = new JButton("종료");      
         btnSubmit = new JButton("저장");

         lblId.setBounds(20, 30, 100, 20);
         lblPwd.setBounds(20, 60, 100, 20);
         lblHp.setBounds(20, 90, 100 , 20);
         lblAddr.setBounds(20, 120, 100, 20);
         lblAge.setBounds(20, 150, 100, 20);
         lblhob.setBounds(20, 180, 100, 20);
         lbSelf.setBounds(20, 210, 100, 20);
         
         txtId.setBounds(120, 30, 150, 20);
         //txtPwd.setBounds(120, 60, 150, 20);
         txtHp1.setBounds(120, 90, 60, 20);
         lblhipen1.setBounds(190, 90, 10, 20);
         txtHp2.setBounds(210, 90, 60, 20);
         txtAddr.setBounds(120, 120, 150, 20);
         txtAge.setBounds(120, 150, 150, 20);
         //txthob.setBounds(120, 180, 150, 20);
         //txtSelf.setBounds(120, 210, 150, 100);
         txtSelf.setBounds(0, 230, 350, 100);
         
         Panel paButton = new Panel();
         paButton.add(btnSubmit);
         paButton.add(btnCancel);
         paButton.setBounds(0, 340, 370, 370);
      
            
         add(txtId);
         //add(txtPwd);
         add(txtHp1);
         add(lblhipen1);
         add(txtHp2);
         add(txtAddr);
         add(txtAge);
         //add(txthob);
         add(txtSelf);
         add(paButton);
         add(panGen);
         add(panHobby);
     }

	public static void main(String[] args) {
		new RegMember2();
	}


}