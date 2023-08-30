
public class InstanceOfTest1 {

	public static void main(String[] args) {
		Base b1 = new Base();
		Base b2 = new Derived();

		if (b1 instanceof Base) {
			System.out.println("b1 is Base instance");
		}
		if (b1 instanceof Derived) {
			System.out.println("b1 is Derived instance");
		}
		if (b2 instanceof Base) {
			System.out.println("b2 is Base instance");
		}
		if (b2 instanceof Derived) {
			System.out.println("b2 is Derived instance");
		}
							//오버라이딩 다형성은 변수는안먹고 , 메소드 안에서만 먹는다 생성자도 먹는듯  
	}

}
