//컴퓨터공학과 20200769 박지호
package ex.lotto;

import java.util.Random;

public class Lotto {
	//멤버 변수
	int[] lottoNumber = new int[6];
	boolean isvalid;
	Random ran = new Random();
	
	//멤버 함수
	//생성자(정수 6개)
	Lotto(int a, int b, int c, int d, int e, int f){
		lottoNumber[0] = a;
		lottoNumber[1] = b;
		lottoNumber[2] = c;
		lottoNumber[3] = d;
		lottoNumber[4] = e;
		lottoNumber[5] = f;
	}
	//생성자(길이가 6인 정수 배열)
	Lotto(int[] lo){
		for(int i=0; i<lottoNumber.length; i++)
			lottoNumber[i] = lo[i];
	}
	
	//설정된 번호의 유효성 검사
	boolean verify() {
		if (lottoNumber== null)
				return false;
		else
			return true;
	}
	
	//번호 출력(범위/중복여부)
	void show() {
		for(int i=0; i<lottoNumber.length; i++) {
			for(int j=0; j<i; j++) {
				if(lottoNumber[i] == lottoNumber[j]) {
					//유효하지 않은 경우 오류 메시지 출력
					System.out.println("오류: 중복된 번호입니다.");
					break;
				}
			}
			//유효한 번호가 설정된 경우에만 출력
			System.out.print(lottoNumber[i] +" ");
		}
	}
	
	//로또 번호를 반환
	int[] getNumbers() {
		//설정된 번호가 유효하지 않은 경우 null 반환
		this.lottoNumber = null;
		return lottoNumber;
	}
	//유효 번호의 자동 생성
	void generate() {
		for(int i=0; i<lottoNumber.length; i++) {
			lottoNumber[i] = ran.nextInt(45)+1; //1~46 숫자
			for(int j = 0; j<i; j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
					//중복되는 경우에 다시 숫자를 뽑음
					j--;
					break;
				}
			}
		}
	}
	
}
