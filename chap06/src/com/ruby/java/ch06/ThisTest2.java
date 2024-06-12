package com.ruby.java.ch06;
class Student{
	String name; //default 선언->현 자바파일에서는 접근가능, 외부에서는 private
	int age;
	private String getName() {
		return name;
	}
	public Student(){}//java compiler가 자동 추가
	public Student(String str) {
		this.name=str;
	}

public class ThisTest2 {
	private String name;

	public void setName(String name) {
//		name = name;//문제: 색깔은 formal parameter 색깔
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Student s = new Student("hong");
//		s.getName(); -> 같은 파일이지만 class가 달라서 접근 불가
//		s.age=11; -> default니까 현 파일에서는 접근가능
		ThisTest2 exam = new ThisTest2();
		exam.setName("Amy");

		System.out.println(exam.getName());
	}
}
}