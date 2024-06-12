package com.ruby.java.ch06;

//별도의 class를 만들어보면
class Student{
//public class student{ 이라고 하면 오류 (오류메세지 : Student라는 자바파일이 없다)
	private String sname;
	private int age;
}

public class Armor {
	private String name;
	private int height;

	public String getName() {//게터, return이 있으면 return type 있어야 함
		return name;
	}
	public void setName(String value) {//세터, return이 없으면 void로 작성
		name = value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		   Armor() -> 생성자:객체를 생성한다 : 1.메모리에 field공간 할당 2. 할당된 주소 반환
//		a -> 참조변수(주소), Armor : 타입
		Armor a[] = new Armor[10]; //배열 생성자 -> name,age 세트가 10개, a는 그 중 첫번째를 가리킴
		int []arr = new int[10]; //0~9까지의 배열 중 arr은 첫번째 칸을 가리킴
		
			a[i]= new Armor();
		int n = 10;
//		a, arr은 stack 영역에, new에 의한 메모리는 heap 영역에 저장됨
		Armor suit1 = new Armor(); //생성자
		suit1=null; //참조변수에 값을 안줌 (초기화)
		suit1.setName("mark"); //객체가 없는데 .을 찍으면 nullpointerexception 오류
		System.out.println(suit1.getName());
		
//		Armor c = new Armor();
//		a.name="kim";//main이니까 private라도 접근가능 -> 오류안난다
////		a.age=10;
//
//		a.setName("kim");
//		System.out.println(a.getName());
//		Student s = new Student();
//		s.sname = "hong";//다른 class이니까 3번줄의 별도의 class 접근불가능 -> 오류
//		
		
	}

}
