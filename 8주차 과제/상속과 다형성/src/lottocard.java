//��ǻ�Ͱ��а� 20200769 ����ȣ
import java.util.Scanner;

public class LottoCard {
	Lotto[] lotto = new Lotto[5];
	int n;
	Scanner s = new Scanner(System.in);
	//�ζ� ��ȣ�� ���� ����
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
	
	//�ζ� ��ȣ�� �ڵ� ����
	public void makelottoAuto(int m) {
		//������� ���������� ��ü ����
		for(int i = 0; i < m; i++) {
			lotto[i] = new Lotto();
			n++;
		}
		for(int i=0; i< m; i++) {
			lotto[i].show();
		}
	}
}
