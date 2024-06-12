package com.ruby.java.ch07.inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();
//		Employee e1 = new Employee("hong", 10, "java");
		Professor p = new Professor();
		Student s = new Student();

		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");

		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");

		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("데이터과학");

		System.out.println("Person 객체 :: "+p.toString());
		System.out.println("Emplyee 객체 :: "+e.toString());
		System.out.println("Student 객체 :: "+s.toString());
	}
}