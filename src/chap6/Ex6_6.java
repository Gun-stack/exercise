package chap6;

public class Ex6_6 {
	public static double getDistance(int x, int y, int x1, int y1) {
		int yl= y1-y; int xl= x1-x;
		return Math.sqrt(Math.pow(yl,2)+Math.pow(xl, 2)) ;
				
	}

	public static void main(String args[]) {
		System.out.println(getDistance(1, 1, 2, 2));
		
		
		double d = Math.pow(10, -3);
		System.out.println(d);
	}
}