//컴퓨터공학과 20200769 박지호
public class TvUser {

	public static void main(String[] args) {
		Tv t; 
		t = new Tv(); //객체 생성
		t.status = false; //초기값은 off(false)
		t.channel = 1; //초기값은 1
		t.volume = 5; //초기값은 5
		System.out.println("현재 TV의 전원은 "+ t.status + "입니다. 전원을 켜주세요.");
		
		t.pushPower(); //Tv 전원을 켜준다.
		System.out.print("현재 TV의 전원은 "+ t.status + ", ");
		System.out.print("채널은 "+ t.channel + ", ");
		System.out.println("볼륨은 "+ t.volume + "입니다.");
		
		t.channelUp();//Tv 채널을 올린다.
		System.out.println();
		System.out.println("채널을 올려줍니다.");
		System.out.print("현재 Tv 채널은 "+ t.channel + ", ");
		System.out.println("볼륨은 "+ t.volume + "이다.");
		
		t.volumeUp(); //Tv 볼륨을 올린다.
		System.out.println();
		System.out.println("볼륨을 올려줍니다.");
		System.out.print("현재 Tv 채널은 "+ t.channel + ", ");
		System.out.println("볼륨은 "+ t.volume + "이다.");
		
		t.channelDown();//Tv 채널을 낮춘다.
		System.out.println();
		System.out.println("채널을 낮춰줍니다.");
		System.out.print("현재 Tv 채널은 "+ t.channel + ", ");
		System.out.println("볼륨은 "+ t.volume + "이다.");
		
		t.volumeDown(); //Tv 볼륨을 낮춘다.
		System.out.println();
		System.out.println("볼륨을 낮춰줍니다.");
		System.out.print("현재 Tv 채널은 "+ t.channel + ", ");
		System.out.println("볼륨은 "+ t.volume + "이다.");
	}

}
