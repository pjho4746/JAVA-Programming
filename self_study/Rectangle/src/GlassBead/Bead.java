package GlassBead;

public class Bead {
	Child child1, child2;
	void show() {
		System.out.print("���1 ");
		child1.show();
		System.out.print("���2 ");
		child2.show();
	}
	public static void main(String[] args) {
		Bead sim = new Bead();
		sim.child1 = new Child(15);
		sim.child2 = new Child(9);
		System.out.println("<��� ����>");
		sim.show();
		System.out.println("<��� ����>");
		sim.child1.obtainBead(sim.child2, 2);
		sim.show();
		System.out.println("<��� ����>");
		sim.child2.obtainBead(sim.child1, 2);
		sim.show();

	}

}