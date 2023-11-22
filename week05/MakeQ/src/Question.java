//컴퓨터공학과 20200769
import java.util.Random;

public class Question {
	public int n1, n2, c, re;
	
	Random num = new Random();
	
	public void makeNum1() {
		n1 = num.nextInt(9); //0~8 생성
		n1 += 1;
	}
	
	public void makeNum2() {
		n2 = num.nextInt(9); //0~8 생성
		n2 += 1;
	}	
	
	public void makeCal() {
		c = num.nextInt(2); //0,1 생성
	}
	
	public int makeRe() {
		if (c ==0) {
			re = n1+n2;
			return re;
		}
		else { 
			re = n1*n2;
			return re;
		}
	}
	
	public void showQ() {
		if (c==0) {
			System.out.println(n1 + "+" + n2);
			System.out.println("정답을 입력하세요");
		}
		else {
			System.out.println(n1 + "×" + n2);
			System.out.println("정답을 입력하세요");
		}
	}
}
