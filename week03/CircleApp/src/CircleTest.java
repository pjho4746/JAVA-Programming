
public class CircleTest {

	public static void main(String[] args) {
		Circle c1;
		c1=new Circle();
		
		c1.radius = 1;
		
		Circle c10=new Circle();
		c10.radius=10;
		
		System.out.print("반지름 "+c1.radius+"인");
		System.out.print("원의 둘레는 "+c1.getCircumference());
		System.out.println("원의 넓이는 "+c1.getArea());
		
		System.out.print("반지름 "+c10.radius+"인");
		System.out.print("원의 둘레는 "+c10.getCircumference());
		System.out.println("원의 넓이는 "+c10.getArea());

	}

}
