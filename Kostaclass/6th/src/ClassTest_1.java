//클래스 정의 Student class

public class ClassTest_1 {
	public static void main(String[] args) {	
		
		Student stu1 = new Student();
		//		변수			객체
		stu1.name = "홍길동";
		stu1.grade = 1;
		stu1.num = 10101;
		stu1.address = "서울";
	
		System.out.println(stu1.info());
		
				
	
	}
}
