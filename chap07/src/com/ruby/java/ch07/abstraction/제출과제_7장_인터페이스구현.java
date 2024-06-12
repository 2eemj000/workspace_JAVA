package com.ruby.java.ch07.abstraction;

interface Shape {
	//공통 인터페이스 선언
	public double perimeter();
	public float area();
}

class Triangle implements Shape {
	private int x1, y1, x2, y2, x3, y3;
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	@Override
	public double perimeter() { //구글링으로 계산식 찾아서 구현
		double sum = 0.0;
		double temp = (double)x1*(double)y2-(double)x2*(double)y1;
		System.out.println("temp=" + temp);
		sum = Math.abs(1.0/2* temp);
		System.out.println("sum = " + sum);
		return sum;
	}
	@Override
	public float area() {
		return (float)x1*y2+x2*y3+x3*y1-x2*y1-x3*y2-x1*y3;
	}
}
class Rectangle implements Shape {
	int x1,y1,x2,y2,x3,y3,x4,y4;
	public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	@Override
	public double perimeter() { //구글링으로 계산식 찾아서 구현
		double sum = 0;
		return (Math.abs(x2-x1)+Math.abs(y2-y1))*2;
	}
	@Override
	public float area() {
		return Math.abs((x2-x1)*(y2-y1));
	}
}
class Square extends Rectangle {
	int side;
	public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int side) {
		//super()를 사용 - 7장에서 찾아서
		super(x1, y1, x2, y2, x3, y3, x4, y4); //부모 생성자를 활용, 호출할 때는 변수타입 명시X
		this.side = side;
	}
	@Override
	public double perimeter() { //구글링으로 계산식 찾아서 구현
		double sum = 0;
		return side*4;
	}
	@Override
	public float area() {
		return side*side;
	}
}

public class 제출과제_7장_인터페이스구현 {
	
	public static void main (String args[]) {
		
	Shape t = new Triangle(1,2,3,4,5,6);
	Shape r = new Rectangle(1,2,3,2,1,5,3,5);
	Shape s = new Square(1,2,3,2,1,5,3,5,3);
	
	System.out.println("삼각형 둘레 길이 = " + t.perimeter());
	System.out.println("삼각형 면적 = " + t.area());
	System.out.println("사각형 둘레 길이 = " + r.perimeter());
	System.out.println("사각형 면적 = " + r.area());
	System.out.println("정사각형 둘레 길이 = " + s.perimeter());
	System.out.println("정사각형 면적 = " + s.area());
	}
}
