class Shape{
	String color;

	public void draw() {

	}
}
class Circle extends Shape{
	int x ,y, z ;
	@Override
	public void draw() {
		super.draw();
	}

}


public class polymoTest1 {
	public static void main(String[] args) {
		Circle c = new Circle() ;
		c.color="red";
		c.x = 4;
		c.draw();
		
		Shape s =new Circle();  //upcasting 자식 객체를 부모변수에 넣는다. 

		s.color= "red";
//		s.x = 3;
		s.draw();  //다형성 상속시, 업캐스팅 시 , 오버라이딩시
		
	}
}
