//컴퓨터공학과 20200769 박지호
public class LottoList {
	
	public static void main(String[] args) {
		LottoCard c1 = new LottoCard();
		LottoCard c2 = new LottoCard();
		
		System.out.println("<자동 생성>");
		c1.makelottoAuto(5);
		
		System.out.println("<수동 생성>");
		c2.makelottoCard(5);
	}

}
