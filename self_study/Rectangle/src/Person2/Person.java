package Person2;

public class Person {
	//����Ŭ���������� ��𼭵� ���� ����, �ٸ� ��Ű���� ��ӹ��� ���� Ŭ������ ���� �Ұ���
	//private : getter, setter �ʿ�, �ڽ� Ŭ������ ���� �Ұ�
	protected int age;
	protected String name;
	
	public void WhatYourName() {
		System.out.println(name);
	}
	public void HowOldAreYou() {
		System.out.println(age+"��");
	}

	//���� Ŭ������ ������
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
}
