//��ǻ�Ͱ��а� 20200769 ����ȣ
public class Tv {
	//Tv�� �Ӽ�
	boolean status;
	int channel;
	int volume;
	//�Ѱ谪 ��ȣ��� ���
	static final int CHANNEL_MAX = 5;
	static final int CHANNEL_MIN = 1;
	static final int VOLUME_MAX = 10;
	static final int VOLUME_MIN = 1;
	
	//Tv�� ������ �Ѱų� ���� ����� �ϴ� �޼���
	void pushPower(){
		this.status = !status;
		return;
	}
	
	//Tv ä���� ���̴� ����� �ϴ� �޼���
	void channelUp(){
		if(this.channel == CHANNEL_MAX) {
			System.out.println("�� �̻� ä���� �����ϴ�. 1�� ä�η� ���ư��ϴ�");//������ ������ ��ȯ�ϸ� �����ϱ� ���� �ʱ�ȭ��
			this.channel = 0;
		}
		this.channel++;
		return;
	}
	//Tv ä���� ���ߴ� ����� �ϴ� �޼���
	void channelDown(){
		if(this.channel == CHANNEL_MIN) {
			System.out.println("�� �̻� ä���� �����ϴ�. 1�� ä�η� ���ư��ϴ�.");
			this.channel = 2;
		}
		
		this.channel--;
		return;
	}
	//Tv ������ ���̴� ����� �ϴ� �޼���
	void volumeUp() {
		if(this.volume == VOLUME_MAX) {
			System.out.println("�ְ� �����Դϴ�.");
			return;
		}
		this.volume++;
		return;
	}
	//Tv ������ ���ߴ� ����� �ϴ� �޼���
	void volumeDown() {
		if(this.volume == VOLUME_MIN) {
			System.out.println("���� �����Դϴ�.");
			return;
		}
		this.volume--;
		return;
	}
}