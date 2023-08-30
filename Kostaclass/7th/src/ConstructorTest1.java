import java.time.Period;
import java.util.Iterator;

class Person{
	int age;
	String name;
//	Person() {
//		System.out.println("Person()");
//	}
	
	Person(String n, int a){
		age= a;
		name = n;
	}
	Person(){
		this("none", 0); //생성자에서 다른 생성자 호출, 반드시 생성자의 맨 처음에 호출 해야함 
	}
	Person(int a){
		this("none",a);

	}
	Person(String n){
		this(n,0);

	}
	Person(Person p){
		name= p.name;
		age = p.age;
	}
	
//	String info() {
//		return "이름 : "+name+" 나이 : "+age;
//	}
}




public class ConstructorTest1 {
	public static void main(String[] args) {
		Person per1 = new Person("kim",21);
		Person per2 = new Person();
		per2.name="Kim";
		per2.age = 21;
//		per2.info();
		Person per3 = new Person(20);
		Person per4 = new Person("hong");
		Person per5= new Person(per1);//인스턴스변수 는 보통 생성자로 초기화 ,클래스 변수는 
		Math.pow
	}
}
