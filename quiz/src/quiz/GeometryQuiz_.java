package quiz;
import java.util.ArrayList;
import java.util.List;
abstract class Geometry {
	List<Integer> xArr = new ArrayList<>();
	List<Integer> yArr = new ArrayList<>();
	abstract double getArea();
	abstract double getLength();
}
class Point extends Geometry {
	public Point(int x, int y) {
		xArr.add(x);	yArr.add(y);
	}
	@Override double getArea() {	return 0;	}
	@Override double getLength() { return 0; 	}
	@Override public String toString() { return "[" + xArr.get(0) + "," + yArr.get(0) + "]"; }
}
class Line extends Geometry {
	public Line(int x1, int y1, int x2, int y2) {
		xArr.add(x1);	yArr.add(y1);
		xArr.add(x2);	yArr.add(y2);
	}
	@Override	double getArea() {	return 0;	}
	@Override	double getLength() {
		return Line.length(xArr.get(0), yArr.get(0), xArr.get(1), yArr.get(1));
	}
	
	static double length(int x1, int y1, int x2, int y2) {
		// 피타고라스
		return 0.0;
	}
}
class PolyLine extends Geometry {
	public PolyLine(int... arr) {
		for (int i = 0  ;i < arr.length/2 ; i++) {
			xArr.add(arr[2*i]);	yArr.add(arr[2*i+1]);
		}
	}
	@Override	double getArea() {	return 0;	}
	@Override	double getLength() {
		double ret = 0.0;
		for (int i = 0 ; i < xArr.size() - 1 ; i++ ) {
			ret += Line.length(xArr.get(i), yArr.get(i), xArr.get(i+1), yArr.get(i+1));
		}
		return ret;
	}
}

public class GeometryQuiz_ {

}
