class Tclass1{
	void method1() {
		int num1;
		method2(); // 같은 클래스 내의 메소드들 끼리는 서로 호출 가능 선언없이
	}
	void method2() {
		int num2;
		method3();
	}
	void method3() {
		int num3;
	}
}
public class ClassTest_4 {
	public static void main(String[] args) {
		Tclass1 tc = new Tclass1();
		tc.method1();
	}
}
