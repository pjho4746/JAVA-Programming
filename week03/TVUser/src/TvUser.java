//��ǻ�Ͱ��а� 20200769 ����ȣ
public class TvUser {

	public static void main(String[] args) {
		Tv t; 
		t = new Tv(); //��ü ����
		t.status = false; //�ʱⰪ�� off(false)
		t.channel = 1; //�ʱⰪ�� 1
		t.volume = 5; //�ʱⰪ�� 5
		System.out.println("���� TV�� ������ "+ t.status + "�Դϴ�. ������ ���ּ���.");
		
		t.pushPower(); //Tv ������ ���ش�.
		System.out.print("���� TV�� ������ "+ t.status + ", ");
		System.out.print("ä���� "+ t.channel + ", ");
		System.out.println("������ "+ t.volume + "�Դϴ�.");
		
		t.channelUp();//Tv ä���� �ø���.
		System.out.println();
		System.out.println("ä���� �÷��ݴϴ�.");
		System.out.print("���� Tv ä���� "+ t.channel + ", ");
		System.out.println("������ "+ t.volume + "�̴�.");
		
		t.volumeUp(); //Tv ������ �ø���.
		System.out.println();
		System.out.println("������ �÷��ݴϴ�.");
		System.out.print("���� Tv ä���� "+ t.channel + ", ");
		System.out.println("������ "+ t.volume + "�̴�.");
		
		t.channelDown();//Tv ä���� �����.
		System.out.println();
		System.out.println("ä���� �����ݴϴ�.");
		System.out.print("���� Tv ä���� "+ t.channel + ", ");
		System.out.println("������ "+ t.volume + "�̴�.");
		
		t.volumeDown(); //Tv ������ �����.
		System.out.println();
		System.out.println("������ �����ݴϴ�.");
		System.out.print("���� Tv ä���� "+ t.channel + ", ");
		System.out.println("������ "+ t.volume + "�̴�.");
	}

}