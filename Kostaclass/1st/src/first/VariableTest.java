package first;

public class VariableTest {
	public static void main(String[] args) {

		char  ch = 'a'; 
		
		System.out.println(ch);
		
		char  up7;
		up7 = '7';
		System.out.println(up7);
		
		up7 = '8';
		System.out.println(up7);
		
	
		//char : 자료형, ch : 변수명, = : 대입연산자 'a' : 리터럴 데이터
		// == : 같다 , = : 대입
		
		/*명명규칙 제한
		1.대소문자
		2.예약어
		3.숫자시작x
		4._언더바 ,$ 달러 가능 	
		권장사항
		1. 클래스이름 대문자
		2. "Camel" 단어의 첫 글자 대문자 lastIndexOf, StringBuffer(클래스임)
		3. 상수의 이름은 대문자 단어는 _로 구분 PI, MAX_NUMBER
		  */
		
		
		byte b = 127;
		System.out.println(b);
		byte bb = -128;
		System.out.println(bb);
		int i =1000;
		float f = 1.23f;
		double d = 1.23;
		boolean bo= false;
		String name = "Stiven";
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bo);
		System.out.println(name);
		/*2의 8승  =  256 127+128+1
		앞자리 부호
		0/0/0/0/0/0/0/0/0 = 0 
		0/1/1/1/1/1/1/1/1 = 127
		1/0/0/0/0/0/0/0/0 = -128
		2의 보수법
		뒤집고 1을 더함
		
		리터럴(literal)
		
		
		스트링은 클래스 String str = "abc";
		
		*/
	}
}
