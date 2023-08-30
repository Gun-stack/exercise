class Account {
	String id;
	String name;
	int balance;

	String info() {
		return String.format("게좌번호 : %s , 이름 : %s , 잔액 : %d 원", id, name, balance);
	}

	void deposit(int i) {
		balance += i;
		System.out.println("Deposit + " + i + "원");
	}

	void withdraw(int i) {
		balance -= i;
		System.out.println("Withdraw - " + i + "원");
	}

}

class Bank {
	Account[] accs = new Account[100];//객체생성
	Account acc1 = new Account();
	int accCnt;

	void makeAccount(String id, String name, int balance) {
		Account acc = new Account();
		acc.id = id;
		acc.name = name;
		acc.balance = balance;
		accs[accCnt++] = acc;
	}

	void allAccountInfo() {
		for (int i = 0; i < accCnt; i++) {
			System.out.println(accs[i].info());
		}
	}

	int search(String id) { 
		int i;
		for (  i = 0; i < accCnt; i++){	
		if (accs[i].id.equals(id))  break;
		}
		return i;
	}

	void accountInfo(String id) {
		 {		System.out.println(accs[search(id)].info());
			}
		}
	
	void deposit(String id, int money) {		
				accs[search(id)].deposit(money);
				System.out.println(accs[search(id)].info());
			}
		
	

	void withdraw(String id, int money) {
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].id.equals(id) ) {
				accs[i].withdraw(money);
				System.out.println(accs[i].info());   
			}
		}
	}
}

public class ClassTest5 {
	public static void main(String[] args) {
//		Account acc1 = new Account();
//		acc1.id = "10001";
//		acc1.name = "고길동";
//		acc1.balance = 100000;
//		System.out.println(acc1.info());
//		acc1.deposit(10000);
//		System.out.println(acc1.info());
//		acc1.withdraw(10000);
//		System.out.println(acc1.info());
//	
		Bank bank = new Bank();
		bank.makeAccount("10001", "1길동", 100000);
		bank.makeAccount("10002", "2길동", 200000);
		bank.makeAccount("10003", "3길동", 300000);
		bank.makeAccount("10004", "4길동", 400000);
		bank.makeAccount("10005", "5길동", 500000);
		bank.allAccountInfo();
	
		System.out.println("=======");
		
		bank.accountInfo("10001");
		bank.deposit("10001", 10000);
		bank.withdraw("10001", 20000);

	}
}
