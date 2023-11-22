package exam.bead;

public class Child {
	private int numOfBead;
	
	public Child(int numOfBead){
		this.numOfBead = numOfBead;
	}
	
	public void show() {
		System.out.println("보유 개수: "+numOfBead);
	}
	
	public void obtainBead(Child child, int nObtainBead) {
		//매개변수로 객체를 전달받음 = 참조값을 받음
		//따라서 함수 호출 전달시 호출된 실인수가 영향을 받음
		numOfBead += child.loseBead(nObtainBead);
	}
	
	public int loseBead(int nLoseBead) {
		if (numOfBead < nLoseBead) {
			int rval = numOfBead;
			numOfBead = 0;
			return rval;
		}
		
		numOfBead -= nLoseBead;
		return nLoseBead;
	}
}
