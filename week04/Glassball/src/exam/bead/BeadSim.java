package exam.bead;

public class BeadSim {
	Child child1, child2;
	
	void show() {
		System.out.print("어린이1 ");
		child1.show();
		System.out.print("어린이2 ");
		child2.show();
	}
	
	public static void main(String[] args) {
		//static인 경우, 객체를 1개만 생성할 수 있음 - > BeadSim의 객체를 만들고 그것의 참조변수!!
		BeadSim sim = new BeadSim(); 
		
		sim.child1 = new Child(15);
		sim.child2 = new Child(9);
		
		System.out.println(">> 게임 전 보유 개수");
		sim.show();
		
		//1차 게임: 어린이 1이 어린이 2의 구슬 2개 획득
		System.out.println("\n>> 1차 게임");
		sim.child1.obtainBead(sim.child2, 2);
		sim.show();
		
		//2차 게임: 어린이 2이 어린이 1의 구슬 7개 획득
		System.out.println("\n>> 2차 게임");
		sim.child2.obtainBead(sim.child1, 7);
		sim.show();
		
	}

}
