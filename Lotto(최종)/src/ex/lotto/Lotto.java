//컴퓨터공학과 20200769 박지호
package ex.lotto;

import java.util.Random;

public class Lotto {
	//로또 번호 유지
	private int[] lottoNumber = new int[6];
	//현재 배열에 설정된 숫자들이 유효한 로또 번호인지 나타냄
	private boolean isValid;
	Random ran = new Random();

	public Lotto() {
	      //new 연산자로 객체 배열 할당
	      generate();
	      isValid = verify();
	      
	   }

	//생성자(길이가 6인 정수 배열)
	public Lotto(int[] lo){
			for(int i=0; i<lottoNumber.length; i++)
				lottoNumber[i] = lo[i];
			isValid = verify();
		}
		
	//인자가 있는 생성자(정수 6개)
	public Lotto(int a, int b, int c, int d, int e, int f) {
		//배열 선언과 동시에 초기화
		lottoNumber = new int[] {a,b,c,d,e,f}; 
		isValid = verify();
	}
	
	//설정된 번호의 유효성 검사(1~46 사이의 숫자인지 검사)
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
	
	//번호 출력(범위/중복 여부)
	void show() {
		//유효한 번호가 설정된 경우에만 출력
		if(isValid==false) {
			for(int i=0; i<lottoNumber.length; i++)
				System.out.print(lottoNumber[i]+" ");
			System.out.println();
		}
		//유효하지 않은 경우 오류메시지 출력
		else
			System.out.println("오류: 유효하지 않습니다");
	}
	
	//로또 번호 반환
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
