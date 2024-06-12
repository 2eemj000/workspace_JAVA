package com.ruby.java.ch06;

public class StaticMethodTest {
	int num = 123;//인스턴스 필드 : 인스턴스 객체 생성 후 사용할 수 있음
	static int count = 0; //count는 static이므로 객체 없어도 사용할 수 있음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodTest. print1();
		StaticMethodTest smt = new StaticMethodTest();
		smt.print2();//객체 생성 후 사용됨
	}
	public static void print1() {//클래스 메소드
//		int num2 = num; // 객체가 없으므로 사용할 수 없음
		int num2 = num; 
	}
		System.out.println("hello");
	}
//	public void print2() {
//		System.out.println("good");//->오류 : 인스턴스 메소드
//	}

