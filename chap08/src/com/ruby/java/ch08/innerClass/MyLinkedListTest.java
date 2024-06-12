package com.ruby.java.ch08.innerClass;

public class MyLinkedListTest {
	public static void main(String[] args) {
		//스택에 참조변수 myList 생성, 힙에는 MyLinkedList 인스턴스 생성
		//생성된 인스턴스는 myList 변수가 참조
		MyLinkedList myList = new MyLinkedList(); 
		myList.print();
		
		myList.add("JAVA");
		myList.add("JSP");
		myList.add("Servlet");
		myList.print();
		
		myList.printReverse(); //양방향 LinkedList 구현
	}

}
