//컴퓨터공하고가 20200769 박지호
import java.util.Random;
import java.util.Scanner;

public class SolveMath {

	public static void main(String[] args) {
		for(int z =0; z<9; z++) {
			Random n1 = new Random();
			int num1 = n1.nextInt(9); //0~8 생성
			num1 +=1; //1~9 생성
			
			Random n2 = new Random();
			int num2 = n2.nextInt(9);
			num2 +=1;
			
			Random ma = new Random();
			int cal = ma.nextInt(2); //0,1 생성
			
			Scanner s = new Scanner(System.in);
			
			if (cal == 0) {
				int re = num1 + num2;
				System.out.print(num1+"+"+num2+"= ");
				for (int i= 0; i<2; i++) {
					int an = s.nextInt();
					if (an == re) {
						System.out.println("정답입니다");
						break;
					}
				}
				System.out.println("정답은 "+re+"입니다");
			}
			else {
				int re = num1 * num2;
				System.out.print(num1+"×"+num2+"= ");
				for (int i= 0; i<2; i++) {
					int an = s.nextInt();
					if (an == re) {
						System.out.println("정답입니다");
						break;
					}
			}
				System.out.println("정답은 "+re+"입니다");
		}
	}
	}
}
