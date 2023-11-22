package Person2;

public class Main {

	public static void main(String[] args) {
		Person[] pList= new Person[2];
		
		pList[0] = new Person("일지매", 18);
		pList[1] = new UnivStudent("홍길동", 20, "컴퓨터공학");
		
		for(Person p : pList) {
			System.out.print("이름: ");
			p.WhatYourName();
			
			if(p instanceof UnivStudent)
				((UnivStudent) p).WhoAreYou();
			
			System.out.println();
		}
	}
}
