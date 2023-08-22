class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int x1, int y1) {
		int yl = y1 - y;
		int xl = x1 - x;
		return Math.sqrt(Math.pow(yl, 2) + Math.pow(xl, 2));
	}

	double getDistance2(MyPoint p2) {
		return Math.sqrt(Math.pow(p2.y, 2) + Math.pow(p2.x, 2));
	}
	
}

public class Ex6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));

		MyPoint p2 = new MyPoint(2, 2);
		System.out.println(p2.getDistance(-2, -2));
		
		System.out.println(p2.getDistance2(p2));
		
	}
}