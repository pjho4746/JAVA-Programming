package GlassBead;

public class Child {
	private int numOfBead;
	
	public Child(int numOfBead) {
		this.numOfBead = numOfBead;
	}
	
	public void obtainBead(Child child, int nObtainBead) {
		numOfBead += child.loseBead(nObtainBead);
	}
	public int loseBead(int nLoseBead) {
		if(numOfBead<nLoseBead) {
			int rval = numOfBead;
			numOfBead = 0;
			return rval;
		}
		numOfBead -= nLoseBead;
		return nLoseBead;
	}
	public void show() {
		System.out.println("현재 구슬 개수: " + numOfBead);
	}
}
