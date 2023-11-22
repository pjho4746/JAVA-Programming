//컴퓨터공학과 20200769 박지호
import java.util.Scanner;

public class LottoCard {
	Lotto[] lotto = new Lotto[5];
	int n;
	Scanner s = new Scanner(System.in);
	//로또 번호를 수동 설정
	public void makelottoCard(int m) {
		int a, b, c, d, e, f;
		for(int i = 0; i < m; i++) {
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			d = s.nextInt();
			e = s.nextInt();
			f = s.nextInt();
			lotto[i] = new Lotto(a, b, c, d, e, f);
			n++;
		}
		for(int i=0; i< m; i++) {
			lotto[i].show();
		}
	}
	
	//로또 번호를 자동 설정
	public void makelottoAuto(int m) {
		//만들어진 참조변수에 객체 생성
		for(int i = 0; i < m; i++) {
			lotto[i] = new Lotto();
			n++;
		}
		for(int i=0; i< m; i++) {
			lotto[i].show();
		}
	}
}
