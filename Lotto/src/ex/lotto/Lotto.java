//��ǻ�Ͱ��а� 20200769 ����ȣ
package ex.lotto;

import java.util.Random;

public class Lotto {
	//��� ����
	int[] lottoNumber = new int[6];
	boolean isvalid;
	Random ran = new Random();
	
	//��� �Լ�
	//������(���� 6��)
	Lotto(int a, int b, int c, int d, int e, int f){
		lottoNumber[0] = a;
		lottoNumber[1] = b;
		lottoNumber[2] = c;
		lottoNumber[3] = d;
		lottoNumber[4] = e;
		lottoNumber[5] = f;
	}
	//������(���̰� 6�� ���� �迭)
	Lotto(int[] lo){
		for(int i=0; i<lottoNumber.length; i++)
			lottoNumber[i] = lo[i];
	}
	
	//������ ��ȣ�� ��ȿ�� �˻�
	boolean verify() {
		if (lottoNumber== null)
				return false;
		else
			return true;
	}
	
	//��ȣ ���(����/�ߺ�����)
	void show() {
		for(int i=0; i<lottoNumber.length; i++) {
			for(int j=0; j<i; j++) {
				if(lottoNumber[i] == lottoNumber[j]) {
					//��ȿ���� ���� ��� ���� �޽��� ���
					System.out.println("����: �ߺ��� ��ȣ�Դϴ�.");
					break;
				}
			}
			//��ȿ�� ��ȣ�� ������ ��쿡�� ���
			System.out.print(lottoNumber[i] +" ");
		}
	}
	
	//�ζ� ��ȣ�� ��ȯ
	int[] getNumbers() {
		//������ ��ȣ�� ��ȿ���� ���� ��� null ��ȯ
		this.lottoNumber = null;
		return lottoNumber;
	}
	//��ȿ ��ȣ�� �ڵ� ����
	void generate() {
		for(int i=0; i<lottoNumber.length; i++) {
			lottoNumber[i] = ran.nextInt(45)+1; //1~46 ����
			for(int j = 0; j<i; j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
					//�ߺ��Ǵ� ��쿡 �ٽ� ���ڸ� ����
					j--;
					break;
				}
			}
		}
	}
	
}
