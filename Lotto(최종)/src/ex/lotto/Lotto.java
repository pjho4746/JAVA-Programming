//��ǻ�Ͱ��а� 20200769 ����ȣ
package ex.lotto;

import java.util.Random;

public class Lotto {
	//�ζ� ��ȣ ����
	private int[] lottoNumber = new int[6];
	//���� �迭�� ������ ���ڵ��� ��ȿ�� �ζ� ��ȣ���� ��Ÿ��
	private boolean isValid;
	Random ran = new Random();

	public Lotto() {
	      //new �����ڷ� ��ü �迭 �Ҵ�
	      generate();
	      isValid = verify();
	      
	   }

	//������(���̰� 6�� ���� �迭)
	public Lotto(int[] lo){
			for(int i=0; i<lottoNumber.length; i++)
				lottoNumber[i] = lo[i];
			isValid = verify();
		}
		
	//���ڰ� �ִ� ������(���� 6��)
	public Lotto(int a, int b, int c, int d, int e, int f) {
		//�迭 ����� ���ÿ� �ʱ�ȭ
		lottoNumber = new int[] {a,b,c,d,e,f}; 
		isValid = verify();
	}
	
	//������ ��ȣ�� ��ȿ�� �˻�(1~46 ������ �������� �˻�)
	boolean verify() {
		for(int i=0; i<lottoNumber.length; i++) {
			if(1<=lottoNumber[i]&&lottoNumber[i]<=45) {
				for(int j=i+1; j<lottoNumber.length; j++) {
					if(lottoNumber[i]==lottoNumber[j]) {
						return false;
					}
				}
			}
		}

		return false;
	}
	
	//��ȣ ���(����/�ߺ� ����)
	void show() {
		//��ȿ�� ��ȣ�� ������ ��쿡�� ���
		if(isValid==false) {
			for(int i=0; i<lottoNumber.length; i++)
				System.out.print(lottoNumber[i]+" ");
			System.out.println();
		}
		//��ȿ���� ���� ��� �����޽��� ���
		else
			System.out.println("����: ��ȿ���� �ʽ��ϴ�");
	}
	
	//�ζ� ��ȣ ��ȯ
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
