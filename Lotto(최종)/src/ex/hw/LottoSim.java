//��ǻ�Ͱ��а� 20200769 ����ȣ
package ex.hw;
import ex.lotto.*;

public class LottoSim {

	public static void main(String[] args) {
		//�ڵ� ���� ����� �̿��� ������ �ζ� ī�� ���� �ζ� ��ȣ 5���� ���� �� ���
		System.out.println("�ڵ� ���� ������� �ζ� ��ȣ 5���� ���� �� ���");
		LottoCard lc = new LottoCard();
		lc.makeLottoAuto(5);
		
		//�ζ� ��ȣ 3���� �Է¹���
		System.out.println("�ζ� ��ȣ 3���� �Է¹ް� ���");
		LottoCard lc2 = new LottoCard();
		lc2.makeLottoCard(3);

	}

}
