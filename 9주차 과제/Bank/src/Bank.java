//컴퓨터공학과 20200769 박지호
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		/* 기본 구성
		Account ac = new Account();
		try {
			ac.deposit(100);
		}
		catch(MalformedData m) {
			m.printStackTrace();
		}
		ac.check();
		try {
			ac.withdraw(50);
		}
		catch(MalformedData m) {
			m.printStackTrace();
		}
		ac.check();
		*/
		
		//배열(기본 구성 활용)
		Account[] accounts = new Account[5];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<accounts.length; i++) {
			accounts[i] = new Account();
			//예금
			try {
				System.out.print("정수를 입력하세요: ");
				int amount = input.nextInt();
				accounts[i].deposit(amount);
			}
			catch(InputMismatchException ime) {
				System.out.println("예외발생: 잘못된 입력입니다. 정수만 입력하세요.");
			}
			catch(MalformedData m) {
				m.printStackTrace();
			}
			accounts[i].check();
			//인출
			try {
				System.out.print("정수를 입력하세요: ");
				int amount = input.nextInt();
				accounts[i].withdraw(amount);
			}
			catch(InputMismatchException ime) {
				System.out.println("예외발생: 잘못된 입력입니다. 정수만 입력하세요.");
			}
			catch(MalformedData m) {
				m.printStackTrace();
			}
			accounts[i].check();
		}
		
	}	
}
