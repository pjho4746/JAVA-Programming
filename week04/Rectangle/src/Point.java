//��ǻ�Ͱ��а� 20200769 ����ȣ
public class Point {
	private int x;
	private int y;
	
	public Point() {
		//this.x = 0;
		//this.y = 0;
		this(0, 0);
	}
	
	//������ �Լ�, private�� ��� ��ü�� �������� ����
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
