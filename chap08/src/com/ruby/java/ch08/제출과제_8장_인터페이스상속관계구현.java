package com.ruby.java.ch08;

interface Shape {
	public double perimeter();
	public float area();
	@Override
	String toString();
}

class Triangle implements Shape {
	private int x1,y1,x2,y2,x3,y3;
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
		double sum = 0;
		return Math.abs(1/2*(x1*y2-x2*y1));
		}
	@Override
	public float area() {
		return x1*y2+x2*y3+x3*y1-x2*y1-x3*y2-x1*y3;
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
class Pentagon implements Shape {
	private int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;
	public Pentagon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		this.x5 = x5;
		this.y5 = y5;
	}
	public double perimeter() { //구글링으로 계산식 찾아서 구현
		double sum = 0;
		return Math.abs(x2-x1)*5;
	}
	@Override
	public float area() {
		return 1/2*Math.abs(x1*y2-x2*y1+x2*y3-x3*y2+x3*y4-x4*y3+x5*y1-x1*y5);
	}
}
public class 제출과제_8장_인터페이스상속관계구현 {
	
	public static void main (String args[]) {
		
	Shape[]arr = new Shape[4];
	arr[0] = new Triangle(1,2,3,4,5,6);
	arr[1] = new Rectangle(1,2,3,2, 1,5,3,5);
	arr[2] = new Square(1,2,3,2,1,4,3,4,2);
	arr[3] = new Pentagon(5,1,8,1,3,5,10,5,6,12);
	
	for(Object p : arr) { //확장형 for문
		System.out.println(p.toString());
	}
	System.out.println("삼각형 둘레 길이 = " + arr[0].perimeter());
	System.out.println("삼각형 면적 = " + arr[0].area());
	System.out.println("사각형 둘레 길이 = " + arr[1].perimeter());
	System.out.println("사각형 면적 = " + arr[1].area());
	System.out.println("오각형 둘레 길이 =" + arr[2].perimeter());
	System.out.println("오각형 면적 = " + arr[2].area());
}
}