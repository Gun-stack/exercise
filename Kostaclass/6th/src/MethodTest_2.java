class Data{
	int x;
	
}
public class MethodTest_2 {
	static void increment(int x) {
		x += 1;
		System.out.println(x);//11
	}
	static void increment2(Data d) {
		d.x += 1;
		System.out.println(d.x);//11
	}
	
	
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		
		increment(data.x);
		System.out.println(data.x);//10
	
		increment2(data);
		System.out.println(data.x);//11
	
	}
}
