//컴퓨터공학과 20200769 박지호
public class Tv {
	//Tv의 속성
	boolean status;
	int channel;
	int volume;
	//한계값 기호상수 사용
	static final int CHANNEL_MAX = 5;
	static final int CHANNEL_MIN = 1;
	static final int VOLUME_MAX = 10;
	static final int VOLUME_MIN = 1;
	
	//Tv의 전원을 켜거나 끄는 기능을 하는 메서드
	void pushPower(){
		this.status = !status;
		return;
	}
	
	//Tv 채널을 높이는 기능을 하는 메서드
	void channelUp(){
		if(this.channel == CHANNEL_MAX) {
			System.out.println("더 이상 채널이 없습니다. 1번 채널로 돌아갑니다");//지정된 범위를 순환하며 동작하기 위해 초기화함
			this.channel = 0;
		}
		this.channel++;
		return;
	}
	//Tv 채널을 낮추는 기능을 하는 메서드
	void channelDown(){
		if(this.channel == CHANNEL_MIN) {
			System.out.println("더 이상 채널이 없습니다. 1번 채널로 돌아갑니다.");
			this.channel = 2;
		}
		
		this.channel--;
		return;
	}
	//Tv 볼륨을 높이는 기능을 하는 메서드
	void volumeUp() {
		if(this.volume == VOLUME_MAX) {
			System.out.println("최고 볼륨입니다.");
			return;
		}
		this.volume++;
		return;
	}
	//Tv 볼륨을 낮추는 기능을 하는 메서드
	void volumeDown() {
		if(this.volume == VOLUME_MIN) {
			System.out.println("최저 볼륨입니다.");
			return;
		}
		this.volume--;
		return;
	}
}