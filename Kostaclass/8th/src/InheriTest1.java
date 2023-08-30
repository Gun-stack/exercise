class Person{
	int age;
	String name;
	public Person() {
	}
	Person(String name, int age){
		this.age = age;
		this.name = name;
	}
	String info() {
		return "이름 : "+name+" 나이 : "+age;
	}
}

class Student extends Person{
	
	String major;
	int grade;
	
	Student() {
	
	}
	Student(String name, int age){
	super(name,age);
	}

	Student(String name, int age,String major,int grade){
//		super.name = name;
//		super.age = age;
		super(name,age);
		this.major = major;
		this.grade = grade;
	}
	
	
	
	@Override  // 부모의 메서드 재정의 
	String info() {
		return super.info()+" 전공 : "+major + " 학년 : " + grade;
		
	}
}

public class InheriTest1 {
	public static void main(String[] args) {
		Student stud1 = new Student("열심히",20);
		stud1.major ="산업공학";
		stud1.grade = 2;
		System.out.println(stud1.info());
		
		
		
		Person per1 = new Person();
		per1.name="내로남불";
		per1.age=30;
//		per1.major =  자식 클래스의 속성과 클래스 사용 못함
		System.out.println(per1.info());
		
		Student stud2 = new Student("돈많은",40,"금융",3);
		System.out.println(stud2.info());
		
	}
}
