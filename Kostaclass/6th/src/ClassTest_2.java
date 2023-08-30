
class Person{
	String name;
	int age;
	
	String info() { //메소드 정의
		return String.format("이름 : %s , 나이 : %d ",name,age);
	}
	
}


public class ClassTest_2 {
		public static void main(String[] args) {
			
			Person per1 = new Person();
			per1. name = "홍";
			per1 . age = 30;
			
			System.out.println(per1.info()); //메서드 호출
			Person[] parr = new Person[5];// 레퍼런스 5개 parr과 Person 다른 메모리
			
			parr[0] = new Person();
			parr[1] = new Person();
			parr[2] = new Person();
			parr[3] = new Person();
			parr[4] = new Person();
		
		
		}
}
