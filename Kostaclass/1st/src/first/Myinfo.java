package first;

public class Myinfo {
	public static void main(String[] args) {
		//이름을 저장할 변수 선언하여 본인이름 할당
		//나이를 저장할 변수 선언하여 본인나이 할당
		//키를 저장할 변수 선언하여 본인 키 할당
		//남여 구분을 저장할 변수를 선언하여 본인 성별 할당
		String name = "김건우";
		int age = 30;
		double height = 172.5;
		float height2 = 172.5f;
		char gender = 'M';
		System.out.println(String.format("%s, %d, %f, %c" , name,age,height,gender));
		//String.format(name, args );
		//참조형 reference type  클래스...
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(height2);
		System.out.println(gender);
		
		//final = 변수를 상수로
		final double pi= 3.141592;
		// pi= 1.25; 변경불가 * PI= 상수
		System.out.println(pi);
		
		
		
}
}
