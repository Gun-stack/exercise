class Base{
	int bnum;
	void method1() {}//1
	void method2() {}//2

}

class Derived extends Base{
	int dnum;
	void method1(int n) {} //5
	void method2() {
		method1();//가능 , 1 
		super.method2(); //가능2
		method2();//자기자신 6 호출 잘못 사용될 확률 높음 
	}//6
		
	void method2(int n) {      //3
		method2();//가능. 6
		
	}
	void method3() {}//4
}


public class InheriTest2 {
	public static void main(String[] args) {
		Base b = new Base();
		b.bnum=10;
		b.method1();//1
		b.method2();//2
		
		Derived d= new Derived();
		d.bnum=20;
		d.dnum=30;
		d.method1();//1
		d.method2();//6 ** 오버라이딩 해서 자식의 메소드 호출 됨
		d.method3();//4
		
	}
}
