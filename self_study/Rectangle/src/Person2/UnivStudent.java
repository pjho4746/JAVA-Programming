package Person2;


public class UnivStudent extends Person{
	protected String major;
	
	public UnivStudent(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void WhoAreYou() {
		WhatYourName();
		HowOldAreYou();
		
		System.out.println(major+"����");
	}
}
