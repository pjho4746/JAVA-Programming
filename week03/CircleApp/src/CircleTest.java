
public class CircleTest {

	public static void main(String[] args) {
		Circle c1;
		c1=new Circle();
		
		c1.radius = 1;
		
		Circle c10=new Circle();
		c10.radius=10;
		
		System.out.print("������ "+c1.radius+"��");
		System.out.print("���� �ѷ��� "+c1.getCircumference());
		System.out.println("���� ���̴� "+c1.getArea());
		
		System.out.print("������ "+c10.radius+"��");
		System.out.print("���� �ѷ��� "+c10.getCircumference());
		System.out.println("���� ���̴� "+c10.getArea());

	}

}
