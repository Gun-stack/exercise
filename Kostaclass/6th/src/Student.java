
public class Student {
	String name;
	int grade;
	int num;
	String address;
	
	String info() {
		return String.format(" 이름 : %s \n 학년 : %d \n 학번 : %d \n 주소 : %s",name, grade, num, address);
	}
}
