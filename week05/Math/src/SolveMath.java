//��ǻ�Ͱ��ϰ� 20200769 ����ȣ
import java.util.Random;
import java.util.Scanner;

public class SolveMath {

	public static void main(String[] args) {
		for(int z =0; z<9; z++) {
			Random n1 = new Random();
			int num1 = n1.nextInt(9); //0~8 ����
			num1 +=1; //1~9 ����
			
			Random n2 = new Random();
			int num2 = n2.nextInt(9);
			num2 +=1;
			
			Random ma = new Random();
			int cal = ma.nextInt(2); //0,1 ����
			
			Scanner s = new Scanner(System.in);
			
			if (cal == 0) {
				int re = num1 + num2;
				System.out.print(num1+"+"+num2+"= ");
				for (int i= 0; i<2; i++) {
					int an = s.nextInt();
					if (an == re) {
						System.out.println("�����Դϴ�");
						break;
					}
				}
				System.out.println("������ "+re+"�Դϴ�");
			}
			else {
				int re = num1 * num2;
				System.out.print(num1+"��"+num2+"= ");
				for (int i= 0; i<2; i++) {
					int an = s.nextInt();
					if (an == re) {
						System.out.println("�����Դϴ�");
						break;
					}
			}
				System.out.println("������ "+re+"�Դϴ�");
		}
	}
	}
}
