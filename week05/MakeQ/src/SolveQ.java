//��ǻ�Ͱ��а� 20200769
import java.util.Scanner;

public class SolveQ {

	public static void main(String[] args) {
		Question Q = new Question();
		Scanner s = new Scanner(System.in);
		for (int i=0; i<9; i++) {
			Q.makeNum1();
			Q.makeNum2();
			Q.makeCal();
			int r = Q.makeRe();
			Q.showQ();
			
			for(int z = 0; z<3; z++ ) {
				int t = s.nextInt();
				if(t == r) {
					break;
				}
			}System.out.println("������" + r);
		}
	}

}
