package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	
	//생성자 함수의 overloading (함수 body가 다르다.)
	public Member() {} // default 생성자
	public Member(String name, int age) { // 함수 정의할 때 변수 type 적어줘야
	
	
		
		this.name = name; //this. 는 객체를 의미하는 예약어, 이름 같을 때 구분할 수 있음
		this.age  = age; //수는 바로 값을 가지지만, 다른건 주소를 줘서 찾아가는 것
	}
	public void setName(String name) {
		this.name=name;
	}
	public static void main(String[]args) {
		Member m2;
		Member m = new Member(); // new : 메모리할당, 할당된 주소를 반환, Member() : 초기화
	}
}
