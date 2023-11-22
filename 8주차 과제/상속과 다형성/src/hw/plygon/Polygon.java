//컴퓨터공학과 20200769 박지호
package hw.plygon;
//추상 메소드가 하나 이상 포함되면 반드시 추상 클래스로 선언
abstract public class Polygon {
	//위치(x,y)
	protected int x, y;
	//크기(w,h)
	protected int w, h;
	//도형의 종류(type)
	protected String Type;
	
	//도형의 기본정보 표시
	public void show() {
		System.out.println("<정보 출력>");
		System.out.println("위치: ("+ x +"," + y + ")  크기: " + w + "," + h + "  도형의 종류: "+ Type);
	}
	
	//객체 생성시 모든 멤버필드 초기
	public Polygon(int x, int y, int w, int h, String Type) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.Type = Type;
	}
	
	//파생클래스에서 넓이 계산을 강제화하기 위해 추상 메서드
	abstract double getArea();

}
