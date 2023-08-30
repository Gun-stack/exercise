class Number{
	int num;
	static int snum;	

	void imethod() {
		num = 10;
		snum++;
		imethod2();
		smethod();
		
	}
	void imethod2() {
		imethod();
	}
	
	
	static void smethod() {
		snum=100;
//		imethod();  스태틱에서 인스턴스 메서드도 호출 불가
//		num=10; static method 에서는 인스턴스 변수 사용불가 
	}

}




public class StaticTest1 {
	public static void main(String[] args) {
		System.out.println(Number.snum); // 스태틱 클래스 변수는 객체 생성없이 사용가능 
//		System.out.println(Number.num); 인스턴스 변수는 객체 생성 후 사용가능
	
		Number n = new Number();
		System.out.println(n.num);
		System.out.println(n.snum); //static variable 은 reference 를 통해서도 접근가능
		Number.smethod();
//		Number.imethod();  안댐
		n.imethod(); //됨 스태틱 메소드에는 인스턴스 메소드 못씀
		
	}
}
