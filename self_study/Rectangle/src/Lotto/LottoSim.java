package Lotto;

public class LottoSim {

	public static void main(String[] args) {
		LottoCard c1 = new LottoCard();
		LottoCard c2 = new LottoCard();
		
		System.out.println("<�ڵ� ����>");
		c1.makelottoAuto(5);
		
		System.out.println("<���� ����>");
		c2.makelottoCard(5);
	}

}