 class AA{
	 int a;
	 void methodA() {System.out.println("1");}  //1
	 void method() {System.out.println("2");}   //2
	 void info() {System.out.println(getPay());	 }
	 int getPay() {return 0;}  //오버라이딩
 }
class BB extends AA{
	int b;
	void methodB() {System.out.println("3");}   //3
	void method() {System.out.println("4");}  // 4
	@Override
	int getPay() {
		return 100;
	}
}

public class PolyTest2 {

	public static void main(String[] args) {
		AA obj = new BB();
		obj.methodA(); //1
//		obj.methodB(); // X
//		obj.b =10;  참조타입이 부모면 자식 클래스 접근 X 
		obj.method();//4
		obj.a =10;
		// 자식 객체를 부모 변수에 넣을 경우, 부모에는 없는 자식의 변수나 함수 사용 X
		//단 오버라이딩 한 함수는 부모 변수로 자식클래스의 함수를 호출 한다
		obj.info();
		
	}
}
