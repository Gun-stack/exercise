
class MyNumber{
	int num;
	void func1(int n) {
		int number =n;
		num = number;
	}
	void func2(int n) {
		int number = n;
		num= number;
		
	}
}
class MyMath2{
	
	static int add(int x, int y) {
		int result = x+y;
		return result;
	}
	static int multi( int x , int y) {
		int result = x*y ;
		return result;
	}
}


public class variableTest_3 {
	public static void main(String[] args) {
		MyNumber mn = new MyNumber();
		System.out.println(mn.num); //0
		mn.func1(10);
		System.out.println(mn.num); //10
		mn.func2(20);	
		System.out.println(mn.num); //20
		
		
		int result = MyMath2.add(5000, 20);
		System.out.println(result);
		
		result = MyMath2.multi(100, 200);
		System.out.println(result);
		
	}
}
