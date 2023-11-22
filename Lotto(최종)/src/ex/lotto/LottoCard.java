//컴퓨터공학과 20200769 박지호
package ex.lotto;

import java.util.Scanner;

public class LottoCard {
	private Lotto[] lotto = new Lotto[5];
	//같이 설정된 로또 번호의 개수(1~5)
	private int n = 0;
	
	Scanner s = new Scanner(System.in);
	
	//각 로또 번호를 수동 설정
	public void makeLottoCard(int m) {
		int a, b, c, d, e, f;
		
		for(int i=0; i<m; i++) {
			System.out.print("로또 번호 입력: ");
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			d = s.nextInt();
			e = s.nextInt();
			f = s.nextInt();
			
			lotto[i] = new Lotto(a, b, c, d, e, f);
			//유효한 카드이면 하나씩 증가(이렇게 이해했습니다..)
			n++;
		}
		//설정한 로또 번호를 출력
		System.out.println();
		for(int i=0; i<m; i++) {
			lotto[i].show();
		}
	}
	
	//각 로또 번호를 자동 설정
	public void makeLottoAuto(int m) {
		for(int i=0; i<m; i++) {
			lotto[i] = new Lotto();
			//유효한 카드이면 하나씩 증가(이렇게 이해했습니다..)
			n++;
		}
		//설정한 로또 번호를 출력
		for(int i=0; i<m; i++) {
			lotto[i].show();
		}
	}
}
