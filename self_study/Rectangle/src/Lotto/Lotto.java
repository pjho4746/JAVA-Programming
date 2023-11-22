package Lotto;

import java.util.Random;

public class Lotto {
	int[] lottoNumber = new int[6];
	boolean isValid;
	Random ran = new Random();
	//인자가 없는 생성자
	public Lotto() {
		generate();
		isValid = verify();
	}
	//인자(길이가 6인 배열)가 있는 생성자
	public Lotto(int[] lo) {
		for(int i=0; i<lottoNumber.length; i++)
			lottoNumber[i] = lo[i];
		isValid = verify();
	}
	//인자(정수 6개)가 있는 생성자
	public Lotto(int a, int b, int c, int d, int e, int f) {
		lottoNumber = new int[] {a, b, c, d, e, f};
		isValid = verify();
	}
	//설정된 번호의 유효성 검사
	public boolean verify() {
		//1~46 사이이면서 각 요소가 중복이 아닐 때 true 반환
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
	//번호 출력
	public void show() {
		//유효한 번호가 설정된 경우에만 출력
		if(isValid == true) {
			for(int i = 0; i < lottoNumber.length; i++)
				System.out.print(lottoNumber[i]+" ");
			System.out.println();
		}
		//유효하지 않은 경우 오류 메시지 출력
		else
			System.out.println("오류: 유효하지 않습니다");
	}
	//로또 번호를 반환
	public int[] getNumbers() {
		//유효한 번호가 설정된 경우
		if(isValid == true)
			return lottoNumber;
		//유효하지 않은 경우, null 반환
		else {
			lottoNumber = null;
			return lottoNumber;
		}
	}
	//유효 번호의 자동 생성
	public void generate() {
		for(int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = ran.nextInt(45)+1; //1~46 숫자
			for(int j = 0; j < i; j++) {
				if(lottoNumber[i] == lottoNumber[j])
					j--; //중복되므로 다시 뽑음
					break;
			}
		}
	}
}
