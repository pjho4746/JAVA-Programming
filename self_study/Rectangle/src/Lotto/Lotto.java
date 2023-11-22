package Lotto;

import java.util.Random;

public class Lotto {
	int[] lottoNumber = new int[6];
	boolean isValid;
	Random ran = new Random();
	//���ڰ� ���� ������
	public Lotto() {
		generate();
		isValid = verify();
	}
	//����(���̰� 6�� �迭)�� �ִ� ������
	public Lotto(int[] lo) {
		for(int i=0; i<lottoNumber.length; i++)
			lottoNumber[i] = lo[i];
		isValid = verify();
	}
	//����(���� 6��)�� �ִ� ������
	public Lotto(int a, int b, int c, int d, int e, int f) {
		lottoNumber = new int[] {a, b, c, d, e, f};
		isValid = verify();
	}
	//������ ��ȣ�� ��ȿ�� �˻�
	public boolean verify() {
		//1~46 �����̸鼭 �� ��Ұ� �ߺ��� �ƴ� �� true ��ȯ
		for(int i = 0; i < lottoNumber.length; i++) {
			if(1 <= lottoNumber[i] && lottoNumber[i] <= 46) {
				for(int j=i+1; j < lottoNumber.length; i++) {
					if(lottoNumber[i] != lottoNumber[j])
						return true;
				}
			}
		}
		return false;
	}
	//��ȣ ���
	public void show() {
		//��ȿ�� ��ȣ�� ������ ��쿡�� ���
		if(isValid == true) {
			for(int i = 0; i < lottoNumber.length; i++)
				System.out.print(lottoNumber[i]+" ");
			System.out.println();
		}
		//��ȿ���� ���� ��� ���� �޽��� ���
		else
			System.out.println("����: ��ȿ���� �ʽ��ϴ�");
	}
	//�ζ� ��ȣ�� ��ȯ
	public int[] getNumbers() {
		//��ȿ�� ��ȣ�� ������ ���
		if(isValid == true)
			return lottoNumber;
		//��ȿ���� ���� ���, null ��ȯ
		else {
			lottoNumber = null;
			return lottoNumber;
		}
	}
	//��ȿ ��ȣ�� �ڵ� ����
	public void generate() {
		for(int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = ran.nextInt(45)+1; //1~46 ����
			for(int j = 0; j < i; j++) {
				if(lottoNumber[i] == lottoNumber[j])
					j--; //�ߺ��ǹǷ� �ٽ� ����
					break;
			}
		}
	}
}
