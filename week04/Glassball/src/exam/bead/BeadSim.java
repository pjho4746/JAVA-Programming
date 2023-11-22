package exam.bead;

public class BeadSim {
	Child child1, child2;
	
	void show() {
		System.out.print("���1 ");
		child1.show();
		System.out.print("���2 ");
		child2.show();
	}
	
	public static void main(String[] args) {
		//static�� ���, ��ü�� 1���� ������ �� ���� - > BeadSim�� ��ü�� ����� �װ��� ��������!!
		BeadSim sim = new BeadSim(); 
		
		sim.child1 = new Child(15);
		sim.child2 = new Child(9);
		
		System.out.println(">> ���� �� ���� ����");
		sim.show();
		
		//1�� ����: ��� 1�� ��� 2�� ���� 2�� ȹ��
		System.out.println("\n>> 1�� ����");
		sim.child1.obtainBead(sim.child2, 2);
		sim.show();
		
		//2�� ����: ��� 2�� ��� 1�� ���� 7�� ȹ��
		System.out.println("\n>> 2�� ����");
		sim.child2.obtainBead(sim.child1, 7);
		sim.show();
		
	}

}