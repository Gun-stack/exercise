package shapePJ;

public class ShaepMain {
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[100];
		int count;
		
		ShapeSet ss = new ShapeSet();
		
		
		ss.add(new Circle("red",10,10,20));
		ss.add(new Circle("pink",new Point(5,5),10));
		
		ss.add(new Triangle("blue",new Point(5,5),new Point(10,5),new Point(15,30)));
		ss.add(new Triangle("sky",3,3,5,5,7,7));
		
		ss.add(new Rectangle("green",30,30,100,50));
		ss.add(new Rectangle("yellow",new Point(5,5),30,15 ));
		
		
		
		ss.allShapeDraw();
		
	}
	
	
}


/*
 [원: 색(red)  중심점(a,b) 반지름(20)]
 [삼각형 색 점1 점2   점3]
 [사각형 색 , 시작점 너비 높이]
 
ss.add(new Circle("red",10,10,20));
		ss.add(new Circle("pink",new Point(5,5),10));
		ss.add(new Triangle("blue",new Point(5,5),new Point(10,5),new Point(15,30)));
		ss.add(new Triangle("sky",3,3,5,5,7,7));
		ss.add(new Rectangle("green",30,30,100,50));
		ss.add(new Rectangle("yellow",new Point(5,5),30,15 ));



	public static void main(String[] args) {
		Company com = new Company();

		Permanent emp1 = new Permanent(10101, "1길동", 3000000);
		Sales emp2 = new Sales(10201, "2길동", 100000, 3000000);
		PartTime emp3 = new PartTime(10301, "3길동", 200, 20000);
		// 참조타입 제각각 - > 부모 타입 으로 업캐스팅

		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);

		com.allEmpInfo();
		System.out.println("총급여 : " +com.getTotalPay());
//		System.out.println(emp2.info());
	}
}





*/