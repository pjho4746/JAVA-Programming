//��ǻ�Ͱ��а� 20200769
import java.util.Random;
import java.util.Scanner;

public class NewMath {
	private int x, y, z, res;
	Random num = new Random();
	//�ǿ����� �����
	public int makeOperand() {
		return (num.nextInt(9)+1);
	}
	//������ �����
	public int makeOperator() {
		return (num.nextInt(1)+1);
	}
	
	public static void main(String[] args) {
		NewMath nm = new NewMath();
		int[] mathresult = new int[10];
		
		for(int i=0; i<mathresult.length; i++) {
			nm.x = nm.makeOperand();
			nm.y = nm.makeOperand();
			nm.z = nm.makeOperator();
			Scanner s = new Scanner(System.in);
			if(nm.z==0) {
				System.out.println(nm.x+"+"+nm.y+"=");
				nm.res = s.nextInt();
				if(nm.res != nm.x + nm.y) {
					for(int j=0; j<2; j++) {
						System.out.println("����: ����� Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���.");
						nm.res = s.nextInt();
						if(nm.res == nm.x + nm.y) {
							break;
						}
					}
					//������ Ʋ������ 0
					mathresult[i] = 0;
					System.out.println("������ "+nm.res);
				}
				else {
					//������ ������ 1
					mathresult[i] = 1;
					System.out.println("�����Դϴ�.");
				}
	
			}
			else
				System.out.println(nm.x+"-"+nm.y+"=");
			nm.res = s.nextInt();
			if(nm.res != nm.x - nm.y) {
				for(int j=0; j<2; j++) {
					System.out.println("����: ����� Ʋ�Ƚ��ϴ�.");
					nm.res = s.nextInt();
					if(nm.res == nm.x - nm.y) {
						break;
					}
				}
				//������ Ʋ������ 0
				mathresult[i] = 0;
				System.out.println("������ "+nm.res);
			}
			else
				//������ ������ 1
				mathresult[i] = 1;
				System.out.println("�����Դϴ�.");
		}
		System.out.println("���� ���(����/Ʋ��)�� ����ϰڽ��ϴ�.");
		for(int i=0; i<mathresult.length; i++) {
			System.out.print(mathresult[i]+" ");
		}
		
	}

}