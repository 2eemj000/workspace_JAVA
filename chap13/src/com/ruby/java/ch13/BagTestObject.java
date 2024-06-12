package com.ruby.java.ch13;
//generic 대신에 객체 사용한 방법으로 생략
class Bag {
	private Object thing;
	public Bag(Object thing) {
		this.thing = thing;
	}
	public Object getThing() {
		return thing;
	}
	public void setThing(Object thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}
class Book2 {
}
class PencilCase2 {
}
class Notebook2 {
}

public class BagTestObject {
	public static void main(String[] args) {
		Bag bag = new Bag(new Book2());
		Bag bag2 = new Bag(new PencilCase2());
		Bag bag3 = new Bag(new Notebook2());

		bag.showType();
		bag2.showType();
		bag3.showType();

		bag = bag2;//error를 발생시키지 않지만 잘 못된 코드이다
		/*
		Book2 book = bag.getThing();
		PencilCase2 pc = bag2.getThing();
		Notebook2 nb = bag3.getThing();
		*/
		Book2 book = (Book2)bag.getThing();//down casting
		PencilCase2 pc = (PencilCase2)bag2.getThing();
		Notebook2 nb = (Notebook2)bag3.getThing();
	}
}