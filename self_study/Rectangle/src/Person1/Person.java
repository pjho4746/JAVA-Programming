package Person1;

public class Person {
	protected int age;
	protected String name;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void WhatYourName() {
		System.out.println(name);
	}
	
	public void HowOldAreYou() {
		System.out.println(age+"��");
	}
	public void WhoAreYou() {
		WhatYourName();
		HowOldAreYou();
	}

	@Override
	public String toString() {
		return name+"("+age+"��)";
	}
}
