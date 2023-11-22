package Person2;

public class Person {
	//하위클래스에서는 어디서든 접근 가능, 다른 패키지에 상속받지 않은 클래스만 접근 불가능
	//private : getter, setter 필요, 자식 클래스도 접근 불가
	protected int age;
	protected String name;
	
	public void WhatYourName() {
		System.out.println(name);
	}
	public void HowOldAreYou() {
		System.out.println(age+"세");
	}

	//하위 클래스의 생성자
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
}
