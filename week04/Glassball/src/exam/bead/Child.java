package exam.bead;

public class Child {
	private int numOfBead;
	
	public Child(int numOfBead){
		this.numOfBead = numOfBead;
	}
	
	public void show() {
		System.out.println("���� ����: "+numOfBead);
	}
	
	public void obtainBead(Child child, int nObtainBead) {
		//�Ű������� ��ü�� ���޹��� = �������� ����
		//���� �Լ� ȣ�� ���޽� ȣ��� ���μ��� ������ ����
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