package Person2;

public class Main {

	public static void main(String[] args) {
		Person[] pList= new Person[2];
		
		pList[0] = new Person("������", 18);
		pList[1] = new UnivStudent("ȫ�浿", 20, "��ǻ�Ͱ���");
		
		for(Person p : pList) {
			System.out.print("�̸�: ");
			p.WhatYourName();
			
			if(p instanceof UnivStudent)
				((UnivStudent) p).WhoAreYou();
			
			System.out.println();
		}
	}
}