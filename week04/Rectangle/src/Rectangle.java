//��ǻ�Ͱ��а� 20200769 ����ȣ
public class Rectangle {
	//��������
	Point left_top;
	Point right_bottom;

	
	Rectangle(int x1, int y1, int x2, int y2) {
		left_top = new Point(x1, y1);
		right_bottom = new Point(x2, y2);

	}
	Rectangle(Point p1, Point p2){
		left_top = p1;
		right_bottom = p2;

	}
	int getWidth() {
		int width = right_bottom.getX()-left_top.getX();
		return width;
	}
	int getHeight() {
		int height = right_bottom.getY()-left_top.getY();
		return height;
	}
	int getCircumference() {
		int circumference = 2*(getWidth() + getHeight());
		return circumference;
	}
	int getArea() {
		int area = getWidth() * getHeight();
		return area;
	}
	void show() {
		System.out.print("[���簢�� "+getWidth()+"��"+getHeight()+""
				+ ": ("+left_top.getX()+", "+left_top.getY()+"), ");
		System.out.println("("+right_bottom.getX()+", "+right_bottom.getY()+")]");
	}
}
