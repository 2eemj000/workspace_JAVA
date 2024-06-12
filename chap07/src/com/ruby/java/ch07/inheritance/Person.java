package com.ruby.java.ch07.inheritance;

public class Person {
//	protected 혹은 private으로 해야 main에서 접근 못한다.
	protected String name;
	protected int age;
	public Person() {
		System.out.println("Person 생성자 호출");
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + "," + age;
	}
}