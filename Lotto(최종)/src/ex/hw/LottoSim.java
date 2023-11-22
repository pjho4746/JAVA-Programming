//컴퓨터공학과 20200769 박지호
package ex.hw;
import ex.lotto.*;

public class LottoSim {

	public static void main(String[] args) {
		//자동 생성 기능을 이용해 한장의 로또 카드 내의 로또 번호 5개를 설정 후 출력
		System.out.println("자동 생성 기능으로 로또 번호 5개를 설정 후 출력");
		LottoCard lc = new LottoCard();
		lc.makeLottoAuto(5);
		
		//로또 번호 3개를 입력받음
		System.out.println("로또 번호 3개를 입력받고 출력");
		LottoCard lc2 = new LottoCard();
		lc2.makeLottoCard(3);

	}

}
