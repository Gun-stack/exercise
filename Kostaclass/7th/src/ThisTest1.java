class Account1{
	String id;
	String name;
	int balance;
	
	Account1(String id, String name,int balance) {
		this.id=id; //디스 쓰면 클래스,인스턴스 변수 안스면 지역변수
		this.name=name;
		this.balance=balance;
		
	}
	String info() {
		return "계좌번호 : "+id+" 이름 : "+ name+" 잔액 : "+balance;
	}
	
}


public class ThisTest1 {
	public static void main(String[] args) {
		Account1 acc1 = new Account1("10101","1길동", 100000);
		new Account1("10102", "2길동", 200000);
		System.out.println(acc1.info());
		
	}
}
