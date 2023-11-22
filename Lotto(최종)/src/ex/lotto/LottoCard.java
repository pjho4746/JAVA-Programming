//��ǻ�Ͱ��а� 20200769 ����ȣ
package ex.lotto;

import java.util.Scanner;

public class LottoCard {
	private Lotto[] lotto = new Lotto[5];
	//���� ������ �ζ� ��ȣ�� ����(1~5)
	private int n = 0;
	
	Scanner s = new Scanner(System.in);
	
	//�� �ζ� ��ȣ�� ���� ����
	public void makeLottoCard(int m) {
		int a, b, c, d, e, f;
		
		for(int i=0; i<m; i++) {
			System.out.print("�ζ� ��ȣ �Է�: ");
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			d = s.nextInt();
			e = s.nextInt();
			f = s.nextInt();
			
			lotto[i] = new Lotto(a, b, c, d, e, f);
			//��ȿ�� ī���̸� �ϳ��� ����(�̷��� �����߽��ϴ�..)
			n++;
		}
		//������ �ζ� ��ȣ�� ���
		System.out.println();
		for(int i=0; i<m; i++) {
			lotto[i].show();
		}
	}
	
	//�� �ζ� ��ȣ�� �ڵ� ����
	public void makeLottoAuto(int m) {
		for(int i=0; i<m; i++) {
			lotto[i] = new Lotto();
			//��ȿ�� ī���̸� �ϳ��� ����(�̷��� �����߽��ϴ�..)
			n++;
		}
		//������ �ζ� ��ȣ�� ���
		for(int i=0; i<m; i++) {
			lotto[i].show();
		}
	}
}
