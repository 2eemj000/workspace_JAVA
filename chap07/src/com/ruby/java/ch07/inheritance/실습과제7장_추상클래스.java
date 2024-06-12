package com.ruby.java.ch07.inheritance;
//7장 실습 구현 
abstract class Person2 { //추상클래스
	int pid;
	String name;
	int age;
	public abstract String toString() ;
}
class Student2 extends Person2 { //상속받음
	super(); //컴파일러가 Person2의 생성자를 Student2에 자동으로 추가
}
	int sid;
	String dept;
	int year;
	public Student2(int pid, String dept, int age, int sid, int year) {
		super(pid, name, age);
		this.sid  = sid;
	}
	@Override
	public String toString() {
		super.toString();
		return sid + ", "+dept+","+year;
	}

class Employee extends Person2 {
	//eno, dept, salary
	//super 사용
}
public class 실습과제7장_추상클래스{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 arr[] = new Person2[5];
        arr[0] = new Student2(1, "Kim", 20, 1001, "Computer Science", 3);
        arr[1] = new Student2(2, "Lee", 21, 1002, "Mathematics", 2);
        arr[2] = new Employee(3, "Park", 30, 2001, "HR", 3000);
        arr[3] = new Employee(4, "Choi", 35, 2002, "Engineering", 4000);
        arr[4] = new Student2(5, "Kang", 22, 1003, "Physics", 4);
		for(Person2 p : arr) {
			System.out.println(p.toString());
		}

	}
}
