//컴퓨터공학과 20200769 박지호
public class Point {
	private int x;
	private int y;
	
	public Point() {
		//this.x = 0;
		//this.y = 0;
		this(0, 0);
	}
	
	//생성자 함수, private인 경우 객체를 생성하지 못함
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void show() {
		System.out.println("("+x+", "+y+")");
	}
}
