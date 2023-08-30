class Mymath1{
	int add(int x, int y) {
		int result = x+y;
		return result;
	}
}

public class Mymath {
		public static void main(String[] args) {
			Mymath1 mm = new Mymath1();
		int res = 	mm.add(40,20);
		System.out.println(res);
		
		}
}
