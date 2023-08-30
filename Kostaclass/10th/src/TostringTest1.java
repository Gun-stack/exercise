class person{
	String name;
	int age;
	person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름:" + name + " 나이:" +age;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof person == false)
			return false;
		person p = (person)obj;
		return name.equals(p.name) && age ==p.age;
				
	}
}

public class TostringTest1 {

		public static void main(String[] args) {
			
			person p1 = new person("kim", 30);
			person p2 = new person("kim", 30);
			String string = "!!!"+p1;
//			System.out.println(p1);
//			System.out.println(string);
			
			System.out.println(p1==p2);
			System.out.println(p1.equals(p2));
		}
}
