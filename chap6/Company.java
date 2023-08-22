
public class Company {
	Employee[] emps =new Employee[10];
	int empCnt;
	
	void enter(Employee employee) {
			emps[empCnt++] = employee;
	}
	
	void allInfo() {
		for (int i = 0; i < empCnt; i++) {
		System.out.println(emps[i].info());	
		}
	}
	
	void bonus(Employee employee,int i) {
		employee.sal += i; 
	}
	
	void getTotalpay() {
		 int tot =0;
		for (int i = 0; i < empCnt; i++) {
			tot += emps[i].sal;
		}
		System.out.println(tot);
	}
	
	public static void main(String[] args) {
		//사번이름부서페이
		Company com = new Company();
		
		Employee emp1 = new Employee("10101","1길동","홍보부",1);
		Employee emp2 = new Employee("10102","2길동","총무부",2);
		Employee emp3 = new Employee("10103","3길동","개발부",3);
		
		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);
		
		com.allInfo();
		com.bonus(emp3, 10000);
		System.out.println(emp3.info());
		com.allInfo();
		
		com.getTotalpay();
	}
}
