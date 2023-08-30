import java.util.HashSet;

class Person {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}

	@Override
	public String toString() {
		return name + "," + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false)
			return false;
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}

}

public class HashcodeTest {

	public static void main(String[] args) {
		String str1 = "hong";
		String str2 = "hong";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		Person p1 = new Person("kim", 30);
		Person p2 = new Person("kim", 30);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		HashSet hs = new HashSet(); // set은 동일한 데이터가 안들어감. 내부에서 같은 데이터인지의 여부를 입력되는 데이터의 hashCode 와 equals 함수로 판단된다
		hs.add(p1);
		hs.add(p2);
		for (Object o : hs) {
			System.out.println(o);
		}

	}

}
