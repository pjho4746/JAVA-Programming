//컴퓨터공학과 20200769 박지호
package hw.plygon;

public class CanvasApp {
	//그려진 도형들의 정보 출력
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 9, 7, 5, "직사각형", 12, 14);
		Square s = new Square(5, 9, 7, 5, "직사각형", 12, 14);
		Triangle t = new Triangle(5, 9, 5, 5, "삼각형", 12, 14, 7, 14);
		
		t.show();
		r.show();
	}

}
