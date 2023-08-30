class Base {
	int x;

	void method() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	int y;

	void method() {
		System.out.println("Derived");
	}
}

public class plinoTest3 {
	public static void main(String[] args) {
		Base base1 = new Derived(); // 오버라이딩 한 경우 //upcasting 부모 타입의 배열에 자식객체
		base1.method(); // NEW 한 클래스의 메소드를 출력 **다형성
		base1.x = 10;
		// base1.y=10;

		Base base2 = new Base();
		base2.method();

		if (base1 instanceof Derived) {
			Derived derived1 = (Derived) base1;// 다운캐스팅
			derived1.y = 10;
		}
		if (base2 instanceof Derived) {
			Derived derived2 = (Derived) base2;
			derived2.y = 30;
		}

		
	}
}
