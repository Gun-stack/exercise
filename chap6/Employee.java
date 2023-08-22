
public class Employee {
	String id;														//변수선언
	String name;
	String dep;
	int sal;
	
	Employee() {			//생성자
	}
	
	
	Employee(String id,String name,String dep,int sal)  //생성자
	{
		this.id =id;
		this.name = name;
		this.dep =dep;
		this.sal = sal;
	}
	
	String info() {
	return	String.format(" %s , %s , %s , %d ", id,name,dep,sal);
	}
	
	
	
	
	
	
	
	
}
