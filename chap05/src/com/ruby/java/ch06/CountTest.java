package com.ruby.java.ch06;
class Count{
	public static int totalCount;
	public int num; // static이 있냐없냐의 차이
//	public int num : 접근가능 , private : 접근불가, 그냥 int num; : default 모드 (해당 파일에서는 접근가능)
	
	public void print() {
		System.out.println("num ="+num);
	}
	public static void print2() { // static이 있냐없냐의 차이
		System.out.println("totalCount ="+totalCount);
	}
	public Count() {
		num = 1;
		totalCount++; 
		// Count() : 생성자는 class이름을 사용
		// Count c1 = new Count() : 1. heap에 메모리할당 2. 할당된 공간에 주소반환
		// public Count(){} : 자바 컴파일러가 자동 생성
	}
	int getter() {
	}
	void setter(int n) {
		num += n;
	}
}
public class CountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Count.totalCount);
//		System.out.println(Count.num); -> 오류(num은 클래스필드가 아니라 인스턴스필드이므로) //  
		Count.print2();
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		c1.print();
		c1.print2();
		Count.print2(); //print2는 객체로 해도되고, class로 해도됨 (static) -> 클래스메서드
//		Count.print(); //error : static이 없으면 객체를 만들어서 해야함 -> 인스턴스메서드
		c1.getter();
		c1.setter(1);
		
		System.out.println(c3.totalCount); //totalCount는 static
		System.out.println(c1.totalCount); //totalCount는 메소드영역에 저장되어 공유되기 때문에 c1,c2,c3 모두 3으로 나옴
		System.out.println(Count.totalCount);
	}
}
