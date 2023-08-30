class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive. Brrr");
	}

	void stop() {
		System.out.println("stop!");
	}

}

class FireEngine extends Car {
	void water() {
		System.out.println("water!1");
	}

}

class Ambulance extends Car {
	void siren() {
		System.out.println("BBe~Ppo");
	}
}

public class PolimoTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.water();
		Car car = fe; //up casting 부모에 
//		car.water(); //안댐
		
		if (car instanceof FireEngine) {
			FireEngine fe2 = (FireEngine)car;// downcasting
			fe2.water();	
		}
		
		
		
		
		
		
	}

}
