package chpa7;

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}
class Circle extends Shape{
	double r;
	Circle(){}
	Circle(double r){
		Point p =new Point(0,0);
		this.r =r;
	}
	Circle(double r, Point p){
		this.r=r;
		super.p=p;
	}
	
	@Override
	double calcArea() {
		double s;
		s = Math.pow(r, 2) * Math.PI;
		return s;
	}
	
}

class Rectangle extends Shape{
	
	public Rectangle() {
	}
	int width;
	int height;

	public Rectangle(int width, int height){
		this. width = width;
		this. height = height;
	}
	
	@Override
	double calcArea() {
		double s;
		s= width*height;
		
		return s;
	}
}



class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

public class Ex7_22 {
	static double sumArea(Shape[] shape) {
		double tot =0 ;
		for (int i = 0; i < shape.length; i++) {
			tot += shape[i].calcArea();
			
		}
			
			return tot;
	}
	
	
	
	
	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합:" + sumArea(arr));
	}
}
