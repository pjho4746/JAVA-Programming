//컴퓨터공학과 20200769 박지호
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegMember3 extends JFrame {

	    GridBagLayout gb;
	    GridBagConstraints gbc;
	   
	    public RegMember3(){
	        super("사원 등록3");
	        //Container c = this.getContentPane();
	        //c.setLayout(new GridLayout(0,2);
	        
	        gb = new GridBagLayout();
	        setLayout(gb);
	        gbc = new GridBagConstraints();
	        gbc.fill = GridBagConstraints.BOTH;
	        gbc.weightx = 1.0;
	        gbc.weighty = 1.0;
	        
	        buidGUI();
	        
	        setSize(350,450);
	        setVisible(true);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	       
	       
	    }//생성자
	   
	    //그리드백레이아웃에 붙이는 메소드
	    private void gbAdd(JComponent c, int x, int y, int w, int h){
	        gbc.gridx = x;
	        gbc.gridy = y;
	        gbc.gridwidth = w;
	        gbc.gridheight = h;
	        gb.setConstraints(c, gbc);
	        gbc.insets = new Insets(2, 2, 2, 2);
	        add(c, gbc);
	    }//gbAdd
	    
	    private void buidGUI() {
	    	 //아이디
	        JLabel bId = new JLabel("성명");
	        JTextField tfId = new JTextField(8);     
	        //그리드백에 붙이기
	        gbAdd(bId, 0, 0, 1, 1);
	        gbAdd(tfId, 1, 0, 3, 1);
	        
	        //성별
	        JLabel bGender = new JLabel("성별");
	        JPanel pGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JRadioButton rbMan = new JRadioButton("남",true);
	        JRadioButton rbWoman = new JRadioButton("여",true);
	        ButtonGroup group = new ButtonGroup();
	        group.add(rbMan);
	        group.add(rbWoman);
	        pGender.add(rbMan);
	        pGender.add(rbWoman);      
	        gbAdd(bGender, 0, 1, 1, 1);
	        gbAdd(pGender,1, 1, 3, 1);
	        
	        //주민등록번호
	        JLabel bTel = new JLabel("주민등록번호");
	        JPanel pTel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JTextField tfTel1 = new JTextField(6);    
	        JTextField tfTel2 = new JTextField(7);    
	        pTel.add(tfTel1);
	        pTel.add(new JLabel(" - "));
	        pTel.add(tfTel2);
	        gbAdd(bTel, 0, 2, 1, 1);
	        gbAdd(pTel, 1, 2, 3, 1);
	       
	        //주소
	        JLabel bAddr = new JLabel("주소");
	        JTextField tfAddr = new JTextField(22);
	        gbAdd(bAddr, 0, 3, 1,1);
	        gbAdd(tfAddr, 1, 3, 3,1);
	       
	        //부서명
	        JLabel bEmail = new JLabel("부서명");
	        JTextField tfEmail = new JTextField(8);
	        gbAdd(bEmail, 0,4,1,1);
	        gbAdd(tfEmail,1,4,3,1);
	        
	        //취미
	        JLabel bgroup = new JLabel("취미");
	        //JTextField tfgroup = new JTextField(22);
	        JPanel chBox = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JCheckBox ch1 = new JCheckBox("영화");
	        JCheckBox ch2 = new JCheckBox("음악감상");
	        JCheckBox ch3 = new JCheckBox("사진");
	        JCheckBox ch4 = new JCheckBox("운동");
	        chBox.add(ch1);
	        chBox.add(ch2);
	        chBox.add(ch3);
	        chBox.add(ch4);
	        gbAdd(bgroup, 0,5,1,1);
	        gbAdd(chBox,1,5,3,1);
	        
	        //자기소개
	        JLabel bIntro = new JLabel("자기 소개");
	        JTextArea taIntro = new JTextArea(9, 22); //행 : 열
	        JScrollPane pane = new JScrollPane(taIntro);
	        pane.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		String name = tfId.getText();
	        		String phnum1 = tfTel1.getText();
	        		String phnum2 = tfTel2.getText();
	        		String address = tfAddr.getText();
	        		String where = tfEmail.getText();
	        		String selfIn = taIntro.getText();
	        		taIntro.setText(" "+name+phnum1+"-"+phnum2+address+where+selfIn);
	        		taIntro.setText(" ");
	        	}
	        });
	        gbAdd(bIntro,0,6,1,1);
	        gbAdd(pane,1,6,3,1);
	    }
	    
	    public static void main(String[] args) {
	       
	        new RegMember3();
	    }
	
	}//end
	 