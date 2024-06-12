package quiz;

public class GeometryQuiz {
	public static void main(String[]args) {
		Geometry arr[] = new Geometry[5];
		arr[0]=new Point(1,2);
		arr[1]=new Line(1,2,1,4);
		arr[2]=new Polyline(1,2,1,4,3,4);
		arr[3]=new TriAngle(1,2,3,4,5,6);
		arr[4]=new Rectangle(1,3,2,3,1,6,2,6);
		
		for(int i=0;i<arr.length;i++)
			arr[i].getArea();
		for(int i=0;i<arr.length;i++)
			arr[i].getLength();
	}
}

//추상클래스 선언
abstract class Geometry{
	int[] xArr;
	int[] yArr;
	abstract double getArea();
	abstract double getLength();
}

class Point extends Geometry{
	public Point (int x, int y){
		xArr=new int[1];
		yArr=new int[1];
		xArr[0]=x;
		yArr[0]=y;
	}
	double getArea() {
		return 0.0;
	}
	double getLength() {
		return 0.0;
	}
}

class Line extends Geometry{
	public Line (int x1, int x2, int y1, int y2){
		xArr=new int[2];
		yArr=new int[2];
		xArr[0]=x1;
		xArr[1]=x2;
		yArr[0]=y1;
		yArr[1]=y2;
	}
	double getArea() {
		return 0.0;
	}
	double getLength() {
		return Math.sqrt((xArr[1]-xArr[0]) * (xArr[1]-xArr[0]) + (yArr[1]-yArr[0]) * (yArr[1]-yArr[0]));
	}
}

class Polyline extends Geometry{
	public Polyline (int x1, int x2, int x3, int y1, int y2, int y3){
		
		
		//public Polyline (int... arr){
		//	for (int i=0;i<arr.length/2;i++){
		//		xArr.add(arr[2*i]); 
		//		yArr.add(arr[2*i+1]);
		//	}
		// --> Polyline은 변수를 몇개 받을지 모르니까 가변길이인자 선언, arr에서 두개씩 묶음
		
		// 세개씩 묶을 때는
		// for (int i=0;i<arr.length/3;i++){
		//		xArr.add(arr[3*i]); 
		//		yArr.add(arr[3*i+1]);
		// 		zArr.add(arr[3*i+2]); 
		//	}
		
		xArr=new int[3];
		yArr=new int[3];
		xArr[0]=x1;
		xArr[1]=x2;
		xArr[2]=x3;
		yArr[0]=y1;
		yArr[1]=y2;
		yArr[2]=y3;
	}
	double getArea() {
		return 0.0;
	}
	double getLength() {
		return Math.sqrt((xArr[1]-xArr[0]) * (xArr[1]-xArr[0]) + (yArr[1]-yArr[0]) * (yArr[1]-yArr[0]))+Math.sqrt((xArr[2]-xArr[1]) * (xArr[2]-xArr[1]) + (yArr[2]-yArr[1]) * (yArr[2]-yArr[1]));
	}
}

class TriAngle extends Geometry{
	public TriAngle (int x1, int x2, int x3, int y1, int y2, int y3){
		xArr=new int[3];
		yArr=new int[3];
		xArr[0]=x1;
		xArr[1]=x2;
		xArr[2]=x3;
		yArr[0]=y1;
		yArr[1]=y2;
		yArr[2]=y3;
	}
	double getArea() {
		return ;
	}
	double getLength() {
		return ;
	}
}

class Rectangle extends Geometry{
	public Rectangle (int x1, int x2, int x3, int y1, int y2, int y3, int x4, int y4){
		xArr=new int[4];
		yArr=new int[4];
		xArr[0]=x1;
		xArr[1]=x2;
		xArr[2]=x3;
		xArr[3]=x4;
		yArr[0]=y1;
		yArr[1]=y2;
		yArr[2]=y3;
		yArr[3]=y4;
	}
	double getArea() {
		return ;
	}
	double getLength() {
		return ;
	}
}