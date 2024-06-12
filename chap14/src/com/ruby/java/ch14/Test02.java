package com.ruby.java.ch14;
@FunctionalInterface // 어노테이션으로 람다식이라고 알려줬으니까
interface Multiply {
	double getValue();
	void setValue(); // 하나 이상의 추상메서드가 선언되면 오류
}

public class Test02 {

	public static void main(String[] args) {

		Multiply m;
		m = () -> 3.14 * 2;
		System.out.println(m.getValue());

		m = () -> 10 * 3;
		System.out.println(m.getValue());
	}
}